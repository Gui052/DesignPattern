package cn.cychee.state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 持有State实例，通过调用不同状态的实例，能获得不同状态下的实例调用此类的操作。而此类不关心状态是什么，切换完全由State类完成
 * 此类只提供一个切换State实例的方法即可，在State中具体调用
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/20 11:12
 */
public class SafeFrame extends Frame implements ActionListener, Context {

    //中文乱码  在 vm 启动参数加入 -Dfile.encoding=GB18030
    //显示当前时间
    private final TextField textClock = new TextField(60);
    private final TextArea textScreen = new TextArea(10, 60);
    private final Button buttonUse = new Button("使用金库");
    private final Button buttonAlarm = new Button("按下警铃");
    private final Button buttonPhone = new Button("正常通话");
    private final Button buttonExit = new Button("结束");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        //配置textClock
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        //配置textScreen
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        //为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        //配置界面
        add(panel, BorderLayout.SOUTH);
        //显示
        pack();
        show();

        //设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(event.toString());
        if (event.getSource() == buttonUse) {
            //由于这个类也实现了Context接口，可以直接传进去，此类并不关心是哪个状态具体执行操作
            state.doUse(this);
        } else if (event.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (event.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (event.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }


    @Override
    public void setClock(int hour) {
        String clockString = "现在时间是";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        this.state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变成了" + state + "状态");
        //这里更改了状态
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String massage) {
        textScreen.append("call!" + massage + "\n");
    }

    @Override
    public void recordLog(String massage) {
        textScreen.append("record ... " + massage + "\n");
    }
}

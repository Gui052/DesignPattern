package cn.cychee.templatemethod;

public class CharDisplay extends AbstractDisplay {

    private char aChar;

    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }

    @Override
    public void open() {
        System.out.println("<<");
    }

    @Override
    public void print() {
        System.out.println(aChar);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}


/**
 * 抽象工厂模式
 * <p>将相关联的零件组装成产品</p>
 * <p>在抽象零件中定义方法,可能是下一个零件会使用到上一个零件,定义组装产品的步骤</p>
 * <p>然后在使用类中定义组装产品的参数,用哪个工厂进行组装(实际上产品组装步骤已经是固定的了,从零件或者从这里都可以看到,只是选个工厂而已)</p>
 * <p>定义具体工厂和具体零件</p>
 * <p>选择哪个工厂进行组装</p>
 * @author Mr.Lan
 * @since 2020/5/2 1:33 下午
 */
package cn.itailan.abstractfactory;
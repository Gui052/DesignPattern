/**
 * 建造者模式
 * <p>组装复杂结构的实例</p>
 * <p>首先有一个builder,然后有一个director,有一个builder成员变量,定义builder的方法执行建造.</p>
 * <p>然后具体的builder继承builder,并各自覆写方法</p>
 * <p>使用的时候,将具体的builder传入director,调用director中的方法,即可完成建造</p>
 * @author Mr.Lan
 * @since 2020-05-01 19:02
 */
package cn.cychee.builder;
/**
 * 工厂.具体思路就是create方法传入工厂名,返回相应的工厂.这里只是简单生成对象.
 * <p>这里只有一个idCard工厂,实际上还可以有其他工厂</p>
 * 还可以在工厂里设置一个map,产品初始化之后调用工厂的注册方法加入map,获取产品的时候直接通过map获取.
 * 这种比较适合策略模式+工厂.
 */
package cn.cychee.factorymethod;
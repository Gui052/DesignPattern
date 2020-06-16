/**
 * 代理模式
 * <p>必要时生成实例</p>
 * <p>在这个例子中,由于生成真正的Printer实例需要耗费时间,所以使用PrinterProxy代理,除了某些真的需要
 * 调用到真正实例Printer的方法,都可以由代理进行实现.将真正的生成Printer实例放到了调用真正方法的时候</p>
 * <p>对于调用者来说,他并不感知调用的是真正的Printer实例还是其代理</p>
 * <p>代理模式有很多种变种,这里是  虚拟代理virtual proxy.只有需要时才生成</p>
 * <p>远程代理remote proxy,完全不必在意真正的对象是否存在远程网络上,就像它在身边一样调用</p>
 * <p>access proxy,用于调用真实对象的功能时设置访问限制</p>
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/16 11:18 下午
 */
package cn.itailan.proxy;
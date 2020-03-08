/** Iterator模式
 * <p>首先有一个迭代器Iterator接口,迭代器有next和hasNext方法</p>
 * <p>然后有一个集合Aggregate接口,集合中有返回一个迭代器Iterator的方法</p>
 * <p>然后有一个具体的集合ConcreteAggravate实现Aggregate接口,里面有集合的一些操作方法,并重写集合Aggregate的迭代器方法返回一个迭代器Iterator</p>
 * <p>然后有一个具体的迭代器ConcreteIterator实现Iterator接口,包含一个具体的集合ConcreteAggravate,并根据此集合实现迭代器的具体方法next和hasNext</p>
 * <p>最后使用的时候,只要获取Iterator即可,不要使用具体的迭代器ConcreteIterator,可以实现解耦</p>
 * <p>从这里开始,要逐步养成不要使用具体类来编程,要优先使用抽象类和接口编程</p>
 * @author Mr.Lan
 * @since 2020-03-08 11:39
 */
package cn.itailan.iterator;
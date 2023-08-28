package cn.cychee.iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate<EntityObject> aggregate = new ConcreteAggregate<>();
        aggregate.append(new EntityObject("第一个对象"));
        aggregate.append(new EntityObject("第二个对象"));
        aggregate.append(new EntityObject("第三个对象"));
        aggregate.append(new EntityObject("第四个对象"));

        //这一行比较重要,获取的是一个抽象迭代器,而不是具体的迭代器,这里的迭代就不依赖于具体迭代器了
        //实现解耦
        Itrator itrator = aggregate.iterator();
        while (itrator.hasNext()) {
            EntityObject object = (EntityObject) itrator.next();
            System.out.println(object.getName());
        }
    }
}

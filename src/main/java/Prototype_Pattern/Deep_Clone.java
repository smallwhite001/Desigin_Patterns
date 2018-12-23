package Prototype_Pattern;

import java.util.Date;

public class Deep_Clone implements Cloneable {
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();//直接调用object对象clone方法

        //进行深复制
        Deep_Clone deep_clone = (Deep_Clone) obj;
        //将属性也进行克隆
        deep_clone.birthday = (Date) this.birthday.clone();
        return super.clone();
    }

    @Override
    public String toString() {
        return "Deep_Clone{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}

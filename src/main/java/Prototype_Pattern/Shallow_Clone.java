package Prototype_Pattern;

import java.util.Date;

/**
 * 浅克隆
 */
public class Shallow_Clone implements  Cloneable{
  private String name;
  private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    @Override
    public String toString() {
        return "Shallow_Clone{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

package pl.com.empas.java_introductory_course.oop.solid.pc.common;

public class Item {

    protected String name;
    //Price in groszes
    protected int price;

    public Item(String name, int price) {

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

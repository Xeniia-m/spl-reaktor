package bgu.spl.net.srv;

public class Subscription {
    private int id;
    private  String name;

    Subscription(int id, String name){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

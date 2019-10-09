package basis;

public class Object01 {
    String name;
    int price;


    public static void main(String[] args) {
        Object01 timo = new Object01();
        timo.name="提莫";
        timo.price=6330;

        Object01 shoe = new Object01();
        shoe.name="鞋子";
        shoe.price=4500;
        System.out.println(shoe.name+"\n"+shoe.price+"\n"+timo.name);




    }
}

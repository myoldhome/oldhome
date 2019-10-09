package basis;

public class Singleton01 {
    //私有化构造方法
    private Singleton01(){

    }
    //准备一个属性指向实例化对象
    private static Singleton01 singleton01;

    //访问没有就返回创建对象
    public static Singleton01 getSingleton01(){
        if(singleton01==null){
            singleton01=new Singleton01();
        }
        return singleton01;
    }



}

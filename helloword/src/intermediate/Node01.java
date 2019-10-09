package intermediate;

//import javafx.scene.Node;
//import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class Node01 {
    //左节点
    public Node01 leftNode;
    //右节点
    public Node01 rightNode;
    //值
    public Object value;

    public void add(Object v){
        if (null==value){
            value=v;
        }else {
            if ((Integer)v-((Integer)value)<=0){
                if (null==leftNode){
                    leftNode = new Node01();
                }
             leftNode.add(v);
            }else {
                if (null==rightNode){
                    rightNode=new Node01();
                }
            }
        }
    }
    // 中序遍历所有的节点
    public List<Object> values() {
        List<Object> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());

        // 当前节点
        values.add(value);

        // 右节点的遍历结果
        if (null != rightNode)

            values.addAll(rightNode.values());

        return values;
    }

    public static void main(String[] args) {

        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };

        Node01 roots = new Node01();
        for (int number : randoms) {
            roots.add(number);
        }

        System.out.println(roots.values());

    }



}

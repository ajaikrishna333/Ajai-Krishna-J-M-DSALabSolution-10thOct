package ServicePackage;
import java.util.ArrayList;

public class ServiceClass {

    Node root;

    public ArrayList<Integer> create() {
        root = new Node(100);
        root.left = new Node(20);
        root.right = new Node(130);
        root.left.left = new Node(10);
        root.left.right = new Node(50);
        root.right.left = new Node(110);
        root.right.right = new Node(140);
        root.left.left.left = new Node(5);

        ArrayList<Integer> output = findLongestPath(root);
        return output;

    }

    public ArrayList<Integer> findLongestPath(Node root){
        if(root == null){
            ArrayList<Integer> output = new ArrayList<Integer>();
            return output;
        }
        ArrayList<Integer> rightArray = findLongestPath(root.right);
        ArrayList<Integer> leftArray = findLongestPath(root.left);

        if(rightArray.size() < leftArray.size()){
            leftArray.add(root.data);
        }else{
            rightArray.add(root.data);
        }
        return (leftArray.size() > rightArray.size() ? leftArray : rightArray);
    }

}

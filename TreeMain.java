import java.util.Random;
public class TreeMain {
    public static void main(String[] args) {
    	LinkedBinarySearchTree<Integer> test1 = new LinkedBinarySearchTree<Integer>();
    	//for( int i = 0 ; i < 15; i++) {
    	//	Random rand = new Random();
    	//	int  n = rand.nextInt(50) + 1;
    	//	test1.addElement(n);
    	//}
    	test1.addElement(4);
    	test1.addElement(2);
    	test1.addElement(6);
    	test1.addElement(1);
    	test1.addElement(3);
    	test1.addElement(5);
    	test1.addElement(7);
    	
    	//Inspect To String
    	System.out.println("Tree toString(): " + test1.toString());
    	
    	System.out.println("Height is : " + test1.getHeight());
    	
    	int i;
    	//Inspect Iterator
    	while(test1.iteratorPreOrder().hasNext()) {
    		i = test1.iteratorPreOrder().next();
    		System.out.println(i);
    		if(!test1.contains(i)){
    			System.out.println("Contains is broken");
    		}
    	}
    }
}
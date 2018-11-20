import java.util.HashMap;

class BST {
	int value;
	BST left;
	BST right;
	HashMap map = new HashMap();
	BST(Node p) {
		this.value=p;
	}
}
public class BinarySearchTree {
	static Node p;
	static Node q;
	static Node root;
	
	int a[]= {12,18,12,1,3,20,17,19};
	void create(int a[]) {
		
		//for(int i=0;i<a.length;i++) {
		//	System.out.println("Array is "+a);
		//}
		//System.out.println();
		BST b = new BST(p);
		
	}


public static void main(String[] args) {
	int a[]= {12,18,12,1,3,20,17,19};
	BinarySearchTree bst = new BinarySearchTree();
	bst.create(a);
}

}

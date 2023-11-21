
public class BinarySearchTree {

    Node root;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node tmp = root;
            Node parent = root;
            while (tmp != null) {
                parent = tmp;
                if (data < tmp.data) {
                    tmp = tmp.left;
                } else if (data > tmp.data) {
                    tmp = tmp.right;
                }
            }
            if (data < parent.data) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }
    }

    public int minSearch(Node focus) {
        if (focus.left != null) {
            minSearch(focus.left);
        }
        return (focus.data);
    }

    public Node search(int data) {
        Node tmp = root;
        while (tmp != null) {
            if (data < tmp.data) {
                tmp = tmp.left;
            } else if (data > tmp.data) {
                tmp = tmp.right;
            } else {
                return tmp;
            }
        }
        return null;
    }

    public Node searchRecursive(Node tmp, int data) {
        if (tmp == null) {
            return null;
        }
        if (tmp.data == data) {
            return tmp;
        } else if (data < tmp.data) {
            return searchRecursive(tmp.left, data);
        } else {
            return searchRecursive(tmp.right, data);
        }
    }

    public int size(Node tmp) {
        if (tmp == null) {
            return 0;
        } else {
            return (size(tmp.left) + size(tmp.right) + 1);
        }
    }
    
    public void deleteMin(Node tmp){
        if(root == null || tmp == null){
            System.out.println("tmp or root is null.");
            return;
        }
        
        Node parent = null;                                     
        while(tmp.left != null){
            parent = tmp;
            tmp = tmp.left;
        }                                                                   // buranın algıritması yazılır 
   
        if(tmp == root){
            root = tmp.right;                                  
        }
        
        parent.left = tmp.right;
    }
    
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + "  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + "  ");
            inOrder(root.right);
        }
    }
    
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "  ");
        }
    }
    
    public int height(Node root) {
        if (root == null) {
            return -1;
        } else {
            int sol = 0;
            int sag = 0;

            sol = height(root.left);
            sag = height(root.right);

            if (sol < sag) {
                return (sag + 1);
            } else {
                return (sol + 1);
            }
        }
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearchTree x = new BinarySearchTree();
        boolean cikis = false;
        while (cikis == false) {
            System.out.println("0 - exit");
            System.out.println("1 - add node");
            System.out.println("2 - search min");
            System.out.println("3 - search recursive");
            System.out.println("4 - size");
            System.out.println("5 - delete min");
            System.out.println("6 - preOrder");
            System.out.println("7 - inOrder");
            System.out.println("8 - postOrder");
            System.out.print("choose an action: ");
            int action = input.nextInt();
            System.out.println("");
            switch (action) {

                case 0:
                    cikis = true;
                    break;
                case 1:
                    System.out.print("new data: ");
                    int data = input.nextInt();
                    x.addNode(data);
                    break;
                case 2:
                    int min = x.minSearch(x.root);
                    System.out.println("min number: " + min);
                    break;
                case 3:
                    System.out.print("ARADIGINIZ DATA: ");
                    int data3 = input.nextInt();
                    Node aranan = x.searchRecursive(x.root, data3);
                    if(aranan == null){
                        System.out.println("There is no such an index.");
                        break;
                    }else{
                        System.out.println("The value you are looking for is avalible in the system.");
                    }
                    break;
                case 4:
                    int size = x.size(x.root);
                    System.out.println("size: " + size);
                    break;
                case 5:
                    x.deleteMin(x.root);
                    break;
                case 6:
                    x.preOrder(x.root);
                    break;
                case 7:
                    x.inOrder(x.root);
                    break;
                case 8:
                    x.postOrder(x.root);
                    break;
            }
            System.out.println("");
        }

    }
}

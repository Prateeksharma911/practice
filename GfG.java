//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


public class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
 
        inOrder(node.left);
        System.out.print(node.data + " ");
 
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Spiral g = new Spiral();
                ArrayList<Integer> result = g.findSpiral(root);
                for(int value : result)
                System.out.print(value + " ");
			    System.out.println();
    	        
	        }
	}
}




// } Driver Code Ends


//User function Template for Java


/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral
{
    void traverse(Node root,HashMap<Integer,ArrayList<Integer>> hm, int level) {
        if (root == null) {
           return; 
        }
        traverse(root.left, hm, level+1);
        if (hm.containsKey(level)) {
            System.out.println("Adding for level" + level);
            ArrayList<Integer> arraylist = hm.get(level);
            
            System.out.println(arraylist);
            arraylist.add(root.data);
            hm.put(level, arraylist);
        } else {
            
            System.out.println("Adding for level" + level + "WITH data "+ root.data);
            
            // ArrayList<Integer> itemsList = new ArrayList<Integer>();
            // itemsList.add(root.data);
            // hm.put(level, itemsList);
            hm.put(level,  new ArrayList<Integer>(Arrays.asList(root.data)));

            System.out.println(hm);
            System.out.println("HM");
            
        }
        traverse(root.right, hm, level+1);
    }
    
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
        traverse(root, hm, 0);
        int leveltrav = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(hm);
        while (hm.containsKey(leveltrav)) {
            ArrayList<Integer> arrayvalue = hm.get(leveltrav);
            int sizeofarray = arrayvalue.size();
            if (leveltrav%2 == 0) {
                int indexing = sizeofarray-1;
                while (indexing >= 0) {
                    ans.add(arrayvalue.get(indexing));
                    indexing--;
                }
            } else {
                int indexing = 0;
                while (indexing < sizeofarray) {
                    ans.add(arrayvalue.get(indexing));
                    indexing++;
                }
            }
            leveltrav++;
            
        }
        return ans;
    }
}








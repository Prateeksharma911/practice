import java.util.*;
public class Foo {
	public static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> ans = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[i] < stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(stack.peek());
            }
            stack.add(a[i]);
        }
        
        
        
        return ans;
    }
	public static void main(String[] args) {
		// Foo ob = new Foo();
		System.out.println("Hello");
		// int[] arr = new int[]{1};
		System.out.println(leftSmaller(6, new int[]{1, 5, 0, 3, 4, 5}));
	}
}
  package t6atester;

public class T6ATester {
    public static void main(String[] args) {
        FinalT6A q1 = new FinalT6A(2, 1);
        q1.methodA();

        FinalT6A q2 = new FinalT6A(3, 5);
        q2.methodA();

        q1 = new FinalT6A(5, 7);
        q1.methodA();
        q2.methodA();
    }
}

public class FinalT6A {
    public int temp = 4;
    private int sum;
    private int y = 1;

    public FinalT6A(int x, int p) {
        temp += 1;  // Increment temp
        y = temp - p;  // Calculate y based on the new temp and p
        sum = temp + x;  // Calculate sum
        System.out.println(x + " " + y + " " + sum);  // Print x, y, and sum
    }

    public void methodA() {
        int x = 0, y = 0;  // Initialize x and y
        y = y + this.y;  // Add instance variable y to local y
        x = this.y + 2 + temp;  // Calculate x using instance variable y and temp
        sum = x + y + methodB(temp, y);  // Update sum and call methodB
        System.out.println(x + " " + y + " " + sum);  // Print x, y, and sum
    }

    public int methodB(int temp, int n) {
        int x = 0;  // Initialize x
        y = y + (++temp);  // Increment temp and add it to instance variable y
        x = x + 3 + n;  // Update x
        sum = sum + x + y;  // Update sum
        System.out.println(x + " " + y + " " + sum);  // Print x, y, and sum
        return sum;  // Return sum
    }
}

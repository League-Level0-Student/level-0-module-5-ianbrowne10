import javax.swing.JOptionPane;

public class Fibonacci {
public static void main(String[] args) {
int num1 = 1;
int num2 = 0;
int sum = num1 + num2;	
for (int i = 0; i < 10; i++) {
	
num2 = num1;
num1 = sum;	
sum = num1 + num2;
System.out.println(sum);
}
	
	
	
}
}

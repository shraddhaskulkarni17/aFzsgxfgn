package Basic_program;

public class SingleArray {
public static void main(String[] args) {
	String[] str=new String[5];
//	str[0]="abc1";
//	str[1]="abc2";
//	str[2]="abc3";
	 String[] str1= {"10","20","30","40"};
	for(int i=0;i<=2;i++) {
		System.out.print(str1[i]+" ");
	}
	
	System.out.println("----Even Number----");
	for(int i=0;i<=3;i=i+2) {
		System.out.print(str1[i]+" ");
	}
	
	System.out.println("----Odd Number----");
	for(int i=0;i<=3;i++) {
		System.out.println();
	}
}
}

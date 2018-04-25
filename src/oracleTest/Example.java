package oracleTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Example {

//	 int a = 100; 																			//1
//	 static int b = 200;
//	 public static void main(String[] args) {
//	
//	 Example abc1 = new Example();
//	 System.out.println(abc1.a+" "+b);    //100  200
//	
//	 Example abc2 = new Example();
//	 Val(500);
//	 System.out.println(abc2.a+" "+b);  //  100  500
//	 }
//	 public static void Val(int c) {
//	 b=c;
//	 }

	
	
	
	
	
	
	
//	 public static void main(String[] args) { 							//2
//	
//	 StringBuilder sb = new StringBuilder(5);
//	 String str1 = "";
//	 String str2 = sb.toString();
//	
//	 System.out.println(str1==str2);          //false
//	 System.out.println(str1.equals(str2)); //true
//	
//	 }

	
	
	
	
	
	
	
	
	
//	 public static void main(String[] args) {								 //3
//	
//	 int x = 3;
//	 switch(x){
//	 default:
//	 case 1:
//	 x++;
//	 case 2:
//	 x+=2;
//	
//	 }
//	 System.out.println(x);      //output  6
//	
//	 }

	
	
	
	
	
	
	
	
//	 int a = 0; //4
//	 static int b;
//	
//	 public int Lol(int sum) {
//	 while(a<5) {
//	 b++;
//	 a++;
//	 }
//	 return b;
//	 }
//	 public static void main(String[] args) {
//	
//	 Example exam1 = new Example();
//	 exam1.Lol(2);
//	
//	 Example exam2 = new Example();
//	 exam2.Lol(3);
//	 System.out.println(exam1.b+" "+exam2.b);    //output  10 10
//	
//	 }

	
	
	
	
	
	
	
	
//	 public static void main(String[] args) { //5
//	 int [] names = new int [2];
//	 names [0] = 12;
//	 names [1] = 13;
//	
//	 names = new int[4];
//	 names [2] = 14;
//	 names [3] =15;
//	
//	 for(int a: names) {
//	 System.out.println(a); //output  0 0 14 15
//	 }
//	 }

	
	
	
	
	
	
//	 class A() {														 //6
//	 System.out.println("A");
//	 }
//	
//	 class B extends A() {	
//	 System.out.println("B");
//	 }
//	
//	 class C extends B() {	
//	 System.out.println("C");
//	 }
//	
//	 C c = new C();      //output    A B C

	
	
	
	
	
//	 public static void main(String[] args) { //7
//	 int[] arr1 = {1,2,3,4,5};
//	 int[] arr2 = new int[3];
//	 arr2=arr1;
//	 for(int i: arr2) {
//	 System.out.println(i); //output  1 2 3 4 5 
//	 }
//	 }

	
	
	
	
	
	// Which is gonna run? //8
	//
	// A) public static void main(String[] args) {
	//
	// }
	// B) public static void main(Object[] args) {
	//
	// }
	// C) public static void main(Integer[] args) {
	//
	// System.out.println("In Object")
	// }
	// //Correct answer is A

	
	
	
	
	
	
	
	// public static void main(String[] args) { //9
	// LocalDate dt = LocalDate.parse("2018-01-32");
	// LocalDate dt1 = dt.plusDays(10);
	// }
	//

	
	
	
	
	
	
	
	
//	 public static void main(String[] args) { //10
//	
//	 String str[][] = {{"j","a","v,","a"},{"j","a","v,","a"}};
//	 for (String[] strings : str) {
//	 for (int i = 0; i < strings.length; i++) {
//	 System.out.println(strings[i]); //output   java java 
//	 }
//	 System.out.println();
//	 }
//	
//	 }

	
	
	
	
	
	
//	 public static void main(String[] args) { //11
//	 List al = new ArrayList<>();
//	 al.add('a');
//	 al.add(2);
//	 al.add(3);
//	 al.add(null);
//	 al.add(null);
//	 al.remove(2);
//	 al.remove(0);
//	 al.remove(new Character('a'));
//	
//	 System.out.println(al);  //output  2 null null
//	 }

	
	
	
	
	
	
	
//	 public static void main(String[] args) { 							//12
//	 StringBuilder sb = new StringBuilder(5);
//	 String str = ""; //no space
//	 if(sb.toString().equals(str)) {
//	 System.out.println("true");       //output  true
//	 }else {
//	 System.out.println("false");
//	 }
//	 }

	
	
	
	
	
	
//	 public static void main(String[] args) { //13
//	 int[] num = {8,4,3,5};
//	 int i = 0;
//	 while(i<num.length) {
//	 System.out.println(num[i]);   //output    8 4 3 5 
//	 i++;
//	 }
//	 }

	
	
	
	
	
	
	
	
//	 public static void main(String[] args) { //14
//	 String [] str = {"A","B","C"};
//	 for ( String string : str) {
//	 System.out.println(string);
//	 if(string.equals("C")) {
//	 continue;
//	 }
//	 System.out.println("Work done");  //output  A Work done
//	 break;
//	 }
//	 }

	
	
	
	
	
	
	
//	 public static void main(String[] args) { 					//15
//	 int arr1[] = {0,9,8,7};
//	 int arr2[] = {1,2,3,4,9};
//	 int arr3[] = {9,8,12,3,4,5};
//	
//	 int n1 = arr1[1];
//	 int n2 = arr2[4];
//	 int n3 = arr3[0];
//	
//	 System.out.println(n1+" "+n2+" "+n3);    //output 9 9 9 
//	 }

	
	
	
	
	
	
	
	
//	 static int i;
//	 public static void main(String[] args) { 						//16
//	 int p,r,t;
//	 if(i==0) {
//	 p=10;
//	 r=20;
//	 t=30;	
//	 }
//	 System.out.println(p+r+t); //output it will not compile because out of the scope
//	 }

	
	
	
	
	
	
//	 public static void main(String[] args) {						 //17
//	
//	 int [][] num = new int [3][4];
//	 for (int i = 0; i < num.length; i++) {
//	 for (int j = 0; j < num[i].length; j++) {
//	 System.out.println(num[i][j]); //output    12 times 0
//	 }
//	 }
//	 }

	
	
	
	
	
	
	
//	 public static void main(String[] args) { //18
//	 for (int i = 0; i < 3; i++) {
//	 boolean flag = false;
//	 switch(i) {
//	 default:
//	 flag = true;
//	 }
//	 if(flag)
//	 System.out.println(i); //output   0 1 2 
//	 }
//	 }

	
	
	
	
	
	
	
//	public static void main(String[] args) { // 19
//		int i = 1, j = 10;
//
//		do {
//			if (i++ > --j)
//				continue;
//		} while (i < 5);
//		System.out.println(i + " " + j);   // output 5 6 
//	}

	
	
	
	
	
	
	
	
//	 public static void main(String[] args) { //20
//	 String mystr = "good";
//	 char [] chr = {'g','o','o','d'};
//	 String strNull = "";
//	 for(char ch: chr) {
//	 strNull = strNull+ch;
//	 }
//	 System.out.println(mystr==strNull);    //  false 
//	 System.out.println(mystr.equals(strNull)); // true
//	 }

	
	
	
	
	
	
//	 public static void main(String[] args) { //21
//	 String one = "one";
//	 String two = "two";
//	 System.out.println(one.equals(one=two)); //  false
//	 }

	
	
	
	
	
	// static int num1; 													//22
	// int num2;
	//
	// public Example(int num) {
	// if(num>num1) {
	// this.num1 = num;
	// this.num2 = num;
	// }
	// }
	// public static void main(String[] args) {
	// Example ex1 = new Example(50);
	// Example ex2 = new Example(125);
	// Example ex3 = new Example(100);
	// System.out.println("num1 "+ex1.num1+ " num2 "+ex1.num2); //125 50
	// System.out.println("num1 "+ex2.num1+ " num2 "+ex2.num2); //125 125
	// System.out.println("num1 "+ex3.num1+ " num2 "+ex3.num2); //125 0
	// }

	
	
	
	
	
	
	
//	 public static void main(String[] args) { //23
//	 Example a = new Example();
//	 Example b = new Example();
//	 Example c = new Example();
//	
//	 a=c;
//	 c=b;
//	 b=null;      //how many garbig collector?
//	
//	 }

	
	
	
	
	
	
//	 public static void main(String[] args) { //24
//	 StringBuilder sb = new StringBuilder(5);
//	 String str = "";
//	 if(sb.equals(str)) {
//	 System.out.println("XXX");
//	 }else if(sb.toString().equals(str)) {
//	 System.out.println("YYY");    //output  YYY
//	 }else {
//	 System.out.println("In Else");
//	 }
//	 }

	
	
	
	
	
	
	
//	 public static void main(String[] args) { 							//25
//	 String str =" ";
//	 if(str.equals(" ") && str.isEmpty()){
//	 System.out.println("if answer");
//	 }else {
//	 System.out.println("else answer");  //output else anwser
//	 }
//	 }

	
	
	
	
//	 public static void main(String[] args) { //26
//	 int [] numbers = {1,2,3,4,5};
//	 numbers = new int[] {1,2,3};
//	 for(int n : numbers) {
//	 System.out.println(n);   //output  1 2 3
//	 }
//	 }

	
	
	
	
	
	
	
	
//	 public static void main(String[] args) { //27
//	 int [] n1 = new int[3];
//	 n1[0] = 1;
//	 n1[1] = 2;
//	 n1[2] = 3;
//	 int n2[] = {1,2,3,4,5};
//	 n1=n2;
//	 for (int n3 : n1) {
//	 System.out.println(n3);    //output  1 2 3 4 5 
//	 }
//	 }

	
	
	
	
	
	
//	 public static void main(String[] args) { //28
//	 int count = 0;
//	 String str [] = {"2012", "2013", "2014", "2015", "2016"};
//	 for(int i=0; i<str.length;) {
//	 i++;
//	 if(str[i].equals("2014")) {
//	 continue;
//	 }
//	 count++;
//	 }
//	 System.out.println(count);   //output  java.lang.ArrayIndexOutOfBoundsException
//	 }

	
	
	
	
	
	
	// int a;
	// static int b;
	// public static void main (String args[]){ //29
	// Example a = new Example();
	// Example b = new Example();
	// a.a = 5;
	// a.b = 5;
	// b.a = 10;
	// b.b = 10;
	// System.out.println(a.a); // 5
	// System.out.println(a.b); // 10
	// System.out.println(b.a); // 10
	// System.out.println(b.b); // 10
	// }

	
	
	
	
	
	
//	 public static void main(String[] args) { //30
//	 List list = new ArrayList<>();
//	 list.add(1);
//	 list.add(2);
//	 list.add(3);
//	 list.add(null);
//	 list.remove(2);
//	 list.remove(null);
//	 System.out.println(list); //output [1,2]
//	 }

	
	
	
	
	
	
//	 static final int x=1;
//	 public static void main(String[] args) { //31
//	
//	 if (m1(x)) {
//	 System.out.println("Java SE ");
//	 }else
//	 System.out.println("Java EE "); //output   Java EE
//	 }
//	
//	
//	 static boolean m1(int x) {
//	 return x > 0 ? false : true;
//	 }

	
	
	
	
//	public static void main(String[] args) {  											// 32
//		int aVar = 9;
//		if (aVar++ < 10) {
//			System.out.println(aVar + " Hello World!");    //output  10 Hello World
//		} else {
//			System.out.println(aVar + " Hello Universe!");    
//		}
//	}
	
	
	
	
//	public static void main(String[] args) {								//33
//		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
//		System.out.println(date);    //output Exception at runtime
//	}
	
	
	
	
//	public static void main(String[] args) {     			// 34
//		String shirts[][] = new String[2][2];
//		shirts[0][0] = "red"; 
//		shirts[0][1] = "blue";
//		shirts[1][0] = "small";
//		shirts[1][1] = "medium";
//		for (int index = 0; index < 2;) {
//			for (int idx = 0; idx < 2;) {
//				System.out.print(shirts[index][idx] + ": ");  //output red: blue: small: medium:
//				idx++;
//			}
//			index++;
//		}
	
	
	
	
	
//	public static void main(String[] args) {   							//35
//		int x = 100;
//		int a = x++;
//		int b = ++x;
//		int c = x++;
//		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c; 
//		System.out.println(d);						//output compliation error
//		}
	
	
	
	
	
	
//	public static void main(String[] args) {									//36
//		String[][] chs = new String[2][];
//		chs[0] = new String[2];
//		chs[1] = new String[5];
//		int i = 97;
//		for (int a = 0; a < chs.length; a++) {
//			for (int b = 0; b < chs.length; b++) {
//				chs[a][b] = " " + i;
//				i++;
//			}
//		}
//		for (String[] ca : chs) {
//			for (String c : ca) {
//				System.out.print(c + " ");     // 97 98
//			} 													
//			System.out.println();                // 99 100 null null null
//		}
//	}
	
	
	
	
	
	
//	public static void main(String[] args) { 									//37
//		List<String> names = new ArrayList<>();
//		names.add("Robb");
//		names.add("Bran");
//		names.add("Rick");
//		names.add("Bran");
//		if (names.remove("Bran")) {
//			names.remove("Jon");
//		}
//		System.out.println(names);     //output [Robb, Rick, Bran]
//	}
	
	
	
	
	
//	static int i;
//	int j;
//	public static void main(String[] args) {										//38
//		Example x1 = new Example();
//		Example x2 = new Example();
//		x1.i = 3;
//		x1.j = 4;
//		x2.i = 5;
//		x2.j = 6;
//		System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);  // 5 4 5 6
//	}
	
	
	
	
//	int ns;
//	static int s;
//
//	Example(int ns) {
//		if (s < ns) {
//			s = ns;
//			this.ns = ns;
//		}
//	}
//	void doPrint() {
//		System.out.println("ns = " + ns + " s = " + s);
//	}
//	public static void main(String[] args) {																	//39
//		Example ref1 = new Example(50);
//		Example ref2 = new Example(125);
//		Example ref3 = new Example(100);
//		ref1.doPrint();
//		ref2.doPrint();
//		ref3.doPrint();
//		        //output   ns = 50 s = 125
//				//output   ns = 125 s = 125
//				//output   ns = 0 s = 125
//	}
	
	
	
	
	
//	public static void main(String[] args) {												//40
//		int ii = 0;
//		int jj = 7;
//		for (ii = 0; ii < jj -1; ii = ii + 2) {
//			System.out.print(ii + " ");						//output 0 2 4
//		}
//	}

	
	
	
	
	
	
//	public static void main(String[] args) { 							// 41
//		LocalDate date1 = LocalDate.now();
//		LocalDate date2 = LocalDate.of(2014, 6, 20);
//		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
//		System.out.print("date1 = " + date1); // output date1 = 2014-06-20
//		System.out.print("date2 = " + date2); // output date2 = 2014-06-20
//		System.out.print("date3 = " + date3); // output date2 = 2014-06-20
//	}
	
	
	
	
	
	
//	public static void main(String[] args) {														//42
//		String[][] arr = { { "A", "B", "C" }, { "D", "E" } };
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//				if (arr[i][j].equals("B")) {
//					break;
//				}
//			}
//			continue;													//output  A B D E 
//		}
//	}
	
	
//	int x;
//	int y;
//	public void doStuff(int x, int y) {
//		this.x = x;
//		y = this.y;
//	}
//	public void display() {
//		System.out.println(x + " " + y + " : ");
//	}
//	public static void main(String[] args) {														//43
//		Example m1 = new Example();
//		m1.x = 100;
//		m1.y = 200;
//		Example m2 = new Example();
//		m2.doStuff(m1.x, m1.y);
//		m1.display();          		 // output 100 200
//		m2.display();          		 // output 100 0
//	}

	
	
	
	
	
//	int x;
//	static int y;
//	public Example(int a, int b) {
//		this.x = a;
//		b = this.y;
//	}
//	public void print() {
//		System.out.println(x + " :" + y);
//	}
//	public static void main(String[] args) {															//44
//		Example u = new Example(100, 200);
//		u.x = 300;
//		u.y = 400;
//		u.print();
//		Example t = new Example(200, 100);
//		t.x = 400;
//		t.y = 300;
//		t.print();                 //output 300 :400    400: 300
//	}
	
	
	
	

	
	
	}











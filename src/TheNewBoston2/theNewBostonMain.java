package TheNewBoston2;
import java.util.Random;
import java.util.Scanner;

public class theNewBostonMain {
	public static void main(String[] args) {
//		Scanner bucky7 = new Scanner(System.in);
//		double fnum , snum, answer;
//		System.out.println("Enter first num: ");
//		fnum = bucky7.nextDouble();		
//		System.out.println("Enter second num: ");
//		snum = bucky7.nextDouble();		
//		answer = fnum+snum;
//		System.out.println(answer);                                        //7
		
		
		
		
//		int  girls, boys, people;
//		girls = 7; boys = 3;
//		people = girls % boys;
//		System.out.println(people);                                        //8
		
		
		
//		int tuna = 5, bass = 18;
//		tuna *= 8;
//		System.out.println(tuna);										   //9
		
		
		
//		int test = 6;
//		if(test!=9) {
//			System.out.println("yes");
//		}else{
//			System.out.println("this is else");
//		}    																//10
		
		
		
//		int boy = 18, girl = 68;
//		if(boy>10 || girl<60) {
//			System.out.println("You can enter");
//		}else {
//			System.out.println("You can not enter");
//		}																	//11
		
		
		
//		int age = 4;
//		
//		switch(age) {
//			case 1:
//				System.out.println("You can crawl");
//				break;
//			case 2:
//				System.out.println("You can talk");
//				break;
//			case 3:
//				System.out.println("You can get in trouble");
//				break;
//			default:
//				System.out.println("I dont know how old are you");                
//	} 																					//12
		
		
		
//		   int counter = 0;
//		   while(counter<10) {
//			   System.out.println(counter);
//			   counter++;
//		   }																				//13
		
		
		
//		theNewBostonUtil t14 = new theNewBostonUtil();
//		t14.simpleMessage();    																//14
		
		
		
//		Scanner scan15 = new Scanner(System.in);
//		theNewBostonUtil t15 = new theNewBostonUtil();
//		System.out.println("Enter your name here");
//		String name = scan15.nextLine();
//		t15.simpleMessage(name);																//15
		
		
		
//		Scanner scan16 = new Scanner(System.in);
//		theNewBostonUtil t16 = new theNewBostonUtil();
//		System.out.println("Enter name of first gf here: ");
//		String temp16 = scan16.nextLine();
//		t16.setName(temp16);
//        t16.saying();																		//16	
		
		
		
//		theNewBostonUtil t17 = new theNewBostonUtil("Kelsey");
//		theNewBostonUtil tt17 = new theNewBostonUtil("Nickole");
//		t17.saying();
//		tt17.saying();																		//17
		
		
		
//		int age = 60;
//		
//		if(age<50) {
//			System.out.println("Your are young");
//		}else {
//			System.out.println("Your are old");
//			if(age>75) {
//				System.out.println("Your are really old");
//			}else {
//				System.out.println("Dont worry you arent really that old");
//			}
//		}																						//18
		
		
		
//		int age = 45;
//		
//		if(age>60) 
//		System.out.println("You are a senior citizen");	
//		else if(age>=50)
//			System.out.println("You are in ur 50s");
//		else if(age>=40)
//			System.out.println("You are in ur 40s");
//		else  
//			System.out.println("You are a young buck"); 											//19
		
		
		
//		int age = 21;		
//		System.out.println(age>50?  "You are old": "You are young"); 								//20
		
		
		
//		Scanner scan21 = new Scanner(System.in);
//		int total = 0, grade, average, counter = 0;
//		
//		while(counter<6) {
//			grade = scan21.nextInt();
//			total = total+grade;
//			counter++;
//		}
//		average = total/10;
//		System.out.println("Your average is: "+ average);												//21
		
		
		
//		for(int counter = 1; counter<=21; counter+=3) {
//			System.out.println(counter);
//		}																								//22
		
		
		
//		//A = P(1+R)^n
//		double amount, principal = 10000;
//		double rate = .01;
//		
//		for(int day=1; day<=20; day++) {
//			amount = principal*Math.pow(1+rate, day);
//			System.out.println(day+"  "+amount);
//		}																								//23
		
		
		
//		int counter = 15;
//		
//		do {
//			System.out.println(counter);
//			counter++;			
//		}while(counter<=10);																				//24
		
		
		
//		Random dice = new Random();
//		int number;
//		
//		for(int counter = 1; counter<=10; counter++) {
//			number = dice.nextInt(6)+1;
//			System.out.println(number+ " ");
//		}																									//26
		
		
		
//		    int bucky[] = {13,22,3,4,5};		
//			System.out.println(bucky[2]);																	//27
		
		
		
		
//		System.out.println("Index\tValues");
//		int bucky[] = {32,12,18,54,2};
//		
//		for(int i=0; i<bucky.length; i++) {
//			System.out.println(i+"\t"+bucky[i]);
//		}																									//28
		
		
		
//		int bucky[] = {21,16,86,222,3};
//		int sum = 0;
//		for(int i=0; i<bucky.length; i++) {
//			sum+=bucky[i];
//		}
//		System.out.println("The sum of theze number is: "+sum);            										//29
		
		
		
//		Random rand = new Random();
//		int freq[]= new int[7];
//		for(int roll=1; roll<1000; roll++) {
//			++freq[1+rand.nextInt(6)];
//		}		
//		
//		System.out.println("Face\tFrequency");
//		
//		for(int face = 1; face<freq.length; face++) {
//			System.out.println(face+"\t"+freq[face]);
//		}																											//30
		
		
		
//		int bucky[]= {3,4,5,6,7};
//		int total = 0;
//		
//		for(int x: bucky) {
//			total+=x;
//		}
//		System.out.println(total);																					//31
		
		
//		theNewBostonUtil t32 = new theNewBostonUtil();
//		int bucky[] = {3,4,5,6,10};
//		t32.change(bucky);
//		for(int y: bucky) {
//			System.out.println(y);
//		}																											//32
		
		
		
//		int firstArray[][]= {{8,9,10,11},{12,13,14,15}};
//		int secondArray[][]= {{30,31,32,33},{43},{4,5,6}};															//33
		
		
		
//		int firstArray[][]= {{8,9,10,11},{12,13,14,15}};
//		int secondArray[][]= {{30,31,32,33},{43},{4,5,6}};
//		
//		theNewBostonUtil t34 = new theNewBostonUtil();
//		System.out.println("This is the first array");
//		t34.display(firstArray);
//		
//		System.out.println("This is the second array");
//		t34.display(secondArray);																					//34
		
		
		
//		theNewBostonUtil t35 = new theNewBostonUtil();
//		System.out.println(t35.average(43,56,76,8,65,76,2,31));														//35
		
		
		
//		theNewBostonUtil t41 = new theNewBostonUtil();
//		theNewBostonUtil t41hour = new theNewBostonUtil(5);
//		theNewBostonUtil t41minute = new theNewBostonUtil(5,13);
//		theNewBostonUtil t41second = new theNewBostonUtil(5,13,43);
//
//        System.out.printf("%s\n",t41.toMilitary());
//        System.out.printf("%s\n",t41hour.toMilitary());
//        System.out.printf("%s\n",t41minute.toMilitary());
//        System.out.printf("%s\n",t41second.toMilitary());															//41
		
		
		
//		theNewBostonPotpie pot = new theNewBostonPotpie(4,5,6);														//42
		
	
//		theNewBostonPotpie pot43 = new theNewBostonPotpie(4,5,6);
//		theNewBostonUtil t43 = new theNewBostonUtil("Bucky", pot43);
//		System.out.println(t43);																					//43 43


        

		
		
		
		
		
		
		
		
		
			

	
	}
	

}






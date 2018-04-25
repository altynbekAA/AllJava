package letsdoit;

public class TablicaMain {
	public static void main (String ...food) {
		
		Tablica Kewa = new Tablica();
	    //Kewa.getTablica(10);                                 //1
	    
	    Kewa.getTuz("Altynbek");                               //2
	    
	    System.out.println();
	    
	    Kewa.getBack("Altynbek");                                     //3
	    
	    System.out.println();
	    
	    String result = Kewa.stringTime("Hi", 5);                     //4
	    System.out.println(result);
	    
	    int [] arr = {3,2,1,7,5,6,4};
	    
	    System.out.println(Kewa.array(arr)+" max");                   //5
	    
	    System.out.println(Kewa.array1(arr)+" min");                  //6
	    
	    
	    
	    String bir = "I love cybertek";
	    System.out.println(Kewa.birChon(bir));                         //7
	    
	    
	    int [] num = {1,2,9,9,};
	    System.out.println(Kewa.arrayCount9(num));
	    
	    Kewa.Load("Chicago");
	    System.out.println();
	    
	    
	    System.out.println();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	 

}










 class A{  
    private A(){
	System.out.println("Hello java");}//private constructor 
	 
    void msg()
	{System.out.println("Hello java");}  
 }  
class private_constructor{  
     public static void main(String args[]){  
      A ob=new A();
     }  
 }  
abstract class Engineering
{
    void display()
    {
        System.out.println("Method display invoked");
        
    }
}

interface Programming
{  

void coding();

 
}  

interface Drawing
{  

void draw();
 
} 

class Computer extends Engineering implements Programming
{

    
public void coding()
{
 System.out.println("Method coding invoked by computer class");   
}
    
}

class Mechanical extends Engineering implements Drawing
{
 
  
    public void draw()
{
    System.out.println("Drawing interface method draw invoked");
}
    
    
    
    
}

class Test {
    public static void main(String[] args) {
  
        Computer com=new Computer();
        Mechanical mech=new Mechanical();
        com.coding();
        com.display();
        mech.draw();
        mech.display();
        
    }
}

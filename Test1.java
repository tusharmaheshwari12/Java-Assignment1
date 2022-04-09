interface GrandParent
{
void grandparentmethod();
}

interface Parent1 extends GrandParent
{
    void parent1method();
}
interface Parent2 extends GrandParent
{
    void parent2method();
}
interface Child extends Parent1,Parent2
{
    void childmethod();
   
}
class Family implements Child
{
    public void grandparentmethod()
    {
        System.out.println("Overriding grandparentmethod ");
    }
   
    public void parent1method()
    {
        System.out.println("Overriding parent1method ");
    }
   
    public void parent2method()
    {
        System.out.println("Overriding parent2method ");
    }
   
    public void childmethod()
    {
        System.out.println("Overriding childmethod ");
    }
   
     public void familymethod()
    {
        System.out.println("invoking familymethod ");
    }
   
   
}




class Test1 {
    public static void main(String[] args) {
       
        Family f=new Family();
        f.grandparentmethod();
        f.parent1method();
        f.parent2method();
        f.childmethod();
        f.familymethod();
       
    }
}

import greenfoot.*;

/**
 * Write a description of class Apple here.
 * 
 * @author Josh
 * @version (a version number or a date)
 */
public class Back extends Keys
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new TCC());
       }  
      
}
   
}

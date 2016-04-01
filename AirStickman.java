import greenfoot.*;

/**
 * Write a description of class AirStickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirStickman extends Stickman
{
    /**
     * Act - do whatever the AirStickman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (5);
        lookforStickman();
    } 
    public void lookforStickman()
    {
      if (isTouching (Stickman.class))
      {
          jumpForward();
          jumpBackwards();
      }
        
    }
    
    public void jumpForward()
    {
        setLocation(getX(), getY() -200);
        Greenfoot.delay(10);
        setLocation(getX()+300, getY() );
        Greenfoot.delay(10);
        setLocation(getX(),getY() + 200);
        Greenfoot.delay(10);
        setLocation(getX(),getY() +300);
        Greenfoot.delay(10);
        setLocation(getY(),getX() -300);
    }
    public void jumpBackwards()
    {
        setLocation(getY(), getX() +200);
        Greenfoot.delay(10);
        setLocation(getY()-300, getX() );
        Greenfoot.delay(10);
        setLocation(getY(),getX() - 200);
        Greenfoot.delay(10);
        setLocation(getY(),getX() -300);
        Greenfoot.delay(10);
        setLocation(getY(),getX() +300);
    }
}

        



        
        
 

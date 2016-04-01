import greenfoot.*;

/**
 * Like Stickman, only mobile
 * 
 * 
 */
public class jumpingStickman extends Stickman
{
    /**
     * Act - do whatever the jumpingStickman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
       move (5);
       lookForStickman();
    }
    
    public void jumpOver()
    { 
      setLocation (190, 320);
      Greenfoot.delay (2);
      setLocation (210, 300);
      Greenfoot.delay (2);
      setLocation (230, 270);
      Greenfoot.delay(2);
      setLocation (250, 240);
      Greenfoot.delay(2);
      setLocation (270, 200);
      Greenfoot.delay(2);
      setLocation (290, 190);
      Greenfoot.delay (3);
      setLocation (315, 150);
      Greenfoot.delay (3);
      setLocation (335, 190);
      Greenfoot.delay (3);
      setLocation (355, 200);
      Greenfoot.delay (3);
      setLocation (395,240);
      Greenfoot.delay(3);
      setLocation(415,270);
      Greenfoot.delay(3);
      setLocation (435,300);
      Greenfoot.delay (3);
      setLocation (455,300);
      Greenfoot.delay (3);
      setLocation(475,320);
      
    }
    public void lookForStickman()
    {
        if (isTouching(Stickman.class))
        {
            jumpOver();
        }
        
    }
}

import greenfoot.*;

/**
 * Write a description of class JumpingStickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpingStickman extends Stickman
{
    /**
     * Act - do whatever the JumpingStickman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        lookForStickman();
    }    
    public void lookForStickman()
    {
        if (isTouching (Stickman.class))
        {
            jumpOver();
        }
    }
    public void jumpOver()
    {
        setLocation(getX(),getY()-200);
        Greenfoot.delay(10);
        setLocation(getX()+300 ,getY());
        Greenfoot.delay(10);
        setLocation(getX(),getY()+200);
    }
}

import greenfoot.*;

/**
 * Write a description of class crabby here.
 * 
 * @Paul Frazier 
 * @V1.0
 */
public class crabby extends Actor
{//start class
    /**
     * Act - do whatever the crabby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {//start method
        if ( isAtEdge() )
        {//start if statement
            turn (90); 
            move (2);
        }//end if statement
        move (-3); 
        turn (-1);
        Greenfoot.getRandomNumber(80);
    }//end method    
}//end class

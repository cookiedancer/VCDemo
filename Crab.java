import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 * 
 * Version: 2
 * 
 * In this version, the crab walks around the beach more or less randomly.
 */
public class Crab extends Actor
{
    private int niceMeme; //storage for Random Number
    /**
     * Act - do whatever the crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act() 
{
    

   

    checkKeypress();
    move(5);    
    seekForWorm();
}

 public int seeIAmError()
{
    niceMeme = Greenfoot.getRandomNumber(100);
    return niceMeme;
}

public void moveIt()
{// start method
    move(20);
}// end method
public void seekForWorm()
{
    if (isTouching(worm.class))
    {
        removeTouching(worm.class);
        Greenfoot.playSound("slurp.wav");
        World myCurrentWorld=getWorld();
        myCurrentWorld.addObject(new worm(),
          Greenfoot.getRandomNumber(560),
          Greenfoot.getRandomNumber(560));
    }   
}

public void checkKeypress()
{
    if(Greenfoot.isKeyDown("left"))
    {
        turn(-4);
    }
    if (Greenfoot.isKeyDown("right"))
    {
        turn(4);
    }
}
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld2 extends World
{

    /**
     * Constructor for objects of class CrabWorld2.
     * 
     */
    public CrabWorld2()
    {    
        super(760, 760, 1); 
        prepare();
        Greenfoot.playSound("doom.wav");  
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,412,585);
        crab.setLocation(358,653);
        aa aa = new aa();
        addObject(aa,142,236);
        aa.setLocation(122,219);
        ab ab = new ab();
        addObject(ab,648,225);
        dec2 dec2 = new dec2();
        addObject(dec2,379,202);
        tituloboss tituloboss = new tituloboss();
        addObject(tituloboss,380,51);
        tituloboss.setLocation(383,43);
        worm worm = new worm();
        addObject(worm,518,386);
        worm worm2 = new worm();
        addObject(worm2,250,368);
        worm2.setLocation(245,385);
        worm worm3 = new worm();
        addObject(worm3,681,535);
        worm3.setLocation(681,535);
        worm worm4 = new worm();
        addObject(worm4,88,505);
        worm4.setLocation(91,536);
        worm4.setLocation(87,534);
        CopyOflobster copyOflobster = new CopyOflobster();
        addObject(copyOflobster,383,468);
        CopyOflobster copyOflobster2 = new CopyOflobster();
        addObject(copyOflobster2,705,653);
        copyOflobster2.setLocation(686,658);
        CopyOflobster copyOflobster3 = new CopyOflobster();
        addObject(copyOflobster3,82,634);
        copyOflobster3.setLocation(85,658);
        lobster lobster = new lobster();
        addObject(lobster,696,65);
        lobster lobster2 = new lobster();
        addObject(lobster2,59,58);
    }

    public void act()
    {
        if (getObjects(Crab.class).isEmpty()) { 
            // if there are no instances of the X object in the world
            Greenfoot.setWorld(new end()); 
            // create a new instance of the MyWorld class, restarting the game
        }
    }
}

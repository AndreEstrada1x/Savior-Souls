import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
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
        lobster lobster = new lobster();
        addObject(lobster,526,312);
        lobster.setLocation(462,333);
        lobster lobster2 = new lobster();
        addObject(lobster2,419,316);
        lobster2.setLocation(401,322);
        lobster2.setLocation(394,331);
        lobster lobster3 = new lobster();
        addObject(lobster3,336,305);
        lobster3.setLocation(349,323);
        lobster lobster4 = new lobster();
        addObject(lobster4,263,308);
        lobster4.setLocation(281,311);
        aa aa = new aa();
        addObject(aa,142,236);
        ab ab = new ab();
        addObject(ab,648,225);
        worm worm = new worm();
        addObject(worm,486,371);
        worm.setLocation(486,370);
        worm worm2 = new worm();
        addObject(worm2,405,379);
        worm2.setLocation(401,397);
        worm.setLocation(463,378);
        worm worm3 = new worm();
        addObject(worm3,337,400);
        worm3.setLocation(352,380);
        worm worm4 = new worm();
        addObject(worm4,232,384);
        worm4.setLocation(287,372);
        lobster2.setLocation(409,311);
        lobster.setLocation(498,303);
        worm2.setLocation(412,378);
        lobster.setLocation(474,295);
        lobster3.setLocation(206,468);
        lobster4.setLocation(149,383);
        aa.setLocation(141,204);
        lobster4.setLocation(72,416);
        lobster2.setLocation(553,461);
        lobster.setLocation(685,413);
        lobster.setLocation(685,413);
        aa.setLocation(100,248);
        aa.setLocation(150,211);
        aa.setLocation(124,198);
        aa.setLocation(122,219);
        worm4.setLocation(46,47);
        worm.setLocation(723,63);
        worm4.setLocation(41,71);
        worm4.setLocation(44,62);
        skull skull = new skull();
        addObject(skull,375,162);
        skull.setLocation(394,165);
        skull.setLocation(379,202);
        CopyOflobster copyOflobster = new CopyOflobster();
        addObject(copyOflobster,667,566);
        copyOflobster.setLocation(660,580);
        CopyOflobster copyOflobster2 = new CopyOflobster();
        addObject(copyOflobster2,104,584);
        worm worm5 = new worm();
        addObject(worm5,60,694);
        worm5.setLocation(44,720);
        worm worm6 = new worm();
        addObject(worm6,734,708);
        worm6.setLocation(722,712);
        tituloboss tituloboss = new tituloboss();
        addObject(tituloboss,460,54);
        tituloboss.setLocation(378,42);
        worm.setLocation(685,45);
        tituloboss.setLocation(675,46);
        tituloboss.setLocation(244,34);
        tituloboss.setLocation(402,43);
        worm.setLocation(708,59);
        tituloboss.setLocation(383,43);
    }
    public void act()
    {
        if (getObjects(Crab.class).isEmpty()) { 
            // if there are no instances of the X object in the world
            Greenfoot.setWorld(new end()); 
            // create a new instance of the MyWorld class, restarting the game
        }
        if (getObjects(worm.class).isEmpty()) { 
            // if there are no instances of the X object in the world
            Greenfoot.setWorld(new CrabWorld2()); 
            // create a new instance of the MyWorld class, restarting the game
        }
    }
}

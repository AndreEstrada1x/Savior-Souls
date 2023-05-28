import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eye here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eye extends World
{

    /**
     * Constructor for objects of class eye.
     * 
     */
    public eye()
    {    
        super(760, 760, 1); 
        prepare();
        Greenfoot.playSound("cyber.wav");  
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act()
    {
        if (getObjects(Crab.class).isEmpty()) { 
            // if there are no instances of the X object in the world
            Greenfoot.setWorld(new end()); 
            // create a new instance of the MyWorld class, restarting the game
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ala ala = new ala();
        addObject(ala,549,257);
        ala2 ala2 = new ala2();
        addObject(ala2,300,176);
        ala.setLocation(640,176);
        eyec eyec = new eyec();
        addObject(eyec,456,268);
        gold gold = new gold();
        addObject(gold,586,450);
        gold.setLocation(675,450);
        gold gold2 = new gold();
        addObject(gold2,653,574);
        gold2.setLocation(650,573);
        gold gold3 = new gold();
        addObject(gold3,649,672);
        gold2.setLocation(675,550);
        gold3.setLocation(675,650);
        flama flama = new flama();
        addObject(flama,154,408);
        flama.setLocation(94,406);
        flama flama2 = new flama();
        addObject(flama2,143,180);
        flama2.setLocation(109,313);
        flama2.setLocation(104,321);
        flama2.setLocation(374,515);
        flama.setLocation(120,377);
        Crab crab = new Crab();
        addObject(crab,162,593);
        crab.setLocation(98,662);
        CopyOfworm copyOfworm = new CopyOfworm();
        addObject(copyOfworm,548,115);
        CopyOfworm copyOfworm2 = new CopyOfworm();
        addObject(copyOfworm2,523,120);
        copyOfworm2.setLocation(495,116);
        CopyOfworm copyOfworm3 = new CopyOfworm();
        addObject(copyOfworm3,527,673);
        copyOfworm3.setLocation(556,701);
        CopyOfworm copyOfworm4 = new CopyOfworm();
        addObject(copyOfworm4,587,480);
        copyOfworm4.setLocation(587,480);
        copyOfworm4.setLocation(549,462);
        flama.setLocation(129,381);
        flama flama3 = new flama();
        addObject(flama3,82,192);
        flama2.setLocation(218,561);
        flama.setLocation(141,392);
        flama.setLocation(166,399);
        flama.setLocation(120,373);
        flama2.setLocation(151,544);
        flama2.setLocation(206,542);
        flama2.setLocation(202,544);
        flama.setLocation(146,401);
        flama.setLocation(140,370);
        tituloboss2 tituloboss2 = new tituloboss2();
        addObject(tituloboss2,394,57);
        tituloboss2.setLocation(454,34);
    }
}

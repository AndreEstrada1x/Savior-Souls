import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    flecha flecha = new flecha();
    private int opcion=0;
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
     {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(760, 760, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        gametitulo gametitulo = new gametitulo();
        addObject(gametitulo,343,105);
        gametitulo.setLocation(400,116);
        addObject (new jugar () ,400,250) ;
        addObject (new salir (), 400, 350);
        addObject (flecha, 275, 250) ;
        dec dec = new dec();
        addObject(dec,395,563);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown ("UP") && opcion!=0) {opcion++; }
        if (Greenfoot.isKeyDown ("DOWN") && opcion!=1) {opcion--;}
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
        
        flecha.setLocation(275, 250 +(opcion*100));
        
        if (Greenfoot.isKeyDown ("SPACE") || Greenfoot. isKeyDown ("ENTER") ) 
        {
            switch (opcion){
            case 0: //jugar
            Greenfoot.setWorld(new CrabWorld());
            break;
            case 1: // salir
            Greenfoot.setWorld(new eye());
            break;
            }
        }
    }
}

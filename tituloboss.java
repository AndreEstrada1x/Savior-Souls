import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tituloboss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tituloboss extends Actor
{
    /**
     * Act - do whatever the tituloboss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public tituloboss()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () /3;
        int myNewWidth = (int)myImage.getWidth () /3;
        myImage.scale (myNewWidth, myNewHeight);
    }
}

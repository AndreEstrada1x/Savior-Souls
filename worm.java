import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class worm extends Actor
{
    /**
     * Act - do whatever the worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public worm()
    {
        GreenfootImage myImage = getImage () ;
        int myNewHeight = (int)myImage.getHeight () /3;
        int myNewWidth = (int)myImage.getWidth () /3;
        myImage.scale (myNewWidth, myNewHeight);
    }
}

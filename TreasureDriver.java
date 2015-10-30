import kareltherobot.*;
/**
 * Write a description of class TreasureDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureDriver implements Directions
{
   public static void main(String[] args)
   {
        World.reset();
        World.setDelay(1);
        World.readWorld("treasureWorld.kwld");
        World.setTrace(true);
        World.setVisible(true);
        TreasureHunter bot = new TreasureHunter(2, 2, North, 0);
        bot.work();
    }
}

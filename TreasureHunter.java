import kareltherobot.*;
/**
 * Write a description of class TreasureHunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureHunter extends Robot
{
    public TreasureHunter(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }

    public void moveToNextClue()
    {
        move();
        while(!nextToABeeper()) move();
    }

    public int countBeepers()
    {
        int result = 0;

        while(nextToABeeper())
        {
            pickBeeper();
            result++;
        }
        for(int x = 0;x<result;x++){
            putBeeper();
        }

        return result;
    }

    public void work() 
    {
        while(true)
        {
            int beeps = countBeepers();
            if(beeps==1)
            {
                faceNorth();
                moveToNextClue();
            }
            else if(beeps==2)
            {
                faceWest();
                moveToNextClue();
            }
            else if(beeps==3)
            {
                faceSouth();
                moveToNextClue();
            }
            else if(beeps==4)
            {
                faceEast();
                moveToNextClue();
            } 
            else if(beeps==5)
            {
                break;
            } 
            else
            {
                move();
            }
            
        }
        turnOff();
    }

    private void faceNorth()
    {
        while(!facingNorth()) turnLeft();
    }

    private void faceEast()
    {
        while(!facingEast()) turnLeft();
    }

    private void faceSouth()
    {
        while(!facingSouth()) turnLeft();
    }

    private void faceWest()
    {
        while(!facingWest()) turnLeft();
    }
}

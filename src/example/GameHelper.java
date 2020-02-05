package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet="abcdefg";
    private int gridLength=7;
    private int gridSize=49;
    private int [] grid= new int[gridSize];
    private int shipCount=0;
    public String getUserInput(String prompt){
        String inputLine= null;
        System.out.println(prompt+" ");
        try{
            BufferedReader is= new BufferedReader(new InputStreamReader(System.in));
            inputLine= is.readLine();
            if(inputLine.length() == 0) return null;
        }catch (IOException e){
            System.out.println("IOExeption: "+e);
        }
        return inputLine.toLowerCase();
    }
    public ArrayList<String> placeShip(int size){
        ArrayList<String> alphaceCells= new ArrayList<String>();
        String [] alphacoords= new String[size];
        String temp=null;
        int [] coords= new int[size];
        int attemps=0;
        shipCount++;
        int loccation=0;
        boolean success=false;
        int location=0;
        shipCount++;
        int incr=1;
        if ((shipCount%2)==1) {
            incr=gridLength;
        }
        while(!success&attemps++<200){
            location=(int) (Math.random()*gridSize);
            int x=0;
            success=true;
            while(success&&x<size){
                if(grid[location]==0){
                    coords[x++]=location;
                    location+=incr;
                    if(location>=gridSize){
                        success=false;
                    }
                }
                else{
                   // System.out.println(" used "+location);
                    success=false;
                }
            }
        }
        int x=0;
        int row=0;
        int collumn=0;
        while(x<size){
            grid[coords[x]]=1;
            row=(int) (coords[x]/gridLength);
            collumn=coords[x]%gridLength;
            temp=String.valueOf(alphabet.charAt(collumn));
            alphaceCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaceCells;
    }

}
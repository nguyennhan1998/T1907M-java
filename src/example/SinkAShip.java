package example;

import java.util.ArrayList;

public class SinkAShip {
    private  GameHelper helper= new GameHelper();
    private ArrayList<Ship> shipList= new ArrayList<Ship>();
    private int numOfGuess=0;
    private void setUpGame(){
        Ship one= new Ship();
        one.setName("endeavour");
        Ship two = new Ship();
        two.setName("black pearl");
        Ship three= new Ship();
        three.setName("flying dutchman");
        shipList.add(one);
        shipList.add(two);
        shipList.add(three);
        System.out.println("your goal is to sink three ship");
        System.out.println("Endeavour,Black Pearl,Flying Dutchman");
        System.out.println("Try to sink them all in the fewest number of guess");
        for(Ship shipSet : shipList){
            ArrayList<String> newLocation= helper.placeShip(3);
            shipSet.setLocationCells(newLocation);


        }


    }
    private void startPlaying(){
        while(!shipList.isEmpty()){
            String userGuess= helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
    }
    private void checkUserGuess(String userGuess){
        numOfGuess++;
        String result= "miss";
        for(Ship shipToTest: shipList){
            result= shipToTest.check(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                shipList.remove(shipToTest);
                break;

            }
        }
        System.out.println(result);
    }

private void finishGame(){
    System.out.println("all the ships are sunk! you're now the king of the sea!");
    if(numOfGuess<=18){
        System.out.println("it only took you "+ numOfGuess+" guesses");
        System.out.println("you got out before your options sank.");

    }else{
        System.out.println("took you long enought. "+numOfGuess+ " guesses.");
        System.out.println("Fish are dancing with your options.");
    }
}
    public static void main(String[] args) {
        SinkAShip game= new SinkAShip();
        game.setUpGame();
        game.startPlaying();
    }

}

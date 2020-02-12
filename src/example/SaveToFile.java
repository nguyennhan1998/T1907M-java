package example;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;

public class SaveToFile {
    public static void main(String[] args) {
        GameCharacter zombie= new GameCharacter(50,"Zombie");
        zombie.addWeapon(new Weapon("teeth"));
        zombie.addWeapon(new Weapon("hands"));
        GameCharacter peaShooter= new GameCharacter(40,"PeaShooter");
        peaShooter.addWeapon(new Weapon("Gun"));
        GameCharacter mushroom= new GameCharacter(30,"MagicMushrooom");
        mushroom.addWeapon(new Weapon("poison"));
        mushroom.addWeapon(new Weapon("light"));
        try{
            FileOutputStream fileStream=  new FileOutputStream("game.dat");
            ObjectOutputStream os= new ObjectOutputStream(fileStream);
            os.writeObject(zombie);
            os.writeObject(peaShooter);
            os.writeObject(mushroom);
            os.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            FileInputStream fileStream= new FileInputStream("game.dat");
            ObjectInputStream os= new ObjectInputStream(fileStream);
            GameCharacter o1= (GameCharacter) os.readObject();
            GameCharacter o2=(GameCharacter) os.readObject();
            GameCharacter o3= (GameCharacter) os.readObject();
            os.close();
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o3);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
class Weapon implements Serializable {
    String name;
    Weapon(String n){name=n;}
    public String toString(){return name;}
}
class GameCharacter implements Serializable{
    int health;
    String type;
    Weapon[] weapons;
    int weaponCount;
    GameCharacter (int h,String t){
        health=h;type=t;
        weaponCount=0;weapons=new Weapon[10];
    }
    void addWeapon(Weapon w){
        weapons[weaponCount]=w;weaponCount++;
    }
    public String toString(){
        String s= health+" , "+type;
        for(int i=0;i<weaponCount;i++){
            s=s+","+weapons[i];

        }
        return s;
    }

}

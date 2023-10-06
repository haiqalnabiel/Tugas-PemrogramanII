
import java.util.Scanner;

public class Fighter {
    
    String Name = "Haiqal";
    String Race = "Human";
    String Job = "Blade Master";
    int Level = 102;
    String Weapon = "Blade of Orpus";
    
    int BattlePoint = 60000;
    int ATK = 2400;
    int HP = 30000;
    int Mana = 2300;
    
    void DisplayStatus() {
        System.out.println("Character Status:");
        System.out.println("Name: " + Name);
        System.out.println("Race: " + Race);
        System.out.println("Job: " + Job);
        System.out.println("Level: " + Level);
        System.out.println("Weapon: " + Weapon);
        System.out.println("ATK: " + ATK);
        System.out.println("HP: " + HP);
        System.out.println("Mana: " + Mana);
        System.out.println("BattlePoint: " + BattlePoint);
    }
    void ChooseAttack() {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Choose Attack:");
         System.out.println("1. Slash");
         System.out.println("2. Thrust");
        
        int choice = scanner.nextInt();
        
        switch (choice){
        case 1:
            Slash();
            break;
        case 2:
            Thrust();
            break;
        default:
            System.out.println("Choice invalid");
         
        }

}
    
    void Slash(){
        int Damage = ATK-500;
        System.out.println("You are Slashing with the " +Weapon+ " and dealing " +Damage+ " Damage ");
        
    }
    void Thrust(){
        int Damage = ATK-150;
        System.out.println("You are thrusting with the " +Weapon+ " and dealing " +Damage+ " damage");
        
    }
    
    
}

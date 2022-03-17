
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 131539
 */
public class GetStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int roll, math, eng, chem, kisw, bio;
        
        Scanner SC=new Scanner(System.in);
        
        System.out.print("Enter Name");
        name=SC.nextLine();
        System.out.print("Enter Roll Number");
        roll=SC.nextInt();
        System.out.print("Enter marks in Math, English, Chemistry, Kiswahili and Biology: ");
        math=SC.nextInt();
        eng=SC.nextInt();
        chem=SC.nextInt();
        kisw=SC.nextInt();
        bio=SC.nextInt();
        
        int total=math+eng+chem+kisw+bio;
        float perc=(float)total/500*100;
        
        System.out.println("Roll Number:" + roll +"\tName: "+name);
        System.out.println("Marks(Maths, English, Chemistry, Kiswahili, Biology"): "+math+", "+eng+", "+chem+", "+kisw+", "+bio+");
        System.out.println("Total: "+total+"\tPercentage:" +perc);
        
        
    }
    
}

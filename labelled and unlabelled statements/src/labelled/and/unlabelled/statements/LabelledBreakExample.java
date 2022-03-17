/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labelled.and.unlabelled.statements;

/**
 *
 * @author 131539
 */
public class LabelledBreakExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Task:
    for(int i=0; i<10; i++){
         if (i==8){
            break Task;
          }
          System.out.println("......."+i );
      } 
   }
}    
    
    



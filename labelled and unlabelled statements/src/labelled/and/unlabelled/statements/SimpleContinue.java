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
public class SimpleContinue {
    public static void main(String[] args) {
      String[] listOfNames = { "Ravi", "Soma",
         "null", "Colin", "Harry", "null",
         "Smith" };

      for (int i = 0; i < listOfNames.length; i++) {
         if (listOfNames[i].equals("null"))
            continue;
         System.out.println(listOfNames[i]);
      }
   }
}
    


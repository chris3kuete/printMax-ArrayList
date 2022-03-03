/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistmax;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sa
 */
public class ArrayListMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();
        int j;
        Scanner scan = new Scanner(System.in);
        int input ;
        
        do{
            input = scan.nextInt();
            num.add(input);
        }while(input !=0);
        System.out.println(" the numbers are "+ num);
         j = max(num);
         System.out.println("the max is "+ j);
        
    }
    public static Integer max(ArrayList<Integer> list){
        
        int highest = list.get(0);
        if (list.isEmpty()){
            return null;
        }else {
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) > highest){
                    highest = list.get(i);
                }
                
            }
        }
        return highest;
    }
    
}

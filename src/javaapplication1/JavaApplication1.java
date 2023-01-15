/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 *
 * @author User
 */
public class JavaApplication1 {

//    private static Object arrOfsize;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Hi there.My name is sam.This is my lucky day. i like coding so much.This is it.";
        String[] arrOfStr = str.split("\\.");
        Scanner myObj = new Scanner(System.in);
        int input = myObj.nextInt();
        int length = input + 1;
        StringJoiner joiner = new StringJoiner("");
         

             System.out.println(Arrays.toString(arrOfStr));
             for(int i=0;i<arrOfStr.length;i++) {
             String word[] = arrOfStr[i].split(" ");
             System.out.println(Arrays.toString(arrOfStr));
             if(word.length > input){
             System.out.println(Arrays.toString(word)); 
             int  interchange = (word.length - length);
             System.out.println(interchange);
             String  term = word[interchange];
             System.out.println("word:::"+word+"skipIndex::"+interchange);
             String temp = word[0];
             word[interchange] = temp;
             word[0] = term;
             System.out.println("new paragraph" + word);
               for(int j = 0; j < word.length; j++) {
                   if (j < (word.length -1)) {
                     joiner.add(word[j].concat(" "));
                   } else {
                       joiner.add(word[j].concat(". ")); 
                   }
               }
            }
             else{
                   joiner.add(arrOfStr[i].concat(". "));
                }
          
           } 
             
           System.out.println("Joined strings: "+ joiner);
      }
   }
        


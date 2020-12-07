/*
 * @Description: First java program
 * @Author: BO Jianyuan
 * @Date: 2020-12-07 15:00:43
 * @LastEditors: BO Jianyuan
 * @LastEditTime: 2020-12-07 15:19:51
 */
import java.time.format.DateTimeFormatter; 
import java.time.LocalDateTime;    

 public class FirstProg{
     public static void main(String[] args){
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
         LocalDateTime now = LocalDateTime.now(); 
         System.out.println("I am determined to learn how to code.");
         System.out.println(String.format("Today's date is %s.", dtf.format(now)));
     }
 }
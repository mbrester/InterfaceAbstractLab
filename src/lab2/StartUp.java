/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Mitch
 */
public class StartUp {
    public static void main(String[] args) {
        
        AdvancedJavaCourse e1 = new AdvancedJavaCourse("OOA","111");
        ProgrammingCourses e2 = new IntroJavaCourse("JAVA","112");
        ProgrammingCourses e3 = new IntroToProgrammingCourse("VB","113");
        //It seems that if you have any thing in the class that you use to create the object, then you can not have anything that is final
        //in it if you want to abstract the object
        
       e1.setCredits(1);
       e2.setCredits(4);
       e3.setCredits(3.1);
        
        
        System.out.println("Course one is " + e1.getCourseName() + " and its course number is " + e1.getCourseNumber());
        System.out.println("Course two is " + e2.getCourseName() + " and its course number is " + e2.getCourseNumber());
        System.out.println("Course three is " + e3.getCourseName() + " and its course number is " + e3.getCourseNumber());
        //While I see the benifets of using interfaces, I do not like that you have to over ride every method you wish to use in the interface
        
        
        
        
        
        
        
    }
            
}

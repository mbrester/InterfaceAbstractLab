/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Mitch
 */
public class StartUp {
    public static void main(String[] args) {
        
        ProgrammingCourses e1 = new AdvancedJavaCourse("OOA","111",4);
        ProgrammingCourses e2 = new IntroJavaCourse("JAVA","112",3);
        ProgrammingCourses e3 = new IntroToProgrammingCourse("VB","113",2);
        //I personally like using this, because it lets your objects be more flexable than just using the other method, while the other way does have its 
        //avantiges at times.
        
        
        System.out.println("Course one is " + e1.getCourseName() + " and its course number is" + e1.getCourseNumber());
        System.out.println("Course two is " + e2.getCourseName() + " and its course number is" + e2.getCourseNumber());
        System.out.println("Course three is " + e3.getCourseName() + " and its course number is" + e3.getCourseNumber());
        //I enjoy using this way of architecture, because you can choose witch classes you can have abstract, so you are not setting the methods, in other 
        //classes that do the same thing, up multiple times
        
        
        
        
        
        
        
    }
            
}

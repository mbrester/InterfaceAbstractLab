/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author mbrester1
 */
public abstract class ProgrammingCourses {
    private String courseName;
    private String courseNumber;
    private double credits;

    public ProgrammingCourses(String courseName, String courseNumber, double credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }
    
    
    
     public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    public abstract void setCourseCredits(double credits);
    
    public void setCredits(double credits){
        this.credits= credits;
    }
        
    
    
    
    
    
}

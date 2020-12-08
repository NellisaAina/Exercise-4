/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

abstract class marks {
    abstract double getPercentage();
}

class StudentA extends marks{
    double marks1,marks2,marks3,percentage;
    
    public StudentA(double m1, double m2, double m3) {
        this.marks1 = m1;
	this.marks2 = m2;
	this.marks3 = m3;
    }
    
    public double getPercentage() {
	percentage = (marks1 + marks2 + marks3)/300*100;
	return percentage;
    }
}

class StudentB extends marks{
    double marks1,marks2,marks3,marks4,percentage;

    public StudentB(double m1, double m2, double m3, double m4) {
	this.marks1 = m1;
	this.marks2 = m2;
	this.marks3 = m3;
	this.marks4 = m4;	
    }
	
    public double getPercentage() {
	percentage = (marks1 + marks2 + marks3 + marks4)/400*100;
	return percentage;
    }
}

class Question3{
    
    public static void main(String[] args) {
        
        StudentA a = new StudentA(50,60,70);
        StudentB b = new StudentB(50,90,100,50);
		
	System.out.println("Percentage for student A: "+ a.getPercentage() + "%");
	System.out.println("Percentage for student B: " + b.getPercentage()+ "%");
    }
    
}

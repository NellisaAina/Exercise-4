/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

abstract class Parent {
    abstract void message();
    public void print(){
        System.out.println("Message");
    }
}

class SubClass1 extends Parent{
    public void message(){
        System.out.println("This is first subclass");
    }
}

class SubClass2 extends Parent {
    public void message(){
        System.out.println("This is second subclass");
    }
}

class Question1 {
    
    public static void main(String[] args){
        
        SubClass1 sc1 = new SubClass1();
        SubClass2 sc2 = new SubClass2();
        
        sc1.message();
        sc2.message();
    }
    
}

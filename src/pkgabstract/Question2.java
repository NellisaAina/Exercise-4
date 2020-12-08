/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    void getBalance(){
        System.out.println("Balance Bank A: $100");
    }
}

class BankB extends Bank {
    void getBalance(){
        System.out.println("Balance Bank B: $150");
    }
}

class BankC extends Bank {
    void getBalance(){
        System.out.println("Balance Bank C: $200");
    }
}

class Question2 {

    public static void main(String[] args) {
        
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
    
}

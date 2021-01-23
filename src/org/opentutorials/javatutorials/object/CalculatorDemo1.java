package org.opentutorials.javatutorials.object;

class Calculator1 {
    static double PI = 3.14;//static을 사용하면 클래스에 저장된다 모든 인스턴스에서 사용가능하다
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    
    public void printinfo() {
    	System.out.println(PI);
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
        System.out.println(this.left + this.right+PI);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
        System.out.println((this.left + this.right) / 2+PI);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator1 c1 = new Calculator1();
        System.out.println(c1.PI);
 
        Calculator1 c2 = new Calculator1();
        c2.printinfo();
 
    }
 
}

package org.opentutorials.javatutorials.Inheritance.example4;

class Calculator {
    int left, right;
     
    public Calculator(){}
     
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
class SubstractionableCalculator extends Calculator {
	int back;
    public SubstractionableCalculator(int left, int right,int back) {
        super(left, right); // 부모 클래스에 있는 생성자에 보내준다 super(현재클래스의 부모클래스를 의미) 
        // this.left = left;//오류 부모 생성자에서 오류
//        this.right = right;//오류 부모 생성자에서 오류
        this.back = back;//자식 클래스(SubstractionableCalculator)에만 있는 생성자
    }
 
    public void substract() {
        System.out.println(this.left - this.right - this.back);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20,3);
        //SubstractionableCalculator메소드에 보낸다
        c1.sum();
        c1.avg();
        c1.substract();
    }
}

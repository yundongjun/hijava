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
        super(left, right); // �θ� Ŭ������ �ִ� �����ڿ� �����ش� super(����Ŭ������ �θ�Ŭ������ �ǹ�) 
        // this.left = left;//���� �θ� �����ڿ��� ����
//        this.right = right;//���� �θ� �����ڿ��� ����
        this.back = back;//�ڽ� Ŭ����(SubstractionableCalculator)���� �ִ� ������
    }
 
    public void substract() {
        System.out.println(this.left - this.right - this.back);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20,3);
        //SubstractionableCalculator�޼ҵ忡 ������
        c1.sum();
        c1.avg();
        c1.substract();
    }
}

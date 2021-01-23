package org.opentutorials.javatutorials.object;

class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(this.v);//this는 전역변수
    }
}
 
public class ScopeDemo9 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
 
}

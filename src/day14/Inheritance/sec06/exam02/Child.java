package day14.Inheritance.sec06.exam02;

public class Child extends Parent {

  String c;
  String d;
  //메소드 오버라이딩

  @Override
  public void method2() {
    System.out.println("Child의 method2()");
  }

  public void method3() {
    System.out.println("Child의 method3()");
  }
}
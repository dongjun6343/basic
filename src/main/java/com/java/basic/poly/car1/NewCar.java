package com.java.basic.poly.car1;

/**
 * OCP원칙
 * <p>
 * Open-Closed Principle 원칙
 * 확장에는 열려있고, 변경에는 닫혀있다는 뜻.
 * -> 기존의 코드 수정 없이 새로운 기능을 추가할 수 있다는 의미이다.
 *
 * 기존의 코드 수정 없이 -> 변하지 않는 부분, 변하는 부분으로 구분해서 개발한다는 의미이다.
 *
 * 새로운 차량을 만든다. -> 핵심 부분의 코드는 전혀 수정하지 않아도 된다. (OCP)
 *
 * [정리]
 * Car를 사용하는 '클라이언트' 코드인 Driver 코드의 변경없이 새로운 자동차를 확장할 수 있다.
 * 다형성을 활용하고 역할과 구현을 잘 분리해서 새로운 자동차를 추가해도 대부분의 핵심 코드를 그대로 유지할 수 있다.
 *
 * 디자인패턴 중 전략패턴 -> 클라이언트 코드의 변경없이 쉽게 교체할 수 있다.
 */
public class NewCar implements Car {

    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}

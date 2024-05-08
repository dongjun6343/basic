package com.java.basic.poly.car;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.driver();

        // 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); // k3의 참조 제거
        driver.setModel3Car(model3Car);
        driver.driver();

        /**
         * 여기서 새로운 차량을 추가한다면 Dirver 코드를 많이 변경해야한다. -> 분기처리에서 계속 추가.
         * 만약 운전할 수 있는 차량의 종류가 계속 늘어난다면 변경 되는 코드가 많아진다.
         * => 역할과 구현을 분리하지 않아서 발생하는 문제이다.
         */
    }
}

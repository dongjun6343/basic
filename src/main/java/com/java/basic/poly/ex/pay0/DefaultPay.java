package com.java.basic.poly.ex.pay0;

/**
 * nullObject 패턴
 */
public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}

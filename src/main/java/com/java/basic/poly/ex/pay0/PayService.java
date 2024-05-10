package com.java.basic.poly.ex.pay0;

public class PayService {

    // 변하지 않는 부분
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option);
        // nullObject패턴을 사용해서 null처리 삭제
//        if (pay != null) {
//            boolean result = pay.pay(amount);
//        }
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}

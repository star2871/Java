package cond;

public class If6 {
    public static void main(String[] args) {
            int price = 10000;
            int age = 10;
            int discount = 0;

            if (price >= 10000) {
                discount = discount +1000;
                System.out.println("10000원 이상 구매, 1000원 할인");
            } else if (age <= 10) {
                // 서로 연관된 조건이어서, 하나로 묶을 때
                discount = discount + 1000;
                System.out.println("어린이 1000원 할인");
            } else {
                System.out.println("할인 없음");
            }

            System.out.println("총 할인 금액: " + discount + "원");

            if (true) {
                // 중괄호 무조건 넣어라
                System.out.println("if문에서 실행됨");
            }
    }
}

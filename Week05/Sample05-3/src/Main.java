//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int apple;
    int pear;
    int payment;
    final int APPLE = 500;
    final int PEAR = 600;
    int price;

    System.out.print("사과 구입 개수 : ");
    apple = keyboard.nextInt();
    System.out.print("배 구입 개수 : ");
    pear = keyboard.nextInt();
    System.out.print("지불 금액 입력 ");
    payment = keyboard.nextInt();

    price = apple * APPLE + pear * PEAR;

    String result = payment >= price ? String.format("거스름돈 : %,d 원", payment - price) : "금액이 부족합니다.";

    System.out.printf("구입 금액 : %,d 원\n", price);
    System.out.printf("지불 금액 : %,d 원\n", payment);
    System.out.println(result);


}

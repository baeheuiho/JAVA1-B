//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int price;      //구입 가격
    char grade;     // 회원 등급

    double discount; // 할인 가격

    String gradeTemp;
    int discountRate;


    System.out.print("구입 가격 입력 : ");
    price = keyboard.nextInt();
    System.out.print("화눤 등급 입력 (VIP, GOLD, SILVER, NONE) 예) V or v ");
    grade = keyboard.next().charAt(0);

    gradeTemp = grade == 'V' ? "VIP" : (grade == 'G' ? "GOLD" : (grade == 'S' ? "SILVER" : "NONE"));
    discountRate = grade == 'V' ? 20 : (grade == 'G' ? 15 : (grade == 'S' ? 10 : 0));


    discount = price - price * ((double) discountRate / 100) ;




    System.out.printf("회원 등급 : %s (%d %% 할인)\n", gradeTemp, discountRate);
    System.out.printf("구입 가격 : %,d 원\n", price);
    System.out.printf("할인 가격 : %,d 원\n\n", (int) discount);
    String result = price >= 100000 ? String.format("추가 할인 : %,d 원", (int) (discount - (price * (10.0 / 100))))  : "추가 할인 없음";
    System.out.println(result);
}

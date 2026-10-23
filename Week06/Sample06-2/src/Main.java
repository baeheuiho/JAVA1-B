//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final double DON = 3.75;     // 1돈의 무게
    final int GOLD = 775000;     // 금 1돈의 가격
    float weight;

    System.out.print("당신의 몸무게는 ? ");
    weight = keyboard.nextFloat();   // 45.6

   /* int weight1 = (int) weight;   // 45
    float remainder = weight - weight1;  // .6

    int gram = (int) (weight1 * 1000 + remainder * 1000); */

    int gram = (int) (weight * 1000);
    double donofweight = gram / DON;
    double money = donofweight * GOLD;
    long money1 = (long) (money / 10000);
    money1 *= 10000;

    System.out.printf("%.1f Kg = %,d gram\n", weight, gram);
    System.out.printf("%.1f Kg = %,.2f 돈\n", weight, donofweight);
    System.out.printf("%.1f Kg = %,d 원(금 1돈 가격 = %,d원)\n", weight, money1, GOLD);

}

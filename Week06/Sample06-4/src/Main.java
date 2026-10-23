//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int LIFE = 7;
    final int FEE = 4500;
    int year;
    int ciga;

    System.out.print("당신은 몇년동안 담배를 피웠나요 ? ");
    year = keyboard.nextInt();
    System.out.print("당신은 담배를 하루에 몇 개피 피우나요? ");
    ciga = keyboard.nextInt();

    int day = year * 365;   // 담배 피운 날 수
    int count = day * ciga;  // 내가 피운 담배 개피 수

    long minute = (long) count * LIFE;
    int hour = (int) (minute / 60);
    minute -= (hour * 60);
    int day1 = hour / 24;
    hour -= (day1 * 24);
    int year1 = day1 / 365;
    day1 -= (year1 * 365);

    int gap = count / 20 + ((count % 20 != 0) ? 1 : 0);
    int money = gap * FEE;

    System.out.printf("담배 1개피를 피우면 수명이 %d분 단축 된다고 합니다.\n", LIFE);
    System.out.printf("담배를 하루에 %d 개피씩 %d년을 피우면, %d년 %d일 %d시간 %d분 수명이 단축됩니다.\n",
            ciga, year, year1, day1, hour, minute);
    System.out.printf("담배를 하루에 %d 개피씩 %d년을 피우면, 비용은 %,d 원이 필요합니다.\n",
            ciga, year, money);

}

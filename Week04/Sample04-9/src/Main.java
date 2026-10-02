//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int height;
    double area;

    System.out.print("삼각형의 밑변은 ? ");
    base = keyboard.nextInt();
    System.out.print("삼각형의 높이는 ? ");
    height = keyboard.nextInt();

    area = (base * height) / 2.0;

    System.out.printf("\n\t**** 삼각형의 넓이 구하기 ****\n");
    System.out.printf("\t\t밑변 : %d Cm\n", base);
    System.out.printf("\t\t높이 : %d Cm\n", height);
    System.out.printf("\n\t\t넓이 : %.2f \u33a0\n", area);


}

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int base;
        int rectagular_area;
        double radius;
        double circle_area;
        final double PI = 3.141592;
        double area;

        System.out.print("정사각형의 한변의 길이 입력(예 5) : ");
        base = keyboard.nextInt();

        rectagular_area = base * base;
        radius = base / 2.0;
        circle_area = PI * radius * radius;
        area = rectagular_area - circle_area;

        System.out.printf("한변의 길이가 %,d Cm인 정사각형의 면적 = %,d \u33A0\n", base, rectagular_area);
        System.out.printf("이 정사각형 내부 원의 반지름 : %.2f Cm, 면적 : %,.2f \u33A0\n", radius, circle_area);
        System.out.printf("구하려는 면적 : %,.2f\u33a0\n", area);
}

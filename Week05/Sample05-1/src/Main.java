//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int width;   // 가로 길이
    int height;  // 세로 길이

    char type;   // 사각형의 type( 정, 직 사각형)
    int area;    // 면적

    System.out.print("사각형의 가로 길이 입력(예 5) : ");
    width = keyboard.nextInt();
    System.out.print("사각형의 세로 길이 입력(예 5) : ");
    height = keyboard.nextInt();

    type = (width == height) ? '정' : '직';
    area = width * height;

    System.out.printf("**** %c사각형 넓이 ******\n", type);
    System.out.printf("\t가로 길이 : %,d Cm\n", width);
    System.out.printf("\t세로 길이 : %,d Cm\n", height);
    System.out.printf("\t넓    이 : %,d \u33a0\n", area);

}

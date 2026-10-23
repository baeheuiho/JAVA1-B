//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1, num2, num3;
    int result;

    System.out.print("정수 3개를 입력 : ");
    num1 = keyboard.nextInt();
    num2 = keyboard.nextInt();
    num3 = keyboard.nextInt();

    if (num1 > num2) {
        if (num1 > num3) {
            result = num1;
        } else {
            result = num3;
        }
    } else if (num2 > num3) {
        result = num2;
    } else {
        result = num3;
    }

    System.out.printf("%d, %d, %d중에서 가장 큰 수는 %d 입니다.\n", num1, num2, num3, result);
}

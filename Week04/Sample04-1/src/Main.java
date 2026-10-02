//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    int a = 5;
    int b = 2;
    double c =  a / b;           // 2.5 (2.0)
    double d = (double) a / b;   // 2.5 (2.0) cast 연산자

    System.out.printf("a = %d, b = %d, c = %.2f, d = %.2f\n", a, b, c, d);
}

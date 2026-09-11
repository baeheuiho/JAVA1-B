//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
     Scanner keyboard = new Scanner(System.in);
     double PI = 3.141592;
     int radius;  // 원의 반지름
     double area;


     System.out.print("원의 반지름 입력 (정수형) ? ");
     radius = keyboard.nextInt();

     area = PI * radius * radius;

     System.out.printf("원의 반지름 : %,d Cm, 면적 : %,.2f \u33A0\n", radius, area);

}

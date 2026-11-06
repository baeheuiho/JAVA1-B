//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int LINE = 10;
    final int STAR = 23;

    System.out.println("***********************");
    System.out.println("***********************");
    System.out.println("***********************");
    System.out.println("***********************");
    System.out.println("***********************");
    System.out.println();

    // 반복문 사용 (반복 부분이 존재)
    for (int i = 0; i < LINE; i++) {
        System.out.println("***********************");
    }
    System.out.println();

    // 중첩 반복문 사용 (최적의 방법)
    for (int i = 0; i < LINE; i++) {
        int j = 0;
        while (j < STAR) {
            System.out.print("*");
            j++;
        }
        System.out.println();
    }
}

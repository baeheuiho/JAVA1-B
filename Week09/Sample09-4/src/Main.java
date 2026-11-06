//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int START = 1;
    final int END = 100;
    int total = 0;

  //***************************************************
    for (int i = START; i <= END; i++) {
        if (i % 3 == 0) {  // 3의 배수를 제외
            continue;
        }
        total += i;
   /* continue */  }

    System.out.printf("%d + %d + .... + %d + %d = %,d\n",
            START, START + 1, END - 1, END, total);

    //***************************************************
    total = 0;
    for (int i = START; i <= END; i++) {
        if (i % 3 == 0 && i % 5 != 0) {  // 3의 배수를 제외하면서 5의 배수인 경우는 더하는 경우
            continue;
        }
        total += i;
    }

    System.out.printf("%d + %d + .... + %d + %d = %,d\n",
            START, START + 1, END - 1, END, total);
}

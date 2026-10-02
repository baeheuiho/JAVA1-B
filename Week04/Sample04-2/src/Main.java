//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
      int max = Integer.MAX_VALUE;

      long a = max + 1;    // Overflow
      long b = max + 1L;   // long형 연산

      System.out.printf("max = %,d, a = %,d, b = %,d\n", max, a, b);
}

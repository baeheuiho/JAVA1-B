//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    /*   long test1 = 3000000000L;
         long test2 = 4000000000L;
         long result = test1 * test2;

        System.out.printf("%,d * %,d = %,d\n", test1, test2, result);
     */
    /*   byte test1 = 127;
       byte  test2 = 1;
       int result = test1 + test2;

       System.out.printf("%,d + %,d = %,d\n", test1, test2, result); */

       short test1 = 32767;
       short test2 = 1;
       short result = (short) (test1 + test2);  // 캐스트 연산자

       System.out.printf("%,d + %,d = %,d\n", test1, test2, result);

}

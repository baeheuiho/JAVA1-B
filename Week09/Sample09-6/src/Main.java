//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
     final int START = 1;
     final int TARGET = 200000000;
     int total = 0;
     int today = 1;

     for (int i = START; true; i *= 2) {
         total += i;

         System.out.printf("오늘 저축 금액  = %,11d 원,   %3d 일 = %,11d 원\n", i, today++, total);
         if (total >= TARGET)
             break;
     }
}

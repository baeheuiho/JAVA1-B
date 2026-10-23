//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
      final int radius = 6400;   // 단위 km
      final float PI = 3.141592f;
      final int KOREA = 100505;   // 단위  km²

      double surface = 4 * PI * radius * radius;   // 지구의 표면적  km²

      double ratio = KOREA / surface;

      System.out.printf("지구의 반지름 %,d Km, 표면적 %,.2f km²\n", radius, surface);
      System.out.printf("대한민국 면적 %,d km² 은 %f %% 입니다.\n", KOREA, ratio);

}

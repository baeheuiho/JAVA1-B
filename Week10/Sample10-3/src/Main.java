//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
      Scanner keyboard = new Scanner(System.in);
      String source;
      char[] reverse;   // 선언

      System.out.print("영어 문장 입력 : ");
      source = keyboard.nextLine();

      reverse = new char[source.length()];   // 정의
      for (int i = 0; i < source.length(); i++) {
          if (source.charAt(i) >= 'A' && source.charAt(i) <= 'Z')
              reverse[i] = (char) (source.charAt(i) + 32);
          else if (source.charAt(i) >= 'a' && source.charAt(i) <= 'z')
              reverse[i] = (char) (source.charAt(i) - 32);
          else
              reverse[i] = source.charAt(i);
      }

      System.out.printf("원본 : %s\n", source);
      System.out.printf("변경 : %s\n", new String(reverse));
}

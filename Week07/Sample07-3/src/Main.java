//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int score;
    String result;

    System.out.print("점수 입력 : ");
    score = keyboard.nextInt();

    /*****       Program 1            ****/
    if (score >= 90) {
        result = "A학점 취득 성공";
    } else {
        result = "A학점 취득 실패";
    }
    result += "\n감사합니다";

    if (!(score >= 0 && score <= 100))
        result = "ERROR : 점수는 0 ~ 100 사이";
    System.out.println(result);

    /*****       Program 2         ****/
    if (score >= 0 && score <= 100) {
        if (score >= 90) {
            result = "A학점 취득 성공";
        } else {
            result = "A학점 취득 실패";
        }
        result += "\n감사합니다";
    } else
        result = "ERROR : 점수는 0 ~ 100 사이";

    System.out.println(result);

    /*****       Program 3         ****/
    if (score >= 0 && score <= 100) {
        switch (score / 90) {
            case 0:
                result = "A학점 취득 실패";
                break;
            case 1:
                result = "A학점 취득 성공";
        }
        result += "\n감사합니다";
    } else
        result = "ERROR : 점수는 0 ~ 100 사이";

    System.out.println(result);

}

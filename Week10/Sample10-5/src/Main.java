//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String[] name = {"홍길동", "이혜인", "김명성", "경복대", "이대학", "홍길동", "이혜인", "김명성", "경복대", "이대학"};
    int[] kor = {90, 87, 75, 100, 100, 90, 87, 75, 100, 100};
    int[] math = {95, 90, 95, 99, 99, 95, 90, 95, 99, 99};
    int[] eng = {90, 88, 100, 100, 75, 90, 88, 100, 100, 75};

    int[] sum = new int[name.length];
    float[] avg = new float[name.length];
    int[] rank = new int[name.length];


    int i = 0;
   //  Data 입력
 /*   while (i < name.length) {
        System.out.printf("%s 학생의 국어, 수학, 영어 성적 입력 : ", name[i]);
        kor[i] = keyboard.nextInt();
        math[i] = keyboard.nextInt();
        eng[i] = keyboard.nextInt();

        if ((kor[i] >= 0 && kor[i] <= 100) &&
                (math[i] >= 0 && math[i] <= 100) &&
                (eng[i] >= 0 && eng[i] <= 100)) {
            i++;
        } else {
            System.err.println("ERROR : 점수는 0 ~ 100");
            System.in.read();
        }
    } */

    for (i = 0; i < name.length; i++)
        sum[i] = kor[i] + math[i] + eng[i];

    // 등수 구하는 것
     for (i = 0; i < name.length; i++) {
        int step = 1; // 기본 등수는 1등으로 시작
        for (int j = 0; j < name.length; j++) {
            // 내 점수보다 남의 점수가 더 크다면 등수를 1 밀려나게 한다 (+1)
            if (sum[j] > sum[i]) {
                step++;
            }
        }
        rank[i] = step;
    }


    for (i = 0; i < name.length; i++)
        avg[i] = sum[i] / 3.0f;

    System.out.println("****************************************");
    System.out.println(" 이름  국어  수학  영어  총점  평균  등수");
    System.out.println("****************************************");

    for (i = 0; i < name.length; i++) {
        System.out.printf(" %3s %3d %4d %4d %4d %7.2f %3d\n",
                name[i], kor[i], math[i], eng[i], sum[i], avg[i], rank[i]);
    }
    System.out.println("****************************************");

}


void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    String[] name = {"홍길동", "이혜인", "김명성", "경복대", "이대학", "홍길동", "이혜인", "김명성", "경복대", "이대학"};
    int[] kor = {90, 87, 75, 100, 100, 90, 87, 75, 100, 100};
    int[] math = {95, 90, 95, 99, 99, 95, 90, 95, 99, 99};
    int[] eng = {90, 88, 100, 100, 75, 90, 88, 100, 100, 75};

    int[] sum = new int[name.length];
    float[] avg = new float[name.length];
    int[] rank = new int[name.length];


    int i = 0;
    // Data 입력
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

// Sort ( 등수를 구하기 위함)
    for (i = 0; i < name.length - 1; i++) {
        for (int j = i + 1; j < name.length; j++) {
            if (sum[i] < sum[j]) {
                String temp = name[i];
                name[i] = name[j];
                name[j] = temp;

                int test = kor[i];
                kor[i] = kor[j];
                kor[j] = test;

                test = eng[i];
                eng[i] = eng[j];
                eng[j] = test;

                test = math[i];
                math[i] = math[j];
                math[j] = test;

                test = sum[i];
                sum[i] = sum[j];
                sum[j] = test;
            }
        }
    }

    // 등수 부여
    for (i = 0; i < name.length; i++)
        rank[i] = i + 1;

    // 동점자 처리
    for (i = 0; i < name.length- 1; i++)
        for (int j = i + 1; j < name.length; j++)
            if (sum[i] == sum[j]) {
                rank[j] = rank[i];
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

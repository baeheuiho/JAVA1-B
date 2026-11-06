//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int START = 1;
    final int END = 100;
    int total = 0;
    int first, last;
    String result;
    char answer;

//***********************************************************
    for (int i = START; i <= END; i++) {
        total += i;
    }

    System.out.printf("%d + %d + .... + %d + %d = %,d\n",
            START, START + 1, END - 1, END, total);

    //***********************************************************


    while (true) {
        total = 0;
        System.out.println();
        while (true) {
            System.out.print("어디부터 시작할까요 ? ");
            first = keyboard.nextInt();
            System.out.print("어디까지 더할까요 ? ");
            last = keyboard.nextInt();
            if (first <= last) {
                break;
            } else {
                System.err.printf("ERROR : 시작 값이(%d)는 종료 값(%d) 보다 작거나 닽아야 함", first, last);
                System.in.read();
            }
        }  // Break 위치

        for (int j = first; j <= last; j++) {
            total += j;
        }

        if (first == last) {
            result = String.format("%d = %,d\n", first, total);
        } else if (last - first <= 3) {
            if (last - first == 1)
                result = String.format("%d + %d = %,d\n", first, last, total);
            else if (last - first == 2)
                result = String.format("%d + %d + %d = %,d\n", first, first + 1, last, total);
            else
                result = String.format("%d + %d + %d + %d = %,d\n", first, first + 1, last - 1, last, total);
        } else {
            result = String.format("%d + %d + .... + %d + %d = %,d\n",
                    first, first + 1, last - 1, last, total);
        }

        System.out.println(result);
        System.out.print("계속할까요 ? (Yes/No) ");
        keyboard.nextLine();
        answer = keyboard.nextLine().charAt(0);
        if (answer == 'N' || answer == 'n')
            break;
    }
}

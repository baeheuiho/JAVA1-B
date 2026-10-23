//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
       Scanner keyboard = new Scanner(System.in);
       int salary;
       int tax;
       String message;


       System.out.print("당신의 급여액 입력 : ");
       salary = keyboard.nextInt();

       if (salary >= 0 && salary <= 30000000){
           if (salary < 2000000){
               tax = 0;
           } else if (salary <= 4000000){
               tax = (int) ((salary - 2000000) * (10.0f / 100));
           } else if (salary <= 6000000) {
               tax = (int) ((salary - 2000000) * (8.0f / 100));
           } else if (salary <= 20000000) {
               tax = (int) ((salary - 2000000) * (6.0f / 100));
           } else {
               tax = (int) ((salary - 2000000) * (5.0f / 100));
           }
           message = String.format("급여액 %,d원의 세금은 %,d원 입니다.", salary, tax);
       } else {
           message = "ERROR : 급여액은 0 ~ 30,000,000 사이임";
       }

       System.out.println(message);
}

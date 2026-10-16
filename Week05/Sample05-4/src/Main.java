//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     int age;

     System.out.print("당신의 나이 ? ");
     age = keyboard.nextInt();

     boolean flag = (age >= 0 && age < 120) ? true : false;
     int charge = (age <= 7 || age >= 65) ? 0 : 5000;

     String result = flag == true ? String.format("나이 : %,d 살, 요금 : %,d 원", age, charge) : "Data(나이) 입력 오류";

     System.out.println(result);
}

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("명령어를 입력하세요");
			String s = sc.nextLine();
			System.out.println(s);
			
			if (s.equals("exit")) {
				System.out.println("프로그램 종료!");
				break;
			} else if(s.equals("help")) {
				System.out.println("exit : 프로그램종료");
				System.out.println("add : 게시물 정보를 저장 : 제목, 내용");
				System.out.println("list : 저장된 게시물 목록 출력");
				
			} else if(s.equals("add")) {
				System.out.println("add : 게시물 정보를 저장 : 제목, 내용");
			} else if(s.equals("list"))	{
				System.out.println("list : 저장된 게시물 목록 출력");
			} else {
				System.out.println("올바른 명령어가 아닙니다.");
			}
		}
		
	}

}


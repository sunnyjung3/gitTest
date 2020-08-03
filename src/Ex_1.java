import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] titles = new String[10];
		String[] bodies = new String[10];
		int lastIndex = 0;
		
		while(true) {
			System.out.println("명령어를 입력하세요");
			String s = sc.nextLine();
			System.out.println(s);
			
			if (s.equals("exit")) {
				System.out.println("프로그램 종료!");
				break;
			} else if(s.equals("help")) {
				
				System.out.println("add : 게시물 등록 ");
				System.out.println("list : 게시물 목록 ");
				System.out.println("exit : 프로그램종료");
				
				
			} else if(s.equals("add")) {
				
				System.out.println("제목을 입력해주세요");
				titles[lastIndex] = sc.nextLine();
				
				System.out.println("내용을 입력해주세요");
				bodies[lastIndex] = sc.nextLine();
				
				lastIndex++;
			
			} else if(s.equals("list")) {
				
				for(int i = 0; i < lastIndex; i++) {
					System.out.println("제목 : " + titles[i]);
					System.out.println("내용 : " + bodies[i]);
				}

			} else {
				System.out.println("올바른 명령어가 아닙니다.");
				
			}
		}
		
	}

}

package com.gm.academy;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\n\n\n\n");
		System.out.println("[admin 접속중] 메인▶로그인▶개설 과정 관리▶강의-과목 등록");
		System.out.println("=====================================================================================");
		System.out.println("                                >>과정_과목 등록<<                                   ");
		System.out.println("=====================================================================================");
		System.out.println("        [과정코드]           [과정명]                   [과정 여부]");
		System.out.println("           L10          리눅스 웹 프로그래밍             강의예정");
		System.out.println("           L11          JAVA Python 입문자 개발과정      강의예정");
		System.out.println("           L12          Android 앱 개발 첫걸음           강의예정");
		System.out.println("           L13          윈도우 웹 프로그래밍             강의예정");
		System.out.println("=====================================================================================");
		System.out.print(">>과정 코드 선택 : ");
		scan.nextLine();
		System.out.println();
		
		System.out.println("★계속하려면 엔터키를 입력하세오. ★");
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		
		System.out.println("[admin 접속중] 메인▶로그인▶개설 과정 관리▶강의-과목 등록");
		System.out.println("======================================================================================");
		System.out.println("                      >>과정 [L11]의 현재 개설 과목 리스트<<                         ");
		System.out.println("======================================================================================");
		System.out.println("                         [과목코드]	              [과목명]          ");
		System.out.println("                             S1                    MaxOS");
		System.out.println("                             S2                    Linux");
		System.out.println("                             S3                    Unix");
		System.out.println("                             S4                    CentOS");
		System.out.println("                             S5                    Oracle");
		System.out.println("                             S6                    MariaDB");
		System.out.println("                             S7                    MongoDB");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("      (0:돌아가기)		                     1/6");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.printf(">>페이지 : ");
		scan.nextLine();
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.printf(">>과목 코드 선택 : ");
		scan.nextLine();
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("======================================================================================");
		System.out.println("                              >>과목 [S1]의 교재 리스트<<                            ");
		System.out.println("======================================================================================");
		System.out.println("                   [교재코드]                  [교재명]");
		System.out.println("                       62                     Do It!! MaxOS 한걸음");
		System.out.println("                       103                    고급 개발자로 가는 길");
		System.out.println("======================================================================================");
		System.out.printf(">>교재 코드 입력 : ");
		scan.nextLine();
		System.out.printf(">>과목 시작 날짜 : ");
		scan.nextLine();
		System.out.printf(">>과목 종료 날짜 : ");
		scan.nextLine();
		System.out.println("[결과] 과정_과목 등록 성공!!");
		
		System.out.println("★계속하려면 엔터키를 입력하세오. ★");
	}
}

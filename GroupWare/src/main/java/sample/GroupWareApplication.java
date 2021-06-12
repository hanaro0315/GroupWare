package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//--백앤드 일정--
//1. 전체 아웃라인 
//2. 로그인 체크(db 서버와 연결 확인)
//3. db 서버 구현


//-----주요기능-----
//1. 로그인 관련 기능(디폴트)
//2. 근무 일정 관리
//3. 근태 정산
//4. 근무일정(휴가 관련 태그 포함)
//5. 출퇴근 시각 기록

@SpringBootApplication
public class GroupWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupWareApplication.class, args);
	}

}

//import java.lang.*; // 디폴트 패키지(생략되어있음)
import com.google.gson.Gson;

import kr.tpc.*;
public class TPC18 {
	public static void main(String[] args) {
		
		// 1. Java에서 제공해주는 class들.. API
		// 문자열(String) 
		/*java.lang.*/String str = new String("APPLE");
		/*java.lang.*/System.out.println(str.toLowerCase()); //apple
		
		// 2. 직접 만들어서 사용하는 class들... DTO/VO, DAO, Utility ... API
		/*kr.tpc*/MyUtil my = new /*kr.tpc*/MyUtil();
		int sum = my.hap();
		System.out.println(sum);
		// 3. 다른 회사에서 만들어 놓은 class들... API
		// Gson -> json : https://mvnrepository.com/
		Gson g = new Gson();
		BookVO vo = new BookVO("자바", 13000, "영진", 800);
		String json = g.toJson(vo);
		// {"title":"자바","price":13000,"company":"영진","page":800}
		System.out.println(json);

	}

}

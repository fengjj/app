package test;

import com.sitech.util.HttpUtil;


public class TestHttp {

	public static void main(String[] args) {
		String result = HttpUtil.invoke("http://127.0.0.1:8080/new_app/myServlet/hdmact/createSmpLotteryInfo?aaa=sss"	, "{aaa:bbb}");
		System.out.println(result);
		
	}

}

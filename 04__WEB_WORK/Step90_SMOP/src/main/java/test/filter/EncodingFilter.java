package test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//  "/*" 이 프로젝트에 오는 모든 요청에 대해 필터링을 하겠다는 의미
//   /Step04_Final/ 하위의 모든 요청
@WebFilter("/*")
//Filter 사용법
//1. filter를  임플리먼츠 하고
public class EncodingFilter implements Filter{
	//2. interface 사용하기 위해 Override 해준다.
	
	//destroy() 필터가 파괴될 때 호출되는 메소드
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 *  request 에 들어오는 참조값은 원래 HttpServletRequest 객체의 참조값이다.
	 *  response에 들어오는 참조값은 원래 HttpServletResponse 객체의 참조값이다.
	 * */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//1. 만일 인코딩 설정이 되지 않았다면
		if(request.getCharacterEncoding()==null) {
			//POST 방식 전송했을 때 한글 깨짐 방식
			request.setCharacterEncoding("utf-8");
		}
		//2. 요청의 흐름 이어가기
		chain.doFilter(request, response);// doFilter를 실행하면서 request와 response 전달해준다. - 통과
		
	}
	//init()  이 필터가 최초 호출될 때 한번만 호출되는 메소드  필터에서 어떤 동작을 준비하고 싶을 때 사용한다.
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}

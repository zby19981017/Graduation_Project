package com.park.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor implements HandlerInterceptor{
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		
//		if((requestURI.contains("/parkIndex"))||(requestURI.contains("/login"))){
//			System.out.println("不过滤");
//			return true;
//			
//			String username = (String) request.getSession().getAttribute("USER_SESSION");
//			if(null == username){
//				response.sendRedirect(request.getContextPath() + "/login.action");
//				return false;
//			}
//		}else{
			String  user_id = (String) request.getSession().getAttribute("USER_NAME");
			String user_flag=(String) request.getSession().getAttribute("USER_FLAG");
			if(null == user_flag){
				response.sendRedirect(request.getContextPath() + "/parkIndex.action");
				return false;
//		}
		}
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}

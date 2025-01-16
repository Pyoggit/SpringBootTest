package com.zeus.common.intercepter;

import java.lang.reflect.Method;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor {

	private static final String USER_INFO = "userInfo";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String requestURL = request.getRequestURI();
		log.info("preHandle");
		
		HandlerMethod handlemethod = (HandlerMethod) handler;
		log.info("requestURL : " + requestURL);
		
		Method methodObj = handlemethod.getMethod();
		log.info("Bean: " + handlemethod.getBean());
		log.info("Method: " + methodObj);
		HttpSession session = request.getSession();
		if (session.getAttribute(USER_INFO) != null) {
			session.removeAttribute(USER_INFO);
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.info("postHandle");
		String requestURL = request.getRequestURI();
		
		log.info("requestURL : " + requestURL);
		
		HandlerMethod handlemethod = (HandlerMethod) handler;
		log.info("Bean: " + handlemethod.getBean());
		
		Method methodObj = handlemethod.getMethod();
		log.info("Method: " + methodObj);
		HttpSession session = request.getSession();
		ModelMap modelMap = modelAndView.getModelMap();
		Object member = modelMap.get("user");
		if (member != null) {
			log.info("member != null");
			session.setAttribute(USER_INFO, member);
			response.sendRedirect("/");
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.info("afterCompletion");
		String requestURL = request.getRequestURI();
		
		log.info("requestURL : " + requestURL);
		HandlerMethod handlemethod = (HandlerMethod) handler;
		Method methodObj = handlemethod.getMethod();
		log.info("Bean: " + handlemethod.getBean());
		log.info("Method: " + methodObj);
	}

}

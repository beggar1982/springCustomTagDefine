package com.xxz.demo.springsupport;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.xxz.demo.bean.User;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String userName=element.getAttribute("name");
		String email=element.getAttribute("address");
		if(StringUtils.hasText(userName)){
			builder.addPropertyValue("name", userName);
		}
		if(StringUtils.hasText(email)){
			builder.addPropertyValue("address", email);
		}
	}
}

package com;

import java.net.URL;

import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gen.ArithmeticPort;
import com.gen.ArithmeticPortService;
import com.gen.GetAddRequest;
import com.gen.GetAddResponse;

@RestController
public class RestApp {
	private static final QName SERVICE_NAME = new QName("http://spring.io/guides/gs-producing-web-service",
			"arithmeticPortService");
	private static ArithmeticPort BACKEND = null;
	@Autowired
	GetAddRequest getAddRequest;

	private static ArithmeticPort getBackend() {
		if (BACKEND == null) {
			try {
				URL url = new URL("http://localhost:8080/ws/arithmetic.wsdl");
				BACKEND = new ArithmeticPortService(url, SERVICE_NAME).getArithmeticPortSoap11();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Can not access WSDL");
				e.printStackTrace();
			}
		}
		return BACKEND;
	}

	@RequestMapping("/hello/{base}/{number1}/{number2}")
	public String getAdd(@PathVariable("base") String base, @PathVariable("number1") String number1,
			@PathVariable("number2") String number2) {
		System.out.println("%%%%%%%%%%getADD"+base+number1+number2);
		getAddRequest.setBase(base);
		getAddRequest.setNumber1(number1);
		getAddRequest.setNumber2(number2);
		GetAddResponse result = null;
		try {
			result = getBackend().getAdd(getAddRequest);
		} catch (NullPointerException e) {
			System.out.println("ERROR");
		}

		result.getResult();

		return result.getResult();
	}

}

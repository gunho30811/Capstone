package hansung.cap.project;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class DataMap { 
		//public List<DataVO> list = new List<DataVO>();
		public static List<listVO> list=new ArrayList<listVO>();
				
	
		private static DataMap instance = new DataMap();
		
		public static DataMap getInstance() {
			return instance;
		} 
		/*
		public DataMap() {
			list.add(new listVO("01��4598","�ҳ�Ÿ","������","������","03:50","06:45"));
			list.add(new listVO("45��4875","�ƹݶ�","���","�迵��","7:45","8:00"));
			list.add(new listVO("75��2413","k5","������","��μ�","5:32","07:55"));
			list.add(new listVO("32ī1234","ray","��Ʈ��","������","4:52","4:55"));
			list.add(new listVO("12��4561","���","�ݻ�","���ȣ","03:51","4:12"));
			list.add(new listVO("45ġ1234","����","������","�̱��","01:00","4:50"));
			list.add(new listVO("01��4598","�ҳ�Ÿ","������","������","03:50","06:45"));
			list.add(new listVO("45��4875","�ƹݶ�","���","�迵��","7:45","8:00"));
			list.add(new listVO("75��2413","k5","������","��μ�","5:32","07:55"));
			list.add(new listVO("32ī1234","ray","��Ʈ��","������","4:52","4:55"));
			
			list.add(new listVO("12��4561","���","�ݻ�","���ȣ","03:51","4:12"));
			list.add(new listVO("45ġ1234","����","������","�̱��","01:00","4:50"));
			list.add(new listVO("01��4598","�ҳ�Ÿ","������","������","03:50","06:45"));
			list.add(new listVO("45��4875","�ƹݶ�","���","�迵��","7:45","8:00"));
			list.add(new listVO("75��2413","k5","������","��μ�","5:32","07:55"));
			list.add(new listVO("32ī1234","ray","��Ʈ��","������","4:52","4:55"));
			list.add(new listVO("12��4561","���","�ݻ�","���ȣ","03:51","4:12"));
			list.add(new listVO("45ġ1234","����","������","�̱��","01:00","4:50"));
			list.add(new listVO("01��4598","�ҳ�Ÿ","������","������","03:50","06:45"));
			list.add(new listVO("45��4875","�ƹݶ�","���","�迵��","7:45","8:00"));
			
			list.add(new listVO("75��2413","k5","������","��μ�","5:32","07:55"));
			list.add(new listVO("32ī1234","ray","��Ʈ��","������","4:52","4:55"));
			list.add(new listVO("12��4561","���","�ݻ�","���ȣ","03:51","4:12"));
			list.add(new listVO("45ġ1234","����","������","�̱��","01:00","4:50"));
			list.add(new listVO("01��4598","�ҳ�Ÿ","������","������","03:50","06:45"));
			list.add(new listVO("45��4875","�ƹݶ�","���","�迵��","7:45","8:00"));
			list.add(new listVO("75��2413","k5","������","��μ�","5:32","07:55"));
			list.add(new listVO("32ī1234","ray","��Ʈ��","������","4:52","4:55"));
			list.add(new listVO("12��4561","���","�ݻ�","���ȣ","03:51","4:12"));
			list.add(new listVO("45ġ1234","����","������","�̱��","01:00","4:50"));
			
			*/
			
		
			
		
		}

	
		
		


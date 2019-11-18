package telcomUser;

import java.text.SimpleDateFormat;
import java.util.*;
import company.*;
import rate.Rate;
import utility.XMLUtil;

public class TelcomUser {
	private String phoneNumber;
	private String callTo;
	private StringBuffer communicationRecords;
	Rate YRate;
	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new StringBuffer();
		
	    Company company=(Company)XMLUtil.getBean();
	    
	    YRate=company.producerate();	
	}
	
	//模拟通话记录的生成
	public void generateCommunicateRecord() {
		//随机生成通话记录数目
		int recordNum = new Random().nextInt(10);
		for(int i = 0; i <= recordNum; i++) {
			long timeStart = System.currentTimeMillis() - new Random().nextInt(36000000);
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			this.callTo = getCallToPhoneNumber();
			this.communicationRecords.append(this.phoneNumber + 
					"," + timeStart + 
					"," + timeEnd + 
					"," + this.callTo+
					";");
		}
	}
	
	private String getCallToPhoneNumber() {
		return "1380372" + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10));
	}
	
	private String accountFee(long timeStart, long timeEnd) {
		
		double feePerMinute = YRate.getRatio();
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double feeTotal = feePerMinute * minutes;
		return String.format("%.4f", feeTotal);
	}
	
	public void printDetails() {
		String allRecords = this.communicationRecords.toString();
		String [] recordArray = allRecords.split(";");
		for(int i = 0; i < recordArray.length; i++) {
			System.out.println("---------通话记录分割线---------");
			System.out.println("---------"+YRate.toString()+"---------");
			String [] recordField = recordArray[i].split(",");
			System.out.println("主叫：" + recordField[0]);
			System.out.println("被叫：" + recordField[3]);
			System.out.println("通话开始时间：" + new Date(Long.parseLong(recordField[1])));
			System.out.println("通话结束时间：" + new Date(Long.parseLong(recordField[2])));
			
			/*
			Date timeStart = new Date(Long.parseLong(recordField[1]));
			Date timeEnd = new Date(Long.parseLong(recordField[2]));
			*/
			
			//DateFormat
			/*
			DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
			System.out.println("通话开始时间：" + mediumFormat.format(timeStart));
			System.out.println("通话结束时间：" + mediumFormat.format(timeEnd));
			*/
			
			//SimpleDateFormat			
			/*
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
			System.out.println("通话开始时间：" + simpleDateFormat.format(timeStart));
			System.out.println("通话结束时间：" + simpleDateFormat.format(timeEnd));
			*/
			System.out.println("计费：" 
					+ accountFee(Long.parseLong(recordField[1]), Long.parseLong(recordField[2]))
					+ " 元。");
		}
	}
}

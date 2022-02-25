package hansung.cap.project;

public class listVO {
	public String carNum; //차 번호
	public String carKind; //차 종
	public String carColor; //차 색
	public String carMaster; //차 주인
	public String inTime; // 입실 시간
	public String outTime;// 나가는 시간
	
	
	public listVO() {
		this.carNum ="";
		this.carKind ="";
		this.carColor ="";
		this.carMaster ="";
		this.inTime ="";
		this.outTime="";
		
	}
	
	public listVO(String carNum, String carKind, String carColor, String carMaster, String inTime , String outTime) {
		this.carNum =carNum;
		this.carKind =carKind;
		this.carColor =carColor;
		this.carMaster =carMaster;
		this.inTime =inTime;
		this.outTime=outTime;
		
	}
	
	
	
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getCarKind() {
		return carKind;
	}
	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarMaster() {
		return carMaster;
	}
	public void setCarMaster(String carMaster) {
		this.carMaster = carMaster;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
}

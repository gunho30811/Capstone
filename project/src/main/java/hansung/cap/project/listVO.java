package hansung.cap.project;

public class listVO {
	public int seq;
	public String model;
	public String carColor;
	public String time;
	
	
	
	public listVO() {
		this.seq =0;
		this.model ="";
		this.carColor ="";
		this.time ="";
		
		
	}
	
	public listVO(int seq, String model, String carColor, String time){
		this.seq =seq;
		this.model =model;
		this.carColor =carColor;
		this.time =time;
		
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
}

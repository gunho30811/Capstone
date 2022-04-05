package hansung.cap.project;

public class fCommentVO {
	int commentNum;
	String userId;
	String text;
	int freeNum;
	String time;
	
	
	public fCommentVO() {
		this.commentNum=0;
		this.userId="";
		this.text="";
		this.freeNum=0;
		this.time="";
	}
	
	public fCommentVO(String userId,String text,int freeNum,String time) {
		
		this.userId=userId;
		this.text=text;
		this.freeNum=freeNum;
		this.time=time;
	}
	
	public fCommentVO(int commentNum,String userId,String text,int freeNum ,String time) {
		this.commentNum=commentNum;
		this.userId=userId;
		this.text=text;
		this.freeNum=freeNum;
		this.time=time;
	}
	
	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getFreeNum() {
		return freeNum;
	}

	public void setFreeNum(int freeNum) {
		this.freeNum = freeNum;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}

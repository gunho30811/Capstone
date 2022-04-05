package hansung.cap.project;

public class qCommentVO {
	int commentNum;
	String userId;
	String text;
	int QnANum;
	String time;
	
	
	public qCommentVO() {
		this.commentNum=0;
		this.userId="";
		this.text="";
		this.QnANum=0;
		this.time="";
	}
	
	public qCommentVO(String userId,String text,int QnANum,String time) {
		
		this.userId=userId;
		this.text=text;
		this.QnANum=QnANum;
		this.time=time;
	}
	
	public qCommentVO(int commentNum,String userId,String text,int QnANum ,String time) {
		this.commentNum=commentNum;
		this.userId=userId;
		this.text=text;
		this.QnANum=QnANum;
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
	public int getQnANum() {
		return QnANum;
	}
	public void setQnANum(int qnANum) {
		QnANum = qnANum;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}

package hansung.cap.project;

public class CommentVO {
	int commentNum;
	String userId;
	String text;
	int QnANum;
	
	
	public CommentVO() {
		this.commentNum=0;
		this.userId="";
		this.text="";
		this.QnANum=0;
	}
	public CommentVO(String userId,String text,int QnANum) {
		
		this.userId=userId;
		this.text=text;
		this.QnANum=QnANum;
	}
	
	public CommentVO(int commentNum,String userId,String text,int QnANum) {
		this.commentNum=commentNum;
		this.userId=userId;
		this.text=text;
		this.QnANum=QnANum;
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
}

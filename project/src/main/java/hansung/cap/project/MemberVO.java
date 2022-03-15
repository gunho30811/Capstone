package hansung.cap.project;

public class MemberVO {
	public String userId;
	public String userPw;
	public String userName;
	public String userEmail;
	public String userQuestion;
	
	public MemberVO() {
		this.userId="";
		this.userPw="";
		this.userName="";
		this.userEmail="";
		this.userQuestion="";
	}
	public MemberVO(String userId,String userPw,String userName,String userEmail,String userQuestion) {
		this.userId=userId;
		this.userPw=userPw;
		this.userName=userName;
		this.userEmail=userEmail;
		this.userQuestion=userQuestion;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserQuestion() {
		return userQuestion;
	}
	public void setUserQuestion(String userQuestion) {
		this.userQuestion = userQuestion;
	}
}

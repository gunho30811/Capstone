package hansung.cap.project;

public class MemberVO {
	public String userId;
	public String userPw;
	
	public MemberVO() {
		this.userId="";
		this.userPw="";
	}
	public MemberVO(String userId,String userPw) {
		this.userId=userId;
		this.userPw=userPw;
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
}

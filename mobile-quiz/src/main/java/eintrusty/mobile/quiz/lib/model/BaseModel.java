package eintrusty.mobile.quiz.lib.model;

public class BaseModel<R> {

	private Integer status;
	private String message;
	private R data;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public R getData() {
		return data;
	}
	public void setData(R data) {
		this.data = data;
	}
	
	
	
	
	
}

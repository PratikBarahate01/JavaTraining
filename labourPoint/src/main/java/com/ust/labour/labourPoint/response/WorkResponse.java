package com.ust.labour.labourPoint.response;
import java.util.List;

import com.ust.labour.labourPoint.model.Labour;

public class WorkResponse {
	
	private List<User> usersList;
	private Labour labour;
	
	public List<User> getUsersList() {
		return usersList;
	}
	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}
	public Labour getLabour() {
		return labour;
	}
	public void setLabour(Labour labour) {
		this.labour = labour;
	}

}

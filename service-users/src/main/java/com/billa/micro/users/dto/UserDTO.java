package com.billa.micro.users.dto;

public class UserDTO {

	private String userid;
	private String name;
	private String isValid;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public static UserDTO[] getUsers()

	{

		UserDTO[] userArr = new UserDTO[3];

		UserDTO dto = new UserDTO();
		dto.setUserid("1");
		dto.setName("BSR");
		dto.setIsValid("Yes");
		userArr[0] = dto;

		dto = new UserDTO();
		dto.setUserid("2");
		dto.setName("ABC");
		dto.setIsValid("Yes");
		userArr[1] = dto;

		dto = new UserDTO();
		dto.setUserid("3");
		dto.setName("XYZ");
		dto.setIsValid("Yes");
		userArr[2] = dto;

		return userArr;
	}
}

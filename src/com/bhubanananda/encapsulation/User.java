package com.bhubanananda.encapsulation;

/**
 * The Class User.
 *
 * @author Bhubanananda
 */
public class User {

	/** The id. */
	private Long id;

	/** The user name. */
	private String userName;

	/** The rolle number. */
	private Integer rolleNumber;

	/** The email id. */
	private String emailId;

	/**
	 * Instantiates a new user.
	 */
	public User() {
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param id          the id
	 * @param userName    the user name
	 * @param rolleNumber the rolle number
	 * @param emailId     the email id
	 */
	public User(Long id, String userName, Integer rolleNumber, String emailId) {
		this.id = id;
		this.userName = userName;
		this.rolleNumber = rolleNumber;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", rolleNumber=" + rolleNumber + ", emailId=" + emailId
				+ "]";
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the rolle number.
	 *
	 * @return the rolle number
	 */
	public Integer getRolleNumber() {
		return rolleNumber;
	}

	/**
	 * Sets the rolle number.
	 *
	 * @param rolleNumber the new rolle number
	 */
	public void setRolleNumber(Integer rolleNumber) {
		this.rolleNumber = rolleNumber;
	}

	/**
	 * Gets the email id.
	 *
	 * @return the email id
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * Sets the email id.
	 *
	 * @param emailId the new email id
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
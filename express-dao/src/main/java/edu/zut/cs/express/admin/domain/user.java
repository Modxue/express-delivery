package edu.zut.cs.express.admin.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.zut.cs.express.base.domain.BaseEntity;
import edu.zut.cs.express.admin.domain.Group;

@Table(name = "T_ADMIN_USER")
@Entity
public class user extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "USERNAME")
	String username;


	@Column(name = "PHONENUMBER")
	String phonenumber;
	
	@Column(name = "ORDERNUM")
	String ordernum;
	
	@Column(name = "KIND")
	String kind1;
	
	@Column(name = "TIME")
	String time1;

	@Column(name = "PASSWORD")
	String password;

	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "TIME")
	String time;
	
	@Column(name = "KIND")
	String kind;

	@Column(name = "EXPRESS_NUMBER")
	String express_number;

	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Group group;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getphonenumber() {
		return phonenumber;
	}
	public void setPhoneNumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getordernum() {
		return ordernum;
	}
	
	public void setOrderNum(String ordernum) {
		this.ordernum=ordernum;
	}

	public String getkind() {
		return kind1;
	}
	
	public void setKind(String kind) {
		this.kind1=kind;
	}
	public String getTime() {
		return time1;
	}

	public void setTime1(String time) {
		this.time1 = time;
	}
	public String getKind() {
		return kind1;
	}

	public void setKind1(String kind) {
		this.kind1 = kind;
	}
	public String getExpress_number() {
		return express_number;
	}

	public void setExpress_number(String express_number) {
		this.express_number = express_number;
	}

	public String gettime() {
		return time1;
	}
	
	public void setTime(String time) {
		this.time1=time;
	}
	
}

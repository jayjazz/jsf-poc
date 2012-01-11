package net.holon.jsfpoc;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String client = "";
	
	public void submit() {
		client = client + "t";
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}
	
	
	
}

package net.holon.jsfpoc;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class Register implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private User user = new User();

    public void submit() {
        FacesMessage message = new FacesMessage("Registration succesful!");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
    
    
}
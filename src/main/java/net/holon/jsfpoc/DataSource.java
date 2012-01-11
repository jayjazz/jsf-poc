package net.holon.jsfpoc;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DataSource {
	public List<String> getClients() {
		List<String> result = new ArrayList<String>();
		for(int i = 0; i < 10; i++)
			result.add("client_" + i);
		
		return result;
	}
}

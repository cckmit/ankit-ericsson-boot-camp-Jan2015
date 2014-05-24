package com.ericsson.raso.sef.fulfillment.profiles;

import java.util.Map;

import com.ericsson.raso.sef.bes.prodcat.entities.BlockingFulfillment;
import com.ericsson.sef.bes.api.entities.Product;

public class UpdateServiceClassProfile extends BlockingFulfillment<Product> {

	protected UpdateServiceClassProfile(String name) {
		super(name);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String serviceClassAction;

	public String getServiceClassAction() {
		return serviceClassAction;
	}

	public void setServiceClassAction(String serviceClassAction) {
		this.serviceClassAction = serviceClassAction;
	}


	@Override
	public void fulfill(Product e, Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepare(Product e, Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void query(Product e, Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revert(Product e, Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}
	
	
}

package com.ericsson.raso.sef.bes.prodcat.entities;

import java.util.List;

import com.ericsson.raso.sef.bes.prodcat.Constants;
import com.ericsson.raso.sef.bes.prodcat.tasks.CostInputTask;
import com.ericsson.raso.sef.ruleengine.Policy;
import com.ericsson.raso.sef.ruleengine.TransformFailedException;
import com.ericsson.raso.sef.ruleengine.TransformUnit;

public class PricingPolicy extends Policy {
	private static final long serialVersionUID = 6928999115192214745L;
	
	public PricingPolicy(String name) {
		super(name);
	}
	
	public void setCost(MonetaryUnit cost) {
		for (TransformUnit transform: this.getTransforms()) {
			transform.setInputData(new CostInputTask(cost));
		}
	}
	
	@Override
	public boolean execute() {
		//TODO: after request context service is available, implement the following code...
		/*
		 * 1. fetch request context reference...
		 * 2. allow each transform unit to execute...
		 * 3. capture the output of tranform into new MonetaryUnit
		 */
		
		if (this.getRule().execute()) {
			for (TransformUnit transform: this.getTransforms()) {
				try {
					if (!transform.execute())
						return false;
				} catch (TransformFailedException e) {
					// TODO Logger - write what shit happened here!!!
					return false;
				}
			}
			return true;
		}
		return false;		
	}

	@Override
	public void addTransformAction(TransformUnit transform) {
		transform.setOutputSchema(Constants.RATED_AMOUNT.name());
		super.addTransformAction(transform);
	}

	@Override
	public void removeTransformAction(TransformUnit transform) {
		super.removeTransformAction(transform);
	}

	@Override
	public void setTransforms(List<TransformUnit> transforms) {
		for (TransformUnit transform: transforms) {
			transform.setOutputSchema("RatedAmount");
			super.addTransformAction(transform);
		}		
	}


	
	

}

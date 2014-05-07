package com.ericsson.raso.sef.bes.prodcat.entities;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

import com.ericsson.raso.sef.bes.prodcat.CatalogException;

public abstract class Owner implements Serializable {
	private static final long serialVersionUID = -1598753924521940204L;

	private String name = null;
	private Type type = null;
	private Map<String, Owner> members = null;
	

	protected Owner(String name2) {
		this.name = name2;
	}

	public static Owner createInstance(Type type, String name) {
		switch (type) {
			case EndUser:
				return new EndUser(name);
			case Market:
				return null;
			case Opco:
				return null;
			case OpcoGroup:
				return null;
			case Partner:
				return null;
			case TenantMvno:
				return null;
			default:
				return null;
		}
	}
	
	public void addOpco(Opco opco) throws CatalogException {
		if (opco == null)
			throw new CatalogException("Specified Opco was null");
		
		if (this.members == null) 
			this.members = new TreeMap<String, Owner>();
		
		if (this.members.containsKey(opco.getName()))
			throw new CatalogException("Specified Opco (" + opco + ") is duplicate!!");
		
		this.members.put(opco.getName(), opco);
			
	}

	public void addPartner(Partner partner) throws CatalogException {
		if (partner == null)
			throw new CatalogException("Specified Partner was null");
		
		if (this.members == null) 
			this.members = new TreeMap<String, Owner>();
		
		if (this.members.containsKey(partner.getName()))
			throw new CatalogException("Specified Partner (" + partner + ") is duplicate!!");
		
		this.members.put(partner.getName(), partner);
			
	}

	public void addMarket(Market market) throws CatalogException {
		if (market == null)
			throw new CatalogException("Specified Market was null");
		
		if (this.members == null) 
			this.members = new TreeMap<String, Owner>();
		
		if (this.members.containsKey(market.getName()))
			throw new CatalogException("Specified Market (" + market + ") is duplicate!!");
		
		this.members.put(market.getName(), market);
			
	}

	public void addTenant(TenantMvno mvno) throws CatalogException {
		if (mvno == null)
			throw new CatalogException("Specified TenantMvno was null");
		
		if (this.members == null) 
			this.members = new TreeMap<String, Owner>();
		
		if (this.members.containsKey(mvno.getName()))
			throw new CatalogException("Specified TenantMvno (" + mvno + ") is duplicate!!");
		
		this.members.put(mvno.getName(), mvno);
			
	}


	public void removeOpco(Opco opco) throws CatalogException {
		if (opco == null)
			throw new CatalogException("Specified Opco was null");
		
		if (this.members == null) 
			throw new CatalogException("Specified Opco (" + opco + ") was invalid");
		
		if (!this.members.containsKey(opco.getName()))
			throw new CatalogException("Specified Opco (" + opco + ") is invalid!!");
		
		this.members.remove(opco.getName());
			
	}

	public void removePartner(Partner partner) throws CatalogException {
		if (partner == null)
			throw new CatalogException("Specified Partner was null");
		
		if (this.members == null) 
			throw new CatalogException("Specified Partner (" + partner + ") was invalid");
		
		if (!this.members.containsKey(partner.getName()))
			throw new CatalogException("Specified Partner (" + partner + ") is invalid!!");
		
		this.members.remove(partner.getName());
			
	}

	public void removeMarket(Market market) throws CatalogException {
		if (market == null)
			throw new CatalogException("Specified Market was null");
		
		if (this.members == null) 
			throw new CatalogException("Specified Market (" + market + ") was invalid");
		
		if (!this.members.containsKey(market.getName()))
			throw new CatalogException("Specified Market (" + market + ") is invalid!!");
		
		this.members.remove(market.getName());
			
	}

	public void removeTenant(TenantMvno mvno) throws CatalogException {
		if (mvno == null)
			throw new CatalogException("Specified TenantMvno was null");
		
		if (this.members == null) 
			throw new CatalogException("Specified TenantMvno (" + mvno + ") was invalid");
		
		if (!this.members.containsKey(mvno.getName()))
			throw new CatalogException("Specified TenantMvno (" + mvno + ") is invalid!!");
		
		this.members.remove(mvno.getName());
			
	}


	public void removeOpco(String opco) throws CatalogException {
		if (opco == null)
			throw new CatalogException("Specified Opco was null");
		
		if (this.members == null) 
			throw new CatalogException("Specified Opco (" + opco + ") was invalid");
		
		if (!this.members.containsKey(opco))
			throw new CatalogException("Specified Opco (" + opco + ") is invalid!!");
		
		this.members.remove(opco);			
	}
	
	public void removePartner(String partner) throws CatalogException {
		if (partner == null)
			throw new CatalogException("Specified Partner was null");
		
		if (this.members == null) 
			throw new CatalogException("Specified Partner (" + partner + ") was invalid");
		
		if (!this.members.containsKey(partner))
			throw new CatalogException("Specified Partner (" + partner + ") is invalid!!");
		
		this.members.remove(partner);			
	}
	
	public void removeMarket(String market) throws CatalogException {
		if (market == null)
			throw new CatalogException("Specified Market was null");
		
		if (this.members == null) 
			throw new CatalogException("Specified Market (" + market + ") was invalid");
		
		if (!this.members.containsKey(market))
			throw new CatalogException("Specified Market (" + market + ") is invalid!!");
		
		this.members.remove(market);			
	}
	
	public void removeTenant(String mvno) throws CatalogException {
		if (mvno == null)
			throw new CatalogException("Specified TenantMvno was null");
		
		if (this.members == null) 
			throw new CatalogException("Specified TenantMvno (" + mvno + ") was invalid");
		
		if (!this.members.containsKey(mvno))
			throw new CatalogException("Specified TenantMvno (" + mvno + ") is invalid!!");
		
		this.members.remove(mvno);			
	}
	
	public Owner getMember(String member) throws CatalogException {
		if (this.members != null)
			return this.members.get(member);
		
		throw new CatalogException("Specified Member (" + member + ") was invalid");		
	}


	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	

	public String getName() {
		return name;
	}



	enum Type {
		/**
		 * Represents a multi-country group company.
		 * 
		 * <code>Note:</code> Any stakeholder tagged at this level will have
		 * permissions to all lower levels.
		 */
		OpcoGroup,

		/**
		 * Represents a company - can be standalone or part of an
		 * <code>OpcoGroup</code>.
		 * 
		 * <code>Note:</code> Any stakeholder tagged at this level will have
		 * permissions to all lower levels.
		 */
		Opco,

		/**
		 * Represents a market within company. For example, a company can have
		 * multiple markets such as Mobile, Landline, Internet, TV, Cloud, etc.
		 * 
		 * <code>Note:</code> Any stakeholder tagged at this level will have
		 * permissions to all lower levels.
		 */
		Market,

		/**
		 * Represents a Tenant who is logical entity that borrows wholesale
		 * capacity from Opco or Market.
		 * 
		 * <code>Note:</code> Any stakeholder tagged at this level will have
		 * permissions to all lower levels.
		 */
		TenantMvno,

		/**
		 * Represents a Partner, an external legal entity to the stakeholders at
		 * all higher levels. Since a Partner is an external legal entity,
		 * commerce & settlement impacts exist for all products & its purchases/
		 * subscriptions related to this entity.
		 * 
		 * <code>Note:</code> Any stakeholder tagged at this level will have
		 * permissions to all lower levels.
		 */
		Partner,

		/**
		 * Represents an End-User that pays for products & avails services from
		 * any stakeholder at higher levels. It is possible for an end-user to
		 * create his/her own products, under the dynamic forumlation feature
		 * 
		 * <code>Note:</code> Any stakeholder tagged at this level will have
		 * permissions to all lower levels.
		 */
		EndUser;
	}

}

package com.dxc.cassandra.pojo;

import java.util.Map;
import java.util.Set;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("invoice")
public class Invoice {

	    @PrimaryKey
	    private Integer id;

	    @Column
	    private String itemname;

	    @Column
	    private Set<String> items;

	    @Column
	    private Map<String,String> itemamount;

	   @Column
	    private String shopname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Set<String> getItems() {
		return items;
	}

	public void setItems(Set<String> items) {
		this.items = items;
	}

	public Map<String, String> getItemamount() {
		return itemamount;
	}

	public void setItemamount(Map<String, String> itemamount) {
		this.itemamount = itemamount;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

}

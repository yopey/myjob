package com.uniasia.ent.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "code1")
public class SOEnterprise implements Serializable{
	private static final long serialVersionUID = -1178480699905462622L;
	
	@Id
	@Field
	private Integer id;
	@Field
	private String name;
	@Field
	private String address;
	@Field
	private String labels;
	@Field
	private Double pay;
	@Field
	private String descr;
	@Field
	private Integer archived;
	@Field("update_time")
	private Date updateTime;
	@Field("win_update_time")
	private Date winUpdateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public Double getPay() {
		return pay;
	}

	public void setPay(Double pay) {
		this.pay = pay;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Integer getArchived() {
		return archived;
	}

	public void setArchived(Integer archived) {
		this.archived = archived;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getWinUpdateTime() {
		return winUpdateTime;
	}

	public void setWinUpdateTime(Date winUpdateTime) {
		this.winUpdateTime = winUpdateTime;
	}

}

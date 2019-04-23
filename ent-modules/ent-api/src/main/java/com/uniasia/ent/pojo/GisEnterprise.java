package com.uniasia.ent.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 企业信息
 */
@Table(name = "gis_enterprise")//要使用通用mapper必须使用注解标识表和字段
public class GisEnterprise implements Serializable{
	private static final long serialVersionUID = 5602913249804356871L;
	
	@Id
    @GeneratedValue(generator = "JDBC")//MySQL的自增字段
	private Integer id;
	private Integer tradegbid;
	private Integer tradeid;
	private Integer parkid;
	private String name;
	private String address;
	private String labels;
	private Double pay;
	private String website;
	private String uscc;
	private String legal;
	private String type;
	private String scope;
	private String coverimg;
	private String images;
	private Double lng;
	private Double lat;
	private String polygon;
	private String panoramaurl;
	private Double landareaUnused;
	private Double landarea;
	private Double landareaUsed;
	private Integer island;
	private Integer isstaffRange;
	private Integer staff;
	private Integer staffMin;
	private Integer staffMax;
	private String developResult;
	private Integer patent;
	private String technology;
	private Integer nature;
	private Double scale;
	private String zipcode;
	private String email;
	private String fax;
	private String contacts;
	private String contactPhone;
	private String descr;
	private String remark;
	private Long repeatTag;
	private Integer istarget;
	private Integer audit;
	private String auditNote;
	@Column(name="`RELEASE`")//mysql的关键字要特殊处理
	private Integer release;
	private Integer refresh;
	private Date createTime;
	private Integer createUserid;
	private Date updateTime;
	private Integer updateUserid;
	private Integer archived;
	private Date winUpdateTime;
	private String corpId;
	private String trade;

	public Integer getTradegbid() {
		return tradegbid;
	}

	public void setTradegbid(Integer tradegbid) {
		this.tradegbid = tradegbid;
	}

	public Integer getTradeid() {
		return tradeid;
	}

	public void setTradeid(Integer tradeid) {
		this.tradeid = tradeid;
	}

	public Integer getParkid() {
		return parkid;
	}

	public void setParkid(Integer parkid) {
		this.parkid = parkid;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getUscc() {
		return uscc;
	}

	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

	public String getLegal() {
		return legal;
	}

	public void setLegal(String legal) {
		this.legal = legal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getCoverimg() {
		return coverimg;
	}

	public void setCoverimg(String coverimg) {
		this.coverimg = coverimg;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public String getPolygon() {
		return polygon;
	}

	public void setPolygon(String polygon) {
		this.polygon = polygon;
	}

	public String getPanoramaurl() {
		return panoramaurl;
	}

	public void setPanoramaurl(String panoramaurl) {
		this.panoramaurl = panoramaurl;
	}

	public Double getLandareaUnused() {
		return landareaUnused;
	}

	public void setLandareaUnused(Double landareaUnused) {
		this.landareaUnused = landareaUnused;
	}

	public Double getLandarea() {
		return landarea;
	}

	public void setLandarea(Double landarea) {
		this.landarea = landarea;
	}

	public Double getLandareaUsed() {
		return landareaUsed;
	}

	public void setLandareaUsed(Double landareaUsed) {
		this.landareaUsed = landareaUsed;
	}

	public Integer getIsland() {
		return island;
	}

	public void setIsland(Integer island) {
		this.island = island;
	}

	public Integer getIsstaffRange() {
		return isstaffRange;
	}

	public void setIsstaffRange(Integer isstaffRange) {
		this.isstaffRange = isstaffRange;
	}

	public Integer getStaff() {
		return staff;
	}

	public void setStaff(Integer staff) {
		this.staff = staff;
	}

	public Integer getStaffMin() {
		return staffMin;
	}

	public void setStaffMin(Integer staffMin) {
		this.staffMin = staffMin;
	}

	public Integer getStaffMax() {
		return staffMax;
	}

	public void setStaffMax(Integer staffMax) {
		this.staffMax = staffMax;
	}

	public String getDevelopResult() {
		return developResult;
	}

	public void setDevelopResult(String developResult) {
		this.developResult = developResult;
	}

	public Integer getPatent() {
		return patent;
	}

	public void setPatent(Integer patent) {
		this.patent = patent;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Integer getNature() {
		return nature;
	}

	public void setNature(Integer nature) {
		this.nature = nature;
	}

	public Double getScale() {
		return scale;
	}

	public void setScale(Double scale) {
		this.scale = scale;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getRepeatTag() {
		return repeatTag;
	}

	public void setRepeatTag(Long repeatTag) {
		this.repeatTag = repeatTag;
	}

	public Integer getIstarget() {
		return istarget;
	}

	public void setIstarget(Integer istarget) {
		this.istarget = istarget;
	}

	public Integer getAudit() {
		return audit;
	}

	public void setAudit(Integer audit) {
		this.audit = audit;
	}

	public String getAuditNote() {
		return auditNote;
	}

	public void setAuditNote(String auditNote) {
		this.auditNote = auditNote;
	}

	public Integer getRelease() {
		return release;
	}

	public void setRelease(Integer release) {
		this.release = release;
	}

	public Integer getRefresh() {
		return refresh;
	}

	public void setRefresh(Integer refresh) {
		this.refresh = refresh;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateUserid() {
		return createUserid;
	}

	public void setCreateUserid(Integer createUserid) {
		this.createUserid = createUserid;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getUpdateUserid() {
		return updateUserid;
	}

	public void setUpdateUserid(Integer updateUserid) {
		this.updateUserid = updateUserid;
	}

	public Integer getArchived() {
		return archived;
	}

	public void setArchived(Integer archived) {
		this.archived = archived;
	}

	public Date getWinUpdateTime() {
		return winUpdateTime;
	}

	public void setWinUpdateTime(Date winUpdateTime) {
		this.winUpdateTime = winUpdateTime;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}

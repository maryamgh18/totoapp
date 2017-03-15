package com.mkyong.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "record")
//@XmlRootElement(name = "GL_TL_INFO_HGHTDRIS_OSTAD")
public class Report {

    private int id;
    private BigDecimal sales;
    private int qty;
    private String staffName;
    private Date date;



/*	private java.lang.Long id;
    private java.lang.Integer vztTadrisOstad;
	private java.math.BigDecimal vahedeMazadeTadris;
	private java.math.BigDecimal vahedeMazadePayanName;
	private java.math.BigDecimal vahedeMazadeToaman;
	private java.lang.String createdBy;
	private java.math.BigDecimal saghfeNahaii;
	private java.lang.String creationDate;
	private java.lang.Integer maliat;
	private java.lang.Integer isActive;

	private java.lang.Long trrsId;
	private java.lang.Long skhsId;
	private java.lang.Long mlfeId;
	private java.math.BigDecimal vahedeMazadeTabestan;

	@XmlAttribute(name = "id")
	public Long getId() {
		System.out.println("Report.getId="+id);
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@XmlAttribute(name = "vztTadrisOstad")
	public Integer getVztTadrisOstad() {
		System.out.println("vztTadrisOstad = " + vztTadrisOstad);
		return vztTadrisOstad;
	}

	public void setVztTadrisOstad(Integer vztTadrisOstad) {
		this.vztTadrisOstad = vztTadrisOstad;
	}


	@XmlAttribute(name = "vahedeMazadeTadris")
	public BigDecimal getVahedeMazadeTadris() {
		return vahedeMazadeTadris;
	}

	public void setVahedeMazadeTadris(BigDecimal vahedeMazadeTadris) {
		this.vahedeMazadeTadris = vahedeMazadeTadris;
	}


	@XmlAttribute(name = "vahedeMazadePayanName")
	public BigDecimal getVahedeMazadePayanName() {
		return vahedeMazadePayanName;
	}

	public void setVahedeMazadePayanName(BigDecimal vahedeMazadePayanName) {
		this.vahedeMazadePayanName = vahedeMazadePayanName;
	}


	@XmlAttribute(name = "vahedeMazadeToaman")
	public BigDecimal getVahedeMazadeToaman() {
		return vahedeMazadeToaman;
	}

	public void setVahedeMazadeToaman(BigDecimal vahedeMazadeToaman) {
		this.vahedeMazadeToaman = vahedeMazadeToaman;
	}


	@XmlAttribute(name = "createdBy")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	@XmlAttribute(name = "saghfeNahaii")
	public BigDecimal getSaghfeNahaii() {
		return saghfeNahaii;
	}

	public void setSaghfeNahaii(BigDecimal saghfeNahaii) {
		this.saghfeNahaii = saghfeNahaii;
	}

	@XmlAttribute(name = "creationDate")
	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@XmlAttribute(name = "maliat")
	public Integer getMaliat() {
		return maliat;
	}

	public void setMaliat(Integer maliat) {
		this.maliat = maliat;
	}

	@XmlAttribute(name = "id")
	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	*//*@XmlAttribute(name = "lastUpdatedBy")
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@XmlAttribute(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlAttribute(name = "lastUpdateDate")
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

*//*
	@XmlAttribute(name = "trrsId")
	public Long getTrrsId() {
		return trrsId;
	}

	public void setTrrsId(Long trrsId) {
		this.trrsId = trrsId;
	}


	@XmlAttribute(name = "skhsId")
	public Long getSkhsId() {
		return skhsId;
	}

	public void setSkhsId(Long skhsId) {
		this.skhsId = skhsId;
	}


	@XmlAttribute(name = "mlfeId")
	public Long getMlfeId() {
		return mlfeId;
	}

	public void setMlfeId(Long mlfeId) {
		this.mlfeId = mlfeId;
	}

	@XmlAttribute(name = "vahedeMazadeTabestan")
	public BigDecimal getVahedeMazadeTabestan() {
		return vahedeMazadeTabestan;
	}

	public void setVahedeMazadeTabestan(BigDecimal vahedeMazadeTabestan) {
		this.vahedeMazadeTabestan = vahedeMazadeTabestan;
	}*/


    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "sales")
    public BigDecimal getSales() {
        return sales;
    }

    public void setSales(BigDecimal sales) {
        this.sales = sales;
    }

    @XmlElement(name = "qty")
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @XmlElement(name = "staffName")
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Report [id=" + id + ", sales=" + sales + ", qty=" + qty + ", staffName=" + staffName + "]";
    }


}
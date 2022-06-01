package bjm.bc.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "REVENUE_PARTY")
public class RevenueParty {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MEMORABLE_DATE")
    private LocalDate memorableDate;
    @Column(name = "ORGANISATION")
    private String organisation;
    @Column(name = "OWNER_ADHAAR_NUMBER")
    private String ownerAdhaarNumber;
    @Column(name = "ACCOUNT_HASH")
    private String accountHash;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "REVENUE_TYPE")
    @Enumerated(EnumType.STRING)
    private RevenueType revenueType;
    @Transient
    private String passwordConfirm;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getMemorableDate() {
		return memorableDate;
	}
	public void setMemorableDate(LocalDate memorableDate) {
		this.memorableDate = memorableDate;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getOwnerAdhaarNumber() {
		return ownerAdhaarNumber;
	}
	public void setOwnerAdhaarNumber(String ownerAdhaarNumber) {
		this.ownerAdhaarNumber = ownerAdhaarNumber;
	}
	public String getAccountHash() {
		return accountHash;
	}
	public void setAccountHash(String accountHash) {
		this.accountHash = accountHash;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RevenueType getRevenueType() {
		return revenueType;
	}
	public void setRevenueType(RevenueType revenueType) {
		this.revenueType = revenueType;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	

}

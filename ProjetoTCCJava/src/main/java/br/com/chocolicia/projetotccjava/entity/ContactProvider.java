package br.com.chocolicia.projetotccjava.entity;

import br.com.chocolicia.projetotccjava.domain.enums.RegisterStatus;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

public class ContactProvider implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactProviderUid;

    private Long providerUid;

    private String contactName;

    private String contactEmail;

    private String contactTelephone;

    private String contactCellphone;

    private RegisterStatus registerStatus;

    private LocalDateTime createDate;

    public Long getContactProviderUid() {
        return contactProviderUid;
    }

    public void setContactProviderUid(Long contactProviderUid) {
        this.contactProviderUid = contactProviderUid;
    }

    public Long getProviderUid() {
        return providerUid;
    }

    public void setProviderUid(Long providerUid) {
        this.providerUid = providerUid;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactTelephone() {
        return contactTelephone;
    }

    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone;
    }

    public String getContactCellphone() {
        return contactCellphone;
    }

    public void setContactCellphone(String contactCellphone) {
        this.contactCellphone = contactCellphone;
    }

    public RegisterStatus getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(RegisterStatus registerStatus) {
        this.registerStatus = registerStatus;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}

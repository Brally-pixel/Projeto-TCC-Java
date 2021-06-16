package br.com.chocolicia.projetotccjava.entity;

import br.com.chocolicia.projetotccjava.domain.enums.RegisterStatus;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentUid;

    private String name;

    private RegisterStatus registerStatus;

    private LocalDateTime createDate;


    public Long getDepartmentUid() {
        return departmentUid;
    }

    public void setDepartmentUid(Long departmentUid) {
        this.departmentUid = departmentUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

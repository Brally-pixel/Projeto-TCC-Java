package br.com.chocolicia.projetotccjava.entity;

import br.com.chocolicia.projetotccjava.domain.enums.LevelEducation;
import br.com.chocolicia.projetotccjava.domain.enums.MaritalStatus;
import br.com.chocolicia.projetotccjava.domain.enums.RegisterStatus;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeUid;

    private String name;

    private String bithDate;

    private String cpf;

    private String rg;

    private MaritalStatus maritalStatus;

    private String gender;

    private RegisterStatus registerStatus;

    @OneToOne
    private Department department;

    private String turn;

    private String email;

    private LevelEducation levelEducation;

    private LocalDateTime createDate;

    @OneToMany
    private List<Adress> adress;

    public Employee() {
    }

    public Employee(Long employeeUid, String name, String bithDate, String cpf, String rg, MaritalStatus maritalStatus, String gender, RegisterStatus registerStatus, Department department, String turn, String email, LevelEducation levelEducation, LocalDateTime createDate, List<Adress> adress) {
        this.employeeUid = employeeUid;
        this.name = name;
        this.bithDate = bithDate;
        this.cpf = cpf;
        this.rg = rg;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.registerStatus = registerStatus;
        this.department = department;
        this.turn = turn;
        this.email = email;
        this.levelEducation = levelEducation;
        this.createDate = createDate;
        this.adress = adress;
    }

    public Long getEmployeeUid() {
        return employeeUid;
    }

    public void setEmployeeUid(Long employeeUid) {
        this.employeeUid = employeeUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBithDate() {
        return bithDate;
    }

    public void setBithDate(String bithDate) {
        this.bithDate = bithDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public RegisterStatus getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(RegisterStatus registerStatus) {
        this.registerStatus = registerStatus;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LevelEducation getLevelEducation() {
        return levelEducation;
    }

    public void setLevelEducation(LevelEducation levelEducation) {
        this.levelEducation = levelEducation;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public List<Adress> getAdress() {
        return adress;
    }

    public void setAdress(List<Adress> adress) {
        this.adress = adress;
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

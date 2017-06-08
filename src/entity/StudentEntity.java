package entity;

import javax.persistence.*;

/**
 * Created by d on 2017/5/17.
 */
@Entity
@Table(name = "student", schema = "active", catalog = "")
public class StudentEntity {
    private int sid;
    private String susername;
    private String spassword;
    private String sname;
    private String sclass;

    @Id
    @Column(name = "Sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "Susername")
    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername;
    }

    @Basic
    @Column(name = "Spassword")
    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    @Basic
    @Column(name = "Sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "Sclass")
    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (sid != that.sid) return false;
        if (susername != null ? !susername.equals(that.susername) : that.susername != null) return false;
        if (spassword != null ? !spassword.equals(that.spassword) : that.spassword != null) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (sclass != null ? !sclass.equals(that.sclass) : that.sclass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (susername != null ? susername.hashCode() : 0);
        result = 31 * result + (spassword != null ? spassword.hashCode() : 0);
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sclass != null ? sclass.hashCode() : 0);
        return result;
    }
}

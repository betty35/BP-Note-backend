package bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.entities;

import javax.persistence.*;

@Entity
@Table(name = "\"User\"", schema = "public", catalog = "bpmonitor")
public class UserEntity {
    private long id;
    private String email;
    private String nickname;
    private Short gender;
    private Short yearOfBirth;
    private String area;
    private String psd;
    private String memo;
    private String phone;
    private String auth;
    private Long starttime;
    private Long endtime;
    private Long lastupdate;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "gender")
    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "year_of_birth")
    public Short getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Short yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Basic
    @Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "psd")
    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    @Basic
    @Column(name = "memo")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "auth")
    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    @Basic
    @Column(name = "starttime")
    public Long getStarttime() {
        return starttime;
    }

    public void setStarttime(Long starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "endtime")
    public Long getEndtime() {
        return endtime;
    }

    public void setEndtime(Long endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "lastupdate")
    public Long getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Long lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (yearOfBirth != null ? !yearOfBirth.equals(that.yearOfBirth) : that.yearOfBirth != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (psd != null ? !psd.equals(that.psd) : that.psd != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (auth != null ? !auth.equals(that.auth) : that.auth != null) return false;
        if (starttime != null ? !starttime.equals(that.starttime) : that.starttime != null) return false;
        if (endtime != null ? !endtime.equals(that.endtime) : that.endtime != null) return false;
        return lastupdate != null ? lastupdate.equals(that.lastupdate) : that.lastupdate == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (yearOfBirth != null ? yearOfBirth.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (psd != null ? psd.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (auth != null ? auth.hashCode() : 0);
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        return result;
    }
}

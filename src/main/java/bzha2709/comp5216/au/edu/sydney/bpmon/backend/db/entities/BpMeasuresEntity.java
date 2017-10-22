package bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.entities;

import javax.persistence.*;

@Entity
@Table(name = "\"BP_Measures\"", schema = "public", catalog = "bpmonitor")
public class BpMeasuresEntity {
    private long id;
    private Long userId;
    private Short sys;
    private Short dia;
    private Short pulse;
    private Short position;
    private Short arm;
    private Short mood;
    private Long time;

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
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "sys")
    public Short getSys() {
        return sys;
    }

    public void setSys(Short sys) {
        this.sys = sys;
    }

    @Basic
    @Column(name = "dia")
    public Short getDia() {
        return dia;
    }

    public void setDia(Short dia) {
        this.dia = dia;
    }

    @Basic
    @Column(name = "pulse")
    public Short getPulse() {
        return pulse;
    }

    public void setPulse(Short pulse) {
        this.pulse = pulse;
    }

    @Basic
    @Column(name = "position")
    public Short getPosition() {
        return position;
    }

    public void setPosition(Short position) {
        this.position = position;
    }

    @Basic
    @Column(name = "arm")
    public Short getArm() {
        return arm;
    }

    public void setArm(Short arm) {
        this.arm = arm;
    }

    @Basic
    @Column(name = "mood")
    public Short getMood() {
        return mood;
    }

    public void setMood(Short mood) {
        this.mood = mood;
    }

    @Basic
    @Column(name = "time")
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BpMeasuresEntity that = (BpMeasuresEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (sys != null ? !sys.equals(that.sys) : that.sys != null) return false;
        if (dia != null ? !dia.equals(that.dia) : that.dia != null) return false;
        if (pulse != null ? !pulse.equals(that.pulse) : that.pulse != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (arm != null ? !arm.equals(that.arm) : that.arm != null) return false;
        if (mood != null ? !mood.equals(that.mood) : that.mood != null) return false;
        return time != null ? time.equals(that.time) : that.time == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (sys != null ? sys.hashCode() : 0);
        result = 31 * result + (dia != null ? dia.hashCode() : 0);
        result = 31 * result + (pulse != null ? pulse.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (arm != null ? arm.hashCode() : 0);
        result = 31 * result + (mood != null ? mood.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}

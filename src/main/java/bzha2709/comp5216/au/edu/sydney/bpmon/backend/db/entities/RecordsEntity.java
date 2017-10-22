package bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.entities;

import javax.persistence.*;

@Entity
@Table(name = "Records", schema = "public", catalog = "bpmonitor")
public class RecordsEntity {
    private long id;
    private Long userId;
    private Long challengeId;
    private Long finishTime;

    @Id
    @Column(name = "id")
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
    @Column(name = "challenge_id")
    public Long getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(Long challengeId) {
        this.challengeId = challengeId;
    }

    @Basic
    @Column(name = "finish_time")
    public Long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecordsEntity that = (RecordsEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (challengeId != null ? !challengeId.equals(that.challengeId) : that.challengeId != null) return false;
        return finishTime != null ? finishTime.equals(that.finishTime) : that.finishTime == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (challengeId != null ? challengeId.hashCode() : 0);
        result = 31 * result + (finishTime != null ? finishTime.hashCode() : 0);
        return result;
    }
}

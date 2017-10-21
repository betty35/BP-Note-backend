package bzha2709.comp5216.au.edu.sydney.bpmon.backend.db.entities;

import javax.persistence.*;

@Entity
@Table(name = "Challenge", schema = "public", catalog = "bpmonitor")
public class ChallengeEntity {
    private long id;
    private String name;
    private String description;
    private String imgPath;
    private Boolean traceable;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "img_path")
    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Basic
    @Column(name = "traceable")
    public Boolean getTraceable() {
        return traceable;
    }

    public void setTraceable(Boolean traceable) {
        this.traceable = traceable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChallengeEntity that = (ChallengeEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (imgPath != null ? !imgPath.equals(that.imgPath) : that.imgPath != null) return false;
        return traceable != null ? traceable.equals(that.traceable) : that.traceable == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (imgPath != null ? imgPath.hashCode() : 0);
        result = 31 * result + (traceable != null ? traceable.hashCode() : 0);
        return result;
    }
}

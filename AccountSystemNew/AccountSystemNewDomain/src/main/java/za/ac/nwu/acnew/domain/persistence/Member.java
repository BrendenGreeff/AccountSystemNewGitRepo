package za.ac.nwu.acnew.domain.persistence;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "members")
@Entity
public class Member {

    private Integer id;

    public Member() {
    }

    public Member(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Members_ID", nullable = false)
    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                '}';
    }
}
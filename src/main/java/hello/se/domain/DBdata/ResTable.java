package hello.se.domain.DBdata;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//레스토랑 테이블
public class ResTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid", nullable = false)
    private Integer oid;

    @Column(name = "number", nullable = false)
    private Integer number;

    /*@Column(name = "places", nullable = false)
    private Integer places;*/

    @Column(name = "covers", nullable = false)
    private Integer covers;

    /*@OneToOne(mappedBy = "resTable")
    private Reservation reservation;

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }*/
}

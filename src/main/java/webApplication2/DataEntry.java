package webApplication2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "entriesData")
@NoArgsConstructor
@AllArgsConstructor
public class DataEntry implements Serializable {
    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "x")
    @Getter @Setter
    private Double x;
    @Column(name = "y")
    @Getter @Setter
    private Double y;
    @Column(name = "r")
    @Getter @Setter
    private Double r;
}

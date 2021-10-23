package pl.dobaczewskiMateusz.PurchaseRequests.role;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, name = "role")
    private String name;

    public Role(String name) {
        this.name = name;
    }
}

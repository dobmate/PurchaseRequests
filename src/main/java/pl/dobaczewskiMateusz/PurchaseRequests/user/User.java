package pl.dobaczewskiMateusz.PurchaseRequests.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.dobaczewskiMateusz.PurchaseRequests.orders.Order;
import pl.dobaczewskiMateusz.PurchaseRequests.requests.PurchaseRequests;
import pl.dobaczewskiMateusz.PurchaseRequests.role.Role;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 20)
    private String name;

    @Email
    @Column(unique = true)
    private String email;

    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Order> orders = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL)
    private List<PurchaseRequests> purchaseRequests = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
}

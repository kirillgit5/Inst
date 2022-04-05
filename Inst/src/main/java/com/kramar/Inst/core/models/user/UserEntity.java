package com.kramar.Inst.core.models.user;

import com.kramar.Inst.core.models.role.RoleEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    @Size(max = 40)
    private String login;

    @NotBlank
    @Size(min = 2)
    @Size(max = 20)
    private String firstName;

    @NotBlank
    @Size(min = 2)
    @Size(max = 20)
    private String lastName;

    @NotBlank
    @Size(min = 5)
    @Size(max = 20)
    @Column(unique = true)
    private String nickname;

    @NotBlank
    @Size(min = 9)
    @Size(max = 40)
    private String password;

    private Gender gender;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<RoleEntity> roles;
}

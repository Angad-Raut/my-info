package com.projectx.my_info.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "person_details")
public class PersonDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_details_id", referencedColumnName = "id")
    private Set<DocumentDetails> documentDetailsSet =new HashSet<>();
}

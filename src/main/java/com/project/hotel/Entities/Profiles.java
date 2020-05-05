package com.project.hotel.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profiles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @NotNull
    public String firstName;
    @NotNull
    public String lastName;
    @NotNull
    public String email;
    @NotNull
    public String tel;

    public Long bookingId;
}

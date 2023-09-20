package dev.fayzullo.appclickup.entity;

import dev.fayzullo.appclickup.entity.template.AbsLongEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class Workspace extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

    private String color;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Users owner;

    @Column(nullable = false)
    private String initialLetter;

    @ManyToOne(fetch = FetchType.LAZY)
    private Attachment avatar;



}

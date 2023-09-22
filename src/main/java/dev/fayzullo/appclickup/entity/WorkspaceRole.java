package dev.fayzullo.appclickup.entity;

import dev.fayzullo.appclickup.entity.enums.WorkspaceRoleName;
import dev.fayzullo.appclickup.entity.template.AbsUUIDEntity;
import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class WorkspaceRole extends AbsUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Workspace workspace;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private WorkspaceRoleName extendsRole;

    public static void main(String[] args) {
        System.out.println("Java");
    }






}

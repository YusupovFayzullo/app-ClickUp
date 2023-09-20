package dev.fayzullo.appclickup.entity;

import dev.fayzullo.appclickup.entity.template.AbsUUIDEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.sql.Timestamp;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class WorkspaceUser extends AbsUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Workspace workspace;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private WorkspaceRole workspaceRole;

    @Column(nullable = false)
    private Timestamp dateInvited;

    private Timestamp dateJoined;







}

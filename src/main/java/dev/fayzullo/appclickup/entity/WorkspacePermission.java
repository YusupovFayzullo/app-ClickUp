package dev.fayzullo.appclickup.entity;

import dev.fayzullo.appclickup.entity.enums.WorkspacePermissionName;
import dev.fayzullo.appclickup.entity.template.AbsUUIDEntity;
import jakarta.persistence.*;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity




public class WorkspacePermission extends AbsUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private WorkspaceRole workspaceRole;

    @Enumerated(EnumType.STRING)
    private WorkspacePermissionName permissionName;





}

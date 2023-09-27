package dev.fayzullo.appclickup.entity;

import dev.fayzullo.appclickup.entity.template.AbsUUIDEntity;
import jakarta.persistence.Entity;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Attachment extends AbsUUIDEntity {

    private String name;

    private String originalName;

    private Long size;

    private String contentType;



}

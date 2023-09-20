package dev.fayzullo.appclickup.entity.template;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.UUID;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class AbsUUIDEntity extends AbsMainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}

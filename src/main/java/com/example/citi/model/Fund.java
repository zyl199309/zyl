package com.example.citi.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "fund", indexes = {
        @Index(name = "idx_code", columnList = "code")
})
@Entity
public class Fund implements Serializable {
    private static final long serialVersionUID = -3853516836630206067L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "volume")
    private int volume;
    @Column(name = "type")
    private int type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fund{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", volume=" + volume +
                ", type=" + type +
                '}';
    }
}

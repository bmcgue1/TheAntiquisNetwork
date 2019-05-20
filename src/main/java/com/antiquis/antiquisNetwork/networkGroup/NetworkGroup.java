package com.antiquis.antiquisNetwork.networkGroup;

import com.antiquis.antiquisNetwork.network.Network;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "networkGroup")
public class NetworkGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "networkid")
    private Network network;
}

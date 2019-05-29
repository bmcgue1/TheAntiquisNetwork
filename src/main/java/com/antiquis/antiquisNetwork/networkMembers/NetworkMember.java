package com.antiquis.antiquisNetwork.networkMembers;

import com.antiquis.antiquisNetwork.network.Network;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "networkMembers")
public class NetworkMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "networkId")
    private Network network;
}

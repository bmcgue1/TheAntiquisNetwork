package com.antiquis.antiquisNetwork.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NetworkService {
    @Autowired
    private NetworkRepository networkRepository;

    //Get all Networks
    public List<Network> getAllNetworks() {
        List<Network> networks = new ArrayList<>();
        networkRepository.findAll().forEach(network -> networks.add(network));
        return networks;
    }

    //Network by id
    public Optional<Network> getNetwork(Long id) {
        Optional<Network> byId = networkRepository.findById(id);
        return byId;
    }

    //Add Network
    public void addNetworks(Network network) {
        networkRepository.save(network);
    }

    // TODO :Fix update Networks
    public void updateNetwork(Long id, Network network) {
        networkRepository.save(network);
    }

    public void deleteNetwork(Long id) {
        networkRepository.deleteById(id);
    }
}

package com.antiquis.antiquisNetwork.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    //Add Network
    public void addNetworks(Network network) {
        networkRepository.save(network);
    }

    // TODO :Fix update Networks
    public void updateNetwork(Long id, Network network) {
        networkRepository.save(network);
    }

    public void deleteNetworkById(Long id) {
        networkRepository.deleteById(id);
    }
}

package com.antiquis.antiquisNetwork.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/network")
public class NetworkController {

    @Autowired
    private NetworkService networkService;

    @GetMapping("/getAll")
    public List<Network> getAllNetworks() {
        return networkService.getAllNetworks();
    }

    @PostMapping("/add")
    public void addNetwork(@RequestBody Network network) {
        networkService.addNetworks(network);
    }

    @RequestMapping("/delete/{id}")
    public void deleteNetworkById(@PathVariable Long id) {
        networkService.deleteNetworkById(id);
    }
}

package com.antiquis.antiquisNetwork.networkMembers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/networkMember")
public class NetworkMemberController {

    @Autowired
    private NetworkMemberService networkMemberService;

    @GetMapping("/getAll")
    public List<NetworkMember> getAllNetworkMembers() {
        return networkMemberService.getAllNetworkMembers();
    }

    @PostMapping("/add")
    public void addNetworkMembers(@RequestBody NetworkMember networkMember) {
        networkMemberService.addNetworkMembers(networkMember);
    }

    @RequestMapping("/delete/id")
    public void deleteNetworkMembersById(@PathVariable Long id) {
        networkMemberService.deleteNetworkMember(id);
    }
}

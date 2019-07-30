package com.antiquis.antiquisNetwork.networkMembers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NetworkMemberService {
    @Autowired
    private NetworkMemberRepository networkMemberRepository;

    //Get all NetworkMembers
    public List<NetworkMember> getAllNetworkMembers() {
        List<NetworkMember> networkMembers = new ArrayList<>();
        networkMemberRepository.findAll().forEach(networkMember -> networkMembers.add(networkMember));
        return networkMembers;
    }

    //Add NetworkMember
    public void addNetworkMembers(NetworkMember networkMember) {
        networkMemberRepository.save(networkMember);
    }


    public void deleteNetworkMember(Long id) {
        networkMemberRepository.deleteById(id);
    }
}

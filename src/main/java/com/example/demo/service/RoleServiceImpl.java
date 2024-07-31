package com.example.demo.service;

import com.example.demo.domain.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl extends CrudServiceImpl<Role, Long> implements RoleService{

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    @Override
    public Role update(Long id, Role roleDetails) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        if (optionalRole.isPresent()) {
            Role role = optionalRole.get();
            role.setName(roleDetails.getName());
            role.setUsers(roleDetails.getUsers());
            return roleRepository.save(role);
        } else {
            return null;
        }
    }

    @Override
    protected CrudRepository<Role, Long> getRepository() {
        return this.roleRepository;
    }
}
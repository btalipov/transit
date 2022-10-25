package kz.talipov.transit.services.impl;

import kz.talipov.transit.models.entities.User;
import kz.talipov.transit.repositories.UserRepository;
import kz.talipov.transit.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {return userRepository.findAll();}

    @Override
    public User addUser(User user) {return userRepository.save(user);}

    @Override
    public User updateUser(User user) {return userRepository.save(user);}

    @Override
    public void deleteUserById(Long id) {userRepository.deleteById(id);}
}

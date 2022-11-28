package com.javaguides.springbootdto.service;


import com.javaguides.springbootdto.dto.UserLocationDTO;
import com.javaguides.springbootdto.model.User;
import com.javaguides.springbootdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepo.findAll()
                .stream()
                //iterate list of users and it will internally call a method to convert user entity to user location dto
                .map(this::convertEntityToDto)
                //collect the result
                .collect(Collectors.toList());

    }


    //create a method to convert user entity to user location dto

    //taken user jpa entity
    //convert this user jpa entity to user location dto
   // userLocationDto= contain user and location information

    private UserLocationDTO convertEntityToDto(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();

        //set all details from user entity to user location dto
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLongitude());
        return userLocationDTO;



    }


}

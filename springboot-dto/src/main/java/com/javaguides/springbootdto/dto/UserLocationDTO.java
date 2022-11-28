package com.javaguides.springbootdto.dto;



//get information from user and location
//write a rest api which return a user and location details to client
//dto to transfer data from server to client

import lombok.Data;

@Data
public class UserLocationDTO {
    //create a field that are required to send information server to client
    //field should be the same as entity class otherwise model mapper , data not populated

    private Long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;

}

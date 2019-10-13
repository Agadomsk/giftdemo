package com.ag.gifdemo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class Gif {


    @Getter
    private String name;
    @Getter
    private String userName;
    @Getter
    private Boolean favorite;






}

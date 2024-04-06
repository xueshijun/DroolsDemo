package com.ws.soon.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class School {
    private String className;
    private String classCount;
    private String[] classNameArray;
    private List classNameList;
    private Set classNameSet;
    private Map classNameMap;

//    public School() {
//    }
//
//    public School(String className) {
//        this.className = className;
//    }

}

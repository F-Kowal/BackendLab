package com.example.demo;

import java.util.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class UsersService {

    private ConcurrentHashMap<Integer, Object> users = new ConcurrentHashMap<>();

    @PostConstruct
    private void onConstruct() {
        this.users.put(1, new Object());
        this.users.put(2, new Object());
        this.users.put(3, new Object());
    }

    public UserPage getUsers(int pageNumber, int pageSize) {
        pageNumber = Math.max(1, pageNumber);
        pageSize = Math.max(1, pageSize);
        pageSize = Math.min(100, pageSize);

        int pageCount = 0;
        int totalCount = 0;

        return new UserPage(pageNumber, pageCount, pageSize, totalCount, Collections.EMPTY_LIST);
    }
}

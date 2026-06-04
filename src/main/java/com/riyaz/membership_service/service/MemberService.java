package com.riyaz.membership_service.service;

import com.riyaz.membership_service.model.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    public List<Member> getMembers() {
        return List.of(
                new Member(1L, "Riyaz", "riyaz@email.com"),
                new Member(2L, "John", "john@email.com")
        );
    }
}
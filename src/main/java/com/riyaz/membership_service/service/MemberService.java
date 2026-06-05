package com.riyaz.membership_service.service;

import com.riyaz.membership_service.model.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    private final List<Member> members = new ArrayList<>();

    public MemberService() {
        members.add(new Member(1L, "Riyaz", "riyaz@email.com"));
        members.add(new Member(2L, "John", "john@email.com"));
    }

    public List<Member> getMembers() {
        return members;
    }

    public Member addMember(Member member) {
        members.add(member);
        return member;
    }

    public void deleteMember(Long id) {
        members.removeIf(member -> member.getId().equals(id));
    }
}
``
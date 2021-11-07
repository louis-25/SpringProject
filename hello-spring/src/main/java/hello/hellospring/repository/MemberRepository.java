package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // Optional은 null을 반환할경우 감싸주는역할
    Optional<Member> findByName(String name);
    List<Member> findAll();
}

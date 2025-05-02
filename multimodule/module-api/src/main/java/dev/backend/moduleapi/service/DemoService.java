package dev.backend.moduleapi.service;
import dev.backend.modulecommon.domain.member.MemberEntity;
import dev.backend.modulecommon.domain.member.MemberRepository;
import dev.backend.modulecommon.response.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {

    @Value("${profile-name}")
    private String profileName;

    private final MemberRepository memberRepository;

    public String save() {
        System.out.println("======= profile name : "+profileName+"========");
        memberRepository.save(MemberEntity.builder().email("member@gmail.com").build());
        return Response.SUCCESS.getMessage();
    }

    public String find(Long id) {
        return memberRepository.findById(id).get().getEmail();
    }
}

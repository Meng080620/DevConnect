package com.ms.spring_security_jwt.service.implementation;
import com.ms.spring_security_jwt.infrastructure.repository.BaseRepository;
import com.ms.spring_security_jwt.infrastructure.service.implementation.BaseCrudServiceImpl;
import com.ms.spring_security_jwt.modules.model.user.entity.UserEntity;
import com.ms.spring_security_jwt.repository.UserRepository;
import com.ms.spring_security_jwt.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl extends BaseCrudServiceImpl<UserEntity, Long> implements UserService {
    private final UserRepository userRepository;

    @Override
    public BaseRepository<UserEntity, Long> getRepository() {
        return this.userRepository;
    }

}

package io.ana.julia.listinha.usecase;

import io.ana.julia.listinha.data.UserRepository;
import io.ana.julia.listinha.data.dto.UserDto;
import io.ana.julia.listinha.data.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FindAllUsersUseCaseImpl implements FindAllUsersUseCase {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public FindAllUsersUseCaseImpl(
            UserRepository userRepository,
            UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> execute() {
        return userRepository.
                findAll()
                .stream().
                map(userEntity -> userMapper.toUserDTO(userEntity))
                .collect(Collectors.toList());
    }
}

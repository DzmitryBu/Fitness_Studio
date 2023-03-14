package by.it_academy.fitness.service;

import by.it_academy.fitness.core.dto.User;
import by.it_academy.fitness.core.exception.SingleErrorResponse;
import by.it_academy.fitness.dao.repositories.UserRepository;
import by.it_academy.fitness.entity.UserCreateEntity;
import by.it_academy.fitness.service.api.IUserService;
import org.springframework.core.convert.ConversionService;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;

public class UserService implements IUserService {
    private static final String EMAIL_REGEX =  "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    private final UserRepository repository;
    private final ConversionService conversionService;


    public UserService(UserRepository repository, ConversionService conversionService) {
        this.repository = repository;
        this.conversionService = conversionService;
    }

    @Override
    public User getCard(UUID uuid) {
        Optional<UserCreateEntity> optionalUserCreateEntity = repository.findById(uuid);

        if (optionalUserCreateEntity.isEmpty()) {
            throw new SingleErrorResponse("Пользователя с указанным uuid не найдено.");
        }
        UserCreateEntity userCreateEntity = optionalUserCreateEntity.get();
        User user = conversionService.convert(userCreateEntity, User.class);
        return user;
    }

    @Override
    public User loadUserByUsername (String mail){
        return conversionService.convert(repository.findByMail(mail).get(), User.class);
    }
}

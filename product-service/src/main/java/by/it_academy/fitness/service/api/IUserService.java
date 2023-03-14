package by.it_academy.fitness.service.api;

import by.it_academy.fitness.core.dto.User;
import java.util.UUID;

public interface IUserService {


    User getCard(UUID uuid);

    User loadUserByUsername(String mail);

}

package by.it_academy.fitness.dao.repositories.api;

import by.it_academy.fitness.entity.UserCreateEntity;

import java.util.UUID;

public interface IUserDao {


    UserCreateEntity getCard(UUID uuid);

    UserCreateEntity getUserEntityByEmail(String email);
}

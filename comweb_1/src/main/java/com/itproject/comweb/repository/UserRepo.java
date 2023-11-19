package com.itproject.comweb.repository;

import com.itproject.comweb.entity.UserEntity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long> {
}
package me.pianorang.em.core.user.infra;

import me.pianorang.em.Constant;
import me.pianorang.em.core.user.domain.User;
import me.pianorang.em.core.user.domain.UserRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//@Profile(Constant.PROFILE_PRODUCTION)
@Repository
public interface JpaUserRepository extends UserRepository, JpaRepository<User, Long> {
}

package me.pianorang.em.core.user.application;

public interface UserEditor {

    /**
     * @param user
     */
    void create(UserCommand user);

    /**
     * @param user
     */
    void update(UserCommand user);

    /**
     * @param id
     */
    void delete(Long id);
}

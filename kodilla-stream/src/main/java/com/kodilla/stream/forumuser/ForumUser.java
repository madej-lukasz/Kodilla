package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    public final LocalDate birthDate;
    public int postCount;



    public ForumUser(final int id, final String userName, final char sex,  LocalDate birthDate, int postCount) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }
        public int getId() {
            return id;
        }

        public String getUserName() {
            return userName;
        }

        public char getSex() {
            return sex;
        }

        public LocalDate getBirthDate () {
            return birthDate;
        }

        public int getPostCount() {
            return postCount;
        }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}

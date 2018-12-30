package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {


        Forum forum = new Forum();
        List<ForumUser> forumUsers = forum.getUserList();
        Map<Integer,ForumUser> forumUserMap = forumUsers.stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostCount() >=1)
                .collect(Collectors.toMap(ForumUser::getId,forumUser -> forumUser));
        forumUserMap.entrySet().stream()
                .map(entry ->entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}

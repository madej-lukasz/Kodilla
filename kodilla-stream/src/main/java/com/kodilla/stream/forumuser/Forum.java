package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1,"kowaslki 1",'M', LocalDate.of(1999,10,10),10 ));
        userList.add(new ForumUser(1,"kowaslki 2",'F', LocalDate.of(1998,8,1),110 ));
        userList.add(new ForumUser(1,"kowaslki 3",'M', LocalDate.of(1996,12,8),210 ));
        userList.add(new ForumUser(1,"kowaslki 4",'F', LocalDate.of(2008,6,19),150 ));
        userList.add(new ForumUser(1,"kowaslki 5",'M', LocalDate.of(2005,5,30),106 ));
        userList.add(new ForumUser(1,"kowaslki 6",'F', LocalDate.of(1994,9,29),100 ));
        userList.add(new ForumUser(1,"kowaslki 7",'M', LocalDate.of(2005,11,16),90 ));
        userList.add(new ForumUser(1,"kowaslki 8",'F', LocalDate.of(2000,1,5),50 ));

    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}

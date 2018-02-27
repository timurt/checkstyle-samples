package kz.tim.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Example of the class which passes all Checkstyle checks.
 *
 * @author Timur Tibeyev.
 */
public class ValidSample {
    private int counter;
    private final List<String> users;

    /**
     *  Initiate new instance of the {@code ValidSample} class.
     */
    public ValidSample() {
        counter = 0;
        users = new ArrayList<>();
    }

    /**
     *  Increases counter by 1.
     */
    public void increaseCounter() {
        this.counter ++;
    }

    /**
     *  Adds user to the users list.
     *
     *  @param user the user to be added
     */
    public void addUser(String user) {
        this.users.add(user);
    }

    /**
     *  Checks is counter equals to the length of the users list.
     *
     *  @return true if equals, otherwise false
     */
    public boolean isCounterMatchingUsersSize() {
        return counter == users.size();
    }

    /**
     *  Filters users list by first letter.
     *
     *  @param letter the first letter for filtering
     *  @return filtered list
     */
    public List<String> getUsersByFirstLetter(char letter) {
        return users.stream()
                .filter(user -> user.charAt(0) == letter)
                .collect(Collectors.toList());
    }
}

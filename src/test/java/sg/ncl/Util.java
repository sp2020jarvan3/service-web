package sg.ncl;

import org.apache.commons.lang3.RandomStringUtils;
import sg.ncl.testbed_interface.User2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Te Ye
 */
public class Util {

    public static User2 getUser() {
        final User2 user = new User2();
        user.setId(RandomStringUtils.randomAlphanumeric(20));
        user.setFirstName(RandomStringUtils.randomAlphanumeric(20));
        user.setLastName(RandomStringUtils.randomAlphanumeric(20));
        user.setJobTitle(RandomStringUtils.randomAlphanumeric(20));
        user.setEmail(RandomStringUtils.randomAlphanumeric(20));
        user.setEmailVerified(true);
        user.setAddress1(RandomStringUtils.randomAlphanumeric(20));
        user.setAddress2(RandomStringUtils.randomAlphanumeric(20));
        user.setInstitution(RandomStringUtils.randomAlphanumeric(20));
        user.setInstitutionAbbreviation(RandomStringUtils.randomAlphanumeric(20));
        user.setInstitutionWeb(RandomStringUtils.randomAlphanumeric(20));
        user.setCountry(RandomStringUtils.randomAlphanumeric(20));
        user.setCity(RandomStringUtils.randomAlphanumeric(20));
        user.setPhone(RandomStringUtils.randomAlphanumeric(20));
        user.setRegion(RandomStringUtils.randomAlphanumeric(20));
        user.setPostalCode(RandomStringUtils.randomAlphanumeric(20));
        return user;
    }

    public static List<User2> getMembersList() {
        List<User2> membersList = new ArrayList<>();
        membersList.add(getUser());
        return membersList;
    }

}

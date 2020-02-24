package person;

public class Person implements Comparable<Person> {
    private String FirstName;
    private String LastName;
    private String EmailId;
    private StringBuffer phonenumbers;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public StringBuffer getPhonenumbers() {
        return phonenumbers;
    }


    public void setPhoneNumbers(String phoneNumber) {
        if (phonenumbers == null) {
            this.phonenumbers = new StringBuffer(phoneNumber);
        } else {
            this.phonenumbers.append(", " + phoneNumber);
        }


    }


    @Override
    public String toString() {
        if (getEmailId() != "") {
            return "---------*--------*---------*---------\n" +
                    "FirstName" + getFirstName() + "\n" +
                    "LastName" + getLastName() + "\n" +
                    "Contactnumber(s)" + getPhonenumbers() + "\n" +
                    "Email adderess" + getEmailId() + "\n" +
                    "--------*--------*--------*----------*";
        } else {
            return "-------*-------*--------*--------\n" +
                    "FirstName" + getFirstName() + "\n" +
                    "LastName" + getLastName() + "\n" +
                    "Contactnumber(s)" + getPhonenumbers() + "\n" +
                    "--------*-------*--------*--------*";
        }
    }


    @Override
    public int compareTo(Person newPerson) {
        return this.getFirstName().compareTo(newPerson.getFirstName());
    }
}

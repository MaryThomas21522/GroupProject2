package GroupProject2;

public class Registration {

    private String email;
    private String userName;
    private String password;

    void setEmail(String email){
        if(email.contains("@yahoo.com")){
            this.email=email;
            System.out.println("Valid email");
        }else {
            System.out.println("Not valid email. Only yahoo.com email allowed");
        }
    }

    void setUserName(String userName){
        this.userName=userName;
        if (userName.length()>6){
            System.out.println("Valid username");
        }else {
            System.out.println("Not valid username. Enter at least 6 characters");
        }
    }

    void setPassword(String password){
        this.password=password;
        if (password.length()>6 && !password.contains(userName)) {
            System.out.println("Valid password");
        }else {
            System.out.println("Not valid password. Enter password not similar to username");
        }
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("duncan@yahoo.com");
        registration.setUserName("Dun");
        registration.setPassword("Dun123");
    }

}

/*
    Create Registration Class in which you would have variables as email, userName and password that have an access
    scope only within its own class. After creating an object of the class user should be able to call methods and in
    each method separately pass values to set users email, username and password.
        Requirements:
        A. Valid email consider to be only yahoo
        B. Valid userName and password cannot be empty and should be of
        length larger than 6 characters. Also, valid password cannot contain userName.
 */



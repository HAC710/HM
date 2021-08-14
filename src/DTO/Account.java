
package DTO;

public class Account {
    
    public int id;
    public String username;
    public String displayname;
    public String password;
    public int type;
    
    public Account() {}

    public Account(int id, String username, String displayname, String password, int type) {
        this.id = id;
        this.username = username;
        this.displayname = displayname;
        this.password = password;
        this.type = type;
    }

    

    public static boolean Compare_ID(Account a, Account b ){
        return a.id > b.id;
    }
    public static boolean Compare_Username(Account a, Account b ){
        return a.username.equals(b.username);
    }
    public static boolean Compare_Password(Account a, Account b ){
        return a.password.equals(b.password);
    }
    
    public static boolean Compare_Type(Account a, Account b ){
        return a.type > b.type;
    }
    public static boolean Compare_DisplayName(Account a, Account b ){
        return a.displayname.equals(b.displayname);
    }
}

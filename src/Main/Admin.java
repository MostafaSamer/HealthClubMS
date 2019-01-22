package Main;

public class Admin implements ILogin{

    public int adminId;
    public String adminUserName;
    public String adminPass;

    //Setter
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }
    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    //Getter
    public int getAdminId() {
        return adminId;
    }
    public String getAdminUserName() {
        return adminUserName;
    }
    public String getAdminPass() {
        return adminPass;
    }

    //Constructor
    public Admin() {
    }
    public Admin(int adminId, String adminUserName, String adminPass) {
        this.setAdminId(adminId);
        this.setAdminUserName(adminUserName);
        this.setAdminPass(adminPass);
    }
    //Methods
    public boolean changePassword(String oldPass, String newPass) {
        if (this.getAdminPass().equals(oldPass)) {
            this.setAdminPass(newPass);
            return true;
        } return false;
    }

    @Override
    public boolean Login (int ID, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

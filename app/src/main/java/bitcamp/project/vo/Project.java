package bitcamp.project.vo;

public class Project {
    private String title;
    private String description;
    private String startDate;
    private String endDate;
    private User[] members = new User[10];
    private int memberSize;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean containsMember(User user) {
        for (int i = 0; i < this.members.length; i++) {
            User member = this.members[i];
            if (member.getName().equals(user.getName())) {
                return true;
            }
        }
        return false;
    }

    public void addMember(User user) {
        this.members[this.memberSize++] = user;
    }

    public int countMembers() {
        return this.memberSize;
    }

    public User getMember(int index) {
        return this.members[index];
    }



}

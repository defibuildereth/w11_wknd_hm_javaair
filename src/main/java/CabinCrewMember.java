public class CabinCrewMember extends Employee{

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String giveAnnouncement (String message) {
        return "Hi there folks, " + message;
    }
}

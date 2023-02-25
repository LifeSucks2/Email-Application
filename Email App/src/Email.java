public class Email {
    private String vorname, nachname, firma, abteilung;

    public Email(String vornme, String nachnme, String frm, String abt){
        this.vorname = vornme;
        this.nachname = nachnme;
        this.firma = frm;
        this.abteilung = abt;
        
    }

    public Email(String vornme, String nachnme, String frm){
        this.vorname = vornme;
        this.nachname = nachnme;
        this.firma = frm;
    }

    public String emailToStringWithAbt(){
        return this.vorname + "." + this.nachname + "@" + this.abteilung + "." + this.firma;
    }

    public String emailToStringWithoutAbt(){
        return this.vorname + "." + this.nachname + "@" + this.firma;
    }
    


}

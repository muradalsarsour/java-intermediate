/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Journal extends Book  {
    private String conferenceName;
    private int conferenceNo;

    public Journal() {
    }

    public Journal(String conferenceName, int conferenceNo, String title, Author author, int number, String genre, int version, Date date) {
        super(title, author, number, genre, version, date);
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }
    
    @Override
    public String getInfo(){
        return super.getInfo()+"\nJournal Conference:"+conferenceName+"\nConference Number:"+conferenceNo;
        
    }

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }
    
    
    
    
}

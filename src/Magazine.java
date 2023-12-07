/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Magazine extends Book {
    private int issueNo;
    private Date releasedate;

    public Magazine() {
    }


    public Magazine(int issueNo, Date releasedate, String title, Author author, int number, String genre, int version, Date date) {
        super(title, author, number, genre, version, date);
        this.issueNo = issueNo;
        this.releasedate = releasedate;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setRelasedate(Date releasedate) {
        this.releasedate = releasedate;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"\nMagazine Issue:"+issueNo+"\nRelase Date:"+releasedate;
    }
    
    
    
}

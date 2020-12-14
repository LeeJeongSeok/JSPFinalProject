package vo;

import java.sql.Timestamp;

public class Answer {

    int id;
    String contents;
    Timestamp create_date;
    Timestamp modified_date;

    public Answer() {

    }

    public Answer(int id, String contents, Timestamp create_date, Timestamp modified_date) {
        this.id = id;
        this.contents = contents;
        this.create_date = create_date;
        this.modified_date = modified_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public Timestamp getModified_date() {
        return modified_date;
    }

    public void setModified_date(Timestamp modified_date) {
        this.modified_date = modified_date;
    }
}

package vo;

import java.sql.Time;
import java.sql.Timestamp;

public class Question {

    int id;
    String title;
    String contents;
    int count_of_answer;
    int writer_id;
    Timestamp create_date;
    Timestamp modified_date;

    public Question() {

    }

    public Question(int id, String title, String contents, int count_of_answer, int writer_id, Timestamp create_date, Timestamp modified_date) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.count_of_answer = count_of_answer;
        this.writer_id = writer_id;
        this.create_date = create_date;
        this.modified_date = modified_date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getCount_of_answer() {
        return count_of_answer;
    }

    public void setCount_of_answer(int count_of_answer) {
        this.count_of_answer = count_of_answer;
    }

    public int getWriter_id() {
        return writer_id;
    }

    public void setWriter_id(int writer_id) {
        this.writer_id = writer_id;
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

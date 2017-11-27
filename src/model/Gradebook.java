package model;

import java.util.Arrays;

public class Gradebook {
    private Session[] sessions;
    private GradeCategory[] categories;
    private String title;

    public Gradebook(String title){
        this.sessions = new Session[0];
        this.categories = new GradeCategory[0];
        this.title = title;
    }

    public Session[] getSessions() {
        return this.sessions;
    }
    
    public void setSessions(Session[] sessions) {
        this.sessions = sessions;
    }
    
    public void addSession(Session session) {
        sessions  = Arrays.copyOf(sessions, sessions.length + 1);
        sessions[sessions.length - 1] = session;
    }

    public void addStudent(Student student) {
        Session session = new Session(title);
        student.addSession(session);
        addSession(session);
    }

    public void addCategory(GradeCategory category) {
        for (Session s : sessions) {
            s.addCategory(category);
        }
    }
    
    
}

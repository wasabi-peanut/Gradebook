package model;

import java.util.Arrays;

public class Student {
    
    private int id;
    
    private String name;
    
    private Session[] sessions;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.sessions = new Session[0]; 
    }
    
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setID(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
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
    
    
}

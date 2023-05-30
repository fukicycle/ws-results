package application.Entities;

import java.util.ArrayList;

public class Event {
    public int id;
    public String name;
    public String start_date;
    public String end_date;
    public String code;
    public WsEntity ws_entity;
    public ArrayList<Object> links;
}

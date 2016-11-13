package ua.studymap.android.data;

import java.util.ArrayList;

import ua.studymap.android.models.Classroom;

/**
 * Created by RON on 13.11.2016.
 */
public class Data {

    public ArrayList<Classroom> classroomsData() {
        ArrayList<Classroom> classroom = new ArrayList<>();
        classroom.add(new Classroom("101", "1 floor"));
        classroom.add(new Classroom("102", "1 floor"));
        classroom.add(new Classroom("103", "1 floor"));
        classroom.add(new Classroom("104", "1 floor"));
        classroom.add(new Classroom("105", "1 floor"));
        return classroom;
    }
}

package ua.studymap.android.data;

import java.util.ArrayList;

import ua.studymap.android.models.Classroom;

/**
 * Created by RON on 13.11.2016.
 */
public class Data {

    public ArrayList<Classroom> classroomsData() {
        ArrayList<Classroom> classroom = new ArrayList<>();
        int room = 100;
        int floor = 1;
        while (room < 1000){
            classroom.add(new Classroom(""+ room, floor +" floor"));
            room++;
            if(room%100 == 0) floor++;
        }

        return classroom;
    }
}

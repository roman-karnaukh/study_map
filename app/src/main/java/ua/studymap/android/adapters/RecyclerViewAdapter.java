package ua.studymap.android.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ua.studymap.android.ListActivity;
import ua.studymap.android.R;
import ua.studymap.android.models.Classroom;

/**
 * Created by RON on 13.11.2016.
 */
public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.PersonViewHolder>{

    List<Classroom> classrooms;
    public RecyclerViewAdapter(List<Classroom> classrooms){
        this.classrooms = classrooms;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int item) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.tvClassroom.setText(classrooms.get(i).name);
        personViewHolder.tvFullClassroom.setText(ListActivity.mContext.getResources().getString(R.string.classroom) + classrooms.get(i).name);
        personViewHolder.tvFloor.setText(classrooms.get(i).floor);

    }

    @Override
    public int getItemCount() {
        return classrooms.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        CardView cv;
        TextView tvClassroom;
        TextView tvFullClassroom;
        TextView tvFloor;
        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            tvClassroom = (TextView)itemView.findViewById(R.id.tvClassroom);
            tvFullClassroom = (TextView)itemView.findViewById(R.id.tvFullClassroom);
            tvFloor = (TextView)itemView.findViewById(R.id.tvFloor);

            tvFloor.setOnClickListener(this);
            tvFullClassroom.setOnClickListener(this);
            cv.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.tvFloor || view.getId()==R.id.tvFullClassroom){
                Toast.makeText(ListActivity.mContext, ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        }
    }

}

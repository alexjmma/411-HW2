package com.cpsc411.hwasssignment2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cpsc411.hwasssignment2.R;
import com.cpsc411.hwasssignment2.model.Student;
import com.cpsc411.hwasssignment2.model.StudentDB;

public class SummaryLVAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return StudentDB.getInstance().getStudents().size();
    }

    @Override
    public Object getItem(int position) {
        return StudentDB.getInstance().getStudents().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row_view;

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            row_view = inflater.inflate(R.layout.student_row, parent, false);
        } else row_view = convertView;

        Student s = StudentDB.getInstance().getStudents().get(position);

        TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name_id);
        TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name_id);
        TextView cwidView = (TextView) row_view.findViewById(R.id.cwid_id);
        firstNameView.setText(s.getFirstName());
        lastNameView.setText(s.getLastName());
        cwidView.setText(s.getCWID());
        row_view.setTag(new Integer(position));

        return row_view;
    }
}

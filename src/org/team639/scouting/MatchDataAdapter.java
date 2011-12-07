package org.team639.scouting;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MatchDataAdapter extends BaseAdapter {
	private Context context;
	
	private List<MatchData> listMatchData;

	public MatchDataAdapter(Context context, List<MatchData> listMatchData) {
		this.context = context;
		this.listMatchData = listMatchData;
	}

	@Override
	public int getCount() {
		return listMatchData.size();
	}

	@Override
	public Object getItem(int position) {
		return listMatchData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		MatchData data = listMatchData.get(position);
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.match_row, null);
		}

		addMatchData(convertView, data);
		addTeamData(convertView, data);
		
		return convertView;
	}
	
	private void addTeamData(View row, MatchData data) {
		TeamView team;

		team = (TeamView) row.findViewById(R.id.R1);
		team.readTeamData(data, MatchData.RED_1);
		
		team = (TeamView) row.findViewById(R.id.R2);
		team.readTeamData(data, MatchData.RED_2);
		
		team = (TeamView) row.findViewById(R.id.R3);
		team.readTeamData(data, MatchData.RED_3);

		team = (TeamView) row.findViewById(R.id.B1);
		team.readTeamData(data, MatchData.BLUE_1);
		
		team = (TeamView) row.findViewById(R.id.B2);
		team.readTeamData(data, MatchData.BLUE_2);

		team = (TeamView) row.findViewById(R.id.B3);
		team.readTeamData(data, MatchData.BLUE_3);

	}
	
	private void addMatchData(View row, MatchData data) {
		MatchResultView view = (MatchResultView) row.findViewById(R.id.MatchResult);
		view.readMatchData(data);
	}
	
}

package org.team639.scouting;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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
		TextView team;
		MatchData.CardPenalty card;

		team = (TextView) row.findViewById(R.id.R1);
		team.setText(data.getTeam(MatchData.TeamStation.RED_1));
		card = data.getCard(MatchData.TeamStation.RED_1);
		if (card != MatchData.CardPenalty.CARD_NONE) {
			team.setTextColor(R.color.redAllianceTextDim);
			if (card == MatchData.CardPenalty.CARD_YELLOW)
				team.setBackgroundResource(R.drawable.red_left_yellow);
			else
				team.setBackgroundResource(R.drawable.red_left_red);
		}
		
		team = (TextView) row.findViewById(R.id.R2);
		team.setText(data.getTeam(MatchData.TeamStation.RED_2));
		card = data.getCard(MatchData.TeamStation.RED_2);
		if (card != MatchData.CardPenalty.CARD_NONE) {
			team.setTextColor(R.color.redAllianceTextDim);
			if (card == MatchData.CardPenalty.CARD_YELLOW)
				team.setBackgroundResource(R.drawable.red_mid_yellow);
			else
				team.setBackgroundResource(R.drawable.red_mid_red);
		}
		
		team = (TextView) row.findViewById(R.id.R3);
		team.setText(data.getTeam(MatchData.TeamStation.RED_3));
		card = data.getCard(MatchData.TeamStation.RED_3);
		if (card != MatchData.CardPenalty.CARD_NONE) {
			team.setTextColor(R.color.redAllianceTextDim);
			if (card == MatchData.CardPenalty.CARD_YELLOW)
				team.setBackgroundResource(R.drawable.red_right_yellow);
			else
				team.setBackgroundResource(R.drawable.red_right_red);
		}
		
		team = (TextView) row.findViewById(R.id.B1);
		team.setText(data.getTeam(MatchData.TeamStation.BLUE_1));
		card = data.getCard(MatchData.TeamStation.BLUE_1);
		if (card != MatchData.CardPenalty.CARD_NONE) {
			team.setTextColor(R.color.blueAllianceTextDim);
			if (card == MatchData.CardPenalty.CARD_YELLOW)
				team.setBackgroundResource(R.drawable.blue_left_yellow);
			else
				team.setBackgroundResource(R.drawable.blue_left_red);
		}
		
		team = (TextView) row.findViewById(R.id.B2);
		team.setText(data.getTeam(MatchData.TeamStation.BLUE_2));
		card = data.getCard(MatchData.TeamStation.BLUE_2);
		if (card != MatchData.CardPenalty.CARD_NONE) {
			team.setTextColor(R.color.blueAllianceTextDim);
			if (card == MatchData.CardPenalty.CARD_YELLOW)
				team.setBackgroundResource(R.drawable.blue_mid_yellow);
			else
				team.setBackgroundResource(R.drawable.blue_mid_red);
		}
		
		team = (TextView) row.findViewById(R.id.B3);
		team.setText(data.getTeam(MatchData.TeamStation.BLUE_3));
		card = data.getCard(MatchData.TeamStation.BLUE_3);
		if (card != MatchData.CardPenalty.CARD_NONE) {
			team.setTextColor(R.color.blueAllianceTextDim);
			if (card == MatchData.CardPenalty.CARD_YELLOW)
				team.setBackgroundResource(R.drawable.blue_right_yellow);
			else
				team.setBackgroundResource(R.drawable.blue_right_red);
		}
	}
	
	private void addMatchData(View row, MatchData data) {
		TextView text = (TextView) row.findViewById(R.id.MatchNumber);
		text.setText(data.getMatchString());
		text = (TextView) row.findViewById(R.id.RScore);
		row.findViewById(R.id.MatchTime).setVisibility(View.INVISIBLE);
		text.setText(data.getRedScore());
		text = (TextView) row.findViewById(R.id.BScore);
		text.setVisibility(View.VISIBLE);
		text.setText(data.getBlueScore());
		text.setBackgroundResource(R.drawable.blue_win);
		text.setVisibility(View.VISIBLE);
	}
	
}

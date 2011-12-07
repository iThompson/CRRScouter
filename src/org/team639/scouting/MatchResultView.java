package org.team639.scouting;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MatchResultView extends RelativeLayout {
	
	private ScoreView rScore = null;
	private ScoreView bScore = null;
	private TextView matchTime = null;

	public MatchResultView(Context context) {
		super(context);
		initResults(null);
	}

	public MatchResultView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initResults(attrs);
	}

	public MatchResultView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initResults(attrs);
	}
	
	private void initResults(AttributeSet attrs) {
		((Activity)getContext()).getLayoutInflater().inflate(R.layout.match_result, this);
		
		rScore = (ScoreView)findViewById(R.id.RScore);
		bScore = (ScoreView)findViewById(R.id.BScore);
		matchTime = (TextView)findViewById(R.id.MatchTime);
	}
	
	public void readMatchData(MatchData data) {
		if (data.isMatchDone()) {
			int redFinal = data.getRedScore();
			int blueFinal = data.getBlueScore();

			rScore.setScore(redFinal);
			bScore.setScore(blueFinal);
			if (redFinal > blueFinal) {
				rScore.setWin(true);
				bScore.setWin(false);
			} else if (blueFinal > redFinal) {
				rScore.setWin(false);
				bScore.setWin(true);
			} else {
				rScore.setWin(false);
				bScore.setWin(false);
			}

			matchTime.setVisibility(INVISIBLE);
			rScore.setVisibility(VISIBLE);
			bScore.setVisibility(VISIBLE);
		} else {
			int matchHour = data.getMatchHour();
			int matchMin = data.getMatchMin();
			if (matchHour < 12) {
				matchTime.setText(String.format("%1$d:%2$d%nAM", matchHour, matchMin));
			} else {
				matchTime.setText(String.format("%1$d:%2$d%nPM", matchHour - 12, matchMin));
			}
			
			matchTime.setVisibility(VISIBLE);
			rScore.setVisibility(INVISIBLE);
			bScore.setVisibility(INVISIBLE);
		}
	}

}

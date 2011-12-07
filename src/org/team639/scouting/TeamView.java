package org.team639.scouting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import org.team639.scouting.MatchData.*;

public class TeamView extends TextView {
	
	private static final int[] STATE_RED = {R.attr.red_card};
	private static final int[] STATE_YELLOW = {R.attr.yellow_card};
	
	private CardPenalty mCard = CardPenalty.CARD_NONE;

	// We don't need to do anything with constructors, let the superclass do its thing
	public TeamView(Context context) {
		super(context);
	}

	public TeamView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public TeamView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	@Override
	protected int[] onCreateDrawableState(int extraSpace) {
		final int[] drawableState = super.onCreateDrawableState(extraSpace + 2);
		if (mCard == CardPenalty.CARD_RED) {
			mergeDrawableStates(drawableState, STATE_RED);
		} else if (mCard == CardPenalty.CARD_YELLOW){
			mergeDrawableStates(drawableState, STATE_YELLOW);
		}
		return drawableState;
	}
	
	public void readTeamData(MatchData data, int station) {
		setTeamID(data.getTeamID(station));
		setCard(data.getCard(station));
	}
	
	public void setCard(CardPenalty card) {
		mCard = card;
		refreshDrawableState();
	}
	
	public void setTeamID(int team) {
		setText(Integer.toString(team));
	}

}

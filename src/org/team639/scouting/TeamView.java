package org.team639.scouting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import org.team639.scouting.MatchData.CardPenalty;

public class TeamView extends TextView {
	
	private static final int[] STATE_RED = {R.attr.red_card};
	private static final int[] STATE_YELLOW = {R.attr.yellow_card};
	
	private CardPenalty mCard = CardPenalty.CARD_NONE;

	public TeamView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public TeamView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public TeamView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
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
	
	public void setCard(CardPenalty card) {
		mCard = card;
		refreshDrawableState();
	}

}

package org.team639.scouting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class ScoreView extends TextView {
	
	private static final int[] STATE_WIN = {R.attr.match_win};
	
	private boolean isWinner = false;

	public ScoreView(Context context) {
		super(context);
	}

	public ScoreView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ScoreView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	@Override
	protected int[] onCreateDrawableState(int extraSpace) {
		final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
		if (isWinner) {
			mergeDrawableStates(drawableState, STATE_WIN);
		}
		return drawableState;
	}
	
	public void setWin(boolean winner)
	{
		isWinner = winner;
		refreshDrawableState();
	}
	
	public void setScore(int score)
	{
		setText(Integer.toString(score));
	}
}

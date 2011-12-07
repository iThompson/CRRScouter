package org.team639.scouting;

public class MatchData {
	
	public enum CardPenalty {
		CARD_NONE,
		CARD_YELLOW,
		CARD_RED
	}
	
	public static final int RED_1 = 0;
	public static final int RED_2 = 1;
	public static final int RED_3 = 2;
	public static final int BLUE_1 = 3;
	public static final int BLUE_2 = 4;
	public static final int BLUE_3 = 5;
	
	public static final int NUM_TEAMS = 6;
	
	private final String MatchID = "Q-27";
	private final Boolean matchDone = true;
	private final int RedResult = 54;
	private final int BlueResult = 27;
	
	private final int[] teams = {639, 1511, 4243, 1126, 2056, 217};
	private final CardPenalty[] cards = {CardPenalty.CARD_RED, CardPenalty.CARD_NONE, CardPenalty.CARD_YELLOW, CardPenalty.CARD_NONE, CardPenalty.CARD_YELLOW, CardPenalty.CARD_RED};
	
	private final int mTimeHour = 11;
	private final int mTimeMin = 37;
	
	public String getMatchString() {
		return MatchID;
	}
	
	public int getRedScore() {
		return RedResult;
	}
	
	public int getBlueScore() {
		return BlueResult;
	}
	
	public Boolean isMatchDone() {
		return matchDone;
	}
	
	public int getTeamID(int station) {
		if (0 <= station && station < NUM_TEAMS) {
			return teams[station];
		} else {
			return 0;
		}
	}
	
	public CardPenalty getCard(int station) {
		if (0 <= station && station < NUM_TEAMS) {
			return cards[station];
		} else {
			return CardPenalty.CARD_NONE;
		}
	}
	
	public int getMatchHour() {
		return mTimeHour;
	}
	
	public int getMatchMin() {
		return mTimeMin;
	}
}

package org.team639.scouting;

public class MatchData {
	
	public enum CardPenalty {
		CARD_NONE,
		CARD_YELLOW,
		CARD_RED
	}
	
	public enum TeamStation {
		RED_1,
		RED_2,
		RED_3,
		BLUE_1,
		BLUE_2,
		BLUE_3
	}
	
	private final String MatchID = "Q-27";
	private final Boolean matchDone = true;
	private final int RedResult = 27;
	private final int BlueResult = 54;
	
	private final int Red1 = 639;
	private final CardPenalty Red1Card = CardPenalty.CARD_RED;
	private final int Red2 = 1511;
	private final CardPenalty Red2Card = CardPenalty.CARD_NONE;
	private final int Red3 = 4243;
	private final CardPenalty Red3Card = CardPenalty.CARD_YELLOW;
	
	private final int Blue1 = 1126;
	private final CardPenalty Blue1Card = CardPenalty.CARD_NONE;
	private final int Blue2 = 2056;
	private final CardPenalty Blue2Card = CardPenalty.CARD_YELLOW;
	private final int Blue3 = 217;
	private final CardPenalty Blue3Card = CardPenalty.CARD_RED;
	
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
	
	public int getTeamID(TeamStation station) {
		switch (station) {
		case RED_1:
			return Red1;
		case RED_2:
			return Red2;
		case RED_3:
			return Red3;
		case BLUE_1:
			return Blue1;
		case BLUE_2:
			return Blue2;
		case BLUE_3:
			return Blue3;
		}
		
		return -1;
	}
	
	public CardPenalty getCard(TeamStation station) {
		switch (station) {
		case RED_1:
			return Red1Card;
		case RED_2:
			return Red2Card;
		case RED_3:
			return Red3Card;
		case BLUE_1:
			return Blue1Card;
		case BLUE_2:
			return Blue2Card;
		case BLUE_3:
			return Blue3Card;
		}
		
		return CardPenalty.CARD_NONE;
	}
}

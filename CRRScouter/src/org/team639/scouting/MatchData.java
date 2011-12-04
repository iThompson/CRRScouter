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
	private final String RedResult = "27";
	private final String BlueResult = "54";
	
	private final String Red1 = "639";
	private final CardPenalty Red1Card = CardPenalty.CARD_NONE;
	private final String Red2 = "1511";
	private final CardPenalty Red2Card = CardPenalty.CARD_YELLOW;
	private final String Red3 = "4243";
	private final CardPenalty Red3Card = CardPenalty.CARD_RED;
	
	private final String Blue1 = "1126";
	private final CardPenalty Blue1Card = CardPenalty.CARD_NONE;
	private final String Blue2 = "2056";
	private final CardPenalty Blue2Card = CardPenalty.CARD_YELLOW;
	private final String Blue3 = "217";
	private final CardPenalty Blue3Card = CardPenalty.CARD_RED;
	
	public String getMatchString() {
		return MatchID;
	}
	
	public String getRedScore() {
		return RedResult;
	}
	
	public String getBlueScore() {
		return BlueResult;
	}
	
	public Boolean isMatchDone() {
		return matchDone;
	}
	
	public String getTeam(TeamStation station) {
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
		
		return "";
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

//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private String winStatement;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int num = (int) (Math.random() * 3);
		switch(num)
		{
		case 0:
			compChoice = "R";
			break;
		case 1:
			compChoice = "P";
			break;
		case 2:
			compChoice = "S";
			break;
		}
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals("R") && compChoice.equals("P"))
		{
			winner = "Computer";
			winStatement = "Paper Covers Rock";
		}
		else if(playChoice.equals("P") && compChoice.equals("R"))
		{
			winner = "Player";
			winStatement = "Paper Covers Rock";
		}
		else if(playChoice.equals("P") && compChoice.equals("S"))
		{
			winner = "Computer";
			winStatement = "Scissors Cuts Paper";
		}
		else if(playChoice.equals("S") && compChoice.equals("P"))
		{
			winner = "Player";
			winStatement = "Scissors Cuts Paper";
		}
		else if(playChoice.equals("R") && compChoice.equals("S"))
		{
			winner = "Player";
			winStatement = "Rock Crushes Scissors";
		}
		else if(playChoice.equals("S") && compChoice.equals("R"))
		{
			winner = "Computer";
			winStatement = "Rock Crushes Scissors";
		}
		else if (playChoice.equals(compChoice)) 
		{
			winner = "";
			winStatement = "!Draw Game!";
		}
		return winner;
	}

	public String toString()
	{
		String output="\n" + "Player had: " + playChoice + "\n" + "Computer had: " + compChoice + "\n!" + determineWinner()
		+ " wins <<" + winStatement + ">>!";
		return output;
	}
}
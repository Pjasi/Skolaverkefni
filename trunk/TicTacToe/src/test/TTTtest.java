package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import heild.TicTacToe;


public class TTTtest {
String skilagildi = "";
	@Test
	public void testInitialize() {
		
		TicTacToe TTT = new TicTacToe();
		char[][] board = TTT.initialize();
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
            		System.out.print(board[i][j]);
            		skilagildi += board[i][j];
            	}
            
            }
		System.out.println(skilagildi);
		assertEquals("abcdefghi",skilagildi);
	}

	
}

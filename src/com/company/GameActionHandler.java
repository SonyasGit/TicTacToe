package com.company;

public class GameActionHandler {
    public static void reset(){
        for(int i = 0; i < GUI.state.length;i++){
            GUI.state[i]=0;
            GUI.player = 0;
            GUI.winner = 0;

        }
    }
}

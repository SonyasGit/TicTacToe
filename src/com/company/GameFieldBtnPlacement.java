package com.company;

public class ButtonPlacement {
    public static void place(){
        // first row
        GUI.btns[0].setBounds(GUI.edge, GUI.edge, GUI.offset, GUI.offset);
        GUI.btns[1].setBounds(GUI.offset + GUI.edge, GUI.edge, GUI.offset, GUI.offset);
        GUI.btns[2].setBounds(GUI.offset*2 + GUI.edge, GUI.edge, GUI.offset, GUI.offset);


        // second row
        GUI.btns[3].setBounds(GUI.edge,GUI.offset + GUI.edge, GUI.offset, GUI.offset);
        GUI.btns[4].setBounds(GUI.edge + GUI.offset,GUI.offset + GUI.edge, GUI.offset, GUI.offset);
        GUI.btns[5].setBounds(GUI.edge + GUI.offset*2,GUI.offset + GUI.edge, GUI.offset, GUI.offset);

        // third row
        GUI.btns[6].setBounds(GUI.edge,GUI.offset*2 + GUI.edge, GUI.offset, GUI.offset);
        GUI.btns[7].setBounds(GUI.edge + GUI.offset,GUI.offset*2 + GUI.edge, GUI.offset, GUI.offset);
        GUI.btns[8].setBounds(GUI.edge + GUI.offset*2,GUI.offset*2 + GUI.edge, GUI.offset, GUI.offset);
    }
}

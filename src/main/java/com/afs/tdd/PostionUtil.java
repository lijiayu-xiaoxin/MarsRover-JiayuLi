package com.afs.tdd;

public class PostionUtil {

    public static String getFinalPos(String curPosStr, char operateCode){
        Position curPos = toPosition(curPosStr);
        changePos(curPos, operateCode);
        return toPosString(curPos);
    }

    public static String getFinalPos(String curPosStr, char[] operateCodes){
        Position curPos = toPosition(curPosStr);
        for (int i = 0; i < operateCodes.length; i++) {
            changePos(curPos, operateCodes[i]);
        }
        return toPosString(curPos);
    }

    public static String toPosString(Position pos) {
        return pos.getX_coordinate() + " " + pos.getY_coordinate() + " " + Position.dirtChars[pos.getDirt()];
    }

    public static Position toPosition(String strPos) {
        int x = Integer.parseInt(strPos.substring(0, strPos.indexOf(" ")));
        int y = Integer.parseInt(strPos.substring(strPos.indexOf(" ") + 1, strPos.lastIndexOf(" ")));
        String dirtStr = strPos.substring(strPos.lastIndexOf(" ") + 1);
        int dirtIndex = -1;
        for (int i = 0; i < 4; i++) {
            if (dirtStr.charAt(0) == Position.dirtChars[i]){
                dirtIndex = i;
                break;
            }
        }
        return new Position(x, y, dirtIndex);
    }

    public static void changePos(Position curPos, char operateCode) {
        switch (operateCode){
            case 'M': moveForward(curPos);break;
            default: turnDirt(curPos, operateCode);break;
        }
    }

    private static void moveForward(Position pos) {
        switch (pos.getDirt()){
            case 0: pos.setY_coordinate(pos.getY_coordinate() + 1);break;
            case 1: pos.setX_coordinate(pos.getX_coordinate() + 1);break;
            case 2: pos.setY_coordinate(pos.getY_coordinate() - 1);break;
            case 3: pos.setX_coordinate(pos.getX_coordinate() - 1);break;
        }
    }

    private static void turnDirt(Position pos, char moveInfo) {
        switch (moveInfo){
            case 'L': pos.setDirt((pos.getDirt() + 3) % 4);break;
            case 'R': pos.setDirt((pos.getDirt() + 5) % 4);break;
        }
    }
}

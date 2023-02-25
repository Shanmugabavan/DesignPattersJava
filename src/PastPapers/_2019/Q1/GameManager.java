package PastPapers._2019.Q1;

import java.util.ArrayList;

public class GameManager {
    public static void main(String[] args) {
        ArrayList<Position> positionArrayList=new ArrayList<Position>();

        Flag flag=new Flag(10,11);

        flag.addPlayer(new Player("Shanmugabavan"));
        flag.addPlayer(new Player("Nirun"));
        flag.addPlayer(new Player("Sarangan"));


        positionArrayList.add(flag.setStateToPosition());
        System.out.println(positionArrayList);

        flag.setPositionx(14);
        flag.setPositiony(17);
        positionArrayList.add(flag.setStateToPosition());
        System.out.println(positionArrayList);

        flag.setPositionx(20);
        flag.setPositiony(30);
        positionArrayList.add(flag.setStateToPosition());
        System.out.println(positionArrayList);

        flag.setPositionx(53);
        flag.setPositiony(75);
        positionArrayList.add(flag.setStateToPosition());
        System.out.println(positionArrayList);

        System.out.println(flag.getPositionx());
        System.out.println(flag.getPositiony());


        flag.restoringFromPosition(positionArrayList.get(1));
        System.out.println(flag.getPositionx());
        System.out.println(flag.getPositiony());

        System.out.println(positionArrayList);



    }
}

package sut.mtset;


import utl.MyRandom;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Koushik Sen (ksen@cs.uiuc.edu)
 * Date: Dec 29, 2005
 * Time: 10:21:17 AM
 */
//@RunWith(JUnit4MCRRunner.class)
public class MTSetTest extends Thread {
    Set s1, s2;
    int c;
    public static boolean isKilled = false;

    public void run() {
        SimpleObject o1 = new SimpleObject(3001);
        switch (c) {
            case 0:
                s1.add(o1);
                break;
            case 1:
                s1.size();
                break;
            case 2:
                s1.clear();
                break;
            case 3:
                s1.contains(o1);
                break;
            case 4:
                s1.remove(o1);
                break;
            case 5:
                s1.toArray();
                break;
            case 6:
                s1.isEmpty();
                break;
            case 7:
                s1.iterator();
                break;
            case 8:
                s1.addAll(s2);
                break;
            case 9:
                s1.equals(s2);
                break;
            case 10:
                s1.retainAll(s2);
                break;
            case 11:
                s1.containsAll(s2);
                break;
            default:
                s1.removeAll(s2);
                break;
        }
    }

    public static void test() {
        isKilled = false;
        Set s1 = Collections.synchronizedSet(new HashSet());
        Set s2 = Collections.synchronizedSet(new HashSet());
        s1.add(new SimpleObject(MyRandom.nextInt(3000)));
        s1.add(new SimpleObject(MyRandom.nextInt(3000)));
        s2.add(new SimpleObject(MyRandom.nextInt(3000)));
        s2.add(new SimpleObject(MyRandom.nextInt(3000)));

        for (int i = 12; i >= 0; i--) {
            MTSetTest mtSetTest = new MTSetTest();
            setField(s1, s2, i, mtSetTest);
            mtSetTest.start();
        }
        for (int i = 7; i >=0 ; i--) {
            MTSetTest mtSetTest = new MTSetTest();
            setField(s2, s1, i, mtSetTest);
            mtSetTest.start();
        }

        if (s1.size() != 1){
            isKilled = true;
            return;
        }else if (s2.size() != 1){
            isKilled = true;
            return;
        }else{
            Iterator<SimpleObject> iterator11 = s1.iterator();
            if (iterator11.next().v != 3001){
                isKilled = true;
                return;
            }
            Iterator<SimpleObject> iterator22 = s2.iterator();
            if (iterator22.next().v != 3001){
                isKilled = true;
                return;
            }
        }
    }

    private static void setField(Set s1, Set s2, int i, MTSetTest mtSetTest) {
        mtSetTest.s1 = s1;
        mtSetTest.s2 = s2;
        mtSetTest.c = i;
    }
}


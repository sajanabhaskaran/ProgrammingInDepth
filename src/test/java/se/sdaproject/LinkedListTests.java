package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

class LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(expected,list.toString());
    }

    @Test
    void searchNumberFromList(){
        LinkedList list=new LinkedList();
        list.add(12);
        list.add(2);
        Integer indexValue=list.search(12);
        assertEquals(0,indexValue);
    }

    @Test
    void getNumberInTheGivenIndex(){
        LinkedList list= new LinkedList();
        list.add(12);
        list.add(22);
        list.add(45);
        int actualNumber= list.get(2);
        assertEquals(45,actualNumber);
    }

    @Test
    void getSizeofALinkedList(){
        LinkedList list=new LinkedList();
        list.add(12);
        list.add(22);
        list.add(45);
        int actualSize=list.size();
        assertEquals(3,actualSize);

    }

    @Test
    void removeFromLinkedList(){
        LinkedList list= new LinkedList();
        list.add(12);
        list.add(22);
        list.add(45);
        list.remove(45);
        String expected = "LinkedList(12,22)";
        assertEquals(expected,list.toString());
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }
}

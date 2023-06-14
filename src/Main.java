import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. A collection of 100 elements, the number of duplicates removed, a collection without duplicates
        int element = 100;
        ArrayList<Integer> listOfHundredElements = new ArrayList<>();
        for (int i = 0; i < element; i++) {
            listOfHundredElements.add(i, (int) (Math.random() * 50 + 1));
        }
        System.out.println("List of 100 elements: \n" + listOfHundredElements);

        Set<Integer> deletedElements = new HashSet<>(listOfHundredElements);
        System.out.println("\nCount of deleted elements are " + deletedElements.size());
        System.out.println("\nList of elements without repeats: ");
        for (Integer listOfElementsWithoutRepeats : deletedElements) {
            System.out.println(listOfElementsWithoutRepeats);
        }

        // 2. There are N people in a circle, numbered from 1 to N. While keeping score
        //every second person is crossed out in a circle until there is only one left.

        ArrayList<Integer> num = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            num.add(i, (int)(Math.random() * 10 + 1));
        }
        System.out.println("Number of people in ArrayList: \n" + num);
        int i;
        int size;

        while (num.size() > 1){
            if (num.size() % 2 != 0) {
                i = 0;
                size = num.size()/2;

                for (int j = 0; j < size ; j++) {
                    num.remove(i+1);
                    i++;
                }
                num.remove(0);

            }else if (num.size() % 2 == 0) {
                i = 0;
                size = num.size()/2;

                for (int j = 0; j < size ; j++) {
                    num.remove(i+1);
                    i++;

                }
            }
        }
        System.out.println("Number of people in ArrayList is " + num.get(0));

        int number2 = 20;
        LinkedList<Integer> num2 = new LinkedList<>();
        for (int l = 0; l < number2; l++) {
            num2.add(l, (int)(Math.random() * 10 + 1));
        }
        System.out.println("Number of people in LinkedList: \n" + num2);

        int l;
        int size1;

        while (num2.size() > 1){
            if (num2.size() % 2 != 0) {
                l = 0;
                size1 = num2.size()/2;

                for (int j = 0; j < size1; j++) {
                    num2.remove(l+1);
                    l++;
                }
                num2.remove(0);

            }else if (num2.size() % 2 == 0) {
                l = 0;
                size1 = num2.size()/2;

                for (int j = 0; j < size1 ; j++) {
                    num2.remove(l+1);
                    l++;

                }
            }
        }
        System.out.println("Number of people in LinkedList is " + num2.get(0));

       // 3. rearrange the elements of the integers list and the number X so that
        // numbers not exceeding X come first, followed by numbers greater than X.

          List<Integer> list = new ArrayList<>(Arrays.asList(10, -5, 5, 3, -3, -2, 2, 13, -1, 15, 20));
                int x = 7;
                int len = list.size();
                int k = 0;
                int replace = 0;

                while ( k < len - replace) {
                    if (list.get(k) > x) {
                        list.add(len - 1, list.remove(k));
                        replace++;
                    } else {
                        k++;
                    }
                }
                System.out.println("X = " + x);
                System.out.println(list);
            }
        }




class ForLoop {
    static void main(String[] args) {

        String[] catBoard = new String[]{"karmi", "Bubu", "Simba", "Tuflik", "Parker"};
        for (int i = 0; i < catBoard.length; i++) {
            System.out.println(catBoard[i]);
        }
        for (String cat : catBoard) {
            System.out.println(cat);
        }
    }
}




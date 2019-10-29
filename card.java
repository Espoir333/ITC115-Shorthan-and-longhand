public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);

    //Variable decoration
    String result;

    //int ;



    System.out.print("Please input 2-3 charactes by selecting from the following: A, C, D, E, H, J, K, Q, S, 2, 3, 4, 5, 6, 7, 8, 9 or 10: ");
    result = kbd.next().toUpperCase();

    switch (result){

        case "AH": 
            System.out.println("Ace of Hearts");
        break;

        case "AD":
            System.out.println("Ace of Diamonds");
            break;

        case "AC":
            System.out.println("Ace of Clubs");
            break;

        case "AS":
            System.out.println("Ace of Spades");
            break;

    }//Goes with switch

public class Card 

{
   
    private String rank;
    
    private String suit;
    public String card;
    public String description;

 
    public Card(int rank, String suits)

    {      

        if (suit == "D")

        {
            this.suit = "Diamonds";
        }
        else if (suit == "H")
        {
            this.suit = "Hearts";
        }
        else if (suit == "S")

        {
            this.suit = "Spades";

        }

        else if (suit == "C")

        {

            this.suit = "Clubs";

        }

        else

        {

            this.suit = "" + rank;

          }

        if (rank == 1)

        {

            this.rank = "Ace";

        }

        else if (rank == 11)

        {

            this.rank = "Jack";

        }

        else if (rank == 12)

        {

            this.rank = "Queen";

        }

        else if (rank == 13)

        {

            this.rank = "King";
        }

        else
        {

            this.rank = "" + rank;

          }

    }

    Card(String input) {

           // isolate the 2 characters
           rank = input.substring(0,1);

           suit = input.substring(1,2);

            

        }

 
     
    public String getDescription()

    {
        return this.suit + this.rank;

    }
     

}

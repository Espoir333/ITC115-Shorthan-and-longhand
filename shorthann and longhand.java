  
  public class Card
  {
   publicstaticvoid main(String[] args){
        
        publicstaticvoid Task3(Scanner console){
                String[] suits ={"Spades", "Hearts", "Diamonds", "Clubs"};
                String[] ranks ={"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
                String[] cardName ={"S", "H", "D", "C"};
                String[] cardNums ={"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
                String cardRankVar =" ";
                String cardSuitVar =" ";
               
                System.out.println("Select a card: ");
                String cardRank = console.next();
                String cardSuit = console.next();
               
                for(int i =0; i < ranks.length; i++)
                {
                        if(cardRank.equals(ranks[i]))
                        {
                                cardRankVar = cardNums[i];
                        }
                }
                for(int j =0; j < cardName.length; j++)
                {
                        if(cardSuit.equals(cardName[j]))
                        {
                                cardSuitVar = suits[j];
                        }      
                }
               
                System.out.print(cardRankVar +" of "+ cardSuitVar);
        }
}

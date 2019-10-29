String[] names =newString[]{"Espoir", "Makiese"};
for(int i =0; i < names.length;++i){
         Scanner console =new Scanner(System.in);
         System.out.println("How much will "+ names[i]+" be spending?");
         double amount = console.nextDouble();
         System.out.println();
         int numBills =(int)(amount/20.0);
         if(numBills *20.0< amount){
            numBills++;
        }
        System.out.println(names[i]+" needs "+ numBills +" bills");
}

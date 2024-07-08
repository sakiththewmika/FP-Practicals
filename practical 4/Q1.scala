object retailShop{
    var items : Array[String] = Array("Sugar" , "Rice" , "Pen" , "Book" , "Bread");
    var quantity : Array[Int] = Array(5 , 7 , 10 , 4 , 8);

    def displayInventory() : Unit = {
        println("Items in the inventory");
        for(i <- 0 to items.length-1){
            println(items(i) + " : " + quantity(i));
        }
    }

    def restockItem(item : String , quantityVal : Int) : Unit = {
        var found:Boolean = false;
        for(i <- 0 to items.length-1){
            if(items(i) == item){
                quantity(i) += quantityVal;
                println("Item restocked successfully");
                found = true;
            }
        }
        if(!found){
            println("Item not found in inventory");
        }
    }

    def sellItem(item : String , quantityVal : Int) : Unit = {
        var found:Boolean = false;
        for(i <- 0 to items.length-1){
            if(items(i) == item){
                if(quantity(i) >= quantityVal){
                    quantity(i) -= quantityVal;
                    println("Item sold successfully");
                }
                else{
                    println("Insufficient quantity in inventory");
                }
                found = true;
            }
        }
        if(!found){
            println("Item not found in inventory");
        }
    }

    def main(args: Array[String]) : Unit = {
        restockItem("Sugar" , 5);
        displayInventory();
        sellItem("Pen" , 3);
        displayInventory();
    }
}
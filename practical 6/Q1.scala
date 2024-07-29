object InventorySystem {
    val inventory1 : Map[Int, (String, Int, Double)] = Map(
        101 -> ("Item1", 5, 10.00),
        102 -> ("Item2", 8, 20.00),
    )

    val inventory2 : Map[Int, (String, Int, Double)] = Map(
        101 -> ("Item1", 10, 12.00),
        103 -> ("Item3", 12, 15.00),
    )

    def main(args: Array[String]) : Unit = {
        println("Product names in the Inventory 1");
        for ((key, value) <- inventory1) {
            println(value._1);
        }

        // val totalValue1 = inventory1.values.map(x => x._2 * x._3).sum;
        val totalValue1 = inventory1.values.map(x => x._2 * x._3).reduce((x, y) => x + y);
        println("Total value of Inventory 1: " + f"$totalValue1%.2f");

        val isEmpty1 = inventory1.isEmpty;
        println("Is Inventory 1 empty: " + isEmpty1);

        val mergedInventory = (inventory1.keySet ++ inventory2.keySet).map { key =>
            val item1 = inventory1.getOrElse(key, ("", 0, 0.0));
            val Item2 = inventory2.getOrElse(key, ("", 0, 0.0));
            val name = if (item1._1.isEmpty) Item2._1 else item1._1;
            val quantity = item1._2 + Item2._2;
            val price = math.max(item1._3, Item2._3);
            (key, (name, quantity, price));
        }.toMap;
        println("Merged Inventory: " + mergedInventory);

        val productID = 102;
        if (inventory1.contains(productID)) {
            val productDetails = inventory1(productID);
            println(s"Item with key $productID exists in Inventory 1");
            println(f"Name : ${productDetails._1}, Quantity : ${productDetails._2}, Price : ${productDetails._3}%.2f");
        } else {
            println(s"Item with key $productID does not exist in Inventory 1");
        }
    }
}
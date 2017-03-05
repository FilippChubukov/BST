/**
 * Created by Philippok on 02.03.2017.
 */

fun main(args: Array<String>){
    var BST = Tree()

    while(true){
        println("Insert")
        val NodeN = Node(readLine()!!.toInt())
        BST.insert(NodeN)

        println("Tree:")
        BST.display(BST.root)

        println("Find")
        val search = readLine()!!.toInt()
        println("Результат поиска " + BST.find(search))


    }



}


/**
 * Created by Philippok on 02.03.2017.
 */
class Tree {
    var root: Node? = null

    fun insert (NodeN: Node) {

       if (root == null) {
           root = NodeN
           return
       }

       var current = root
       var parent: Node? = null

       while(true) {
        parent = current

        if(NodeN.info < current!!.info) {
            current = current.left

            if(current == null) {
                parent!!.left = NodeN
                return
            }


        } else {
            current = current.right

            if(current == null){
                parent!!.right = NodeN
                return
            }
        }
       }
    }


    fun find(sh: Int): Boolean {
        var current = root

        while(current!= null) {

            if(current.info  == sh) {
                return true
            }

            if(current.info > sh) {
                current = current.left
            } else{
                current = current.right
            }

        }
        return false
    }


    fun display(current: Node?) {

        if(current!= null){
        display(current.left)
        println(current.info)
        display(current.right)
        }


    }


}
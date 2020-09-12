package com.test.Excercises

class BreadthFirstSearch {

    static void BFS (TreeNode root){
        Queue <TreeNode> q = [] as LinkedList<TreeNode>
        q.add(root)

        TreeNode currentNode
        while (!q.isEmpty()) {
            currentNode = q.poll()
            print "$currentNode.value, "

            if (currentNode.left){
                q.add(currentNode.left)
            }

            if (currentNode.right){
                q.add(currentNode.right)
            }
        }
    }

    static void main(String[] args) {
        TreeNode one = FromArrayToTree.fromArrayToTree([1,2,3,4,5,6,7] as int [])

        println BFS(one)
    }
}

package com.test.Excercises


class FromArrayToTree {

    static class TreeNode {
        int value
        TreeNode left
        TreeNode right

        TreeNode(int value) {
            this.value = value
        }
    }



    //java syntax
    static TreeNode fromArrayToTree(int [] T) {
        if (T==null || T.length==0) return null

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root =  new TreeNode(T[0])
        queue.add(root)

        TreeNode current
        boolean isLeft = true
        for (int i = 1; i < T.length; i++) {
            if (isLeft) {
                current = queue.poll()
                current.left = T[i] == 0 ? null : new TreeNode(T[i])
                isLeft = false
                if (current.left){
                    queue.add(current.left)
                }
            } else {
                current.right = T[i] == 0 ? null : new TreeNode(T[i])
                isLeft = true
                if (current.right){
                    queue.add(current.right)
                }
            }

        }

        return root
    }


    static void main(String[] args) {
        fromArrayToTree2([1,2,3,4,5] as int [])
    }
}

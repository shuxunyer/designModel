package code53.release1;

public class Demo {
    public static void main(String[] args) {
        /**
         * /
         * /wz/
         * /wz/a.txt
         * /wz/b.txt
         * /wz/movies/
         * /wz/movies/c.avi
         * /xzg/
         * /xzg/docs/
         * /xzg/docs/d.txt
         */
        FileSystemNode fileSystemTree = new FileSystemNode("/",false);
        FileSystemNode node_wz = new FileSystemNode("/wz/",false);
        FileSystemNode node_xzg = new FileSystemNode("/xzg/",false);
        fileSystemTree.addSubNode(node_wz);
        fileSystemTree.addSubNode(node_xzg);

        FileSystemNode node_wz_a = new FileSystemNode("/wz/a.txt",true);
        FileSystemNode node_wz_b = new FileSystemNode("/wz/b.txt",true);
        FileSystemNode node_wz_movies = new FileSystemNode("/wz/movies/",false);
        node_wz.addSubNode(node_wz_a);
        node_wz.addSubNode(node_wz_b);
        node_wz.addSubNode(node_wz_movies);

        FileSystemNode node_wz_movies_c = new FileSystemNode("/wz/movies/c.avi",true);
        node_wz_movies.addSubNode(node_wz_movies_c);

        FileSystemNode node_xzg_docs = new FileSystemNode("/xzg/docs/",false);
        node_xzg.addSubNode(node_xzg_docs);

        FileSystemNode node_xzg_docs_d = new FileSystemNode("/xzg/docs/d.txt",true);
        node_xzg_docs.addSubNode(node_xzg_docs_d);

        System.out.println("/ files num:" + fileSystemTree.countNumOfFiles());
        System.out.println("/wz/ files num:" + node_wz.countNumOfFiles());
    }
}

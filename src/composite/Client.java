package composite;

public class Client {
    public static void main(String[] args) {
        Folder folderRoot = new Folder("folderRoot");

        Folder levelOne1st =  new Folder("levelOne1st");
        Folder levelTwo =  new Folder("levelTwo");
        levelTwo.add(new File("File1-levelTwo",1234));
        levelTwo.add(new File("File2-levelTwo",12122));
        levelTwo.add(new File("File3-levelTwo",243233));
        levelOne1st.add(levelTwo);

        Folder levelOne2nd =  new Folder("levelOne2nd");
        levelOne2nd.add(new File("File1-levelOne2nd",9999));
        levelOne2nd.add(new File("File2-levelOne2nd",12323));

        folderRoot.add(levelOne1st);
        folderRoot.add(levelOne2nd);
        folderRoot.add(new File("File1-folderRoot",23232));

        int totalSize = folderRoot.size();
        System.out.println("---------------------------------------------");
        System.out.println("Folder " + folderRoot.getName() + ", total size: " + totalSize);
        System.out.println("---------------------------------------------");
    }
}

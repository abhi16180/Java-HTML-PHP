import java.io.*;

class FileInfo
{
    public static void main(String args[])
    {
        File f = new File("t.txt");
        if (f.exists()) {
            System.out.println("Name " + f.getName() + "\nAbsolute  Path " + f.getAbsolutePath() + "\n Read permission "
                    + f.canRead() + "\n Write permission " + f.canWrite() + "\n Size in bytes " + f.length());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }

}

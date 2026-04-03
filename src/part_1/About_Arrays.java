package part_1;

// if you want the full details about array you can read in notes and visite the link below for easy explaination
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3221/
// creating a Class for DVD example  in java

import java.util.Scanner;

// A simple definition for a DVD.
public class About_Arrays {
    public String name;
    public int releaseYear;
    public String director;
    public About_Arrays(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }
    @Override
    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // The actual code for creating an Array to hold About_Arrays's.
        About_Arrays[] dvdCollection = new About_Arrays[5];

//       fill the dvd details
//        for (int i = 0 ; i< dvdCollection.length;i++){
//            System.out.print("write the name of the movie :-");
//            String name= scanner.nextLine();
//            System.out.print("write the year of the movie release :-");
//            int year= scanner.nextInt();
//            scanner.nextLine(); // to clear the buffer
//            System.out.print("write the name of the movie director :-");
//            String director = scanner.nextLine();
//            System.out.println();
//            dvdCollection[i]=new About_Arrays(name,year,director);
//        }
//                                or
//        dvdCollection[0] = new About_Arrays("The Shawshank Redemption", 1994, "Frank Darabont");
//        dvdCollection[1] = new About_Arrays("The Dark Knight", 2008, "Christopher Nolan");
//        dvdCollection[2] = new About_Arrays("Inception", 2010, "Christopher Nolan");
//        dvdCollection[3] = new About_Arrays("The Matrix", 1999, "Lana Wachowski, Lilly Wachowski");
//        dvdCollection[4] = new About_Arrays("Forrest Gump", 1994, "Robert Zemeckis");
//                                or

        About_Arrays incrediblesDVD = new About_Arrays("The Incredibles", 2004, "Brad Bird");
        About_Arrays findingDoryDVD = new About_Arrays("Finding Dory", 2016, "Andrew Stanton");
        About_Arrays lionKingDVD = new About_Arrays("The Lion King", 2019, "Jon Favreau");
        About_Arrays avengersDVD = new About_Arrays("The Avengers", 2012, "Joss Whedon");
        About_Arrays theShawshank= new About_Arrays("The Shawshank Redemption", 1994, "Frank Darabont");

        dvdCollection[0] = incrediblesDVD;
        dvdCollection[1] = findingDoryDVD;
        dvdCollection[2] = lionKingDVD;
        dvdCollection[3] = avengersDVD;
        dvdCollection[4] = theShawshank;


        for (var dvd: dvdCollection){
            System.out.println(dvd);
        }
        System.out.println(dvdCollection);


        scanner.close();

    }


}


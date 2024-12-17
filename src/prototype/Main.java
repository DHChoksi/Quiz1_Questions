package prototype;

import prototype.deep.deepBookCopy;
import prototype.shallow.shallowBookCopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Original chapters list
        List<String> chapters = new ArrayList<>(Arrays.asList("Chapter 1", "Chapter 2"));

        // Create shallow copy of book
        shallowBookCopy shallowCopyBook = new shallowBookCopy("Shallow Book Copy", "Author A", chapters);
        try
        {
            // clone book with shallow
            shallowBookCopy clonedShallow = (shallowBookCopy) shallowCopyBook.clone();

            // Show original and clone initially
            System.out.println("Before modification chapters:");
            System.out.println("Original Shallow: " + shallowCopyBook);
            System.out.println("Cloned Shallow: " + clonedShallow);

            // Update chapters in original book
            shallowCopyBook.getChapters().add("Chapter 3");

            // after updates shallow copy
            System.out.println("\nAfter modification chapters in the original book:");
            System.out.println("Original Shallow: " + shallowCopyBook);
            System.out.println("Cloned Shallow: " + clonedShallow);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        // ------------------------------------------------------------------------------------------- //

        // Test deep copy
        List<String> deepChapters = new ArrayList<>(Arrays.asList("Chapter 1", "Chapter 2"));
        deepBookCopy deepCopyBook = new deepBookCopy("Deep Book Copy", "Author B", deepChapters);

        try
        {
            // clone book with deep copy
            deepBookCopy clonedDeep = (deepBookCopy) deepCopyBook.clone();

            // Show original and clone initially
            System.out.println("\nBefore modification chapters (Deep Copy):");
            System.out.println("Original Deep: " + deepCopyBook);
            System.out.println("Cloned Deep: " + clonedDeep);

            // Update chapters in original book
            deepCopyBook.getChapters().add("Chapter 3");

            // after updates deep copy
            System.out.println("\nAfter modification chapters in the original book (Deep Copy):");
            System.out.println("Original Deep: " + deepCopyBook);
            System.out.println("Cloned Deep: " + clonedDeep);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}

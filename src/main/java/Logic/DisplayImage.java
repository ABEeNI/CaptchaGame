package Logic;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

@Getter
@Setter
public class DisplayImage {

    private ArrayList<String> folderTypesList;
    private ArrayList<String> imageNamesListA;
    private ArrayList<String> imageNamesListB;

    private String chosenType;
    private String chosenImageName;

    Random rand = new Random();


    public DisplayImage() {
        folderTypesList = new ArrayList<>();
        imageNamesListA = new ArrayList<>();
        imageNamesListB = new ArrayList<>();
        InitializeFolderTypesList();
        InitializeImageNamesList();
    }

    public void DisplayRandomPicture() {
        DecideWhichFolder();
        DecideWhichImage();
        System.out.println(chosenImageName);
    }

    public void DecideWhichFolder() {
        chosenType = folderTypesList.get(generateRandomNumber(folderTypesList.size())); //Kérdés, mi a jobb OOP-ban, ha létrehoz ember field-eket és void fv-ekben értékeket adunk, vagy belső változók a fv-ekben és azokat returnóljük? Valszeg előbbi?
    }

    public void DecideWhichImage() {
        if (Objects.equals(chosenType, folderTypesList.get(0)))
            chosenImageName = imageNamesListA.get(generateRandomNumber(imageNamesListA.size()));
        else
            chosenImageName = imageNamesListB.get(generateRandomNumber(imageNamesListB.size()));
        //TODO Delete name from List
    }

    private void InitializeImageNamesList() {
        String tmpA = ReadImageNamesFromText(folderTypesList.get(0));
        String tmpB = ReadImageNamesFromText(folderTypesList.get(1));
        String[] tokenizedA = tmpA.split(",");
        String[] tokenizedB = tmpB.split(",");
        imageNamesListA.addAll(Arrays.asList(tokenizedA));
        imageNamesListB.addAll(Arrays.asList(tokenizedB));
    }

    private String ReadImageNamesFromText(String textFileName) {
        String allImageNames = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(textFileName));
            allImageNames = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();

            }
        }
        return allImageNames;
    }

    private void InitializeFolderTypesList() {
        //TODO change it to use run config
        folderTypesList.add("src/animals.txt");
        folderTypesList.add("src/tools.txt");
    }

    public int generateRandomNumber(int number) {
        return rand.nextInt(number);
    }
}

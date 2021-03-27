package Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//This class adds classes to a list and returns the list
public class ListOfClasses {
    private List<Clas> clasList;

    //constructs an empty list of classes
    public ListOfClasses() {
        clasList = new ArrayList<>();
    }
    //adds one or multiple classes to the list
    public List<Clas> addAll(Clas...clas){
        clasList.addAll(Arrays.asList(clas));
        return clasList;
    }
}

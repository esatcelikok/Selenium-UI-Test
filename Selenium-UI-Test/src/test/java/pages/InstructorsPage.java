

package pages;

public class InstructorsPage extends PageBase {

public int InsructorsAcount(){

    return getElementLibrary().
            getInstructorsPageElements().instructorDivs.size();

    }

}


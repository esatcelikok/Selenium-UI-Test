package utility.library;

import pages.*;

public class PageLibrary {

    HomePage homepage;
    InstructorsPage i̇nstructorsPage;
    QualityAssurancePage qualityAssurancePage;
    AllOpenPositionsPage allOpenPositionsPage;
    CareersPage careersPage;


    public PageLibrary() {
         homepage = new HomePage();

        i̇nstructorsPage = new InstructorsPage();

        qualityAssurancePage = new QualityAssurancePage();

        allOpenPositionsPage = new AllOpenPositionsPage();

        careersPage=new CareersPage();

    }

    public HomePage getHomePage() {
        return homepage;
    }

    public InstructorsPage getInstructorsPage() {
        return i̇nstructorsPage;
    }

    public QualityAssurancePage getQualityAssurancePage() {
        return qualityAssurancePage;
    }

    public AllOpenPositionsPage getAllOpenPositionsPage() {
        return allOpenPositionsPage;
    }

    public CareersPage getCareersPage(){
        return careersPage;
    }
}

package utility.library;


import elements.*;


public class ElementLibrary {

    HomePageElements homepageElements;
    InstructorsPageElements instructorsPageElements ;
    QualityAssurancePageElements qualityAssurancePageElements;
    AllOpenPositionsPageElements allOpenPositionsPageElements;
    CareersPageElements careersPageElements;

    public ElementLibrary() {
        homepageElements = new  HomePageElements();
        instructorsPageElements = new InstructorsPageElements();
        qualityAssurancePageElements = new QualityAssurancePageElements();
        allOpenPositionsPageElements = new AllOpenPositionsPageElements();
        careersPageElements=new CareersPageElements();
    }

    public HomePageElements getHomepageElements() {
        return homepageElements ;
    }

    public QualityAssurancePageElements getQualityAssurancePageElements() {
        return qualityAssurancePageElements;
    }

    public InstructorsPageElements getInstructorsPageElements() {
        return instructorsPageElements;
    }

    public AllOpenPositionsPageElements getAllOpenPositionsPageElements() {
        return allOpenPositionsPageElements;
    }
    public CareersPageElements getCareersPageElements(){
        return careersPageElements;
    }
}

public class Homework_11_printerMethods {



    int maxToner = 100;
    int maxPaper = 100;

    // Method which can be used to print single-sided
    public int print (int pages){
        if(pages < 0){
            System.out.println("\nInvalid value entered");
        }else if (pages <= maxPaper && pages <= maxToner) {
            System.out.println("\nSuccessfully printed "+ pages +" pages single-sided");
            maxToner = maxToner - pages;
            maxPaper = maxPaper - pages;
        }else {
            System.out.println("\nNot enough paper or toner");
        }
        return pages;
    }


    // Method which can be used to print double-sided
    public int print (int pages, boolean bothSide){
        if(pages < 0){
            System.out.println("\nInvalid value entered");
        }else if (pages <= maxPaper && pages <= maxToner) {
            System.out.println("\nSuccessfully printed "+ pages +" pages double-sided");
            maxToner = maxToner - pages;
            if(pages % 2 == 0 ){
                maxPaper = maxPaper - (pages / 2);
            }else {
            maxPaper = maxPaper - (pages / 2)-1;
            }
        }else {
            System.out.println("\nNot enough paper or toner");
        }
        return pages;
    }

    // Method which can be used to add papers in the tray
    public int addPaper (int addPaperInTray){
        if(addPaperInTray < 0){
            System.out.println("\nInvalid value of paper entered");
        }else if (addPaperInTray + maxPaper <= 100) {
            System.out.println("\nSuccessfully added " + addPaperInTray + " paper in tray");
            maxPaper = maxPaper + addPaperInTray;
        }else {
            System.out.println("\nTray of printer is overloaded");
        }

        return addPaperInTray;
    }


    // Method which can be used to add Toner in the printer
    public int addToner (int addTonerInPrinter){
        if(addTonerInPrinter < 0){
            System.out.println("\nInvalid value of toner entered");
        }else if (addTonerInPrinter + maxToner <= 100) {
            System.out.println("\nSuccessfully added " + addTonerInPrinter + " toner in printer");
            maxToner = maxToner + addTonerInPrinter;
        }else {
            System.out.println("\nToner of printer is overloaded");
        }

        return addTonerInPrinter;
    }



    // Method which can be used to print Printer Summary
    public void printerSummary (){
        System.out.println("\n\nToner level: " + maxToner +
                "\nPaper in tray: " + maxPaper);

    }


}

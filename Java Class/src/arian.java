import java.util.Locale;

public class arian {

    public static void main(String[] args) {

        int i = 5;
        int k =10;


        int j = ++i + k++;


        System.out.println(i);      // 6
        System.out.println(k);      // 11
        System.out.println(j + "\n");      // 16


        int g = ++i + k++ + ++j;
        System.out.println(i);  // i = 7
        System.out.println(k);  // k = 12
        System.out.println(j + "\n");  // j = 17


        System.out.println(g);      // g = 35

        int creditScore = 701;
        boolean isFirstHomeBuyer = true;

        double buingHome = creditScore > 700 && isFirstHomeBuyer ? 1.5 : 2.0;
        System.out.println("This buyer is eligible for " + buingHome + " Interes rate\n");

        int age = 25;
        boolean haveId = true;

        String enterClub = age >= 18 && haveId ?  "You can enter the Club\n" : "You cannot enter the club\n";
        System.out.println(enterClub);

        int age1 = 20;
        boolean usCitizen = true;
        String eligibleToVote = age1 >=18 && usCitizen ? "You can VOTE\n" : "You cannot vote\n";
        System.out.println(eligibleToVote);

        System.out.println(eligibleToVote.toUpperCase());
        System.out.println(enterClub.toLowerCase());

        String name =  "ArIaN GoraNi";
        String name1 =  "arian gorani";

        System.out.println(name.equalsIgnoreCase(name1));



        String at =  "GMAIL";
        String et = "gmail";

        if(at.equalsIgnoreCase(et)) {
            System.out.printf(at);
        }
        else {
            System.out.println(et);
            }

        }
    }


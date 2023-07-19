import java.util.Scanner;

/**
 * _SentinelSnippet
 */
public class _SentinelSnippet {

    public void _sentinelSnippet() {

        // setup sentinel
        Scanner scan = new Scanner(System.in);
        String sentinelValue = "Y";
        String sentinelResponse = "Y";

        while (sentinelResponse.equals(sentinelValue)) {

            // section of code which will be optionally run multiple times - BEGIN

            // section of code which will be optionally run multiple times - END

            // sentinel checking
            System.out.print("Would you like to run program again (y/n)? ");
            sentinelResponse = scan.nextLine().toUpperCase().trim();

        }

        // cleanup
        scan.close();
    }
}

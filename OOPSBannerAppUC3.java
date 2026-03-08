public class OOPSBannerAppUC3 {

    public static void main(String[] args) {

        System.out.println("OOPS");

        String gap = "           ";   // BIGGER SPACE

        System.out.println(String.join(gap,
                "   ***   ", "   ***   ", " ******  ", "  *****  "));

        System.out.println(String.join(gap,
                " **   ** ", " **   ** ", " **    ** ", " **      "));

        System.out.println(String.join(gap,
                "**     **", "**     **", " **     **", " **      "));

        System.out.println(String.join(gap,
                "**     **", "**     **", " ******   ", "  *****   "));

        System.out.println(String.join(gap,
                "**     **", "**     **", " **        ", "      **  "));

        System.out.println(String.join(gap,
                " **   ** ", " **   ** ", " **        ", "      **  "));

        System.out.println(String.join(gap,
                "   ***   ", "   ***   ", " **        ", "  *****   "));
    }
}
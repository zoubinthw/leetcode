import q1023.Q1023;

public class Main {
    public static void main(String[] args) {
        String[] queries = {"FoaBar","aaaFoaBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FoBaT";
        final var q1023 = new Q1023();
        final var booleans = q1023.camelMatch(queries, pattern);
        booleans.forEach(bool -> {
            System.out.printf(bool + " ");
        });
        System.out.println();
    }
}

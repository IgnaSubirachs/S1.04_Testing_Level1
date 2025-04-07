public class IdCalculator {

    private static final char [] idLetter={
            'T', 'R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','L','K','E'
    };


    public static char idLetterCalculate(int number){
        if(number<0){
            throw new IllegalArgumentException("Invalid number for ID");
        }
        int letterIndex= number%23;
        return idLetter[letterIndex];

    }

}

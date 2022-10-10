public class Grader {
    private double score;

    public Grader(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }



    public Character letterGrade(){
        if(score >100 || score<0){
            return null;
        }
        else if(score>=85) {
            return 'A';
        }
        else if(score>= 75){
            return 'B';
        }
        else if (score >= 65) {
            return 'C';
        }
        else if(score >= 60){
            return 'O';
        }
        else if(score >= 50){
            return 'E';
        }else {
            return 'F';
        }

    }
}

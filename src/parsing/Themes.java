package src.parsing;

public class Themes {
    
        private String ID;
        private String Question;
        private String Reponse;
        private Integer point;
     
        public Themes(String ID, String Question, String Reponse, Integer point) {
             this.ID = ID;
             this.Question = Question;
             this.Reponse = Reponse;
             this.point = point;
        }
     
        @Override
        public String toString() {
             return "<" + ID + ", " + Question + ", " + Reponse + ", " + point + ">";
        }

        public String getID() {
             return this.ID;
        }

        public String getQuestion() {
             return this.Question;
        }

        public String getReponse() {
             return this.Reponse;
        }

        public Integer getPoint() {
             return this.point;
        }

}
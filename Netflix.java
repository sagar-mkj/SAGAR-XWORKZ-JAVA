class Netflix {

    public static void main(String[] args) {

        String[] kannada = {
                "Kantara", "KGF", "KGF 2", "Ugramm", "Tagaru",
                "Dia", "Lucia", "Vikrant Rona", "777 Charlie", "Garuda Gamana",
                "Rajkumara", "Bell Bottom", "ASN", "Mufti", "Gaalipata",
                "Ulidavaru Kandanthe", "Kirik Party", "Charlie 777",
                "Rama Rama Re", "Simple Aag Ond Love Story"
        };

        String[] hindi = {
                "3 Idiots", "Dangal", "PK", "Lagaan", "Swades",
                "Chak De India", "Taare Zameen Par", "Drishyam", "Andhadhun", "Article 15",
                "Shershaah", "Pathaan", "Jawan", "Bajrangi Bhaijaan", "Barfi",
                "Haider", "Raazi", "Kesari", "Gully Boy", "ZNMD"
        };

        String[] english = {
                "Inception", "Interstellar", "Titanic", "Avatar", "Gladiator",
                "Joker", "Batman", "Avengers", "Iron Man", "Endgame",
                "Shawshank Redemption", "Forrest Gump", "Fight Club", "Matrix", "Alien",
                "Predator", "Godfather", "Rocky", "Terminator", "Die Hard"
        };

        String[] tamil = {
                "Vikram", "Kaithi", "Master", "Leo", "Asuran",
                "Soorarai Pottru", "Jai Bhim", "96", "Ayan", "Ghajini",
                "Anniyan", "Sivaji", "Enthiran", "Kabali", "Visaranai",
                "Pariyerum Perumal", "Vada Chennai", "Thani Oruvan", "Mersal", "Bigil"
        };

        String[] telugu = {
                "RRR", "Baahubali", "Baahubali 2", "Pushpa", "Ala Vaikunta Puramulo",
                "Arjun Reddy", "Magadheera", "Eega", "Rangasthalam", "Jersey",
                "Srimanthudu", "Janatha Garage", "Pokiri", "Athadu", "Khaleja",
                "Gabbar Singh", "Sye", "Leader", "Tagore", "Chatrapathi"
        };

        for(String movie : kannada) System.out.println(movie);
        for(String movie : hindi) System.out.println(movie);
        for(String movie : english) System.out.println(movie);
        for(String movie : tamil) System.out.println(movie);
        for(String movie : telugu) System.out.println(movie);
    }
}

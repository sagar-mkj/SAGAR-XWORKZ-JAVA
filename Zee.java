class Zee {
    public static void main(String[] args) {

        String[] kannada = {
                "Kirik Party","Dia","Gaalipata","Tagaru","Ugramm",
                "Bell Bottom","Mufti","ASN","777 Charlie","Vikrant Rona",
                "Raajakumara","Rajkumara","Lucia","Rama Rama Re","Ulidavaru Kandanthe",
                "Garuda Gamana","Simple Aag Ond Love Story","Kantara","KGF","KGF 2"
        };

        String[] hindi = {
                "The Kashmir Files","Uri","Article 15","Manikarnika","Mulshi Pattern",
                "Dream Girl","Badhaai Ho","Suraj Pe Mangal Bhari","Rustom","Commando",
                "Raees","Gadar","Kesari","Padmaavat","Tanhaji",
                "Super 30","Drishyam","Dangal","PK","Andhadhun"
        };

        String[] english = {
                "The Godfather","Titanic","Inception","Interstellar","Joker",
                "Batman","Gladiator","Rocky","Terminator","Die Hard",
                "Matrix","Alien","Predator","Shawshank Redemption","Fight Club",
                "Forrest Gump","Avatar","Iron Man","Avengers","Endgame"
        };

        String[] tamil = {
                "96","Ghajini","Ayan","Anniyan","Sivaji",
                "Enthiran","Kabali","Visaranai","Vada Chennai","Thani Oruvan",
                "Mersal","Bigil","Pariyerum Perumal","Asuran","Soorarai Pottru",
                "Jai Bhim","Vikram","Master","Leo","Kaithi"
        };

        String[] telugu = {
                "Baahubali","Baahubali 2","RRR","Pushpa","Magadheera",
                "Eega","Rangasthalam","Jersey","Pokiri","Athadu",
                "Khaleja","Gabbar Singh","Sye","Leader","Tagore",
                "Chatrapathi","Ala Vaikunta Puramulo","Arjun Reddy","Srimanthudu","Janatha Garage"
        };

     

        System.out.println("----- Kannada Movies -----");
        for(String movie : kannada){
            System.out.println(movie);
        }

        System.out.println("\n----- Hindi Movies -----");
        for(String movie : hindi){
            System.out.println(movie);
        }

        System.out.println("\n----- English Movies -----");
        for(String movie : english){
            System.out.println(movie);
        }

        System.out.println("\n----- Tamil Movies -----");
        for(String movie : tamil){
            System.out.println(movie);
        }

        System.out.println("\n----- Telugu Movies -----");
        for(String movie : telugu){
            System.out.println(movie);
        }
    }
}

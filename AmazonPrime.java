class AmazonPrime {

    public static void main(String[] args) {

        String[] kannada = {
                "Ugramm","Tagaru","Mufti","Avane Srimannarayana","Bell Bottom",
                "Dia","Kirik Party","Lucia","Gaalipata","Rajkumara",
                "Rama Rama Re","Simple Aag Ond Love Story","Ulidavaru Kandanthe",
                "Garuda Gamana","777 Charlie","ASN","Raajakumara",
                "Vikrant Rona","Kantara","K.G.F"
        };

        String[] hindi = {
                "Drishyam","Gangs of Wasseypur","Bajrangi Bhaijaan","Jolly LLB",
                "Tanu Weds Manu","Shershaah","Raazi","Kesari","Andhadhun","Article 15",
                "PK","Dangal","Chak De India","Haider","Padmaavat",
                "Badhaai Ho","Queen","Barfi","Vicky Donor","ZNMD"
        };

        String[] english = {
                "The Boys","Jack Ryan","Interstellar","Inception","Gladiator",
                "Joker","Batman","Avengers","Iron Man","Endgame",
                "Shawshank Redemption","Fight Club","Matrix","Alien","Predator",
                "Godfather","Rocky","Terminator","Die Hard","Forrest Gump"
        };

        String[] tamil = {
                "Soorarai Pottru","Jai Bhim","Vikram","Kaithi","Master",
                "Asuran","96","Anniyan","Ayan","Ghajini",
                "Sivaji","Enthiran","Kabali","Visaranai","Vada Chennai",
                "Thani Oruvan","Mersal","Bigil","Pariyerum Perumal","Leo"
        };

        String[] telugu = {
                "Baahubali","Baahubali 2","RRR","Magadheera","Eega",
                "Rangasthalam","Jersey","Pushpa","Srimanthudu","Janatha Garage",
                "Pokiri","Athadu","Khaleja","Gabbar Singh","Sye",
                "Leader","Tagore","Chatrapathi","Ala Vaikunta Puramulo","Arjun Reddy"
        };

        for(String movie : kannada){
            System.out.println(movie);
        }

        for(String movie : hindi){
            System.out.println(movie);
        }

        for(String movie : english){
            System.out.println(movie);
        }

        for(String movie : tamil){
            System.out.println(movie);
        }

        for(String movie : telugu){
            System.out.println(movie);
        }
    }
}

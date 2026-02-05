class SuperMarket {

    public static void main(String[] args) {

        String[] fruits = {
                "Apple","Banana","Orange","Mango","Grapes","Pineapple","Papaya","Guava","Watermelon",
                "Muskmelon","Strawberry","Blueberry","Cherry","Kiwi","Pomegranate","Pear","Peach",
                "Plum","Apricot","Fig","Custard Apple","Litchi","Dragon Fruit","Avocado","Coconut"
        };

        String[] vegetables = {
                "Potato","Tomato","Onion","Carrot","Beans","Cabbage","Cauliflower","Brinjal","Lady Finger",
                "Spinach","Radish","Beetroot","Pumpkin","Bottle Gourd","Bitter Gourd","Ridge Gourd",
                "Capsicum","Cucumber","Green Peas","Sweet Corn","Drumstick","Turnip","Broccoli",
                "Mushroom","Zucchini"
        };

        String[] dairy = {
                "Milk","Curd","Butter","Cheese","Paneer","Ghee","Cream","Yogurt","Buttermilk","Flavored Milk",
                "Condensed Milk","Evaporated Milk","Milk Powder","Mozzarella","Cheddar","Swiss Cheese",
                "Whipping Cream","Sour Cream","Greek Yogurt","Custard","Ice Cream Mix","Khoya",
                "Lassi","Milk Shake Base","Whey"
        };

        String[] bakery = {
                "Bread","Bun","Cake","Cookies","Puff","Croissant","Donut","Muffin","Brownie","Pastry",
                "Bagel","Garlic Bread","Pizza Base","Rusk","Cupcake","Swiss Roll","Fruit Cake",
                "Cheese Cake","Chocolate Cake","Sponge Cake","Breadsticks","Tart","Pie","Roll",
                "Multigrain Bread"
        };

        String[] snacks = {
                "Chips","Kurukure","Biscuit","Popcorn","Namkeen","Nachos","Peanuts","Cashews","Almonds",
                "Trail Mix","Makhana","Samosa","Kachori","Mixture","Murukku","Chakli","Aloo Bhujia",
                "Sev","Corn Puffs","Rice Crackers","Granola Bar","Energy Bar","Chocolate Bar",
                "Roasted Chana","Wafers"
        };

        String[] beverages = {
                "Tea","Coffee","Juice","Soft Drink","Milkshake","Green Tea","Black Tea","Lemon Tea",
                "Cold Coffee","Iced Tea","Orange Juice","Apple Juice","Mango Juice","Lime Soda",
                "Energy Drink","Sports Drink","Herbal Tea","Buttermilk","Lassi","Coconut Water",
                "Mocktail","Smoothie","Hot Chocolate","Milk Tea","Espresso"
        };

        String[] grains = {
                "Rice","Wheat","Ragi","Jowar","Bajra","Barley","Oats","Maize","Quinoa","Millet",
                "Brown Rice","Basmati Rice","Sorghum","Pearl Millet","Foxtail Millet","Little Millet",
                "Kodo Millet","Broken Wheat","Semolina","Cornmeal","Wild Rice","Red Rice","Black Rice",
                "Bulgur","Farro"
        };

        String[] pulses = {
                "Toor Dal","Moong Dal","Chana Dal","Urad Dal","Masoor Dal","Green Gram","Black Gram",
                "Yellow Peas","White Peas","Rajma","Chickpeas","Soybeans","Horse Gram","Cowpeas",
                "Red Lentils","Split Peas","Moth Beans","Adzuki Beans","Lima Beans","Kidney Beans",
                "Pigeon Pea","Black Chickpeas","Bengal Gram","Green Peas Dal","Field Beans"
        };

        String[] spices = {
                "Salt","Sugar","Pepper","Chilli","Turmeric","Cumin","Coriander","Mustard Seeds",
                "Fenugreek","Cloves","Cardamom","Cinnamon","Bay Leaf","Star Anise","Nutmeg","Mace",
                "Fennel","Dry Ginger","Black Peppercorn","White Pepper","Asafoetida","Paprika",
                "Oregano","Thyme","Rosemary"
        };

        String[] oils = {
                "Sunflower Oil","Groundnut Oil","Coconut Oil","Olive Oil","Ghee","Mustard Oil","Sesame Oil",
                "Rice Bran Oil","Canola Oil","Palm Oil","Soybean Oil","Corn Oil","Avocado Oil",
                "Flaxseed Oil","Walnut Oil","Almond Oil","Safflower Oil","Grapeseed Oil","Cottonseed Oil",
                "Butter Oil","Vegetable Oil","Extra Virgin Olive Oil","Virgin Coconut Oil",
                "Refined Oil","Cold Pressed Oil"
        };

        String[] meat = {
                "Chicken","Mutton","Fish","Prawns","Eggs","Turkey","Duck","Crab","Lobster","Beef",
                "Pork","Salmon","Tuna","Sardine","Rohu","Catla","Hilsa","Squid","Clams","Oysters",
                "Chicken Sausage","Chicken Nuggets","Fish Fingers","Minced Meat","Smoked Fish"
        };

        String[] frozen = {
                "Frozen Peas","Ice Cream","Frozen Corn","Frozen Fries","Frozen Paneer","Frozen Veg Mix",
                "Frozen Berries","Frozen Spinach","Frozen Chicken","Frozen Fish","Frozen Paratha",
                "Frozen Pizza","Frozen Nuggets","Frozen Momos","Frozen Samosa","Frozen Spring Rolls",
                "Frozen Cutlets","Frozen Waffles","Frozen Garlic Bread","Frozen Desserts",
                "Frozen Cheese","Frozen Pasta","Frozen Burgers","Frozen Idli","Frozen Dosa"
        };

        String[] cleaning = {
                "Soap","Detergent","Phenyl","Dishwash","Floor Cleaner","Glass Cleaner","Toilet Cleaner",
                "Laundry Liquid","Bleach","Fabric Softener","Disinfectant Spray","Mop Refill",
                "Scrub Pad","Scouring Powder","Room Freshener","Drain Cleaner","Hand Wash",
                "Surface Cleaner","Car Wash Shampoo","Brush","Broom","Dustpan","Gloves",
                "Microfiber Cloth","Trash Bags"
        };

        String[] personalCare = {
                "Shampoo","Conditioner","Toothpaste","Face Wash","Cream","Body Lotion","Soap",
                "Face Scrub","Hair Oil","Serum","Sunscreen","Talcum Powder","Deodorant","Perfume",
                "Shaving Cream","Razor","Face Mask","Toner","Moisturizer","Lip Balm","Hand Cream",
                "Foot Cream","Hair Gel","Hair Spray","Beard Oil"
        };

        String[] babyCare = {
                "Diapers","Baby Soap","Baby Oil","Wipes","Powder","Baby Shampoo","Baby Lotion",
                "Baby Cream","Feeding Bottle","Pacifier","Baby Food","Baby Cereal","Teether",
                "Baby Toothpaste","Baby Toothbrush","Baby Bath Tub","Baby Towel","Baby Blanket",
                "Baby Nail Clipper","Baby Comb","Baby Monitor","Baby Mosquito Repellent",
                "Baby Sunscreen","Baby Laundry Detergent","Baby Bib"
        };

        String[] stationery = {
                "Pen","Pencil","Notebook","Eraser","Marker","Highlighter","Sharpener","Stapler",
                "Staple Pins","Glue","Scissors","Ruler","Calculator","File","Folder","Sticky Notes",
                "Paper Clips","Chart Paper","Drawing Book","Sketch Pens","Color Pencils","Crayons",
                "Whiteboard","Whiteboard Marker","Correction Pen"
        };

        String[] electronics = {
                "Bulb","Torch","Extension Box","Battery","Adapter","Charger","Power Bank","Earphones",
                "Headphones","Bluetooth Speaker","Table Lamp","Emergency Light","Switch","Socket",
                "Plug","Wire","Cable","Router","Modem","Remote","Mouse","Keyboard","Webcam",
                "USB Drive","Hard Disk"
        };

        String[] kitchen = {
                "Plates","Cups","Spoons","Pan","Cooker","Knife","Fork","Bowl","Tawa","Kettle",
                "Pressure Cooker","Mixer Grinder","Toaster","Blender","Chopping Board","Rolling Pin",
                "Spatula","Ladle","Strainer","Peeler","Measuring Cups","Lunch Box","Water Bottle",
                "Gas Lighter","Dish Rack"
        };

        String[] petCare = {
                "Dog Food","Cat Food","Pet Shampoo","Leash","Bowl","Pet Treats","Pet Toy","Pet Bed",
                "Pet Collar","Pet Harness","Litter","Litter Box","Pet Comb","Pet Brush","Pet Towel",
                "Pet Toothbrush","Pet Toothpaste","Pet Nail Clipper","Pet Carrier","Pet Blanket",
                "Pet Spray","Pet Vitamins","Pet Soap","Pet Feeding Bottle","Pet Diapers"
        };

        String[] health = {
                "Mask","Sanitizer","Bandage","Thermometer","Medicine","First Aid Kit","Cotton",
                "Antiseptic Cream","Pain Relief Spray","Hand Gloves","Digital BP Monitor","Glucometer",
                "Face Shield","Nebulizer","Pulse Oximeter","Heating Pad","Cold Pack","Hot Water Bag",
                "Vitamins","Calcium Tablets","ORS","Cough Syrup","Pain Killers","Eye Drops","Ear Drops"
        };

        for(String item : fruits) System.out.println(item);
        for(String item : vegetables) System.out.println(item);
        for(String item : dairy) System.out.println(item);
        for(String item : bakery) System.out.println(item);
        for(String item : snacks) System.out.println(item);
        for(String item : beverages) System.out.println(item);
        for(String item : grains) System.out.println(item);
        for(String item : pulses) System.out.println(item);
        for(String item : spices) System.out.println(item);
        for(String item : oils) System.out.println(item);
        for(String item : meat) System.out.println(item);
        for(String item : frozen) System.out.println(item);
        for(String item : cleaning) System.out.println(item);
        for(String item : personalCare) System.out.println(item);
        for(String item : babyCare) System.out.println(item);
        for(String item : stationery) System.out.println(item);
        for(String item : electronics) System.out.println(item);
        for(String item : kitchen) System.out.println(item);
        for(String item : petCare) System.out.println(item);
        for(String item : health) System.out.println(item);
    }
}

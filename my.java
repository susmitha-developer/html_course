class uniq{
    void java(){
        System.out.println("take a java class");
    }
}

class besan extends uniq{

    void python(){
        System.out.println("take a python class");
    }
}



class taf extends uniq{

    void react(){
        System.out.println("take a react class");
    }
}

class fita extends uniq{

    void php(){
        System.out.println("take a php class");
    }
}

class rec extends fita{

    void spring(){
        System.out.println("take a spring class");
    }
}





class my{
    public static void main(String[] args) {
        rec r1=new rec();
        r1.spring();
        r1.java();
        r1.php();

   
        
    }
}
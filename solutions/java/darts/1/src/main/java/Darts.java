class Darts {
    int score(double xOfDart, double yOfDart) {
        //Raiz cuadrada de la distancia del dardo al centro (x e y)
        double distancia = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));

        //Fuera de limites -> > 10
        if(distancia > 10.0){
            return 0;
        }else if((distancia <= 10.0 && distancia > 5.0)){ //Circulo exterior -> < 10 && > 5
            return 1;
        } else if ((distancia <= 5 && distancia > 1)) { //Circulo medio -> < 5 && > 1
            return 5;
        }else{ //Circulo pequeño -> < 1
            return 10;
        }
    }
}

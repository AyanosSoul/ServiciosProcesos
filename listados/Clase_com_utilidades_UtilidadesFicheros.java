public class UtilidadesFicheros {

    public static BufferedReader getBufferedReader(
        String nombreFichero) throws
    FileNotFoundException {
        FileReader lector;
        lector = new FileReader(nombreFichero);
        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(lector);
        return bufferedReader;
    }

    public static PrintWriter getPrintWriter(
        String nombreFichero) throws IOException {
        PrintWriter printWriter;
        FileWriter fileWriter;
        fileWriter = new FileWriter(nombreFichero);
        printWriter = new PrintWriter(fileWriter);
        return printWriter;
    }

    //Fin de getPrintWriter
    public static ArrayList<String> getLineasFichero(
        String nombreFichero) throws IOException {
        ArrayList<String> lineas = new ArrayList<String>();
        BufferedReader bfr = getBufferedReader(nombreFichero);
        //Leemos l�neas del fichero...
        String linea = bfr.readLine();
        while (linea != null) {
            //Y las a�adimos al array
            lineas.add(linea);
            linea = bfr.readLine();
        }
        //Fin del bucle que lee l�neas
        return lineas;
    }
    //Fin de getLineasFichero
}

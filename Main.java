public class Main {
    public static void main (String[] args){
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setNombre("Laura");
        persona1.setEdad(29);
        persona1.setTelefono("6978-9009");

        var nombre = persona1.getNombre();
        var edad = persona1.getEdad();
        var tel = persona1.getTelefono();
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(tel);
    }
    static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return telefono;
        }

    }
}

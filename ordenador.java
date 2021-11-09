public class ordenador {
    // Atributos
    private String procesador;
    private int memoriaRAM;
    private boolean ventiladoresFuncionando;
    
    // Construcctor
    public ordenador(String nombreProcesador, int tamañoMemoriaRAM) {
        procesador = nombreProcesador;
        memoriaRAM = tamañoMemoriaRAM;
        ventiladoresFuncionando = true;
    }
    
    // Gasto energia
    public double gastoEnergia(int minutosEncendido) {
        double gastoTotal= (1.2 * minutosEncendido) + (1 * minutosEncendido) + (0.5 * minutosEncendido);
        return gastoTotal;
    }
    
    public void botonEncendido() {
        ventiladoresFuncionando = !ventiladoresFuncionando;
    }
    
    // Detalles
    public void imprimirDatos() {
        if (ventiladoresFuncionando == true) {  
            System.out.println("Procesador: " + procesador + " | RAM: " + memoriaRAM + " | Ventiladores: Funcionando");
        }
        else {
            System.out.println("Procesador: " + procesador + " | RAM: " + memoriaRAM + " | Ventiladores: No estan funcionando");
        }

    }
    
    public String getEstado() {
        String encendido;
        if (ventiladoresFuncionando == true) {
            encendido = "Ventiladores funcionando";
        }
        else {
            encendido = "Ventiladores apagados";
        }
        return encendido;
    }
}
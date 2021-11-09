public class ordenador {
    // Atributos
    private String procesador;
    private int memoriaRAM;
    private boolean ventiladoresFuncionando;
    
    // Construcctor
    public ordenador(String nombreProcesador, int tama�oMemoriaRAM) {
        procesador = nombreProcesador;
        memoriaRAM = tama�oMemoriaRAM;
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
        System.out.println("Procesador: " + procesador + " | RAM: " + memoriaRAM + " | Ventiladores: " + ventiladoresFuncionando);
    }
    
    public void estado() {
        if (ventiladoresFuncionando == true) {
            System.out.println("Ventiladores funcionando");
        }
        else {
            System.out.println("Ventiladores apagados");
        }
    }
}
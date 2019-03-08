package Almacenes;

/**
 *
 * @author luis-
 */
public class APartesCoches {

    private String suspension;
    private int Ususpension;
    private String frenos;
    private int Ufrenos;
    private String volante;
    private int Uvolante;
    private String asientos;
    private int Uasientos;
    private String escape;
    private int Uescape;
    private String liquidoFrenos;
    private int UliquidoFrenos;
    private String luces;
    private int Uluces;
    private String motor;
    private int Umotor;
    private String luna;
    private int Uluna;
    private String capo;
    private int Ucapo;
    private String neumaticos;
    private int Uneumaticos;
    private String llantas;
    private int Ullantas;
    private String retrovisores;
    private int Uretrovisores;

    //builder sin obligatorios?? introducir en un array lo que se quiere 
    //unidades de cada parte? cada vez que se usa el constructor (del builder) se restan unidades
    //objeto pedido
    public APartesCoches(String suspension, final int Ususpension, String frenos, final int Ufrenos, String volante, final int Uvolante, String asientos, final int Uasientos, String escape, final int Uescape, String liquidoFrenos, final int UliquidoFrenos, String luces, final int Uluces, String motor, final int Umotor, String luna, final int Uluna, String capo, final int Ucapo, String neumaticos, final int Uneumaticos, String llantas, final int Ullantas, String retrovisores, final int Uretrovisores) {
        this.suspension = suspension;
        this.Ususpension = Ususpension;
        this.frenos = frenos;
        this.Ufrenos = Ufrenos;
        this.volante = volante;
        this.Uvolante = Uvolante;
        this.asientos = asientos;
        this.Uasientos = Uasientos;
        this.escape = escape;
        this.Uescape = Uescape;
        this.liquidoFrenos = liquidoFrenos;
        this.UliquidoFrenos = UliquidoFrenos;
        this.luces = luces;
        this.Uluces = Uluces;
        this.motor = motor;
        this.Umotor = Umotor;
        this.luna = luna;
        this.Uluna = Uluna;
        this.capo = capo;
        this.Ucapo = Ucapo;
        this.neumaticos = neumaticos;
        this.Uneumaticos = Uneumaticos;
        this.llantas = llantas;
        this.Ullantas = Ullantas;
        this.retrovisores = retrovisores;
        this.Uretrovisores = Uretrovisores;
    }

}

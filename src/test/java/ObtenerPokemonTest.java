import org.junit.jupiter.api.Test;

public class ObtenerPokemonTest {

    @Test
    public void probarPokemon1(){
        System.out.println(ObtenerPokemonRequest.Companion.get(1));
        System.out.println(ObtenerPokemonRequest.Companion.get("bulbasaur"));
    }


    @Test
    public void probarPokemon2Nombre(){
        // TODO Comprueba que al preguntar por Pokémon con id 2 obtienes a ivisaur.
    }

    @Test
    public void probarPokemon2Id(){
        // TODO Comprueba que al preguntar por Pokémon con ivisaur obtienes el id 2.
    }

    @Test
    public void probarPokemon3Peso(){
        // TODO Comprueba que al preguntar por Pokémon con 3 obtienes el peso de 1000.
    }

    @Test
    public void probarPokemon3Altura(){
        // TODO Comprueba que al preguntar por Pokémon con 3 obtienes la altura de 20.
    }

    @Test
    public void probarPokemon4a6(){
        // TODO Comprueba que los Pokémon (id = 4, id = 5, id = 6) obtienes a charmander, wartortel y blastoise.
    }

    @Test
    public void probarPokemon25NombreEId(){
        // TODO Comprueba que cuando descargas un Pokémon con el id 25 obtienes un nombre, si descargas ese Pokémon por nombre obtienes un id.
        //  Comprueba que ambos Pokémon coinciden (el que has obtenido mediante el nombre y el que has obtenido mediante el id).
    }

    @Test
    public void probarPokemon140A150NombreEId(){
        // TODO Realiza lo mismo que el ejercicio anterior pero para un rango de Pokémons que van desde el 140 al 150.
        //  Estos números deberían poder cambiar fácilmente
        int minId = 140;
        int maxId = 150;

    }

}

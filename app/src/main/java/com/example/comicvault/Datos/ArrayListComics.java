package com.example.comicvault.Datos;

import com.example.comicvault.Logica.Comic;

public class ArrayListComics {

    public static Comic[] listaComics() {
        Comic[] lista = new Comic[]{
                new Comic("Marvel Premiere. El Asombroso Spiderman 8", "https://www.panini.es/media/catalog/product/cache/a5b5dd3adfe0d321084804c738f29601/s/p/sprem050_00.jpg", "Nick Spencer", "¡El regreso del mundo de Marvel 2099! La misteriosa vuelta de Miguel O’Hara a nuestro tiempo amenaza su vida y su futuro. ¿Por qué? Para el Spidey de nuestro tiempo, los choques con sus enemigos, los problemas familiares y los incidentes internacionales lo complican todo."),
                new Comic("Miles Morales: Spider-Man 1", "https://www.panini.es/media/catalog/product/cache/a5b5dd3adfe0d321084804c738f29601/s/m/smile025_00.jpg", "Cody Ziglar", "¡Nueva etapa! Miles se enfrenta a su más poderoso antagonista hasta la fecha, un enemigo que amenaza todo lo que al joven trepamuros le es querido. Con la presencia de Mac Gargan, también conocido como El Escorpión. No te pierdas el siguiente capítulo en la vida del Spidey adolescente, de la mano de Cody Ziglar (guionista de la teleserie de Hulka) y Federico Vicentini."),
                new Comic("Hulk Vs. Thor Alpha", "https://www.panini.es/media/catalog/product/cache/a5b5dd3adfe0d321084804c738f29601/s/h/shvth001_0.jpg", "Martin Coccolo", "Hulk y Thor han sufrido recientemente cambios gigantescos, pero algo permanece constante: ¡su acalorada rivalidad! Después de que unas circunstancias misteriosas los vuelvan a poner en conflicto, ¿podrá el Dios del Trueno triunfar contra un Bruce Banner que ahora controla su ira? Celebrando el sexagésimo aniversario de ambos personajes, llega un cruce épico de cinco partes entre las series de ambos. "),
                new Comic("Guardianes de la Galaxia 13", "https://www.panini.es/media/catalog/product/cache/a5b5dd3adfe0d321084804c738f29601/s/g/sguar025_1.jpg", "Juan Frigeri", "¡La nueva era del espacio comienza aquí! Fueron soldados, marginados, mercenarios, ladrones y familia. Fueron héroes, pero los tiempos han cambiado. La galaxia ya no necesita héroes. ¡Necesita superhéroes! Ahora, cuando escuchen la llamada, ya sea de un grupo de exploradores planetarios o del Emperador Hulkling, Los Guardianes de la Galaxia responderán."),
                new Comic("Iron Man 22", "https://www.panini.es/media/catalog/product/cache/a5b5dd3adfe0d321084804c738f29601/s/i/simds341_0_1.jpg", "Christopher Cantwell", "¡Una crisis a 30.000 pies en el aire! A su regreso de California, Iron Man cae en una trampa explosiva. ¿Rivalizará su destreza tecnológica con el dominio sobre el medio natural que posee su antagonista? ¡El Hombre de Hierro contra la naturaleza, en el nacimiento de un nuevo villano!"),
                new Comic("Marvel 1602","https://www.universomarvel.com/wp-content/uploads/2022/01/45-Marvel-1602.-Edicion-Grimorio.jpg","Neil Gaiman", "¿Qué hubiera ocurrido si las grandes criaturas que pueblan el Universo Marvel, desde Los Cuatro Fantásticos a La Patrulla-X, desde el Doctor Extraño a Hulk, desde Spiderman a Nick Furia, hubieran irrumpido en el siglo XVII, en lugar de hacerlo en el siglo XX? Neil Gaiman, el genial creador de The Sandman, tiene la respuesta, en un imprescindible cómic dibujado por el equipo artístico de Lobezno: Origen, Andy Kubert y Richard Isanove."),
                new Comic("Actos de Maldad 1", "https://www.panini.es/media/catalog/product/cache/a5b5dd3adfe0d321084804c738f29601/s/h/shmma394.jpg", "Reilly Brown", "¡Los superhéroes de Marvel se enfrentan a villanos con los que nunca han luchado! Ms. Marvel contra el Superskrull, El Castigador contra El Nido, Veneno contra Lady Infierno y Masacre contra Pesadilla, en el revival de un clásico de los ochenta: Actos de Venganza.")

        };

        return lista;
    }
}

package lambda.Warburton.chapter1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class SampleData {

    public static final Artist johnColtrane = new Artist("John Coltrane", "US");

    public static final Artist johnLennon = new Artist("John Lennon", "UK");
    public static final Artist paulMcCartney = new Artist("Paul McCartney", "UK");
    public static final Artist georgeHarrison = new Artist("George Harrison", "UK");
    public static final Artist ringoStarr = new Artist("Ringo Starr", "UK");
    public static final Artist SvyatoslavVakarchuk = new Artist("Svyatoslav Vakarchuk", "UA");
    public static final Artist MilosJelic = new Artist("Milos Jelic", "UA");
    public static final Artist DenysHlinin = new Artist("Denys Hlinin", "UA");
    public static final Artist DenysDudko = new Artist("Denys Dudko", "UA");
    public static final Artist VladimirOpenica = new Artist("Vladimir Openica", "UA");

    public static final List<Artist> membersOfTheBeatles = Arrays.asList(johnLennon, paulMcCartney, georgeHarrison, ringoStarr);
    public static final List<Artist> membersOfOE = Arrays.asList(SvyatoslavVakarchuk,MilosJelic,DenysDudko,DenysHlinin,VladimirOpenica);

    public static final Artist theBeatles = new Artist("The Beatles", membersOfTheBeatles, "UK");
    public static final Artist OE = new Artist("Okean Elzy", membersOfOE, "UA");

    public static final Album aLoveSupreme = new Album("A Love Supreme", asList(new Track("Acknowledgement", 467), new Track("Resolution", 442)), asList(johnColtrane));
    public static final Album Zemlya = new Album("Земля", asList(new Track("З нею",206),new Track("Стіна",143),new Track("Бодегіта",170),new Track("Незалежність",136),new Track("Rendez-Vous",174),new Track("Стріляй",200),new Track("Обійми",155),new Track("Караван",161),new Track("Джульєтта",191),new Track("На Небі",153),new Track("Пори Року",203),new Track("Коли навколо ні душі",132)), asList(OE));

    public static final Album Mira = new Album("Земля", asList(new Track("Міра ",241),new Track("День у день ",175),new Track("Хочу напитись тобою ",220),new Track("Пташка ",163),new Track("Зелені очі ",248),new Track("Коли тобі важко ",232),new Track("Як довго ",182),new Track("Не можу без тебе ",155),new Track("Лелеки ",244),new Track("Ночі і дні ",182),new Track("Все буде добре ",190),new Track("Моя мала ",219),new Track("Веселi, брате, часи настали ",212),new Track("Дякую! ",145)), asList(OE));

    public static final Album sampleShortAlbum = new Album("sample Short Album", asList(new Track("short track", 30)), asList(johnColtrane));

    public static final Album manyTrackAlbum = new Album("sample Short Album", asList(new Track("short track", 30), new Track("short track 2", 30), new Track("short track 3", 30), new Track("short track 4", 30), new Track("short track 5", 30)), asList(johnColtrane, johnLennon));

    public static Stream<Album> albums = Stream.of(aLoveSupreme);

    public static Stream<Artist> threeArtists() {
        return Stream.of(johnColtrane, johnLennon, theBeatles);
    }

    public static List<Artist> getThreeArtists() {
        return Arrays.asList(johnColtrane, johnLennon, theBeatles);
    }

}

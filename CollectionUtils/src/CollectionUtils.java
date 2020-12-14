import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;


public class CollectionUtils {

    public static <T extends Collection<E>,E> E getRandomElement(T collection){
            int size = ThreadLocalRandom.current().nextInt(collection.size());
            Iterator<E> iterator = collection.iterator();
            for (int i =0 ; i<size; i++){
                iterator.next();
            }
            return iterator.next();
    }
}

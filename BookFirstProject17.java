package associationAggregationAndComposition17;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author User
 */
class BookFirstProject17 {
    String ISBN;
    AuthorFirstProject17 author;
 
    ArrayList<ChapterFirstProject17> chapters;

    BookFirstProject17() {
        chapters = new ArrayList<ChapterFirstProject17>(Arrays.asList(
            new ChapterFirstProject17(1),
            new ChapterFirstProject17(2),
            new ChapterFirstProject17(3)));
    }
}
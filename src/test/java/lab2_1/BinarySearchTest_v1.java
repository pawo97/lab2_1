package lab2_1;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest_v1 {

    public int tab[];

    @Test
    public void isInSequence() {
        tab = new int[] {1, 2};
        SearchResult result = BinarySearch.search(1, tab);
        Assert.assertThat(result.getPosition(), is(1));
    }

    @Test
    public void isNotInSequence() {
        tab = new int[] {1};
        SearchResult result = BinarySearch.search(2, tab);
        Assert.assertThat(result.getPosition(), is(-1));
    }

    @Test
    public void isFirstElementInSequence() {
        tab = new int[] {1, 8, 6, 2};
        SearchResult result = BinarySearch.search(1, tab);
        Assert.assertThat(result.getPosition(), is(1));
    }

    @Test
    public void isLastElementInSequence() {
        tab = new int[] {3, 6, 4};
        SearchResult result = BinarySearch.search(6, tab);
        Assert.assertThat(result.getPosition(), is(2));
    }

    @Test
    public void isMiddleElementInSequence() {
        tab = new int[] {1, 8, 3, 2, 5};
        SearchResult result = BinarySearch.search(3, tab);
        Assert.assertThat(result.getPosition(), is(3));
    }

    @Test
    public void isFound() {
        tab = new int[] {1, 2, 3, 4, 5, 6};
        SearchResult result = BinarySearch.search(2, tab);
        Assert.assertThat(result.isFound(), is(true));
    }

    @Test
    public void isNotFound() {
        tab = new int[] {15};
        SearchResult result = BinarySearch.search(6, tab);
        Assert.assertThat(result.isFound(), is(false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void thrownIllegalArgumentException() {
        BinarySearch.search(0, new int[0]);
    }
}

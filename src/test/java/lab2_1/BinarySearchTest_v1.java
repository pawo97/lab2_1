package lab2_1;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest_v1 {

    @Test
    public void isInSequence() {
        int[] tab = {1};
        SearchResult result = BinarySearch.search(1, tab);
        Assert.assertThat(result.getPosition(), is(1));
    }

    @Test
    public void isNotInSequence() {
        int[] tab = {1};
        SearchResult result = BinarySearch.search(2, tab);
        Assert.assertThat(result.getPosition(), is(-1));
    }

    @Test
    public void isFirstElementInSequence() {
        int[] tab = {1, 2, 3, 4};
        SearchResult result = BinarySearch.search(1, tab);
        Assert.assertThat(result.getPosition(), is(1));
    }

    @Test
    public void isLastElementInSequence() {
        int[] tab = {1, 2, 3, 4};
        SearchResult result = BinarySearch.search(4, tab);
        Assert.assertThat(result.getPosition(), is(4));
    }

    @Test
    public void isMiddleElementInSequence() {
        int[] tab = {1, 2, 3, 4, 5};
        SearchResult result = BinarySearch.search(3, tab);
        Assert.assertThat(result.getPosition(), is(3));
    }

    @Test
    public void isFound() {
        int[] tab = {1, 2, 3, 4, 5};
        SearchResult result = BinarySearch.search(2, tab);
        Assert.assertThat(result.isFound(), is(true));
    }

    @Test
    public void isNotFound() {
        int[] tab = {1, 2, 3, 4, 5};
        SearchResult result = BinarySearch.search(6, tab);
        Assert.assertThat(result.isFound(), is(false));
    }
}

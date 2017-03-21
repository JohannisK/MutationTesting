package nl.johannisk;

class Timeline {

    static final int DEFAULT_FETCH_COUNT = 10;
    private int fetchCount;

    Timeline() {
        fetchCount = DEFAULT_FETCH_COUNT;
    }

    void setFetchCount(int fetchCount) {
        if (fetchCount <= 0) {
            String msg = "Argument 'fetchCount' must be a positive value.";
            throw new IllegalArgumentException(msg);
        }
        this.fetchCount = fetchCount;
    }

    int getFetchCount() {
        return fetchCount;
    }
}

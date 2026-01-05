package ai.salesmax.model.event;

import java.util.List;

/* loaded from: classes.dex */
public class ResultsChangedEvent<T> {
    private int count;
    private ResultsChangedEventType eventType;
    private List<T> itemsChanged;
    private int start;

    public enum ResultsChangedEventType {
        INSERTED,
        UPDATED,
        DELETED
    }

    public ResultsChangedEvent(List<T> list, ResultsChangedEventType resultsChangedEventType, int i, int i2) {
        this.itemsChanged = list;
        this.start = i;
        this.count = i2;
        this.eventType = resultsChangedEventType;
    }

    public int count() {
        return this.count;
    }

    public ResultsChangedEventType eventType() {
        return this.eventType;
    }

    public List<T> itemsChanged() {
        return this.itemsChanged;
    }

    public int start() {
        return this.start;
    }
}

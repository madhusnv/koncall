package ai.salesmax.model.event;

import ai.salesmax.model.event.ResultsChangedEvent;
import java.util.List;

/* loaded from: classes.dex */
public interface ResultsChangeListener<T> {
    default void fireDeletedEvent(List<T> list, int i) {
        onResultsChanged(new ResultsChangedEvent<>(list, ResultsChangedEvent.ResultsChangedEventType.DELETED, i, list.size()));
    }

    default void fireInsertedEvent(List<T> list, int i) {
        onResultsChanged(new ResultsChangedEvent<>(list, ResultsChangedEvent.ResultsChangedEventType.INSERTED, i, list.size()));
    }

    default void fireUpdatedEvent(List<T> list, int i) {
        onResultsChanged(new ResultsChangedEvent<>(list, ResultsChangedEvent.ResultsChangedEventType.UPDATED, i, list.size()));
    }

    void onResultsChanged(ResultsChangedEvent<T> resultsChangedEvent);
}

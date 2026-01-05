package ai.salesmax.services.model;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import p001o.ih1;

/* loaded from: classes.dex */
public class SubscriptionNotificationEvent<T> {
    private final EventType changeType;
    private final T newImage;
    private final T oldImage;

    public enum EventType {
        CREATE,
        UPDATE,
        DELETE
    }

    public SubscriptionNotificationEvent(T t, T t2, EventType eventType) {
        this.changeType = eventType;
        this.newImage = t2;
        this.oldImage = t;
    }

    public EventType eventType() {
        return this.changeType;
    }

    public <U> SubscriptionNotificationEvent<U> map(Function<T, U> function) {
        Optional optionalOfNullable = Optional.ofNullable(this.oldImage);
        Objects.requireNonNull(function);
        return new SubscriptionNotificationEvent<>(optionalOfNullable.map(new ih1(function)).orElse(null), Optional.ofNullable(this.newImage).map(new ih1(function)).orElse(null), this.changeType);
    }

    public T newValue() {
        return this.newImage;
    }

    public T oldValue() {
        return this.oldImage;
    }
}

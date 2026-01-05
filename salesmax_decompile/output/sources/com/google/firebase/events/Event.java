package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* loaded from: classes5.dex */
public class Event<T> {
    private final T payload;

    /* renamed from: type, reason: collision with root package name */
    private final Class<T> f58159type;

    public Event(Class<T> cls, T t) {
        this.f58159type = (Class) Preconditions.checkNotNull(cls);
        this.payload = (T) Preconditions.checkNotNull(t);
    }

    public T getPayload() {
        return this.payload;
    }

    public Class<T> getType() {
        return this.f58159type;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f58159type, this.payload);
    }
}

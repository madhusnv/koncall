package com.amplifyframework.hub;

import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class HubEvent<T> {
    private final T data;
    private final String name;
    private final UUID uuid = UUID.randomUUID();

    public interface Data<T> {
        HubEvent<T> toHubEvent();
    }

    private HubEvent(String str, T t) {
        this.name = str;
        this.data = t;
    }

    public static HubEvent<?> create(String str) {
        return new HubEvent<>(str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HubEvent.class != obj.getClass()) {
            return false;
        }
        HubEvent hubEvent = (HubEvent) obj;
        if (s6c.m47909a(this.name, hubEvent.name) && s6c.m47909a(this.data, hubEvent.data)) {
            return s6c.m47909a(this.uuid, hubEvent.uuid);
        }
        return false;
    }

    public T getData() {
        return this.data;
    }

    public UUID getId() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.data;
        int iHashCode2 = (iHashCode + (t != null ? t.hashCode() : 0)) * 31;
        UUID uuid = this.uuid;
        return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "HubEvent{name='" + this.name + "', data=" + this.data + ", uuid=" + this.uuid + '}';
    }

    public static <E extends Enum<E>> HubEvent<?> create(E e) {
        Objects.requireNonNull(e);
        return new HubEvent<>(e.toString(), null);
    }

    public static <T> HubEvent<T> create(String str, T t) {
        return new HubEvent<>(str, t);
    }

    public static <T, E extends Enum<E>> HubEvent<T> create(E e, T t) {
        Objects.requireNonNull(e);
        Objects.requireNonNull(t);
        return new HubEvent<>(e.toString(), t);
    }
}

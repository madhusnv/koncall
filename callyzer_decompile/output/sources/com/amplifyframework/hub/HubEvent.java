package com.amplifyframework.hub;

import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HubEvent<T> {
    private final T data;
    private final String name;
    private final UUID uuid = UUID.randomUUID();

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface Data<T> {
        HubEvent<T> toHubEvent();
    }

    private HubEvent(String str, T t7) {
        this.name = str;
        this.data = t7;
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
        if (Objects.equals(this.name, hubEvent.name) && Objects.equals(this.data, hubEvent.data)) {
            return Objects.equals(this.uuid, hubEvent.uuid);
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
        T t7 = this.data;
        int iHashCode2 = (iHashCode + (t7 != null ? t7.hashCode() : 0)) * 31;
        UUID uuid = this.uuid;
        return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "HubEvent{name='" + this.name + "', data=" + this.data + ", uuid=" + this.uuid + '}';
    }

    public static <E extends Enum<E>> HubEvent<?> create(E e2) {
        Objects.requireNonNull(e2);
        return new HubEvent<>(e2.toString(), null);
    }

    public static <T> HubEvent<T> create(String str, T t7) {
        return new HubEvent<>(str, t7);
    }

    public static <T, E extends Enum<E>> HubEvent<T> create(E e2, T t7) {
        Objects.requireNonNull(e2);
        Objects.requireNonNull(t7);
        return new HubEvent<>(e2.toString(), t7);
    }
}

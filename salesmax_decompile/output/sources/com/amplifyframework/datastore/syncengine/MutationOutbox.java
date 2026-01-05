package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.model.Model;
import java.util.List;
import java.util.Set;
import p001o.gi6;
import p001o.hi6;
import p001o.x6c;
import p001o.xk3;

/* loaded from: classes5.dex */
public interface MutationOutbox {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OutboxEvent {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ OutboxEvent[] $VALUES;
        public static final OutboxEvent CONTENT_AVAILABLE = new OutboxEvent("CONTENT_AVAILABLE", 0);

        private static final /* synthetic */ OutboxEvent[] $values() {
            return new OutboxEvent[]{CONTENT_AVAILABLE};
        }

        static {
            OutboxEvent[] outboxEventArr$values = $values();
            $VALUES = outboxEventArr$values;
            $ENTRIES = hi6.m30609a(outboxEventArr$values);
        }

        private OutboxEvent(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static OutboxEvent valueOf(String str) {
            return (OutboxEvent) Enum.valueOf(OutboxEvent.class, str);
        }

        public static OutboxEvent[] values() {
            return (OutboxEvent[]) $VALUES.clone();
        }
    }

    <T extends Model> xk3 enqueue(PendingMutation<T> pendingMutation);

    x6c events();

    <T extends Model> Set<String> fetchPendingMutations(List<? extends T> list, String str, boolean z);

    xk3 load();

    xk3 markInFlight(TimeBasedUuid timeBasedUuid);

    PendingMutation<? extends Model> peek();

    xk3 remove(TimeBasedUuid timeBasedUuid);
}

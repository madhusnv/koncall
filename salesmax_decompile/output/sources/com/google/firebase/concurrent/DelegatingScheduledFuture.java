package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p001o.i9;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes5.dex */
class DelegatingScheduledFuture<V> extends i9 implements ScheduledFuture<V> {
    private final ScheduledFuture<?> upstreamFuture;

    public interface Completer<T> {
        void set(T t);

        void setException(Throwable th);
    }

    public interface Resolver<T> {
        ScheduledFuture<?> addCompleter(Completer<T> completer);
    }

    public DelegatingScheduledFuture(Resolver<V> resolver) {
        this.upstreamFuture = resolver.addCompleter(new Completer<V>() { // from class: com.google.firebase.concurrent.DelegatingScheduledFuture.1
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void set(V v) {
                DelegatingScheduledFuture.this.set(v);
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void setException(Throwable th) {
                DelegatingScheduledFuture.this.setException(th);
            }
        });
    }

    @Override // p001o.i9
    public void afterDone() {
        this.upstreamFuture.cancel(wasInterrupted());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.upstreamFuture.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.upstreamFuture.compareTo(delayed);
    }
}

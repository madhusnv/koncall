package com.amplifyframework.rx;

import com.amplifyframework.core.async.Cancelable;
import java.util.concurrent.atomic.AtomicReference;
import p001o.su5;

/* loaded from: classes5.dex */
final class AmplifyDisposables {
    private AmplifyDisposables() {
    }

    public static su5 fromCancelable(final Cancelable cancelable) {
        return cancelable == null ? su5.m48918c() : new su5() { // from class: com.amplifyframework.rx.AmplifyDisposables.1
            private final AtomicReference<Boolean> isCanceled = new AtomicReference<>(Boolean.FALSE);

            @Override // p001o.su5
            public void dispose() {
                synchronized (this.isCanceled) {
                    if (!this.isCanceled.get().booleanValue()) {
                        cancelable.cancel();
                        this.isCanceled.set(Boolean.TRUE);
                    }
                }
            }

            @Override // p001o.su5
            public boolean isDisposed() {
                boolean zBooleanValue;
                synchronized (this.isCanceled) {
                    zBooleanValue = this.isCanceled.get().booleanValue();
                }
                return zBooleanValue;
            }
        };
    }
}

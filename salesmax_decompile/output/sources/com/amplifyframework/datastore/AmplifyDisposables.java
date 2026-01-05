package com.amplifyframework.datastore;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.AmplifyDisposables;
import com.amplifyframework.logging.Logger;
import java.util.concurrent.atomic.AtomicReference;
import p001o.q7c;
import p001o.su5;

/* loaded from: classes5.dex */
public final class AmplifyDisposables {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");

    private AmplifyDisposables() {
    }

    public static su5 fromCancelable(final Cancelable cancelable) {
        return cancelable == null ? su5.m48918c() : new su5() { // from class: com.amplifyframework.datastore.AmplifyDisposables.1
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onErrorConsumerWrapperFor$0(q7c q7cVar, AmplifyException amplifyException) {
        if (q7cVar.isDisposed()) {
            LOG.warn("Attempted to invoke an emitter that is already disposed", amplifyException);
        } else {
            q7cVar.onError(amplifyException);
        }
    }

    public static <T extends Model, E extends AmplifyException> Consumer<E> onErrorConsumerWrapperFor(final q7c q7cVar) {
        return new Consumer() { // from class: o.xb0
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                AmplifyDisposables.lambda$onErrorConsumerWrapperFor$0(q7cVar, (AmplifyException) obj);
            }
        };
    }
}

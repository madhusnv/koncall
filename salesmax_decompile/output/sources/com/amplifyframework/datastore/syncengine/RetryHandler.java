package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.datastore.syncengine.RetryHandler;
import com.amplifyframework.datastore.utils.ErrorInspector;
import com.amplifyframework.logging.Logger;
import j$.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.c5f;
import p001o.gu3;
import p001o.i5f;
import p001o.jm;
import p001o.rl7;
import p001o.su5;
import p001o.wtf;
import p001o.x6c;
import p001o.x8c;

/* loaded from: classes5.dex */
public class RetryHandler {
    private static final long JITTER_MS_VALUE = 100;
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private static final long MAX_DELAY_MS_VALUE = Duration.ofMinutes(5).toMillis();
    private final long jitterMs;
    private final long maxDelayMs;

    public RetryHandler(long j, long j2) {
        this.jitterMs = j;
        this.maxDelayMs = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$retry$0(AtomicInteger atomicInteger, su5 su5Var) {
        LOG.info("Starting attempt #" + (atomicInteger.get() + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$retry$1(AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, Object obj) {
        atomicBoolean.set(true);
        LOG.info("Success on attempt #" + (atomicInteger.get() + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$retry$2(long j, AtomicInteger atomicInteger, su5 su5Var) {
        LOG.debug("Retrying in " + j + " milliseconds.");
        atomicInteger.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x8c lambda$retry$3(List list, final AtomicInteger atomicInteger, c5f c5fVar, Throwable th) {
        if (ErrorInspector.contains(th, (List<Class<? extends Throwable>>) list)) {
            LOG.warn("Non-retryable exception.", th);
            return x6c.m55694H(th);
        }
        final long jJitteredDelayMillis = jitteredDelayMillis(atomicInteger.get());
        Logger logger = LOG;
        logger.warn("Attempt #" + (atomicInteger.get() + 1) + " failed.", th);
        if (jJitteredDelayMillis <= this.maxDelayMs) {
            return x6c.B0(jJitteredDelayMillis, TimeUnit.MILLISECONDS, c5fVar).m55711D(new gu3() { // from class: o.ise
                @Override // p001o.gu3
                public final void accept(Object obj) {
                    RetryHandler.lambda$retry$2(jJitteredDelayMillis, atomicInteger, (su5) obj);
                }
            });
        }
        logger.warn("No more attempts left.");
        return x6c.m55694H(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x8c lambda$retry$4(final List list, final AtomicInteger atomicInteger, final c5f c5fVar, x6c x6cVar) {
        return x6cVar.m55717M(new rl7() { // from class: o.nse
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f37273a.lambda$retry$3(list, atomicInteger, c5fVar, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$retry$5(AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get()) {
            return;
        }
        LOG.info("The subscribing channel is disposed, canceling retries.");
    }

    public long jitteredDelayMillis(int i) {
        return (long) (Duration.ofSeconds((long) Math.pow(2.0d, i)).toMillis() + (this.jitterMs * Math.random()));
    }

    public <T> wtf retry(wtf wtfVar, List<Class<? extends Throwable>> list) {
        return retry(wtfVar, list, i5f.m31597a());
    }

    public <T> wtf retry(wtf wtfVar, final List<Class<? extends Throwable>> list, final c5f c5fVar) {
        final AtomicInteger atomicInteger = new AtomicInteger();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        return x6c.m55701Y(wtfVar).m55711D(new gu3() { // from class: o.jse
            @Override // p001o.gu3
            public final void accept(Object obj) {
                RetryHandler.lambda$retry$0(atomicInteger, (su5) obj);
            }
        }).m55710C(new gu3() { // from class: o.kse
            @Override // p001o.gu3
            public final void accept(Object obj) {
                RetryHandler.lambda$retry$1(atomicBoolean, atomicInteger, obj);
            }
        }).m0(new rl7() { // from class: o.lse
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f34342a.lambda$retry$4(list, atomicInteger, c5fVar, (x6c) obj);
            }
        }).m55741y(new jm() { // from class: o.mse
            @Override // p001o.jm
            public final void run() {
                RetryHandler.lambda$retry$5(atomicBoolean);
            }
        }).m55716L();
    }

    public RetryHandler() {
        this.jitterMs = JITTER_MS_VALUE;
        this.maxDelayMs = MAX_DELAY_MS_VALUE;
    }
}

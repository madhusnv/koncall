package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.logging.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p001o.xk3;

/* loaded from: classes5.dex */
public final class RetryStrategy {
    public static final RxRetryStrategy RX_INTERRUPTIBLE_WITH_BACKOFF = new RxCompletableExponentialBackoffStrategy(2, 8, Arrays.asList(InterruptedException.class));
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");

    public static final class RxCompletableExponentialBackoffStrategy implements RxRetryStrategy {
        private final int maxExponent;
        private final List<Class<? extends Throwable>> skipExceptionTypes;
        private final int waitBaseDelay;

        public RxCompletableExponentialBackoffStrategy(int i, int i2, List<Class<? extends Throwable>> list) {
            this.waitBaseDelay = i;
            this.maxExponent = i2;
            this.skipExceptionTypes = list;
        }

        @Override // com.amplifyframework.datastore.syncengine.RetryStrategy.RxRetryStrategy
        public boolean retryHandler(int i, Throwable th) throws InterruptedException {
            RetryStrategy.LOG.verbose("Should retry? attempt number:" + i + " exception type:" + th.getClass());
            if (this.skipExceptionTypes.contains(th.getClass())) {
                return false;
            }
            long jLongValue = Double.valueOf(Math.pow(2.0d, i % this.maxExponent)).longValue();
            RetryStrategy.LOG.debug("Waiting " + jLongValue + " seconds before retrying");
            xk3.m56384B(TimeUnit.SECONDS.toMillis(jLongValue), TimeUnit.MILLISECONDS).m56398d();
            return true;
        }
    }

    public interface RxRetryStrategy {
        boolean retryHandler(int i, Throwable th);
    }

    private RetryStrategy() {
    }
}

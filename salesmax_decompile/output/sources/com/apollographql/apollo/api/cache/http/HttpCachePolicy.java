package com.apollographql.apollo.api.cache.http;

import com.apollographql.apollo.api.internal.Utils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class HttpCachePolicy {
    public static final ExpirePolicy CACHE_ONLY = new ExpirePolicy(FetchStrategy.CACHE_ONLY);
    public static final Policy NETWORK_ONLY = new Policy(FetchStrategy.NETWORK_ONLY, 0, null, false);
    public static final ExpirePolicy CACHE_FIRST = new ExpirePolicy(FetchStrategy.CACHE_FIRST);
    public static final ExpirePolicy NETWORK_FIRST = new ExpirePolicy(FetchStrategy.NETWORK_FIRST);

    public static final class ExpirePolicy extends Policy {
        public ExpirePolicy(FetchStrategy fetchStrategy) {
            super(fetchStrategy, 0L, null, false);
        }

        public ExpirePolicy expireAfter(long j, TimeUnit timeUnit) {
            return new ExpirePolicy(this.fetchStrategy, j, (TimeUnit) Utils.checkNotNull(timeUnit), this.expireAfterRead);
        }

        public ExpirePolicy expireAfterRead() {
            return new ExpirePolicy(this.fetchStrategy, this.expireTimeout, this.expireTimeUnit, true);
        }

        private ExpirePolicy(FetchStrategy fetchStrategy, long j, TimeUnit timeUnit, boolean z) {
            super(fetchStrategy, j, timeUnit, z);
        }
    }

    public enum FetchStrategy {
        CACHE_ONLY,
        NETWORK_ONLY,
        CACHE_FIRST,
        NETWORK_FIRST
    }

    public static class Policy {
        public final boolean expireAfterRead;
        public final TimeUnit expireTimeUnit;
        public final long expireTimeout;
        public final FetchStrategy fetchStrategy;

        public Policy(FetchStrategy fetchStrategy, long j, TimeUnit timeUnit, boolean z) {
            this.fetchStrategy = fetchStrategy;
            this.expireTimeout = j;
            this.expireTimeUnit = timeUnit;
            this.expireAfterRead = z;
        }

        public long expireTimeoutMs() {
            TimeUnit timeUnit = this.expireTimeUnit;
            if (timeUnit == null) {
                return 0L;
            }
            return timeUnit.toMillis(this.expireTimeout);
        }
    }

    private HttpCachePolicy() {
    }
}

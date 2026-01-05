package com.onesignal.core.internal.http.impl;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OptionalHeaders {
    private final String cacheKey;
    private final Integer retryCount;
    private final String rywToken;
    private final Long sessionDuration;

    public OptionalHeaders() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OptionalHeaders copy$default(OptionalHeaders optionalHeaders, String str, String str2, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionalHeaders.cacheKey;
        }
        if ((i & 2) != 0) {
            str2 = optionalHeaders.rywToken;
        }
        if ((i & 4) != 0) {
            num = optionalHeaders.retryCount;
        }
        if ((i & 8) != 0) {
            l = optionalHeaders.sessionDuration;
        }
        return optionalHeaders.copy(str, str2, num, l);
    }

    public final String component1() {
        return this.cacheKey;
    }

    public final String component2() {
        return this.rywToken;
    }

    public final Integer component3() {
        return this.retryCount;
    }

    public final Long component4() {
        return this.sessionDuration;
    }

    public final OptionalHeaders copy(String str, String str2, Integer num, Long l) {
        return new OptionalHeaders(str, str2, num, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalHeaders)) {
            return false;
        }
        OptionalHeaders optionalHeaders = (OptionalHeaders) obj;
        return sq8.m48644c(this.cacheKey, optionalHeaders.cacheKey) && sq8.m48644c(this.rywToken, optionalHeaders.rywToken) && sq8.m48644c(this.retryCount, optionalHeaders.retryCount) && sq8.m48644c(this.sessionDuration, optionalHeaders.sessionDuration);
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    public int hashCode() {
        String str = this.cacheKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rywToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.retryCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.sessionDuration;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "OptionalHeaders(cacheKey=" + this.cacheKey + ", rywToken=" + this.rywToken + ", retryCount=" + this.retryCount + ", sessionDuration=" + this.sessionDuration + ')';
    }

    public OptionalHeaders(String str, String str2, Integer num, Long l) {
        this.cacheKey = str;
        this.rywToken = str2;
        this.retryCount = num;
        this.sessionDuration = l;
    }

    public /* synthetic */ OptionalHeaders(String str, String str2, Integer num, Long l, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l);
    }
}

package com.google.api.client.testing.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Clock;
import java.util.concurrent.atomic.AtomicLong;

@Beta
/* loaded from: classes3.dex */
public class FixedClock implements Clock {
    private AtomicLong currentTime;

    public FixedClock() {
        this(0L);
    }

    @Override // com.google.api.client.util.Clock
    public long currentTimeMillis() {
        return this.currentTime.get();
    }

    public FixedClock setTime(long j) {
        this.currentTime.set(j);
        return this;
    }

    public FixedClock(long j) {
        this.currentTime = new AtomicLong(j);
    }
}

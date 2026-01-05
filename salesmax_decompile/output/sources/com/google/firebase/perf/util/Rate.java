package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class Rate {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long numTimeUnits;
    private long numTokensPerTotalTimeUnit;
    private TimeUnit timeUnit;

    /* renamed from: com.google.firebase.perf.util.Rate$1 */
    public static /* synthetic */ class C114411 {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Rate(long j, long j2, TimeUnit timeUnit) {
        this.numTokensPerTotalTimeUnit = j;
        this.numTimeUnits = j2;
        this.timeUnit = timeUnit;
    }

    public double getTokensPerSeconds() {
        int i = C114411.$SwitchMap$java$util$concurrent$TimeUnit[this.timeUnit.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.numTokensPerTotalTimeUnit / this.timeUnit.toSeconds(this.numTimeUnits) : (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * TimeUnit.SECONDS.toMillis(1L) : (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * TimeUnit.SECONDS.toMicros(1L) : (this.numTokensPerTotalTimeUnit / this.numTimeUnits) * TimeUnit.SECONDS.toNanos(1L);
    }
}

package com.amazonaws.metrics;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class ByteThroughputHelper extends ByteThroughputProvider {
    private static final int REPORT_INTERVAL_SECS = 10;

    public ByteThroughputHelper(ThroughputMetricType throughputMetricType) {
        super(throughputMetricType);
    }

    @Override // com.amazonaws.metrics.ByteThroughputProvider
    public void increment(int i, long j) {
        super.increment(i, j);
    }

    public void reportMetrics() {
        if (getByteCount() > 0) {
            AwsSdkMetrics.getServiceMetricCollector().collectByteThroughput(this);
            reset();
        }
    }

    public long startTiming() {
        if (TimeUnit.NANOSECONDS.toSeconds(getDurationNano()) > 10) {
            reportMetrics();
        }
        return System.nanoTime();
    }
}

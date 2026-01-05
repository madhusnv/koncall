package com.google.firebase.perf.transport;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class RateLimiter {
    private final ConfigResolver configResolver;
    private final float fragmentBucketId;
    private boolean isLogcatEnabled;
    private RateLimiterImpl networkLimiter;
    private final float samplingBucketId;
    private RateLimiterImpl traceLimiter;

    public static class RateLimiterImpl {
        private long backgroundCapacity;
        private Rate backgroundRate;
        private long capacity;
        private final Clock clock;
        private long foregroundCapacity;
        private Rate foregroundRate;
        private final boolean isLogcatEnabled;
        private Timer lastTimeTokenReplenished;
        private Rate rate;
        private double tokenCount;
        private static final AndroidLogger logger = AndroidLogger.getInstance();
        private static final long MICROS_IN_A_SECOND = TimeUnit.SECONDS.toMicros(1);

        public RateLimiterImpl(Rate rate, long j, Clock clock, ConfigResolver configResolver, @ResourceType String str, boolean z) {
            this.clock = clock;
            this.capacity = j;
            this.rate = rate;
            this.tokenCount = j;
            this.lastTimeTokenReplenished = clock.getTime();
            setRateByReadingRemoteConfigValues(configResolver, str, z);
            this.isLogcatEnabled = z;
        }

        private static long getBlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getTraceEventCountBackground() : configResolver.getNetworkEventCountBackground();
        }

        private static long getBlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getRateLimitSec() : configResolver.getRateLimitSec();
        }

        private static long getFlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getTraceEventCountForeground() : configResolver.getNetworkEventCountForeground();
        }

        private static long getFlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getRateLimitSec() : configResolver.getRateLimitSec();
        }

        private void setRateByReadingRemoteConfigValues(ConfigResolver configResolver, @ResourceType String str, boolean z) {
            long flimitSec = getFlimitSec(configResolver, str);
            long flimitEvents = getFlimitEvents(configResolver, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Rate rate = new Rate(flimitEvents, flimitSec, timeUnit);
            this.foregroundRate = rate;
            this.foregroundCapacity = flimitEvents;
            if (z) {
                logger.debug("Foreground %s logging rate:%f, burst capacity:%d", str, rate, Long.valueOf(flimitEvents));
            }
            long blimitSec = getBlimitSec(configResolver, str);
            long blimitEvents = getBlimitEvents(configResolver, str);
            Rate rate2 = new Rate(blimitEvents, blimitSec, timeUnit);
            this.backgroundRate = rate2;
            this.backgroundCapacity = blimitEvents;
            if (z) {
                logger.debug("Background %s logging rate:%f, capacity:%d", str, rate2, Long.valueOf(blimitEvents));
            }
        }

        public synchronized void changeRate(boolean z) {
            this.rate = z ? this.foregroundRate : this.backgroundRate;
            this.capacity = z ? this.foregroundCapacity : this.backgroundCapacity;
        }

        public synchronized boolean check(PerfMetric perfMetric) {
            Timer time = this.clock.getTime();
            double durationMicros = (this.lastTimeTokenReplenished.getDurationMicros(time) * this.rate.getTokensPerSeconds()) / MICROS_IN_A_SECOND;
            if (durationMicros > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.tokenCount = Math.min(this.tokenCount + durationMicros, this.capacity);
                this.lastTimeTokenReplenished = time;
            }
            double d = this.tokenCount;
            if (d >= 1.0d) {
                this.tokenCount = d - 1.0d;
                return true;
            }
            if (this.isLogcatEnabled) {
                logger.warn("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }

        @VisibleForTesting
        public long getBackgroundCapacity() {
            return this.backgroundCapacity;
        }

        @VisibleForTesting
        public Rate getBackgroundRate() {
            return this.backgroundRate;
        }

        @VisibleForTesting
        public long getForegroundCapacity() {
            return this.foregroundCapacity;
        }

        @VisibleForTesting
        public Rate getForegroundRate() {
            return this.foregroundRate;
        }

        @VisibleForTesting
        public Rate getRate() {
            return this.rate;
        }

        @VisibleForTesting
        public void setRate(Rate rate) {
            this.rate = rate;
        }
    }

    public RateLimiter(Context context, Rate rate, long j) {
        this(rate, j, new Clock(), getSamplingBucketId(), getSamplingBucketId(), ConfigResolver.getInstance());
        this.isLogcatEnabled = Utils.isDebugLoggingEnabled(context);
    }

    @VisibleForTesting
    public static float getSamplingBucketId() {
        return new Random().nextFloat();
    }

    private boolean hasVerboseSessions(List<PerfSession> list) {
        return list.size() > 0 && list.get(0).getSessionVerbosityCount() > 0 && list.get(0).getSessionVerbosity(0) == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean isDeviceAllowedToSendFragmentScreenTraces() {
        return this.fragmentBucketId < this.configResolver.getFragmentSamplingRate();
    }

    private boolean isDeviceAllowedToSendNetworkEvents() {
        return this.samplingBucketId < this.configResolver.getNetworkRequestSamplingRate();
    }

    private boolean isDeviceAllowedToSendTraces() {
        return this.samplingBucketId < this.configResolver.getTraceSamplingRate();
    }

    public void changeRate(boolean z) {
        this.traceLimiter.changeRate(z);
        this.networkLimiter.changeRate(z);
    }

    @VisibleForTesting
    public boolean getIsDeviceAllowedToSendFragmentScreenTraces() {
        return isDeviceAllowedToSendFragmentScreenTraces();
    }

    @VisibleForTesting
    public boolean getIsDeviceAllowedToSendNetworkEvents() {
        return isDeviceAllowedToSendNetworkEvents();
    }

    @VisibleForTesting
    public boolean getIsDeviceAllowedToSendTraces() {
        return isDeviceAllowedToSendTraces();
    }

    public boolean isEventRateLimited(PerfMetric perfMetric) {
        if (!isRateLimitApplicable(perfMetric)) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            return !this.networkLimiter.check(perfMetric);
        }
        if (perfMetric.hasTraceMetric()) {
            return !this.traceLimiter.check(perfMetric);
        }
        return true;
    }

    public boolean isEventSampled(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !isDeviceAllowedToSendTraces() && !hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (!isFragmentScreenTrace(perfMetric) || isDeviceAllowedToSendFragmentScreenTraces() || hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return !perfMetric.hasNetworkRequestMetric() || isDeviceAllowedToSendNetworkEvents() || hasVerboseSessions(perfMetric.getNetworkRequestMetric().getPerfSessionsList());
        }
        return false;
    }

    public boolean isFragmentScreenTrace(PerfMetric perfMetric) {
        return perfMetric.hasTraceMetric() && perfMetric.getTraceMetric().getName().startsWith(Constants.SCREEN_TRACE_PREFIX) && perfMetric.getTraceMetric().containsCustomAttributes(Constants.ACTIVITY_ATTRIBUTE_KEY);
    }

    public boolean isRateLimitApplicable(PerfMetric perfMetric) {
        return (!perfMetric.hasTraceMetric() || (!(perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) || perfMetric.getTraceMetric().getCountersCount() <= 0)) && !perfMetric.hasGaugeMetric();
    }

    public RateLimiter(Rate rate, long j, Clock clock, float f, float f2, ConfigResolver configResolver) {
        this.traceLimiter = null;
        this.networkLimiter = null;
        boolean z = false;
        this.isLogcatEnabled = false;
        Utils.checkArgument(0.0f <= f && f < 1.0f, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        if (0.0f <= f2 && f2 < 1.0f) {
            z = true;
        }
        Utils.checkArgument(z, "Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        this.samplingBucketId = f;
        this.fragmentBucketId = f2;
        this.configResolver = configResolver;
        this.traceLimiter = new RateLimiterImpl(rate, j, clock, configResolver, ResourceType.TRACE, this.isLogcatEnabled);
        this.networkLimiter = new RateLimiterImpl(rate, j, clock, configResolver, ResourceType.NETWORK, this.isLogcatEnabled);
    }
}

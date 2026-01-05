package com.google.firebase.perf.application;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.util.Optional;
import java.util.HashMap;
import java.util.Map;
import p001o.vj7;

/* loaded from: classes6.dex */
public class FrameMetricsRecorder {
    private static final String FRAME_METRICS_AGGREGATOR_CLASSNAME = "androidx.core.app.FrameMetricsAggregator";
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Activity activity;
    private final Map<Fragment, FrameMetricsCalculator.PerfFrameMetrics> fragmentSnapshotMap;
    private final vj7 frameMetricsAggregator;
    private boolean isRecording;

    public FrameMetricsRecorder(Activity activity) {
        this(activity, new vj7(), new HashMap());
    }

    public static boolean isFrameMetricsRecordingSupported() {
        return true;
    }

    private Optional<FrameMetricsCalculator.PerfFrameMetrics> snapshot() {
        if (!this.isRecording) {
            logger.debug("No recording has been started.");
            return Optional.absent();
        }
        SparseIntArray[] sparseIntArrayArrM52882b = this.frameMetricsAggregator.m52882b();
        if (sparseIntArrayArrM52882b == null) {
            logger.debug("FrameMetricsAggregator.mMetrics is uninitialized.");
            return Optional.absent();
        }
        if (sparseIntArrayArrM52882b[0] != null) {
            return Optional.of(FrameMetricsCalculator.calculateFrameMetrics(sparseIntArrayArrM52882b));
        }
        logger.debug("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return Optional.absent();
    }

    public void start() {
        if (this.isRecording) {
            logger.debug("FrameMetricsAggregator is already recording %s", this.activity.getClass().getSimpleName());
        } else {
            this.frameMetricsAggregator.m52881a(this.activity);
            this.isRecording = true;
        }
    }

    public void startFragment(Fragment fragment) {
        if (!this.isRecording) {
            logger.debug("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.fragmentSnapshotMap.containsKey(fragment)) {
            logger.debug("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalSnapshot = snapshot();
        if (optionalSnapshot.isAvailable()) {
            this.fragmentSnapshotMap.put(fragment, optionalSnapshot.get());
        } else {
            logger.debug("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public Optional<FrameMetricsCalculator.PerfFrameMetrics> stop() {
        if (!this.isRecording) {
            logger.debug("Cannot stop because no recording was started");
            return Optional.absent();
        }
        if (!this.fragmentSnapshotMap.isEmpty()) {
            logger.debug("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.fragmentSnapshotMap.clear();
        }
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalSnapshot = snapshot();
        try {
            this.frameMetricsAggregator.m52883c(this.activity);
            this.frameMetricsAggregator.m52884d();
            this.isRecording = false;
            return optionalSnapshot;
        } catch (IllegalArgumentException e) {
            logger.warn("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
            return Optional.absent();
        }
    }

    public Optional<FrameMetricsCalculator.PerfFrameMetrics> stopFragment(Fragment fragment) {
        if (!this.isRecording) {
            logger.debug("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return Optional.absent();
        }
        if (!this.fragmentSnapshotMap.containsKey(fragment)) {
            logger.debug("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return Optional.absent();
        }
        FrameMetricsCalculator.PerfFrameMetrics perfFrameMetricsRemove = this.fragmentSnapshotMap.remove(fragment);
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalSnapshot = snapshot();
        if (optionalSnapshot.isAvailable()) {
            return Optional.of(optionalSnapshot.get().deltaFrameMetricsFromSnapshot(perfFrameMetricsRemove));
        }
        logger.debug("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return Optional.absent();
    }

    @VisibleForTesting
    public FrameMetricsRecorder(Activity activity, vj7 vj7Var, Map<Fragment, FrameMetricsCalculator.PerfFrameMetrics> map) {
        this.isRecording = false;
        this.activity = activity;
        this.frameMetricsAggregator = vj7Var;
        this.fragmentSnapshotMap = map;
    }
}

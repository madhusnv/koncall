package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import i0.h2;
import i0.r2;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter */
/* loaded from: classes.dex */
class C0226xa6b766a6 implements SessionProcessorImpl.CaptureCallback {
    private final h2 mCaptureCallback;
    private final AdvancedSessionProcessor$ExtensionMetadataMonitor mExtensionMetadataMonitor;
    private long mOnCaptureStartedTimestamp;
    private final r2 mTagBundle;
    private boolean mWillReceiveOnCaptureCompleted;

    public C0226xa6b766a6(h2 h2Var, r2 r2Var, boolean z6) {
        this(h2Var, r2Var, null, z6);
    }

    public void onCaptureCompleted(long j6, int i10, Map<CaptureResult.Key, Object> map) {
        AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor = this.mExtensionMetadataMonitor;
        if (advancedSessionProcessor$ExtensionMetadataMonitor != null) {
            advancedSessionProcessor$ExtensionMetadataMonitor.checkExtensionMetadata(map);
        }
        if (this.mWillReceiveOnCaptureCompleted) {
            this.mCaptureCallback.getClass();
            this.mCaptureCallback.getClass();
        }
    }

    public void onCaptureFailed(int i10) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureProcessProgressed(int i10) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureProcessStarted(int i10) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureSequenceAborted(int i10) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureSequenceCompleted(int i10) {
        if (this.mWillReceiveOnCaptureCompleted) {
            return;
        }
        h2 h2Var = this.mCaptureCallback;
        Map map = Collections.EMPTY_MAP;
        h2Var.getClass();
        this.mCaptureCallback.getClass();
    }

    public void onCaptureStarted(int i10, long j6) {
        this.mOnCaptureStartedTimestamp = j6;
        this.mCaptureCallback.getClass();
    }

    public C0226xa6b766a6(h2 h2Var, r2 r2Var, AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor, boolean z6) {
        this.mOnCaptureStartedTimestamp = -1L;
        this.mCaptureCallback = h2Var;
        this.mTagBundle = r2Var;
        this.mExtensionMetadataMonitor = advancedSessionProcessor$ExtensionMetadataMonitor;
        this.mWillReceiveOnCaptureCompleted = z6;
    }
}

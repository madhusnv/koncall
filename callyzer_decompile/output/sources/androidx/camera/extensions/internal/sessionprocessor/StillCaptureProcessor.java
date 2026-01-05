package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import i0.p1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import og.u1;
import og.y0;
import pg.t8;
import v0.AbstractC7621e;
import v0.C7617a;
import v0.C7618b;
import x0.C8250a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    C8250a mCaptureOutputSurface;
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;
    final C0231b mCaptureResultImageMatcher = new C0231b();
    final Object mLock = new Object();
    HashMap<Integer, Pair<InterfaceC0232c, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface OnCaptureResultCallback {
        void onCaptureCompleted(long j6, List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i10);

        void onError(Exception exc);

        void onProcessCompleted();
    }

    public StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, p1 p1Var, boolean z6) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        C8250a c8250a = new C8250a(surface, size, z6);
        this.mCaptureOutputSurface = c8250a;
        captureProcessorImpl.onOutputSurface(c8250a.f39400e, 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = false;
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public /* synthetic */ void lambda$process$1(boolean z6, HashMap map, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                    } catch (Exception e2) {
                        u1.m10944c(TAG);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e2);
                        }
                        u1.m10942a(TAG);
                        OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback2 != null) {
                            onCaptureResultCallback2.onProcessCompleted();
                        }
                    }
                    if (this.mIsClosed) {
                        u1.m10942a(TAG);
                        u1.m10942a(TAG);
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                        return;
                    }
                    u1.m10942a(TAG);
                    C7617a c7617a = C7617a.f36767f;
                    if (AbstractC7621e.m14507c(c7617a) && C7618b.m14504a(c7617a) && z6 && this.mIsPostviewConfigured) {
                        this.mCaptureProcessorImpl.processWithPostview(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                            public void onCaptureCompleted(long j6, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j6, list);
                            }

                            public void onCaptureProcessProgressed(int i10) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i10);
                            }
                        }, t8.m11872a());
                    } else {
                        C7617a c7617a2 = C7617a.f36766e;
                        if (AbstractC7621e.m14507c(c7617a2) && C7618b.m14504a(c7617a2)) {
                            this.mCaptureProcessorImpl.process(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                public void onCaptureCompleted(long j6, List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j6, list);
                                }

                                public void onCaptureProcessProgressed(int i10) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i10);
                                }
                            }, t8.m11872a());
                        } else {
                            this.mCaptureProcessorImpl.process(map);
                        }
                    }
                    u1.m10942a(TAG);
                    OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback4 != null) {
                        onCaptureResultCallback4.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                } catch (Throwable th2) {
                    u1.m10942a(TAG);
                    OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback5 != null) {
                        onCaptureResultCallback5.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private /* synthetic */ void lambda$startCapture$0(List list, OnCaptureResultCallback onCaptureResultCallback, boolean z6, InterfaceC0232c interfaceC0232c, TotalCaptureResult totalCaptureResult, int i10) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    interfaceC0232c.m620a();
                    u1.m10942a(TAG);
                    return;
                }
                u1.m10942a(TAG);
                this.mCaptureResults.put(Integer.valueOf(i10), new Pair<>(interfaceC0232c, totalCaptureResult));
                Objects.toString(this.mCaptureResults.keySet());
                u1.m10942a(TAG);
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    process(this.mCaptureResults, onCaptureResultCallback, z6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<InterfaceC0232c, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                if (it.hasNext()) {
                    if (it.next().first != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
                this.mCaptureResults.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            u1.m10942a(TAG);
            this.mIsClosed = true;
            clearCaptureResults();
            synchronized (this.mCaptureResultImageMatcher.f1862a) {
            }
            this.mCaptureResultImageMatcher.m617b();
            C8250a c8250a = this.mCaptureOutputSurface;
            synchronized (c8250a.f39396a) {
                try {
                    c8250a.f39399d = true;
                    if (Build.VERSION.SDK_INT >= 29 && c8250a.f39401f) {
                        c8250a.f39398c.mo1881k();
                        c8250a.f39398c.close();
                        c8250a.f39397b.close();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i10) {
        Long l9;
        this.mCaptureResultImageMatcher.m616a(totalCaptureResult, i10);
        if (this.mTimeStampForOutputImage == -1 && (l9 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long jLongValue = l9.longValue();
            this.mTimeStampForOutputImage = jLongValue;
            C8250a c8250a = this.mCaptureOutputSurface;
            if (c8250a.f39402g) {
                c8250a.f39403h = jLongValue;
            }
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void notifyImage(InterfaceC0232c interfaceC0232c) {
        this.mCaptureResultImageMatcher.m618c();
        throw null;
    }

    public void process(Map<Integer, Pair<InterfaceC0232c, TotalCaptureResult>> map, final OnCaptureResultCallback onCaptureResultCallback, final boolean z6) {
        final HashMap map2 = new HashMap();
        synchronized (this.mLock) {
            Iterator<Integer> it = map.keySet().iterator();
            if (it.hasNext()) {
                if (map.get(it.next()).first != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        }
        t8.m11874c().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f1866a.lambda$process$1(z6, map2, onCaptureResultCallback);
            }
        });
    }

    public void startCapture(boolean z6, List<Integer> list, OnCaptureResultCallback onCaptureResultCallback) {
        u1.m10942a(TAG);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            y0.m11056f("StillCaptureProcessor is closed. Can't invoke startCapture()", !this.mIsClosed);
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.m617b();
        synchronized (this.mCaptureResultImageMatcher.f1862a) {
        }
    }
}

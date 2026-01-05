package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import java.util.List;
import og.u1;
import pg.t8;
import v0.AbstractC7621e;
import v0.C7617a;
import v0.C7618b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    private final PreviewImageProcessorImpl mPreviewImageProcessor;
    private final C0231b mCaptureResultImageMatcher = new C0231b();
    private final Object mLock = new Object();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface OnCaptureResultCallback {
        void onCaptureResult(long j6, List<Pair<CaptureResult.Key, Object>> list);
    }

    public PreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl, Surface surface, Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    private /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, InterfaceC0232c interfaceC0232c, TotalCaptureResult totalCaptureResult, int i10) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    interfaceC0232c.m620a();
                    u1.m10942a(TAG);
                    return;
                }
                try {
                    C7617a c7617a = C7617a.f36766e;
                    if (C7618b.m14504a(c7617a) && AbstractC7621e.m14507c(c7617a)) {
                        this.mPreviewImageProcessor.process(interfaceC0232c.get(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                            public void onCaptureCompleted(long j6, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureResult(j6, list);
                            }

                            public void onCaptureProcessProgressed(int i11) {
                            }
                        }, t8.m11874c());
                    } else {
                        this.mPreviewImageProcessor.process(interfaceC0232c.get(), totalCaptureResult);
                    }
                    interfaceC0232c.m620a();
                } catch (Throwable th2) {
                    interfaceC0232c.m620a();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.m617b();
            synchronized (this.mCaptureResultImageMatcher.f1862a) {
            }
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.m616a(totalCaptureResult, 0);
    }

    public void notifyImage(InterfaceC0232c interfaceC0232c) {
        this.mCaptureResultImageMatcher.m618c();
        throw null;
    }

    public void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    public void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    public void start(OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mCaptureResultImageMatcher.f1862a) {
        }
    }
}

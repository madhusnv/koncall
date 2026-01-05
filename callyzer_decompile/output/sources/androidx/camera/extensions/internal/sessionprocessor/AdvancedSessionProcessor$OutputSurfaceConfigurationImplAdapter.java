package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import i0.q1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter implements OutputSurfaceConfigurationImpl {
    private final OutputSurfaceImpl mAnalysisOutputSurface;
    private final OutputSurfaceImpl mCaptureOutputSurface;
    private final OutputSurfaceImpl mPostviewOutputSurface;
    private final OutputSurfaceImpl mPreviewOutputSurface;

    public AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter(q1 q1Var) {
        throw null;
    }

    public OutputSurfaceImpl getImageAnalysisOutputSurface() {
        return this.mAnalysisOutputSurface;
    }

    public OutputSurfaceImpl getImageCaptureOutputSurface() {
        return this.mCaptureOutputSurface;
    }

    public OutputSurfaceImpl getPostviewOutputSurface() {
        return this.mPostviewOutputSurface;
    }

    public OutputSurfaceImpl getPreviewOutputSurface() {
        return this.mPreviewOutputSurface;
    }
}

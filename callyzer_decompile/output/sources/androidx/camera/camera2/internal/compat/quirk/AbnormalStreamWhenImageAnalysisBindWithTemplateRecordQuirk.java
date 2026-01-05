package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    /* renamed from: a */
    public final boolean mo595a() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && Build.DEVICE.equalsIgnoreCase("m55xq");
    }
}

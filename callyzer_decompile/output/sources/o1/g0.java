package o1;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import eb.i3;
import java.util.ArrayList;
import p023y.AbstractC8523a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public final boolean f25733a;

    /* renamed from: b */
    public final boolean f25734b;

    public g0(boolean z6, boolean z10) {
        this.f25733a = z6;
        this.f25734b = z10;
    }

    public g0(i3 i3Var, int i10) {
        switch (i10) {
            case 2:
                ArrayList arrayListM5730h = i3Var.m5730h(CaptureIntentPreviewQuirk.class);
                int size = arrayListM5730h.size();
                boolean z6 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        Object obj = arrayListM5730h.get(i11);
                        i11++;
                        if (((CaptureIntentPreviewQuirk) obj).mo595a()) {
                            z6 = true;
                        }
                    }
                }
                this.f25733a = z6;
                this.f25734b = i3Var.m5728f(ImageCaptureFailedForVideoSnapshotQuirk.class);
                break;
            default:
                this.f25733a = i3Var.m5728f(ImageCaptureFailWithAutoFlashQuirk.class);
                this.f25734b = AbstractC8523a.f41447a.m5729g(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
                break;
        }
    }
}

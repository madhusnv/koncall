package p001o;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;

/* loaded from: classes2.dex */
public class p31 {

    /* renamed from: a */
    public final boolean f39274a;

    /* renamed from: b */
    public final boolean f39275b;

    public p31(l5e l5eVar) {
        this.f39274a = l5eVar.m36593a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f39275b = zq5.m59712b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    /* renamed from: a */
    public int m42937a(int i) {
        if ((this.f39274a || this.f39275b) && i == 2) {
            return 1;
        }
        return i;
    }
}

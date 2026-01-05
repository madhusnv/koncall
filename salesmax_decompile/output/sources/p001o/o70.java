package p001o;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import p001o.d72;
import p001o.mq3;

/* loaded from: classes2.dex */
public class o70 {

    /* renamed from: a */
    public final Range f37841a;

    public o70(l5e l5eVar) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) l5eVar.m36594b(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f37841a = null;
        } else {
            this.f37841a = aeFpsRangeLegacyQuirk.m4523d();
        }
    }

    /* renamed from: a */
    public void m41655a(d72.C12801a c12801a) {
        Range range = this.f37841a;
        if (range != null) {
            c12801a.m22396g(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, mq3.EnumC15404c.REQUIRED);
        }
    }
}

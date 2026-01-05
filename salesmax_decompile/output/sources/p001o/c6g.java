package p001o;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class c6g {

    /* renamed from: a */
    public final boolean f17414a;

    public c6g() {
        this.f17414a = ((StillCaptureFlashStopRepeatingQuirk) zq5.m59712b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    /* renamed from: a */
    public boolean m20349a(List list, boolean z) {
        if (this.f17414a && z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}

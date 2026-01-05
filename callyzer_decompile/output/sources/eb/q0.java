package eb;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import be.C0655j;
import he.C2916g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import ke.InterfaceC4068i;
import n0.AbstractC4940a;
import p019u.C7286a;
import p023y.AbstractC8523a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 implements InterfaceC4068i {

    /* renamed from: a */
    public boolean f9420a;

    public q0(boolean z6) {
        this.f9420a = z6;
    }

    /* renamed from: c */
    public static i0.q0 m5734c(i0.q0 q0Var) {
        C0655j c0655j = new C0655j();
        c0655j.f4191a = q0Var.f16567c;
        Iterator it = Collections.unmodifiableList(q0Var.f16565a).iterator();
        while (it.hasNext()) {
            ((HashSet) c0655j.f4193c).add((i0.v0) it.next());
        }
        c0655j.m1875e(q0Var.f16566b);
        i0.j1 j1VarM7349b = i0.j1.m7349b();
        j1VarM7349b.m7352n(C7286a.g0(CaptureRequest.FLASH_MODE), 0);
        c0655j.m1875e(new C7286a(3, i0.o1.m7399a(j1VarM7349b)));
        return c0655j.m1876f();
    }

    @Override // ke.InterfaceC4068i
    /* renamed from: a */
    public boolean mo5735a(C2916g c2916g) {
        return this.f9420a;
    }

    @Override // ke.InterfaceC4068i
    /* renamed from: b */
    public boolean mo5736b() {
        return this.f9420a;
    }

    /* renamed from: d */
    public boolean m5737d(ArrayList arrayList, boolean z6) {
        if (this.f9420a && z6) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Integer num = (Integer) ((CaptureRequest) obj).get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean m5738e(ArrayList arrayList, boolean z6) {
        if (this.f9420a && z6) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                int iIntValue = ((Integer) ((CaptureRequest) obj).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public q0(int i10) {
        switch (i10) {
            case 4:
                this.f9420a = ((StillCaptureFlashStopRepeatingQuirk) AbstractC8523a.f41447a.m5729g(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
            case 5:
                this.f9420a = AbstractC8523a.f41447a.m5729g(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
            default:
                this.f9420a = AbstractC4940a.f24615a.m5729g(SurfaceOrderQuirk.class) != null;
                break;
        }
    }
}

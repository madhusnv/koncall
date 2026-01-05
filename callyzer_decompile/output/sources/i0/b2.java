package i0;

import a9.C0073l;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import b0.C0515g;
import be.C0655j;
import java.util.ArrayList;
import java.util.HashSet;
import m0.InterfaceC4617k;
import p019u.C7286a;
import p020v.C7615y;
import p023y.AbstractC8523a;
import p024z.AbstractC8833b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b2 extends a2 {
    /* renamed from: e */
    public static b2 m7301e(w2 w2Var, Size size) {
        if (((p020v.d0) w2Var.mo7401e(w2.f44345u0, null)) == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + ((String) w2Var.mo7401e(InterfaceC4617k.M0, w2Var.toString())));
        }
        b2 b2Var = new b2();
        g2 g2Var = (g2) w2Var.mo7401e(w2.f44343r0, null);
        o1 o1Var = o1.f16549c;
        int i10 = g2.m7340a().f16473g.f16567c;
        if (g2Var != null) {
            i10 = g2Var.f16473g.f16567c;
            for (CameraDevice.StateCallback stateCallback : g2Var.f16469c) {
                ArrayList arrayList = b2Var.f16426c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : g2Var.f16470d) {
                ArrayList arrayList2 = b2Var.f16427d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            b2Var.f16425b.m1873c(g2Var.f16473g.f16568d);
            o1Var = g2Var.f16473g.f16566b;
        }
        C0655j c0655j = b2Var.f16425b;
        c0655j.getClass();
        c0655j.f4194d = j1.m7350g(o1Var);
        if (w2Var instanceof r1) {
            Rational rational = AbstractC8833b.f42534a;
            if (((PreviewPixelHDRnetQuirk) AbstractC8523a.f41447a.m5729g(PreviewPixelHDRnetQuirk.class)) != null && !AbstractC8833b.f42534a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                j1 j1VarM7349b = j1.m7349b();
                j1VarM7349b.m7352n(C7286a.g0(CaptureRequest.TONEMAP_MODE), 2);
                b2Var.f16425b.m1875e(new C7286a(3, o1.m7399a(j1VarM7349b)));
            }
        }
        b2Var.f16425b.f4191a = ((Integer) w2Var.mo7401e(C7286a.f34752c, Integer.valueOf(i10))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) w2Var.mo7401e(C7286a.f34754e, new p020v.i0());
        ArrayList arrayList3 = b2Var.f16426c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) w2Var.mo7401e(C7286a.f34755f, new p020v.g0());
        ArrayList arrayList4 = b2Var.f16427d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        b2Var.m7302a(new p020v.k0((CameraCaptureSession.CaptureCallback) w2Var.mo7401e(C7286a.f34756g, new C7615y())));
        C3076g c3076g = w2.E0;
        Integer num = (Integer) w2Var.mo7401e(c3076g, 0);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            C0655j c0655j2 = b2Var.f16425b;
            c0655j2.getClass();
            if (iIntValue != 0) {
                ((j1) c0655j2.f4194d).m7352n(c3076g, num);
            }
        }
        int iM7422P = w2Var.m7422P();
        if (iM7422P != 0) {
            C0655j c0655j3 = b2Var.f16425b;
            c0655j3.getClass();
            if (iM7422P != 0) {
                ((j1) c0655j3.f4194d).m7352n(w2.D0, Integer.valueOf(iM7422P));
            }
        }
        j1 j1VarM7349b2 = j1.m7349b();
        C3076g c3076g2 = C7286a.f34757h;
        j1VarM7349b2.m7352n(c3076g2, (String) w2Var.mo7401e(c3076g2, null));
        C3076g c3076g3 = C7286a.f34753d;
        Long l9 = (Long) w2Var.mo7401e(c3076g3, -1L);
        l9.getClass();
        j1VarM7349b2.m7352n(c3076g3, l9);
        b2Var.f16425b.m1875e(j1VarM7349b2);
        b2Var.f16425b.m1875e(C0515g.m1512d(w2Var).m1515c());
        return b2Var;
    }

    /* renamed from: a */
    public final void m7302a(AbstractC3084o abstractC3084o) {
        this.f16425b.m1874d(abstractC3084o);
        ArrayList arrayList = this.f16428e;
        if (arrayList.contains(abstractC3084o)) {
            return;
        }
        arrayList.add(abstractC3084o);
    }

    /* renamed from: b */
    public final void m7303b(s0 s0Var) {
        this.f16425b.m1875e(s0Var);
    }

    /* renamed from: c */
    public final void m7304c(v0 v0Var, c0.a0 a0Var, int i10) {
        C0073l c0073lM7353a = C3080k.m7353a(v0Var);
        if (a0Var == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        c0073lM7353a.f268e = a0Var;
        c0073lM7353a.f266c = Integer.valueOf(i10);
        this.f16424a.add(c0073lM7353a.m219k());
        ((HashSet) this.f16425b.f4193c).add(v0Var);
    }

    /* renamed from: d */
    public final g2 m7305d() {
        return new g2(new ArrayList(this.f16424a), new ArrayList(this.f16426c), new ArrayList(this.f16427d), new ArrayList(this.f16428e), this.f16425b.m1876f(), this.f16429f, this.f16430g, this.f16431h, this.f16432i);
    }
}

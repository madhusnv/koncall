package p020v;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import b0.C0515g;
import be.C0655j;
import i0.C3076g;
import i0.j1;
import i0.l1;
import i0.o1;
import i0.q0;
import i0.r2;
import i0.w2;
import java.util.ArrayList;
import java.util.HashSet;
import p019u.C7286a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.z */
/* loaded from: classes.dex */
public class C7616z {

    /* renamed from: a */
    public static final C7616z f36762a = new C7616z();

    /* renamed from: a */
    public void mo14433a(w2 w2Var, C0655j c0655j) {
        q0 q0Var = (q0) w2Var.mo7401e(w2.f44344s0, null);
        o1 o1Var = o1.f16549c;
        C3076g c3076g = q0.f16562h;
        HashSet hashSet = new HashSet();
        j1 j1VarM7349b = j1.m7349b();
        ArrayList arrayList = new ArrayList();
        l1 l1VarM7361a = l1.m7361a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        o1 o1VarM7399a = o1.m7399a(j1VarM7349b);
        ArrayList arrayList3 = new ArrayList(arrayList);
        r2 r2Var = r2.f16576b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = l1VarM7361a.f16577a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        int i10 = -1;
        new q0(arrayList2, o1VarM7399a, -1, arrayList3, false, new r2(arrayMap), null);
        if (q0Var != null) {
            i10 = q0Var.f16567c;
            c0655j.m1873c(q0Var.f16568d);
            o1Var = q0Var.f16566b;
        }
        c0655j.f4194d = j1.m7350g(o1Var);
        c0655j.f4191a = ((Integer) w2Var.mo7401e(C7286a.f34752c, Integer.valueOf(i10))).intValue();
        c0655j.m1874d(new k0((CameraCaptureSession.CaptureCallback) w2Var.mo7401e(C7286a.f34756g, new C7615y())));
        c0655j.m1875e(C0515g.m1512d(w2Var).m1515c());
    }
}

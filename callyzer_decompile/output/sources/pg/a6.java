package pg;

import android.hardware.camera2.CameraDevice;
import ay.C0496f;
import ay.ExecutorC0495e;
import i9.AbstractC3194l;
import i9.C3196n;
import i9.C3202t;
import java.util.ArrayList;
import ud.C7416t;
import ud.InterfaceC7411o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a6 {
    /* renamed from: a */
    public static CameraDevice.StateCallback m11533a(ArrayList arrayList) {
        return arrayList.isEmpty() ? new p020v.i0() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new p020v.h0(arrayList);
    }

    /* renamed from: b */
    public static Object m11534b(String str, InterfaceC7411o interfaceC7411o, long j6, long j10, C3202t c3202t) {
        ArrayList arrayList = new ArrayList();
        if (AbstractC3194l.f17200a[((C7416t) interfaceC7411o).m13807b().f35195a.ordinal()] == 1) {
            arrayList.add("cmd.exe");
            arrayList.add("/C");
        } else {
            arrayList.add("sh");
            arrayList.add("-c");
        }
        arrayList.add(str);
        C0496f c0496f = tx.m0.f34659a;
        return tx.c0.m13475K(ExecutorC0495e.f3538c, new C3196n(arrayList, j10, j6, null), c3202t);
    }
}

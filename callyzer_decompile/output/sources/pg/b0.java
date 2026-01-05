package pg;

import a0.C0001a;
import android.util.Range;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import c0.C0833z;
import c9.C0908c;
import c9.C0914i;
import e0.C1894c;
import i0.C3072c;
import i0.C3073d;
import i0.InterfaceC3094y;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import m0.C4608b;
import m0.C4612f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a */
    public static C0914i f28793a;

    /* renamed from: b */
    public static final /* synthetic */ int f28794b = 0;

    /* renamed from: a */
    public static final void m11543a(i0.e0 e0Var, c0.d1 d1Var, C1894c c1894c) {
        C4608b c4608bM9493s;
        C0914i c0914i = f28793a;
        if (c0914i == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        String strMo7323e = e0Var.mo7323e();
        AbstractC4154l.m8922e(strMo7323e, "getCameraId(...)");
        i0.g0 g0VarM7358b = ((i0.l0) c0914i.f5585a).m7358b(strMo7323e);
        C3072c c3072c = new C3072c(g0VarM7358b.mo7319q(), i0.b0.f16434a);
        C0833z c0833z = C0833z.f5289d;
        C4612f c4612f = new C4612f(g0VarM7358b, null, c3072c, null, c0833z, c0833z, (C0001a) c0914i.f5586b, (C0908c) c0914i.f5588d, (i0.z2) c0914i.f5587c);
        synchronized (c4612f.f22844l) {
        }
        List list = (List) d1Var.f5067b;
        synchronized (c4612f.f22844l) {
            c4612f.f22841h = list;
        }
        synchronized (c4612f.f22844l) {
        }
        Range range = (Range) d1Var.f5070e;
        synchronized (c4612f.f22844l) {
            c4612f.f22842j = range;
        }
        List list2 = (List) d1Var.f5069d;
        Objects.toString(list2);
        Objects.toString(c1894c);
        og.u1.m10942a("CameraUseCaseAdapter");
        synchronized (c4612f.f22844l) {
            C3073d c3073d = c4612f.f22834a;
            InterfaceC3094y interfaceC3094y = c4612f.f22843k;
            c3073d.mo7316n(interfaceC3094y);
            C3073d c3073d2 = c4612f.f22835b;
            if (c3073d2 != null) {
                c3073d2.mo7316n(interfaceC3094y);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(c4612f.f22838e);
            linkedHashSet.addAll(list2);
            HashMap mapM9484g = C4612f.m9484g(linkedHashSet, c1894c);
            try {
                try {
                    c4608bM9493s = c4612f.m9493s(linkedHashSet, c4612f.f22835b != null);
                    C4612f.m9482D(mapM9484g);
                } catch (IllegalArgumentException e2) {
                    throw new CameraUseCaseAdapter$CameraException(e2);
                }
            } catch (Throwable th2) {
                C4612f.m9482D(mapM9484g);
                throw th2;
            }
        }
        AbstractC4154l.m8922e(c4608bM9493s, "simulateAddUseCases(...)");
    }
}

package o0;

import android.media.MediaCodec;
import c0.k1;
import eb.q0;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import i0.C3080k;
import java.util.Comparator;
import pg.AbstractC5939t;
import u0.C7294d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C5241a implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f25686a;

    /* renamed from: b */
    public final /* synthetic */ Object f25687b;

    public /* synthetic */ C5241a(int i10, Object obj) {
        this.f25686a = i10;
        this.f25687b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f25686a) {
            case 0:
                C3080k c3080k = (C3080k) obj2;
                ((q0) this.f25687b).getClass();
                Class cls = ((C3080k) obj).f16501a.f16609j;
                int i10 = 0;
                int i11 = cls == MediaCodec.class ? 2 : (cls == k1.class || cls == C7294d.class) ? 0 : 1;
                Class cls2 = c3080k.f16501a.f16609j;
                if (cls2 == MediaCodec.class) {
                    i10 = 2;
                } else if (cls2 != k1.class && cls2 != C7294d.class) {
                    i10 = 1;
                }
                return i11 - i10;
            case 1:
                for (InterfaceC2139c interfaceC2139c : (InterfaceC2139c[]) this.f25687b) {
                    int iM11866a = AbstractC5939t.m11866a((Comparable) interfaceC2139c.invoke(obj), (Comparable) interfaceC2139c.invoke(obj2));
                    if (iM11866a != 0) {
                        return iM11866a;
                    }
                }
                return 0;
            default:
                return ((Number) ((InterfaceC2141e) this.f25687b).invoke(obj, obj2)).intValue();
        }
    }
}

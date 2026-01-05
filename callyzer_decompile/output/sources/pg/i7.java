package pg;

import kz.AbstractC4297c;
import x4.C8299i;
import x4.C8302l;
import x4.C8304n;
import x4.InterfaceC8300j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i7 {
    /* renamed from: a */
    public static iz.h0 m11696a(int i10, byte[] bArr) {
        AbstractC4297c.m8997a(bArr.length, 0, i10);
        return new iz.h0(i10, bArr);
    }

    /* renamed from: b */
    public static C8302l m11697b(InterfaceC8300j interfaceC8300j) {
        C8299i c8299i = new C8299i();
        c8299i.f39846c = new C8304n();
        C8302l c8302l = new C8302l(c8299i);
        c8299i.f39845b = c8302l;
        c8299i.f39844a = interfaceC8300j.getClass();
        try {
            Object objMo15I = interfaceC8300j.mo15I(c8299i);
            if (objMo15I == null) {
                return c8302l;
            }
            c8299i.f39844a = objMo15I;
            return c8302l;
        } catch (Exception e2) {
            c8302l.f39850b.mo15505k(e2);
            return c8302l;
        }
    }
}

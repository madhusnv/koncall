package zb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zb.f */
/* loaded from: classes.dex */
public abstract class AbstractC8912f {

    /* renamed from: b */
    public static final C8910d f42879b = new C8910d();

    /* renamed from: a */
    public final int f42880a;

    public AbstractC8912f(int i10) {
        this.f42880a = i10;
    }

    /* renamed from: a */
    public final boolean m16406a(AbstractC8912f mode) {
        AbstractC4154l.m8923f(mode, "mode");
        int i10 = mode.f42880a;
        return (this.f42880a & i10) == i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC8912f) {
            return this.f42880a == ((AbstractC8912f) obj).f42880a;
        }
        return false;
    }

    public String toString() {
        List listM10834i = pe.m10834i(C8911e.f42874e, C8911e.f42875f, C8911e.f42876g, C8911e.f42877h);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM10834i) {
            if (m16406a((AbstractC8912f) obj)) {
                arrayList.add(obj);
            }
        }
        return AbstractC6663m.m12748L(arrayList, "|", null, null, null, 62);
    }
}

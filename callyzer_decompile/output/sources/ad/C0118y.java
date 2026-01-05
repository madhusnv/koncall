package ad;

import ac.C0088a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import ng.C5070u;
import og.df;
import rw.AbstractC6663m;
import sd.C6813g;
import sd.InterfaceC6811e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.y */
/* loaded from: classes.dex */
public final class C0118y {

    /* renamed from: c */
    public static final /* synthetic */ int f392c = 0;

    /* renamed from: a */
    public final List f393a;

    /* renamed from: b */
    public final boolean f394b;

    static {
        ArrayList arrayList = new ArrayList();
        C0115v c0115v = C0115v.f389a;
        C6813g c6813g = C6813g.f32359i;
        df.m10612b(arrayList, c0115v, new C0088a(1, c6813g, InterfaceC6811e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 7));
        df.m10612b(arrayList, C0116w.f390a, new C0088a(1, c6813g, InterfaceC6811e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 8));
        AbstractC6663m.c0(arrayList);
    }

    public C0118y(List list, boolean z6) {
        this.f393a = list;
        this.f394b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0118y.class != obj.getClass()) {
            return false;
        }
        C0118y c0118y = (C0118y) obj;
        return AbstractC4154l.m8918a(this.f393a, c0118y.f393a) && this.f394b == c0118y.f394b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f394b) + (this.f393a.hashCode() * 31);
    }

    public final String toString() {
        return C5070u.m9998f(this.f393a, this.f394b);
    }
}

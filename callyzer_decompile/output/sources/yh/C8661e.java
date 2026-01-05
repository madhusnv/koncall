package yh;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.e */
/* loaded from: classes.dex */
public final class C8661e {

    /* renamed from: a */
    public final Object f41963a;

    /* renamed from: b */
    public final Object f41964b;

    /* renamed from: c */
    public final Object f41965c;

    public C8661e(Object obj, Object obj2, Object obj3) {
        this.f41963a = obj;
        this.f41964b = obj2;
        this.f41965c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m16002a() {
        Object obj = this.f41963a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f41964b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f41965c);
        StringBuilder sb2 = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return new IllegalArgumentException(AbstractC0030c.m124o(sb2, " and ", strValueOf3, "=", strValueOf4));
    }
}

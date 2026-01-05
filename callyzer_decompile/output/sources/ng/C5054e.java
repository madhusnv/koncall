package ng;

import a2.AbstractC0030c;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.e */
/* loaded from: classes.dex */
public final class C5054e {

    /* renamed from: a */
    public final Object f24832a;

    /* renamed from: b */
    public final Object f24833b;

    /* renamed from: c */
    public final Object f24834c;

    public C5054e(Object obj, Object obj2, Object obj3) {
        this.f24832a = obj;
        this.f24833b = obj2;
        this.f24834c = obj3;
    }

    /* renamed from: a */
    public final IllegalArgumentException m9994a() {
        Object obj = this.f24832a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f24833b);
        return new IllegalArgumentException(a1.m14335o(AbstractC0030c.m127r("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f24834c)));
    }
}

package zs;

import ct.C1502a;
import kotlin.jvm.internal.AbstractC4154l;
import pg.ma;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zs.k */
/* loaded from: classes3.dex */
public final class C9046k extends ma {

    /* renamed from: b */
    public final C1502a f43555b;

    public C9046k(C1502a c1502a) {
        this.f43555b = c1502a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9046k) && AbstractC4154l.m8918a(this.f43555b, ((C9046k) obj).f43555b);
    }

    public final int hashCode() {
        C1502a c1502a = this.f43555b;
        if (c1502a == null) {
            return 0;
        }
        return c1502a.hashCode();
    }

    public final String toString() {
        return "TemplateForDelete(template=" + this.f43555b + ")";
    }
}

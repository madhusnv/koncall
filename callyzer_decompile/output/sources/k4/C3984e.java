package k4;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.e */
/* loaded from: classes.dex */
public final class C3984e {

    /* renamed from: a */
    public final a0 f20665a;

    public C3984e(a0 a0Var) {
        this.f20665a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3984e) && AbstractC4154l.m8918a(this.f20665a, ((C3984e) obj).f20665a);
    }

    public final int hashCode() {
        return this.f20665a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f20665a + ", loaderKey=null)";
    }
}

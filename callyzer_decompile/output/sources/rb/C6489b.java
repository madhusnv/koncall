package rb;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rb.b */
/* loaded from: classes.dex */
public final class C6489b {

    /* renamed from: a */
    public final String f31167a;

    /* renamed from: a */
    public static String m12497a(String str) {
        return a1.m14328h(')', "AuthSchemeId(id=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6489b) {
            return AbstractC4154l.m8918a(this.f31167a, ((C6489b) obj).f31167a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31167a.hashCode();
    }

    public final String toString() {
        return m12497a(this.f31167a);
    }
}

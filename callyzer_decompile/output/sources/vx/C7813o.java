package vx;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.o */
/* loaded from: classes3.dex */
public final class C7813o {

    /* renamed from: b */
    public static final C7812n f37519b = new C7812n();

    /* renamed from: a */
    public final Object f37520a;

    /* renamed from: a */
    public static final Object m14794a(Object obj) {
        if (obj instanceof C7812n) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7813o) {
            return AbstractC4154l.m8918a(this.f37520a, ((C7813o) obj).f37520a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f37520a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f37520a;
        if (obj instanceof C7811m) {
            return ((C7811m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}

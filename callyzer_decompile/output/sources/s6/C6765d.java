package s6;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s6.d */
/* loaded from: classes.dex */
public final class C6765d {

    /* renamed from: a */
    public final String f32221a;

    public C6765d(String name) {
        AbstractC4154l.m8923f(name, "name");
        this.f32221a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6765d)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f32221a, ((C6765d) obj).f32221a);
    }

    public final int hashCode() {
        return this.f32221a.hashCode();
    }

    public final String toString() {
        return this.f32221a;
    }
}

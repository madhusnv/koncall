package c9;

import kotlin.jvm.internal.AbstractC4154l;
import t8.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.o */
/* loaded from: classes.dex */
public final class C0920o {

    /* renamed from: a */
    public String f5602a;

    /* renamed from: b */
    public e0 f5603b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0920o)) {
            return false;
        }
        C0920o c0920o = (C0920o) obj;
        return AbstractC4154l.m8918a(this.f5602a, c0920o.f5602a) && this.f5603b == c0920o.f5603b;
    }

    public final int hashCode() {
        return this.f5603b.hashCode() + (this.f5602a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f5602a + ", state=" + this.f5603b + ')';
    }
}

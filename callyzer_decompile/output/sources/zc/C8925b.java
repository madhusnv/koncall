package zc;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zc.b */
/* loaded from: classes.dex */
public final class C8925b extends AbstractC8927d {

    /* renamed from: a */
    public final String f42889a;

    public C8925b(String name) {
        AbstractC4154l.m8923f(name, "name");
        this.f42889a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8925b) && AbstractC4154l.m8918a(this.f42889a, ((C8925b) obj).f42889a);
    }

    public final int hashCode() {
        return this.f42889a.hashCode();
    }

    public final String toString() {
        return this.f42889a;
    }
}

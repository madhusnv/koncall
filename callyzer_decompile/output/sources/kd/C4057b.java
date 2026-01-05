package kd;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kd.b */
/* loaded from: classes.dex */
public final class C4057b extends AbstractC4059d {

    /* renamed from: a */
    public final C4056a f20909a;

    public C4057b(C4056a c4056a) {
        this.f20909a = c4056a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4057b) && AbstractC4154l.m8918a(this.f20909a, ((C4057b) obj).f20909a);
    }

    public final int hashCode() {
        return this.f20909a.hashCode();
    }

    public final String toString() {
        return "Tag(lazyTagWriter=" + this.f20909a + ')';
    }
}

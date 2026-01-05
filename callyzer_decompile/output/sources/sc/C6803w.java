package sc;

import kotlin.jvm.internal.C4147e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.w */
/* loaded from: classes.dex */
public final class C6803w {

    /* renamed from: a */
    public final C4147e f32333a;

    /* renamed from: b */
    public final C4147e f32334b;

    public C6803w(C4147e c4147e, C4147e c4147e2) {
        this.f32333a = c4147e;
        this.f32334b = c4147e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6803w)) {
            return false;
        }
        C6803w c6803w = (C6803w) obj;
        return this.f32333a.equals(c6803w.f32333a) && this.f32334b.equals(c6803w.f32334b);
    }

    public final int hashCode() {
        return this.f32334b.hashCode() + (this.f32333a.hashCode() * 31);
    }

    public final String toString() {
        return "OperationTypeInfo(inputType=" + this.f32333a + ", outputType=" + this.f32334b + ')';
    }
}

package qd;

import kotlin.jvm.internal.AbstractC4154l;
import uw.AbstractC7557a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qd.h */
/* loaded from: classes.dex */
public final class C6188h extends AbstractC7557a {

    /* renamed from: c */
    public static final C6181a f30146c = new C6181a();

    /* renamed from: b */
    public final InterfaceC6187g f30147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6188h(InterfaceC6187g traceSpan) {
        super(f30146c);
        AbstractC4154l.m8923f(traceSpan, "traceSpan");
        this.f30147b = traceSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6188h) && AbstractC4154l.m8918a(this.f30147b, ((C6188h) obj).f30147b);
    }

    public final int hashCode() {
        return this.f30147b.hashCode();
    }

    public final String toString() {
        return "TraceSpanContextElement(" + this.f30147b + ')';
    }
}

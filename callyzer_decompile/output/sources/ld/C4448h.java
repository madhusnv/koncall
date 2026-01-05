package ld;

import kotlin.jvm.internal.AbstractC4154l;
import ph.C5950e;
import uw.AbstractC7557a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ld.h */
/* loaded from: classes.dex */
public final class C4448h extends AbstractC7557a {

    /* renamed from: c */
    public static final C5950e f22180c = new C5950e(19);

    /* renamed from: b */
    public final InterfaceC4447g f22181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4448h(InterfaceC4447g provider) {
        super(f22180c);
        AbstractC4154l.m8923f(provider, "provider");
        this.f22181b = provider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4448h) && AbstractC4154l.m8918a(this.f22181b, ((C4448h) obj).f22181b);
    }

    public final int hashCode() {
        return this.f22181b.hashCode();
    }

    public final String toString() {
        return "TelemetryContext(" + this.f22181b + ')';
    }
}

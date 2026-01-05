package tx;

import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.s */
/* loaded from: classes3.dex */
public final class C7259s {

    /* renamed from: a */
    public final Object f34670a;

    /* renamed from: b */
    public final InterfaceC7249i f34671b;

    /* renamed from: c */
    public final InterfaceC2142f f34672c;

    /* renamed from: d */
    public final Object f34673d;

    /* renamed from: e */
    public final Throwable f34674e;

    public C7259s(Object obj, InterfaceC7249i interfaceC7249i, InterfaceC2142f interfaceC2142f, Object obj2, Throwable th2) {
        this.f34670a = obj;
        this.f34671b = interfaceC7249i;
        this.f34672c = interfaceC2142f;
        this.f34673d = obj2;
        this.f34674e = th2;
    }

    /* renamed from: a */
    public static C7259s m13574a(C7259s c7259s, InterfaceC7249i interfaceC7249i, Throwable th2, int i10) {
        Object obj = c7259s.f34670a;
        if ((i10 & 2) != 0) {
            interfaceC7249i = c7259s.f34671b;
        }
        InterfaceC7249i interfaceC7249i2 = interfaceC7249i;
        InterfaceC2142f interfaceC2142f = c7259s.f34672c;
        Object obj2 = c7259s.f34673d;
        if ((i10 & 16) != 0) {
            th2 = c7259s.f34674e;
        }
        return new C7259s(obj, interfaceC7249i2, interfaceC2142f, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7259s)) {
            return false;
        }
        C7259s c7259s = (C7259s) obj;
        return AbstractC4154l.m8918a(this.f34670a, c7259s.f34670a) && AbstractC4154l.m8918a(this.f34671b, c7259s.f34671b) && AbstractC4154l.m8918a(this.f34672c, c7259s.f34672c) && AbstractC4154l.m8918a(this.f34673d, c7259s.f34673d) && AbstractC4154l.m8918a(this.f34674e, c7259s.f34674e);
    }

    public final int hashCode() {
        Object obj = this.f34670a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC7249i interfaceC7249i = this.f34671b;
        int iHashCode2 = (iHashCode + (interfaceC7249i == null ? 0 : interfaceC7249i.hashCode())) * 31;
        InterfaceC2142f interfaceC2142f = this.f34672c;
        int iHashCode3 = (iHashCode2 + (interfaceC2142f == null ? 0 : interfaceC2142f.hashCode())) * 31;
        Object obj2 = this.f34673d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f34674e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f34670a + ", cancelHandler=" + this.f34671b + ", onCancellation=" + this.f34672c + ", idempotentResume=" + this.f34673d + ", cancelCause=" + this.f34674e + ')';
    }

    public /* synthetic */ C7259s(Object obj, InterfaceC7249i interfaceC7249i, InterfaceC2142f interfaceC2142f, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC7249i, (i10 & 4) != 0 ? null : interfaceC2142f, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}

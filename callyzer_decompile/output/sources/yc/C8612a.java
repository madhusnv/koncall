package yc;

import kotlin.jvm.internal.AbstractC4154l;
import wc.InterfaceC7971e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yc.a */
/* loaded from: classes.dex */
public final class C8612a implements InterfaceC7971e {

    /* renamed from: a */
    public final InterfaceC7971e f41876a;

    /* renamed from: b */
    public final InterfaceC8613b f41877b;

    public C8612a(InterfaceC7971e handler, InterfaceC8613b with) {
        AbstractC4154l.m8923f(handler, "handler");
        AbstractC4154l.m8923f(with, "with");
        this.f41876a = handler;
        this.f41877b = with;
    }

    @Override // wc.InterfaceC7971e
    /* renamed from: a */
    public final Object mo8275a(Object obj, AbstractC8193c abstractC8193c) {
        return this.f41877b.mo12192a(obj, this.f41876a, abstractC8193c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8612a)) {
            return false;
        }
        C8612a c8612a = (C8612a) obj;
        return AbstractC4154l.m8918a(this.f41876a, c8612a.f41876a) && AbstractC4154l.m8918a(this.f41877b, c8612a.f41877b);
    }

    public final int hashCode() {
        return this.f41877b.hashCode() + (this.f41876a.hashCode() * 31);
    }

    public final String toString() {
        return "DecoratedHandler(handler=" + this.f41876a + ", with=" + this.f41877b + ')';
    }
}

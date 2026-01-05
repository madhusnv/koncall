package uw;

import a2.AbstractC0030c;
import ex.InterfaceC2141e;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;
import sq.i2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uw.b */
/* loaded from: classes3.dex */
public final class C7558b implements InterfaceC7564h, Serializable {

    /* renamed from: a */
    public final InterfaceC7564h f36437a;

    /* renamed from: b */
    public final InterfaceC7562f f36438b;

    public C7558b(InterfaceC7562f element, InterfaceC7564h left) {
        AbstractC4154l.m8923f(left, "left");
        AbstractC4154l.m8923f(element, "element");
        this.f36437a = left;
        this.f36438b = element;
    }

    @Override // uw.InterfaceC7564h
    public final Object A0(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(this.f36437a.A0(obj, interfaceC2141e), this.f36438b);
    }

    public final boolean equals(Object obj) {
        boolean zM8918a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7558b) {
            C7558b c7558b = (C7558b) obj;
            int i10 = 2;
            C7558b c7558b2 = c7558b;
            int i11 = 2;
            while (true) {
                InterfaceC7564h interfaceC7564h = c7558b2.f36437a;
                c7558b2 = interfaceC7564h instanceof C7558b ? (C7558b) interfaceC7564h : null;
                if (c7558b2 == null) {
                    break;
                }
                i11++;
            }
            C7558b c7558b3 = this;
            while (true) {
                InterfaceC7564h interfaceC7564h2 = c7558b3.f36437a;
                c7558b3 = interfaceC7564h2 instanceof C7558b ? (C7558b) interfaceC7564h2 : null;
                if (c7558b3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                C7558b c7558b4 = this;
                while (true) {
                    InterfaceC7562f interfaceC7562f = c7558b4.f36438b;
                    if (!AbstractC4154l.m8918a(c7558b.o0(interfaceC7562f.getKey()), interfaceC7562f)) {
                        zM8918a = false;
                        break;
                    }
                    InterfaceC7564h interfaceC7564h3 = c7558b4.f36437a;
                    if (!(interfaceC7564h3 instanceof C7558b)) {
                        AbstractC4154l.m8921d(interfaceC7564h3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC7562f interfaceC7562f2 = (InterfaceC7562f) interfaceC7564h3;
                        zM8918a = AbstractC4154l.m8918a(c7558b.o0(interfaceC7562f2.getKey()), interfaceC7562f2);
                        break;
                    }
                    c7558b4 = (C7558b) interfaceC7564h3;
                }
                if (zM8918a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36438b.hashCode() + this.f36437a.hashCode();
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7562f o0(InterfaceC7563g key) {
        AbstractC4154l.m8923f(key, "key");
        C7558b c7558b = this;
        while (true) {
            InterfaceC7562f interfaceC7562fO0 = c7558b.f36438b.o0(key);
            if (interfaceC7562fO0 != null) {
                return interfaceC7562fO0;
            }
            InterfaceC7564h interfaceC7564h = c7558b.f36437a;
            if (!(interfaceC7564h instanceof C7558b)) {
                return interfaceC7564h.o0(key);
            }
            c7558b = (C7558b) interfaceC7564h;
        }
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7564h t0(InterfaceC7564h context) {
        AbstractC4154l.m8923f(context, "context");
        return context == C7565i.f36440a ? this : (InterfaceC7564h) context.A0(this, new i2(26));
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("["), (String) A0("", new i2(25)), ']');
    }

    @Override // uw.InterfaceC7564h
    /* renamed from: z */
    public final InterfaceC7564h mo1766z(InterfaceC7563g key) {
        AbstractC4154l.m8923f(key, "key");
        InterfaceC7562f interfaceC7562f = this.f36438b;
        InterfaceC7562f interfaceC7562fO0 = interfaceC7562f.o0(key);
        InterfaceC7564h interfaceC7564h = this.f36437a;
        if (interfaceC7562fO0 != null) {
            return interfaceC7564h;
        }
        InterfaceC7564h interfaceC7564hMo1766z = interfaceC7564h.mo1766z(key);
        return interfaceC7564hMo1766z == interfaceC7564h ? this : interfaceC7564hMo1766z == C7565i.f36440a ? interfaceC7562f : new C7558b(interfaceC7562f, interfaceC7564hMo1766z);
    }
}

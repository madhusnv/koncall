package androidx.compose.foundation;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import i1.C3147z;
import i1.u0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import p3.h0;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class CombinedClickableElement extends a1 {

    /* renamed from: a */
    public final InterfaceC4630l f1896a;

    /* renamed from: b */
    public final u0 f1897b;

    /* renamed from: c */
    public final InterfaceC2137a f1898c;

    /* renamed from: d */
    public final InterfaceC2137a f1899d;

    public CombinedClickableElement(InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, u0 u0Var, InterfaceC4630l interfaceC4630l) {
        this.f1896a = interfaceC4630l;
        this.f1897b = u0Var;
        this.f1898c = interfaceC2137a;
        this.f1899d = interfaceC2137a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return AbstractC4154l.m8918a(this.f1896a, combinedClickableElement.f1896a) && AbstractC4154l.m8918a(this.f1897b, combinedClickableElement.f1897b) && this.f1898c == combinedClickableElement.f1898c && this.f1899d == combinedClickableElement.f1899d;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        InterfaceC4630l interfaceC4630l = this.f1896a;
        return new C3147z(this.f1898c, this.f1899d, this.f1897b, interfaceC4630l);
    }

    public final int hashCode() {
        InterfaceC4630l interfaceC4630l = this.f1896a;
        int iHashCode = (interfaceC4630l != null ? interfaceC4630l.hashCode() : 0) * 31;
        u0 u0Var = this.f1897b;
        int iHashCode2 = (this.f1898c.hashCode() + AbstractC1452a.m4558e((iHashCode + (u0Var != null ? u0Var.hashCode() : 0)) * 31, 29791, true)) * 961;
        InterfaceC2137a interfaceC2137a = this.f1899d;
        return Boolean.hashCode(true) + ((iHashCode2 + (interfaceC2137a != null ? interfaceC2137a.hashCode() : 0)) * 961);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        h0 h0Var;
        C3147z c3147z = (C3147z) abstractC7878q;
        c3147z.f17015N = true;
        boolean z6 = false;
        boolean z10 = c3147z.f17014M == null;
        InterfaceC2137a interfaceC2137a = this.f1899d;
        if (z10 != (interfaceC2137a == null)) {
            c3147z.Q0();
            AbstractC7634f.m14554o(c3147z);
            z6 = true;
        }
        c3147z.f17014M = interfaceC2137a;
        boolean z11 = c3147z.f16845x ? z6 : true;
        c3147z.V0(this.f1896a, this.f1897b, true, null, null, this.f1898c);
        if (!z11 || (h0Var = c3147z.f16832B) == null) {
            return;
        }
        h0Var.N0();
    }
}

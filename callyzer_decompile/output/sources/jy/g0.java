package jy;

import com.sun.mail.util.AbstractC1452a;
import hy.C3060k;
import hy.InterfaceC3055f;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import pg.AbstractC5942w;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class g0 implements InterfaceC3055f {

    /* renamed from: a */
    public final InterfaceC3055f f19898a;

    public g0(InterfaceC3055f interfaceC3055f) {
        this.f19898a = interfaceC3055f;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: c */
    public final boolean mo7278c() {
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: d */
    public final int mo7279d(String name) {
        AbstractC4154l.m8923f(name, "name");
        Integer numM10140v = AbstractC5185w.m10140v(name);
        if (numM10140v != null) {
            return numM10140v.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: e */
    public final AbstractC5942w mo7280e() {
        return C3060k.f16414c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return AbstractC4154l.m8918a(this.f19898a, g0Var.f19898a) && AbstractC4154l.m8918a(mo7277a(), g0Var.mo7277a());
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: f */
    public final int mo7281f() {
        return 1;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: g */
    public final String mo7282g(int i10) {
        return String.valueOf(i10);
    }

    @Override // hy.InterfaceC3055f
    public final List getAnnotations() {
        return C6668r.f31943a;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: h */
    public final List mo7283h(int i10) {
        if (i10 >= 0) {
            return C6668r.f31943a;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Illegal index ", ", ");
        sbM4567n.append(mo7277a());
        sbM4567n.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM4567n.toString().toString());
    }

    public final int hashCode() {
        return mo7277a().hashCode() + (this.f19898a.hashCode() * 31);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: i */
    public final InterfaceC3055f mo7284i(int i10) {
        if (i10 >= 0) {
            return this.f19898a;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Illegal index ", ", ");
        sbM4567n.append(mo7277a());
        sbM4567n.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM4567n.toString().toString());
    }

    @Override // hy.InterfaceC3055f
    public final boolean isInline() {
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: j */
    public final boolean mo7285j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Illegal index ", ", ");
        sbM4567n.append(mo7277a());
        sbM4567n.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM4567n.toString().toString());
    }

    public final String toString() {
        return mo7277a() + '(' + this.f19898a + ')';
    }
}

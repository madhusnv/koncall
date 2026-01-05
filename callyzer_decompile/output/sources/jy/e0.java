package jy;

import hy.C3060k;
import hy.InterfaceC3055f;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.AbstractC5942w;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 implements InterfaceC3055f {

    /* renamed from: a */
    public final InterfaceC3055f f19887a;

    /* renamed from: b */
    public final InterfaceC3055f f19888b;

    public e0(InterfaceC3055f keyDesc, InterfaceC3055f valueDesc) {
        AbstractC4154l.m8923f(keyDesc, "keyDesc");
        AbstractC4154l.m8923f(valueDesc, "valueDesc");
        this.f19887a = keyDesc;
        this.f19888b = valueDesc;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: a */
    public final String mo7277a() {
        return "kotlin.collections.LinkedHashMap";
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
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: e */
    public final AbstractC5942w mo7280e() {
        return C3060k.f16415d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return AbstractC4154l.m8918a(this.f19887a, e0Var.f19887a) && AbstractC4154l.m8918a(this.f19888b, e0Var.f19888b);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: f */
    public final int mo7281f() {
        return 2;
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
        throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f19888b.hashCode() + ((this.f19887a.hashCode() + 710441009) * 31);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: i */
    public final InterfaceC3055f mo7284i(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f19887a;
        }
        if (i11 == 1) {
            return this.f19888b;
        }
        throw new IllegalStateException("Unreached");
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
        throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f19887a + ", " + this.f19888b + ')';
    }
}

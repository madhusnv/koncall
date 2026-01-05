package fk;

import fy.InterfaceC2401a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {
    public static final j0 Companion = new j0();

    /* renamed from: d */
    public static final InterfaceC2401a[] f10447d;

    /* renamed from: a */
    public final p0 f10448a;

    /* renamed from: b */
    public final l1 f10449b;

    /* renamed from: c */
    public final Map f10450c;

    static {
        jy.a1 a1Var = jy.a1.f19869a;
        f10447d = new InterfaceC2401a[]{null, null, new jy.f0(b0.f10342a)};
    }

    public /* synthetic */ k0(int i10, p0 p0Var, l1 l1Var, Map map) {
        if (1 != (i10 & 1)) {
            jy.n0.m8426g(i10, 1, i0.f10435a.getDescriptor());
            throw null;
        }
        this.f10448a = p0Var;
        if ((i10 & 2) == 0) {
            this.f10449b = null;
        } else {
            this.f10449b = l1Var;
        }
        if ((i10 & 4) == 0) {
            this.f10450c = null;
        } else {
            this.f10450c = map;
        }
    }

    /* renamed from: a */
    public static k0 m5975a(k0 k0Var, p0 sessionDetails, l1 l1Var, Map map, int i10) {
        if ((i10 & 1) != 0) {
            sessionDetails = k0Var.f10448a;
        }
        if ((i10 & 2) != 0) {
            l1Var = k0Var.f10449b;
        }
        if ((i10 & 4) != 0) {
            map = k0Var.f10450c;
        }
        k0Var.getClass();
        AbstractC4154l.m8923f(sessionDetails, "sessionDetails");
        return new k0(sessionDetails, l1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return AbstractC4154l.m8918a(this.f10448a, k0Var.f10448a) && AbstractC4154l.m8918a(this.f10449b, k0Var.f10449b) && AbstractC4154l.m8918a(this.f10450c, k0Var.f10450c);
    }

    public final int hashCode() {
        int iHashCode = this.f10448a.hashCode() * 31;
        l1 l1Var = this.f10449b;
        int iHashCode2 = (iHashCode + (l1Var == null ? 0 : Long.hashCode(l1Var.f10453a))) * 31;
        Map map = this.f10450c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f10448a + ", backgroundTime=" + this.f10449b + ", processDataMap=" + this.f10450c + ')';
    }

    public k0(p0 sessionDetails, l1 l1Var, Map map) {
        AbstractC4154l.m8923f(sessionDetails, "sessionDetails");
        this.f10448a = sessionDetails;
        this.f10449b = l1Var;
        this.f10450c = map;
    }
}

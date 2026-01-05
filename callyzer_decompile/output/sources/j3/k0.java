package j3;

import com.sun.mail.util.AbstractC1452a;
import d3.AbstractC1561o;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 extends i0 {

    /* renamed from: a */
    public final String f19060a;

    /* renamed from: b */
    public final List f19061b;

    /* renamed from: c */
    public final int f19062c;

    /* renamed from: d */
    public final AbstractC1561o f19063d;

    /* renamed from: e */
    public final float f19064e;

    /* renamed from: f */
    public final AbstractC1561o f19065f;

    /* renamed from: g */
    public final float f19066g;

    /* renamed from: h */
    public final float f19067h;

    /* renamed from: j */
    public final int f19068j;

    /* renamed from: k */
    public final int f19069k;

    /* renamed from: l */
    public final float f19070l;

    /* renamed from: m */
    public final float f19071m;

    /* renamed from: n */
    public final float f19072n;

    /* renamed from: p */
    public final float f19073p;

    public k0(String str, List list, int i10, AbstractC1561o abstractC1561o, float f6, AbstractC1561o abstractC1561o2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15) {
        this.f19060a = str;
        this.f19061b = list;
        this.f19062c = i10;
        this.f19063d = abstractC1561o;
        this.f19064e = f6;
        this.f19065f = abstractC1561o2;
        this.f19066g = f10;
        this.f19067h = f11;
        this.f19068j = i11;
        this.f19069k = i12;
        this.f19070l = f12;
        this.f19071m = f13;
        this.f19072n = f14;
        this.f19073p = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            return AbstractC4154l.m8918a(this.f19060a, k0Var.f19060a) && AbstractC4154l.m8918a(this.f19063d, k0Var.f19063d) && this.f19064e == k0Var.f19064e && AbstractC4154l.m8918a(this.f19065f, k0Var.f19065f) && this.f19066g == k0Var.f19066g && this.f19067h == k0Var.f19067h && this.f19068j == k0Var.f19068j && this.f19069k == k0Var.f19069k && this.f19070l == k0Var.f19070l && this.f19071m == k0Var.f19071m && this.f19072n == k0Var.f19072n && this.f19073p == k0Var.f19073p && this.f19062c == k0Var.f19062c && AbstractC4154l.m8918a(this.f19061b, k0Var.f19061b);
        }
        return false;
    }

    public final int hashCode() {
        int iM4559f = AbstractC1452a.m4559f(this.f19061b, this.f19060a.hashCode() * 31, 31);
        AbstractC1561o abstractC1561o = this.f19063d;
        int iM4555b = AbstractC1452a.m4555b(this.f19064e, (iM4559f + (abstractC1561o != null ? abstractC1561o.hashCode() : 0)) * 31, 31);
        AbstractC1561o abstractC1561o2 = this.f19065f;
        return Integer.hashCode(this.f19062c) + AbstractC1452a.m4555b(this.f19073p, AbstractC1452a.m4555b(this.f19072n, AbstractC1452a.m4555b(this.f19071m, AbstractC1452a.m4555b(this.f19070l, AbstractC1452a.m4556c(this.f19069k, AbstractC1452a.m4556c(this.f19068j, AbstractC1452a.m4555b(this.f19067h, AbstractC1452a.m4555b(this.f19066g, (iM4555b + (abstractC1561o2 != null ? abstractC1561o2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}

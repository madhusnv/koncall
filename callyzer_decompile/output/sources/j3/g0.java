package j3;

import com.sun.mail.util.AbstractC1452a;
import ec.C2008f;
import fx.InterfaceC2395a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, InterfaceC2395a {

    /* renamed from: a */
    public final String f19012a;

    /* renamed from: b */
    public final float f19013b;

    /* renamed from: c */
    public final float f19014c;

    /* renamed from: d */
    public final float f19015d;

    /* renamed from: e */
    public final float f19016e;

    /* renamed from: f */
    public final float f19017f;

    /* renamed from: g */
    public final float f19018g;

    /* renamed from: h */
    public final float f19019h;

    /* renamed from: j */
    public final List f19020j;

    /* renamed from: k */
    public final List f19021k;

    public g0(String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, List list, ArrayList arrayList) {
        this.f19012a = str;
        this.f19013b = f6;
        this.f19014c = f10;
        this.f19015d = f11;
        this.f19016e = f12;
        this.f19017f = f13;
        this.f19018g = f14;
        this.f19019h = f15;
        this.f19020j = list;
        this.f19021k = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            return AbstractC4154l.m8918a(this.f19012a, g0Var.f19012a) && this.f19013b == g0Var.f19013b && this.f19014c == g0Var.f19014c && this.f19015d == g0Var.f19015d && this.f19016e == g0Var.f19016e && this.f19017f == g0Var.f19017f && this.f19018g == g0Var.f19018g && this.f19019h == g0Var.f19019h && AbstractC4154l.m8918a(this.f19020j, g0Var.f19020j) && AbstractC4154l.m8918a(this.f19021k, g0Var.f19021k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19021k.hashCode() + AbstractC1452a.m4559f(this.f19020j, AbstractC1452a.m4555b(this.f19019h, AbstractC1452a.m4555b(this.f19018g, AbstractC1452a.m4555b(this.f19017f, AbstractC1452a.m4555b(this.f19016e, AbstractC1452a.m4555b(this.f19015d, AbstractC1452a.m4555b(this.f19014c, AbstractC1452a.m4555b(this.f19013b, this.f19012a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2008f(this);
    }
}

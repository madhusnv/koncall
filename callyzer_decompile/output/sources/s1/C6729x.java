package s1;

import e1.AbstractC1911m;
import e1.C1922x;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s4.EnumC6757m;
import t3.g1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.x */
/* loaded from: classes.dex */
public final class C6729x implements t3.l0 {

    /* renamed from: a */
    public final C6727v f32164a;

    /* renamed from: b */
    public final g1 f32165b;

    /* renamed from: c */
    public final InterfaceC6728w f32166c;

    /* renamed from: d */
    public final C1922x f32167d;

    public C6729x(C6727v c6727v, g1 g1Var) {
        this.f32164a = c6727v;
        this.f32165b = g1Var;
        this.f32166c = (InterfaceC6728w) c6727v.f32149b.invoke();
        C1922x c1922x = AbstractC1911m.f9027a;
        this.f32167d = new C1922x();
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: A */
    public final long mo8432A(float f6) {
        return this.f32165b.mo8432A(f6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: F */
    public final float mo8433F(int i10) {
        return this.f32165b.mo8433F(i10);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: J */
    public final float mo8434J(float f6) {
        return this.f32165b.mo8434J(f6);
    }

    @Override // t3.l0
    /* renamed from: M */
    public final t3.k0 mo12873M(int i10, int i11, Map map, InterfaceC2139c interfaceC2139c) {
        return this.f32165b.mo12873M(i10, i11, map, interfaceC2139c);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f32165b.mo154O();
    }

    @Override // t3.InterfaceC7028o
    /* renamed from: R */
    public final boolean mo12874R() {
        return this.f32165b.mo12874R();
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: T */
    public final float mo8435T(float f6) {
        return this.f32165b.mo8435T(f6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: Z */
    public final int mo8436Z(long j6) {
        return this.f32165b.mo8436Z(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f32165b.mo155a();
    }

    /* renamed from: b */
    public final List m12875b(int i10, long j6) {
        C1922x c1922x = this.f32167d;
        List list = (List) c1922x.m5595b(i10);
        if (list != null) {
            return list;
        }
        InterfaceC6728w interfaceC6728w = this.f32166c;
        Object objMo12102b = interfaceC6728w.mo12102b(i10);
        List listB0 = this.f32165b.b0(objMo12102b, this.f32164a.m12867a(i10, objMo12102b, interfaceC6728w.mo12103c(i10)));
        int size = listB0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((t3.i0) listB0.get(i11)).mo13314z(j6));
        }
        c1922x.m5663h(i10, arrayList);
        return arrayList;
    }

    @Override // s4.InterfaceC6747c
    public final int e0(float f6) {
        return this.f32165b.e0(f6);
    }

    @Override // t3.l0
    public final t3.k0 g0(int i10, int i11, Map map, InterfaceC2139c interfaceC2139c) {
        return this.f32165b.g0(i10, i11, map, interfaceC2139c);
    }

    @Override // t3.InterfaceC7028o
    public final EnumC6757m getLayoutDirection() {
        return this.f32165b.getLayoutDirection();
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: l */
    public final long mo8441l(float f6) {
        return this.f32165b.mo8441l(f6);
    }

    @Override // s4.InterfaceC6747c
    public final long l0(long j6) {
        return this.f32165b.l0(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: m */
    public final long mo8442m(long j6) {
        return this.f32165b.mo8442m(j6);
    }

    @Override // s4.InterfaceC6747c
    public final float n0(long j6) {
        return this.f32165b.n0(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: p */
    public final float mo8443p(long j6) {
        return this.f32165b.mo8443p(j6);
    }
}

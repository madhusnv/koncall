package t3;

import ex.InterfaceC2139c;
import java.util.Map;
import s3.AbstractC6744a;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t3.s */
/* loaded from: classes.dex */
public final class C7032s implements l0, InterfaceC7028o {

    /* renamed from: a */
    public final EnumC6757m f34022a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7028o f34023b;

    public C7032s(InterfaceC7028o interfaceC7028o, EnumC6757m enumC6757m) {
        this.f34022a = enumC6757m;
        this.f34023b = interfaceC7028o;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: A */
    public final long mo8432A(float f6) {
        return this.f34023b.mo8432A(f6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: F */
    public final float mo8433F(int i10) {
        return this.f34023b.mo8433F(i10);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: J */
    public final float mo8434J(float f6) {
        return this.f34023b.mo8434J(f6);
    }

    @Override // t3.l0
    /* renamed from: M */
    public final k0 mo12873M(int i10, int i11, Map map, InterfaceC2139c interfaceC2139c) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            AbstractC6744a.m12907b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C7031r(i10, i11, map);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f34023b.mo154O();
    }

    @Override // t3.InterfaceC7028o
    /* renamed from: R */
    public final boolean mo12874R() {
        return this.f34023b.mo12874R();
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: T */
    public final float mo8435T(float f6) {
        return this.f34023b.mo8435T(f6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: Z */
    public final int mo8436Z(long j6) {
        return this.f34023b.mo8436Z(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f34023b.mo155a();
    }

    @Override // s4.InterfaceC6747c
    public final int e0(float f6) {
        return this.f34023b.e0(f6);
    }

    @Override // t3.InterfaceC7028o
    public final EnumC6757m getLayoutDirection() {
        return this.f34022a;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: l */
    public final long mo8441l(float f6) {
        return this.f34023b.mo8441l(f6);
    }

    @Override // s4.InterfaceC6747c
    public final long l0(long j6) {
        return this.f34023b.l0(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: m */
    public final long mo8442m(long j6) {
        return this.f34023b.mo8442m(j6);
    }

    @Override // s4.InterfaceC6747c
    public final float n0(long j6) {
        return this.f34023b.n0(j6);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: p */
    public final float mo8443p(long j6) {
        return this.f34023b.mo8443p(j6);
    }
}

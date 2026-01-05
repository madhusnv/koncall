package s4;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import og.af;
import t4.InterfaceC7040a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.e */
/* loaded from: classes.dex */
public final class C6749e implements InterfaceC6747c {

    /* renamed from: a */
    public final float f32198a;

    /* renamed from: b */
    public final float f32199b;

    /* renamed from: c */
    public final InterfaceC7040a f32200c;

    public C6749e(float f6, float f10, InterfaceC7040a interfaceC7040a) {
        this.f32198a = f6;
        this.f32199b = f10;
        this.f32200c = interfaceC7040a;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f32199b;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f32198a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6749e)) {
            return false;
        }
        C6749e c6749e = (C6749e) obj;
        return Float.compare(this.f32198a, c6749e.f32198a) == 0 && Float.compare(this.f32199b, c6749e.f32199b) == 0 && AbstractC4154l.m8918a(this.f32200c, c6749e.f32200c);
    }

    public final int hashCode() {
        return this.f32200c.hashCode() + AbstractC1452a.m4555b(this.f32199b, Float.hashCode(this.f32198a) * 31, 31);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: l */
    public final long mo8441l(float f6) {
        return af.m10535d(this.f32200c.mo12950a(f6), 4294967296L);
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: p */
    public final float mo8443p(long j6) {
        if (C6760p.m12956a(C6759o.m12953b(j6), 4294967296L)) {
            return this.f32200c.mo12951b(C6759o.m12954c(j6));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f32198a + ", fontScale=" + this.f32199b + ", converter=" + this.f32200c + ')';
    }
}

package w1;

import c3.C0848c;
import c3.C0849d;
import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.d0;
import d3.e0;
import d3.h0;
import d3.l0;
import kotlin.jvm.internal.AbstractC4154l;
import n1.AbstractC4941a;
import og.b2;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w1.d */
/* loaded from: classes.dex */
public final class C7860d implements l0 {

    /* renamed from: a */
    public final InterfaceC7857a f37631a;

    /* renamed from: b */
    public final InterfaceC7857a f37632b;

    /* renamed from: c */
    public final InterfaceC7857a f37633c;

    /* renamed from: d */
    public final InterfaceC7857a f37634d;

    public C7860d(InterfaceC7857a interfaceC7857a, InterfaceC7857a interfaceC7857a2, InterfaceC7857a interfaceC7857a3, InterfaceC7857a interfaceC7857a4) {
        this.f37631a = interfaceC7857a;
        this.f37632b = interfaceC7857a2;
        this.f37633c = interfaceC7857a3;
        this.f37634d = interfaceC7857a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [w1.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [w1.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [w1.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [w1.a] */
    /* renamed from: a */
    public static C7860d m14839a(C7860d c7860d, C7858b c7858b, C7858b c7858b2, C7858b c7858b3, C7858b c7858b4, int i10) {
        C7858b c7858b5 = c7858b;
        if ((i10 & 1) != 0) {
            c7858b5 = c7860d.f37631a;
        }
        C7858b c7858b6 = c7858b2;
        if ((i10 & 2) != 0) {
            c7858b6 = c7860d.f37632b;
        }
        C7858b c7858b7 = c7858b3;
        if ((i10 & 4) != 0) {
            c7858b7 = c7860d.f37633c;
        }
        C7858b c7858b8 = c7858b4;
        if ((i10 & 8) != 0) {
            c7858b8 = c7860d.f37634d;
        }
        c7860d.getClass();
        return new C7860d(c7858b5, c7858b6, c7858b7, c7858b8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7860d)) {
            return false;
        }
        C7860d c7860d = (C7860d) obj;
        return AbstractC4154l.m8918a(this.f37631a, c7860d.f37631a) && AbstractC4154l.m8918a(this.f37632b, c7860d.f37632b) && AbstractC4154l.m8918a(this.f37633c, c7860d.f37633c) && AbstractC4154l.m8918a(this.f37634d, c7860d.f37634d);
    }

    public final int hashCode() {
        return this.f37634d.hashCode() + ((this.f37633c.hashCode() + ((this.f37632b.hashCode() + (this.f37631a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // d3.l0
    /* renamed from: i */
    public final h0 mo399i(long j6, EnumC6757m enumC6757m, InterfaceC6747c interfaceC6747c) {
        float fMo14838a = this.f37631a.mo14838a(j6, interfaceC6747c);
        float fMo14838a2 = this.f37632b.mo14838a(j6, interfaceC6747c);
        float fMo14838a3 = this.f37633c.mo14838a(j6, interfaceC6747c);
        float fMo14838a4 = this.f37634d.mo14838a(j6, interfaceC6747c);
        float fM2292c = C0850e.m2292c(j6);
        float f6 = fMo14838a + fMo14838a4;
        if (f6 > fM2292c) {
            float f10 = fM2292c / f6;
            fMo14838a *= f10;
            fMo14838a4 *= f10;
        }
        float f11 = fMo14838a2 + fMo14838a3;
        if (f11 > fM2292c) {
            float f12 = fM2292c / f11;
            fMo14838a2 *= f12;
            fMo14838a3 *= f12;
        }
        if (fMo14838a < DefinitionKt.NO_Float_VALUE || fMo14838a2 < DefinitionKt.NO_Float_VALUE || fMo14838a3 < DefinitionKt.NO_Float_VALUE || fMo14838a4 < DefinitionKt.NO_Float_VALUE) {
            AbstractC4941a.m9884a("Corner size in Px can't be negative(topStart = " + fMo14838a + ", topEnd = " + fMo14838a2 + ", bottomEnd = " + fMo14838a3 + ", bottomStart = " + fMo14838a4 + ")!");
        }
        if (fMo14838a + fMo14838a2 + fMo14838a3 + fMo14838a4 == DefinitionKt.NO_Float_VALUE) {
            return new d0(b2.m10543a(0L, j6));
        }
        C0848c c0848cM10543a = b2.m10543a(0L, j6);
        EnumC6757m enumC6757m2 = EnumC6757m.Ltr;
        float f13 = enumC6757m == enumC6757m2 ? fMo14838a : fMo14838a2;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        if (enumC6757m == enumC6757m2) {
            fMo14838a = fMo14838a2;
        }
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fMo14838a) << 32) | (Float.floatToRawIntBits(fMo14838a) & 4294967295L);
        float f14 = enumC6757m == enumC6757m2 ? fMo14838a3 : fMo14838a4;
        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
        if (enumC6757m != enumC6757m2) {
            fMo14838a4 = fMo14838a3;
        }
        return new e0(new C0849d(c0848cM10543a.f5354a, c0848cM10543a.f5355b, c0848cM10543a.f5356c, c0848cM10543a.f5357d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (Float.floatToRawIntBits(fMo14838a4) << 32) | (Float.floatToRawIntBits(fMo14838a4) & 4294967295L)));
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f37631a + ", topEnd = " + this.f37632b + ", bottomEnd = " + this.f37633c + ", bottomStart = " + this.f37634d + ')';
    }
}

package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.C5243b;
import og.pe;
import s2.C6735d;
import s4.EnumC6757m;
import t3.InterfaceC7035v;
import u2.InterfaceC7328y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g2.e */
/* loaded from: classes.dex */
public final class C2451e extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11419a;

    /* renamed from: b */
    public final /* synthetic */ int f11420b;

    /* renamed from: c */
    public final /* synthetic */ Object f11421c;

    /* renamed from: d */
    public final /* synthetic */ Object f11422d;

    /* renamed from: e */
    public final /* synthetic */ Object f11423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2451e(ArrayList arrayList, t3.l0 l0Var, int i10, ArrayList arrayList2) {
        super(1);
        this.f11419a = 0;
        float f6 = AbstractC2457k.f11886a;
        this.f11421c = arrayList;
        this.f11423e = l0Var;
        this.f11420b = i10;
        this.f11422d = arrayList2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11419a) {
            case 0:
                t3.v0 v0Var = (t3.v0) obj;
                ArrayList arrayList = (ArrayList) this.f11421c;
                t3.l0 l0Var = (t3.l0) this.f11423e;
                float f6 = AbstractC2457k.f11888c;
                ArrayList arrayList2 = (ArrayList) this.f11422d;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    List list = (List) arrayList.get(i10);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i11 = 0;
                    while (i11 < size2) {
                        iArr[i11] = ((t3.w0) list.get(i11)).f34030a + (i11 < pe.m10832g(list) ? l0Var.e0(f6) : 0);
                        i11++;
                    }
                    C5243b c5243b = AbstractC5251j.f25758b;
                    int[] iArr2 = new int[size2];
                    for (int i12 = 0; i12 < size2; i12++) {
                        iArr2[i12] = 0;
                    }
                    c5243b.mo10316c(l0Var, this.f11420b, iArr, l0Var.getLayoutDirection(), iArr2);
                    int size3 = list.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        v0Var.m13324d((t3.w0) list.get(i13), iArr2[i13], ((Number) arrayList2.get(i10)).intValue(), DefinitionKt.NO_Float_VALUE);
                    }
                }
                return qw.a0.f30746a;
            case 1:
                if (obj == ((k2.c0) this.f11421c)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof InterfaceC7328y) {
                    int i14 = ((C6735d) this.f11422d).f32177a;
                    e1.d0 d0Var = (e1.d0) this.f11423e;
                    int i15 = i14 - this.f11420b;
                    int iM5535d = d0Var.m5535d(obj);
                    d0Var.m5539h(Math.min(i15, iM5535d >= 0 ? d0Var.f8949c[iM5535d] : Integer.MAX_VALUE), obj);
                }
                return qw.a0.f30746a;
            case 2:
                t3.v0 v0Var2 = (t3.v0) obj;
                t3.w0[] w0VarArr = (t3.w0[]) this.f11421c;
                o1.n1 n1Var = (o1.n1) this.f11422d;
                int[] iArr3 = (int[]) this.f11423e;
                int length = w0VarArr.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length) {
                    t3.w0 w0Var = w0VarArr[i16];
                    int i18 = i17 + 1;
                    AbstractC4154l.m8920c(w0Var);
                    Object objMo13310C = w0Var.mo13310C();
                    o1.l1 l1Var = objMo13310C instanceof o1.l1 ? (o1.l1) objMo13310C : null;
                    AbstractC5244c abstractC5244c = l1Var != null ? l1Var.f25784c : null;
                    int i19 = this.f11420b;
                    v0Var2.m13324d(w0Var, iArr3[i17], abstractC5244c != null ? abstractC5244c.mo10334g(i19 - w0Var.f34031b, EnumC6757m.Ltr) : n1Var.f25797b.m14849a(0, i19 - w0Var.f34031b), DefinitionKt.NO_Float_VALUE);
                    i16++;
                    i17 = i18;
                }
                return qw.a0.f30746a;
            case 3:
                t3.v0 v0Var3 = (t3.v0) obj;
                t3.w0 w0Var2 = (t3.w0) this.f11422d;
                t3.l0 l0Var2 = (t3.l0) this.f11423e;
                x1.m0 m0Var = (x1.m0) this.f11421c;
                int i20 = m0Var.f39600b;
                x1.p1 p1Var = m0Var.f39599a;
                l4.i0 i0Var = m0Var.f39601c;
                x1.r1 r1Var = (x1.r1) m0Var.f39602d.invoke();
                p1Var.m15440a(k1.x0.Horizontal, x1.r0.m15453m(l0Var2, i20, i0Var, r1Var != null ? r1Var.f39668a : null, l0Var2.getLayoutDirection() == EnumC6757m.Rtl, w0Var2.f34030a), this.f11420b, w0Var2.f34030a);
                t3.v0.m13319g(v0Var3, w0Var2, Math.round(-p1Var.f39635a.m8490f()), 0);
                return qw.a0.f30746a;
            default:
                t3.v0 v0Var4 = (t3.v0) obj;
                t3.w0 w0Var3 = (t3.w0) this.f11422d;
                t3.l0 l0Var3 = (t3.l0) this.f11423e;
                x1.w1 w1Var = (x1.w1) this.f11421c;
                int i21 = w1Var.f39733b;
                x1.p1 p1Var2 = w1Var.f39732a;
                l4.i0 i0Var2 = w1Var.f39734c;
                x1.r1 r1Var2 = (x1.r1) w1Var.f39735d.invoke();
                p1Var2.m15440a(k1.x0.Vertical, x1.r0.m15453m(l0Var3, i21, i0Var2, r1Var2 != null ? r1Var2.f39668a : null, false, w0Var3.f34030a), this.f11420b, w0Var3.f34031b);
                t3.v0.m13319g(v0Var4, w0Var3, 0, Math.round(-p1Var2.f39635a.m8490f()));
                return qw.a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2451e(k2.c0 c0Var, C6735d c6735d, e1.d0 d0Var, int i10) {
        super(1);
        this.f11419a = 1;
        this.f11421c = c0Var;
        this.f11422d = c6735d;
        this.f11423e = d0Var;
        this.f11420b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2451e(t3.l0 l0Var, InterfaceC7035v interfaceC7035v, t3.w0 w0Var, int i10, int i11) {
        super(1);
        this.f11419a = i11;
        this.f11423e = l0Var;
        this.f11421c = interfaceC7035v;
        this.f11422d = w0Var;
        this.f11420b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2451e(t3.w0[] w0VarArr, o1.n1 n1Var, int i10, int[] iArr) {
        super(1);
        this.f11419a = 2;
        this.f11421c = w0VarArr;
        this.f11422d = n1Var;
        this.f11420b = i10;
        this.f11423e = iArr;
    }
}

package bt;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import at.C0433d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import cv.C1518n;
import dt.C1818x;
import ex.InterfaceC2137a;
import ex.InterfaceC2142f;
import g2.AbstractC2465s;
import g2.ja;
import g2.p9;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.InterfaceC5262u;
import o1.o1;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.b1;
import sq.g2;
import tx.InterfaceC7266z;
import uv.AbstractC7554g;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f4929a;

    /* renamed from: b */
    public final /* synthetic */ Object f4930b;

    /* renamed from: c */
    public final /* synthetic */ Object f4931c;

    /* renamed from: d */
    public final /* synthetic */ String f4932d;

    /* renamed from: e */
    public final /* synthetic */ int f4933e;

    /* renamed from: f */
    public final /* synthetic */ Object f4934f;

    public /* synthetic */ u0(C1818x c1818x, C0433d c0433d, String str, int i10, String str2, int i11) {
        this.f4929a = i11;
        this.f4930b = c1818x;
        this.f4931c = c0433d;
        this.f4932d = str;
        this.f4933e = i10;
        this.f4934f = str2;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4929a) {
            case 0:
                C1818x c1818x = (C1818x) this.f4930b;
                C0433d c0433d = (C0433d) this.f4931c;
                Object obj4 = (String) this.f4934f;
                InterfaceC5262u DropdownMenu = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(DropdownMenu, "$this$DropdownMenu");
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zM8616i = c3966o.m8616i(c1818x);
                    Object objM8596M = c3966o.m8596M();
                    Object obj5 = C3961j.f20408a;
                    if (zM8616i || objM8596M == obj5) {
                        objM8596M = new t0(c1818x, 0);
                        c3966o.j0(objM8596M);
                    }
                    InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M;
                    Integer numValueOf = Integer.valueOf(R.drawable.copytokeybord);
                    float f6 = 20;
                    C7876o c7876o = C7876o.f37669a;
                    g2.m13126D(R.string.copy_to_clip_board, interfaceC2137a, null, numValueOf, false, null, null, null, null, null, AbstractC0245d.m678o(c7876o, f6), c3966o, 0);
                    InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o, f6);
                    boolean zM8616i2 = c3966o.m8616i(c0433d) | c3966o.m8616i(c1818x);
                    String str = this.f4932d;
                    boolean zM8614g = zM8616i2 | c3966o.m8614g(str);
                    int i10 = this.f4933e;
                    boolean zM8612e = zM8614g | c3966o.m8612e(i10);
                    Object objM8596M2 = c3966o.m8596M();
                    if (zM8612e || objM8596M2 == obj5) {
                        objM8596M2 = new v0(c0433d, c1818x, str, i10);
                        c3966o.j0(objM8596M2);
                    }
                    g2.m13126D(R.string.edit, (InterfaceC2137a) objM8596M2, null, Integer.valueOf(R.drawable.ic_note_edit), false, null, null, null, null, null, interfaceC7879rM678o, c3966o, 0);
                    boolean zM8616i3 = c3966o.m8616i(c1818x) | c3966o.m8614g(obj4) | c3966o.m8612e(i10);
                    Object objM8596M3 = c3966o.m8596M();
                    if (zM8616i3 || objM8596M3 == obj5) {
                        objM8596M3 = new w0(c1818x, obj4, i10, 0);
                        c3966o.j0(objM8596M3);
                    }
                    g2.m13126D(R.string.clone, (InterfaceC2137a) objM8596M3, null, Integer.valueOf(R.drawable.clone), false, null, null, null, null, null, AbstractC0245d.m678o(c7876o, f6), c3966o, 0);
                    boolean zM8616i4 = c3966o.m8616i(c1818x);
                    Object objM8596M4 = c3966o.m8596M();
                    if (zM8616i4 || objM8596M4 == obj5) {
                        objM8596M4 = new t0(c1818x, 3);
                        c3966o.j0(objM8596M4);
                    }
                    g2.m13126D(R.string.delete, (InterfaceC2137a) objM8596M4, null, Integer.valueOf(R.drawable.deletegray), false, null, null, null, null, null, AbstractC0245d.m678o(c7876o, f6), c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                C1818x c1818x2 = (C1818x) this.f4930b;
                C0433d c0433d2 = (C0433d) this.f4931c;
                String str2 = (String) this.f4934f;
                o1 AppBar = (o1) obj;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(AppBar, "$this$AppBar");
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zM8616i5 = c3966o2.m8616i(c1818x2);
                    Object objM8596M5 = c3966o2.m8596M();
                    k2.s0 s0Var = C3961j.f20408a;
                    if (zM8616i5 || objM8596M5 == s0Var) {
                        objM8596M5 = new t0(c1818x2, 1);
                        c3966o2.j0(objM8596M5);
                    }
                    C6734c c6734c = b0.f4782g;
                    C7876o c7876o2 = C7876o.f37669a;
                    p9.m6246j((InterfaceC2137a) objM8596M5, c7876o2, false, null, null, c6734c, c3966o2, 196656, 28);
                    boolean z6 = c0433d2.f3192a;
                    float f10 = 0;
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                    InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(c7876o2, AbstractC7554g.m14301b(c3966o2).f36392d, d3.h0.f7748a);
                    boolean zM8616i6 = c3966o2.m8616i(c1818x2);
                    Object objM8596M6 = c3966o2.m8596M();
                    if (zM8616i6 || objM8596M6 == s0Var) {
                        objM8596M6 = new t0(c1818x2, 2);
                        c3966o2.j0(objM8596M6);
                    }
                    AbstractC2465s.m6298a(z6, (InterfaceC2137a) objM8596M6, interfaceC7879rM633a, jFloatToRawIntBits, null, null, null, 0L, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, AbstractC6740i.m12902d(1013859765, new u0(c1818x2, c0433d2, this.f4932d, this.f4933e, str2, 0), c3966o2), c3966o2, 3072, 2032);
                } else {
                    c3966o2.m8601S();
                }
                break;
            default:
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f4930b;
                ja jaVar = (ja) this.f4931c;
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) this.f4934f;
                InterfaceC5262u BottomSheet = (InterfaceC5262u) obj;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC4154l.m8923f(BottomSheet, "$this$BottomSheet");
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    C7876o c7876o3 = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(AbstractC0245d.m668e(c7876o3, 1.0f), 20);
                    C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o3, 0);
                    int i11 = c3966o3.f20462P;
                    i1 i1VarM8620m = c3966o3.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM656j);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o3.c0();
                    if (c3966o3.f20461O) {
                        c3966o3.m8619l(c7637i);
                    } else {
                        c3966o3.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o3);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o3);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i11))) {
                        AbstractC1452a.m4577x(i11, c3966o3, i11, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o3);
                    float f11 = 15;
                    b1.m13113q(this.f4932d, AbstractC0242a.m660n(AbstractC0242a.m656j(c7876o3, 10), f11, DefinitionKt.NO_Float_VALUE, f11, f11, 2), 0L, null, null, 0, 0, 0L, null, null, c3966o3, 48, 1020);
                    boolean zM8616i7 = c3966o3.m8616i(interfaceC7266z) | c3966o3.m8614g(jaVar) | c3966o3.m8614g(interfaceC2137a2);
                    Object objM8596M7 = c3966o3.m8596M();
                    if (zM8616i7 || objM8596M7 == C3961j.f20408a) {
                        objM8596M7 = new C1518n(interfaceC7266z, jaVar, interfaceC2137a2, 1);
                        c3966o3.j0(objM8596M7);
                    }
                    p9.m6238b((InterfaceC2137a) objM8596M7, AbstractC0245d.m668e(AbstractC0242a.m660n(c7876o3, f11, DefinitionKt.NO_Float_VALUE, f11, f11, 2), 1.0f), false, null, null, null, null, null, AbstractC6740i.m12902d(305381744, new qr.a0(this.f4933e, 2), c3966o3), c3966o3, 805306416, 508);
                    c3966o3.m8623p(true);
                } else {
                    c3966o3.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ u0(String str, InterfaceC7266z interfaceC7266z, ja jaVar, InterfaceC2137a interfaceC2137a, int i10) {
        this.f4929a = 2;
        this.f4932d = str;
        this.f4930b = interfaceC7266z;
        this.f4931c = jaVar;
        this.f4934f = interfaceC2137a;
        this.f4933e = i10;
    }
}

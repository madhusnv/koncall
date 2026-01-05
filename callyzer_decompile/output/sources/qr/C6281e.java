package qr;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.lazy.InterfaceC0246a;
import au.C0448l;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import java.util.ArrayList;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import nx.AbstractC5178p;
import o1.AbstractC5251j;
import o1.m1;
import o1.n1;
import og.pe;
import og.r0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import pc.C5876d;
import pg.i0;
import r1.C6428m;
import sq.b1;
import u2.C7320q;
import ur.C7530w;
import ur.k0;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import vs.C7769k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import ws.C8176q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.e */
/* loaded from: classes3.dex */
public final class C6281e extends AbstractC4155m implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f30526a;

    /* renamed from: b */
    public final /* synthetic */ Object f30527b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f30528c;

    /* renamed from: d */
    public final /* synthetic */ List f30529d;

    /* renamed from: e */
    public final /* synthetic */ Object f30530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6281e(ArrayList arrayList, String str, C8176q c8176q, InterfaceC2139c interfaceC2139c) {
        super(4);
        this.f30526a = 3;
        this.f30529d = arrayList;
        this.f30530e = str;
        this.f30527b = c8176q;
        this.f30528c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f30526a) {
            case 0:
                InterfaceC0246a interfaceC0246a = (InterfaceC0246a) obj;
                int iIntValue = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i10 = (((C3966o) interfaceC3962k).m8614g(interfaceC0246a) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= ((C3966o) interfaceC3962k).m8612e(iIntValue) ? 32 : 16;
                }
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(i10 & 1, (i10 & 147) != 146)) {
                    String str = (String) this.f30529d.get(iIntValue);
                    c3966o.m8607Y(-1607517849);
                    boolean z6 = ((C7530w) this.f30527b).f36270b == iIntValue;
                    InterfaceC2139c interfaceC2139c = this.f30528c;
                    boolean zM8614g = ((((i10 & 112) ^ 48) > 32 && c3966o.m8612e(iIntValue)) || (i10 & 48) == 32) | c3966o.m8614g(interfaceC2139c);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C6280d(iIntValue, 0, interfaceC2139c);
                        c3966o.j0(objM8596M);
                    }
                    AbstractC6287k.m12293j(0, (InterfaceC2137a) objM8596M, str, c3966o, z6);
                    if (iIntValue < pe.m10832g((List) this.f30530e)) {
                        c3966o.m8607Y(-1607340065);
                        p9.m6245i(AbstractC0242a.m660n(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 40, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), 1, ((v1) c3966o.m8618k(y1.f13286a)).f12928A, c3966o, 54, 0);
                    } else {
                        c3966o.m8607Y(-1609252579);
                    }
                    c3966o.m8623p(false);
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                InterfaceC0246a interfaceC0246a2 = (InterfaceC0246a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i11 = (((C3966o) interfaceC3962k2).m8614g(interfaceC0246a2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i11 |= ((C3966o) interfaceC3962k2).m8612e(iIntValue3) ? 32 : 16;
                }
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(i11 & 1, (i11 & 147) != 146)) {
                    k0 k0Var = (k0) ((ArrayList) this.f30529d).get(iIntValue3);
                    c3966o2.m8607Y(689540802);
                    boolean z10 = ((C7530w) this.f30527b).f36270b == iIntValue3;
                    InterfaceC2139c interfaceC2139c2 = this.f30528c;
                    boolean zM8614g2 = ((((i11 & 112) ^ 48) > 32 && c3966o2.m8612e(iIntValue3)) || (i11 & 48) == 32) | c3966o2.m8614g(interfaceC2139c2);
                    Object objM8596M2 = c3966o2.m8596M();
                    if (zM8614g2 || objM8596M2 == C3961j.f20408a) {
                        objM8596M2 = new C6280d(iIntValue3, 1, interfaceC2139c2);
                        c3966o2.j0(objM8596M2);
                    }
                    AbstractC6287k.m12294k(k0Var, z10, (InterfaceC2137a) objM8596M2, c3966o2, 0);
                    if (iIntValue3 < pe.m10832g((ArrayList) this.f30530e)) {
                        c3966o2.m8607Y(689719547);
                        p9.m6245i(AbstractC0242a.m660n(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 35, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), 1, ((v1) c3966o2.m8618k(y1.f13286a)).f12928A, c3966o2, 54, 0);
                    } else {
                        c3966o2.m8607Y(685733753);
                    }
                    c3966o2.m8623p(false);
                    c3966o2.m8623p(false);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                InterfaceC0246a interfaceC0246a3 = (InterfaceC0246a) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                C7320q c7320q = (C7320q) this.f30530e;
                if ((iIntValue6 & 6) == 0) {
                    i12 = (((C3966o) interfaceC3962k3).m8614g(interfaceC0246a3) ? 4 : 2) | iIntValue6;
                } else {
                    i12 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i12 |= ((C3966o) interfaceC3962k3).m8612e(iIntValue5) ? 32 : 16;
                }
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(i12 & 1, (i12 & 147) != 146)) {
                    k0 k0Var2 = (k0) ((ArrayList) this.f30529d).get(iIntValue5);
                    c3966o3.m8607Y(1983226631);
                    boolean zContains = c7320q.contains(Integer.valueOf(iIntValue5));
                    boolean zM8614g3 = c3966o3.m8614g(c7320q);
                    boolean z11 = (((i12 & 112) ^ 48) > 32 && c3966o3.m8612e(iIntValue5)) || (i12 & 48) == 32;
                    InterfaceC2139c interfaceC2139c3 = this.f30528c;
                    boolean zM8614g4 = z11 | zM8614g3 | c3966o3.m8614g(interfaceC2139c3);
                    Object objM8596M3 = c3966o3.m8596M();
                    if (zM8614g4 || objM8596M3 == C3961j.f20408a) {
                        objM8596M3 = new C5876d(c7320q, iIntValue5, interfaceC2139c3);
                        c3966o3.j0(objM8596M3);
                    }
                    AbstractC6287k.m12295l(k0Var2, zContains, (InterfaceC2137a) objM8596M3, c3966o3, 0);
                    if (iIntValue5 < pe.m10832g((ArrayList) this.f30527b)) {
                        c3966o3.m8607Y(1983690793);
                        p9.m6245i(AbstractC0242a.m660n(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), 35, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), 1, ((v1) c3966o3.m8618k(y1.f13286a)).f12928A, c3966o3, 54, 0);
                    } else {
                        c3966o3.m8607Y(1976801415);
                    }
                    c3966o3.m8623p(false);
                    c3966o3.m8623p(false);
                } else {
                    c3966o3.m8601S();
                }
                break;
            default:
                C6428m c6428m = (C6428m) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                C8176q c8176q = (C8176q) this.f30527b;
                String str2 = (String) this.f30530e;
                if ((iIntValue8 & 6) == 0) {
                    i13 = (((C3966o) interfaceC3962k4).m8614g(c6428m) ? 4 : 2) | iIntValue8;
                } else {
                    i13 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i13 |= ((C3966o) interfaceC3962k4).m8612e(iIntValue7) ? 32 : 16;
                }
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(i13 & 1, (i13 & 147) != 146)) {
                    C7769k c7769k = (C7769k) ((ArrayList) this.f30529d).get(iIntValue7);
                    c3966o4.m8607Y(-738473695);
                    float f6 = 5;
                    C7876o c7876o = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(AbstractC0242a.m658l(c7876o, DefinitionKt.NO_Float_VALUE, f6, 1), 1.0f);
                    n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, C7864c.f37652l, c3966o4, 48);
                    int i14 = c3966o4.f20462P;
                    i1 i1VarM8620m = c3966o4.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o4, interfaceC7879rM668e);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o4.c0();
                    if (c3966o4.f20461O) {
                        c3966o4.m8619l(c7637i);
                    } else {
                        c3966o4.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o4);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o4);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i14))) {
                        AbstractC1452a.m4577x(i14, c3966o4, i14, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o4);
                    if (str2 == null || AbstractC5178p.m10101L(str2)) {
                        c3966o4.m8607Y(138488505);
                        boolean zM8918a = AbstractC4154l.m8918a(c8176q.f39105g, c7769k.f37432b);
                        InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o, 20);
                        boolean zM8614g5 = c3966o4.m8614g(str2);
                        InterfaceC2139c interfaceC2139c4 = this.f30528c;
                        boolean zM8614g6 = zM8614g5 | c3966o4.m8614g(interfaceC2139c4) | c3966o4.m8614g(c7769k);
                        Object objM8596M4 = c3966o4.m8596M();
                        if (zM8614g6 || objM8596M4 == C3961j.f20408a) {
                            objM8596M4 = new C0448l(str2, interfaceC2139c4, c7769k);
                            c3966o4.j0(objM8596M4);
                        }
                        b1.m13121y(zM8918a, (InterfaceC2137a) objM8596M4, interfaceC7879rM678o, 0L, 0L, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, c3966o4, KyberEngine.KyberPolyBytes, 248);
                        c3966o4.m8623p(false);
                    } else {
                        c3966o4.m8607Y(138975732);
                        b1.m13121y(AbstractC4154l.m8918a(c8176q.f39105g, c7769k.f37432b), null, AbstractC0245d.m678o(c7876o, 20), 0L, 0L, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, c3966o4, KyberEngine.KyberPolyBytes, 250);
                        c3966o4.m8623p(false);
                    }
                    i0.m11693a(r0.m10866b(c7769k.f37431a, 0, c3966o4), "", AbstractC0242a.m660n(AbstractC0245d.m678o(c7876o, 20), f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o4, 432, 120);
                    b1.m13113q(c7769k.f37432b, AbstractC0242a.m660n(c7876o, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), c7769k.f37433c, null, null, 0, 0, 0L, null, ((vd) c3966o4.m8618k(xd.f13268a)).f13055k, c3966o4, 48, 504);
                    c3966o4.m8623p(true);
                    c3966o4.m8623p(false);
                } else {
                    c3966o4.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6281e(ArrayList arrayList, C7320q c7320q, InterfaceC2139c interfaceC2139c, ArrayList arrayList2) {
        super(4);
        this.f30526a = 2;
        this.f30529d = arrayList;
        this.f30530e = c7320q;
        this.f30528c = interfaceC2139c;
        this.f30527b = arrayList2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6281e(List list, C7530w c7530w, InterfaceC2139c interfaceC2139c, List list2, int i10) {
        super(4);
        this.f30526a = i10;
        this.f30529d = list;
        this.f30527b = c7530w;
        this.f30528c = interfaceC2139c;
        this.f30530e = list2;
    }
}

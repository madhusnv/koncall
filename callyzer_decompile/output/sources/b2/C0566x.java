package b2;

import b3.C0585q;
import ex.InterfaceC2139c;
import g4.C2490f;
import g4.C2492h;
import java.util.List;
import k1.C3936k;
import k1.t1;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4165w;
import l4.C4356a;
import l4.C4365j;
import l4.C4381z;
import og.pe;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.iana.AEADAlgorithm;
import tb.C7105p;
import x1.C8259i;
import x1.r1;
import x1.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.x */
/* loaded from: classes.dex */
public final class C0566x extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3854a;

    /* renamed from: b */
    public final /* synthetic */ Object f3855b;

    /* renamed from: c */
    public final /* synthetic */ Object f3856c;

    /* renamed from: d */
    public final /* synthetic */ Object f3857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0566x(int i10, Object obj, Object obj2, Object obj3) {
        super(1);
        this.f3854a = i10;
        this.f3855b = obj;
        this.f3856c = obj2;
        this.f3857d = obj3;
    }

    /* renamed from: a */
    private final Object m1690a(Object obj) {
        Integer numM1664d;
        Integer numM1665e;
        Integer numM1665e2;
        Integer numM1664d2;
        g4.l0 l0Var;
        g4.l0 l0Var2;
        r1 r1Var;
        r1 r1Var2;
        Integer numM1664d3;
        Integer numM1665e3;
        Integer numM1665e4;
        Integer numM1664d4;
        g4.l0 l0Var3;
        g4.l0 l0Var4;
        r1 r1Var3;
        r1 r1Var4;
        C7105p c7105p;
        r0 r0Var = (r0) obj;
        x1.h1 h1Var = (x1.h1) this.f3856c;
        int i10 = 19;
        C4381z c4381z = null;
        switch (x1.g1.f39500a[((x1.n0) this.f3855b).ordinal()]) {
            case 1:
                h1Var.f39507b.m1693b(false);
                break;
            case 2:
                h1Var.f39507b.m1703m();
                break;
            case 3:
                h1Var.f39507b.m1694d();
                break;
            case 4:
                r0Var.f3813e.f3748a = null;
                if (r0Var.f3815g.f13620b.length() > 0) {
                    if (!g4.n0.m6455b(r0Var.f3814f)) {
                        if (!r0Var.m1666f()) {
                            int iM6457d = g4.n0.m6457d(r0Var.f3814f);
                            r0Var.m1676p(iM6457d, iM6457d);
                            break;
                        } else {
                            int iM6458e = g4.n0.m6458e(r0Var.f3814f);
                            r0Var.m1676p(iM6458e, iM6458e);
                            break;
                        }
                    } else {
                        r0Var.m1669i();
                        break;
                    }
                }
                break;
            case 5:
                r0Var.f3813e.f3748a = null;
                if (r0Var.f3815g.f13620b.length() > 0) {
                    if (!g4.n0.m6455b(r0Var.f3814f)) {
                        if (!r0Var.m1666f()) {
                            int iM6458e2 = g4.n0.m6458e(r0Var.f3814f);
                            r0Var.m1676p(iM6458e2, iM6458e2);
                            break;
                        } else {
                            int iM6457d2 = g4.n0.m6457d(r0Var.f3814f);
                            r0Var.m1676p(iM6457d2, iM6457d2);
                            break;
                        }
                    } else {
                        r0Var.m1672l();
                        break;
                    }
                }
                break;
            case 6:
                g1 g1Var = r0Var.f3813e;
                g1Var.f3748a = null;
                C2492h c2492h = r0Var.f3815g;
                String str = c2492h.f13620b;
                String str2 = c2492h.f13620b;
                if (str.length() > 0) {
                    if (!r0Var.m1666f()) {
                        g1Var.f3748a = null;
                        if (str2.length() > 0 && (numM1664d = r0Var.m1664d()) != null) {
                            int iIntValue = numM1664d.intValue();
                            r0Var.m1676p(iIntValue, iIntValue);
                            break;
                        }
                    } else {
                        g1Var.f3748a = null;
                        if (str2.length() > 0 && (numM1665e = r0Var.m1665e()) != null) {
                            int iIntValue2 = numM1665e.intValue();
                            r0Var.m1676p(iIntValue2, iIntValue2);
                            break;
                        }
                    }
                }
                break;
            case 7:
                g1 g1Var2 = r0Var.f3813e;
                g1Var2.f3748a = null;
                C2492h c2492h2 = r0Var.f3815g;
                String str3 = c2492h2.f13620b;
                String str4 = c2492h2.f13620b;
                if (str3.length() > 0) {
                    if (!r0Var.m1666f()) {
                        g1Var2.f3748a = null;
                        if (str4.length() > 0 && (numM1665e2 = r0Var.m1665e()) != null) {
                            int iIntValue3 = numM1665e2.intValue();
                            r0Var.m1676p(iIntValue3, iIntValue3);
                            break;
                        }
                    } else {
                        g1Var2.f3748a = null;
                        if (str4.length() > 0 && (numM1664d2 = r0Var.m1664d()) != null) {
                            int iIntValue4 = numM1664d2.intValue();
                            r0Var.m1676p(iIntValue4, iIntValue4);
                            break;
                        }
                    }
                }
                break;
            case 8:
                r0Var.m1671k();
                break;
            case 9:
                r0Var.m1670j();
                break;
            case 10:
                if (r0Var.f3815g.f13620b.length() > 0 && (l0Var = r0Var.f3811c) != null) {
                    int iM1667g = r0Var.m1667g(l0Var, -1);
                    r0Var.m1676p(iM1667g, iM1667g);
                    break;
                }
                break;
            case 11:
                if (r0Var.f3815g.f13620b.length() > 0 && (l0Var2 = r0Var.f3811c) != null) {
                    int iM1667g2 = r0Var.m1667g(l0Var2, 1);
                    r0Var.m1676p(iM1667g2, iM1667g2);
                    break;
                }
                break;
            case 12:
                if (r0Var.f3815g.f13620b.length() > 0 && (r1Var = r0Var.f3817i) != null) {
                    int iM1668h = r0Var.m1668h(r1Var, -1);
                    r0Var.m1676p(iM1668h, iM1668h);
                    break;
                }
                break;
            case 13:
                if (r0Var.f3815g.f13620b.length() > 0 && (r1Var2 = r0Var.f3817i) != null) {
                    int iM1668h2 = r0Var.m1668h(r1Var2, 1);
                    r0Var.m1676p(iM1668h2, iM1668h2);
                    break;
                }
                break;
            case 14:
                r0Var.m1674n();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                r0Var.m1673m();
                break;
            case 16:
                r0Var.f3813e.f3748a = null;
                if (r0Var.f3815g.f13620b.length() > 0) {
                    if (!r0Var.m1666f()) {
                        r0Var.m1673m();
                        break;
                    } else {
                        r0Var.m1674n();
                        break;
                    }
                }
                break;
            case 17:
                r0Var.f3813e.f3748a = null;
                if (r0Var.f3815g.f13620b.length() > 0) {
                    if (!r0Var.m1666f()) {
                        r0Var.m1674n();
                        break;
                    } else {
                        r0Var.m1673m();
                        break;
                    }
                }
                break;
            case 18:
                r0Var.f3813e.f3748a = null;
                if (r0Var.f3815g.f13620b.length() > 0) {
                    r0Var.m1676p(0, 0);
                    break;
                }
                break;
            case 19:
                r0Var.f3813e.f3748a = null;
                C2492h c2492h3 = r0Var.f3815g;
                if (c2492h3.f13620b.length() > 0) {
                    int length = c2492h3.f13620b.length();
                    r0Var.m1676p(length, length);
                    break;
                }
                break;
            case 20:
                List listM1661a = r0Var.m1661a(C8259i.f39524h);
                if (listM1661a != null) {
                    h1Var.m15436a(listM1661a);
                    break;
                }
                break;
            case 21:
                List listM1661a2 = r0Var.m1661a(C8259i.f39525j);
                if (listM1661a2 != null) {
                    h1Var.m15436a(listM1661a2);
                    break;
                }
                break;
            case 22:
                List listM1661a3 = r0Var.m1661a(C8259i.f39526k);
                if (listM1661a3 != null) {
                    h1Var.m15436a(listM1661a3);
                    break;
                }
                break;
            case 23:
                List listM1661a4 = r0Var.m1661a(C8259i.f39527l);
                if (listM1661a4 != null) {
                    h1Var.m15436a(listM1661a4);
                    break;
                }
                break;
            case 24:
                List listM1661a5 = r0Var.m1661a(C8259i.f39528m);
                if (listM1661a5 != null) {
                    h1Var.m15436a(listM1661a5);
                    break;
                }
                break;
            case 25:
                List listM1661a6 = r0Var.m1661a(C8259i.f39529n);
                if (listM1661a6 != null) {
                    h1Var.m15436a(listM1661a6);
                    break;
                }
                break;
            case 26:
                if (!h1Var.f39510e) {
                    h1Var.m15436a(pe.m10833h(new C4356a("\n", 1)));
                    break;
                } else {
                    h1Var.f39506a.f39725w.invoke(new C4365j(h1Var.f39517l));
                    break;
                }
            case 27:
                if (!h1Var.f39510e) {
                    h1Var.m15436a(pe.m10833h(new C4356a("\t", 1)));
                    break;
                } else {
                    ((C4164v) this.f3857d).f21160a = false;
                    break;
                }
            case 28:
                r0Var.f3813e.f3748a = null;
                C2492h c2492h4 = r0Var.f3815g;
                if (c2492h4.f13620b.length() > 0) {
                    r0Var.m1676p(0, c2492h4.f13620b.length());
                    break;
                }
                break;
            case 29:
                r0Var.m1669i();
                r0Var.m1675o();
                break;
            case 30:
                r0Var.m1672l();
                r0Var.m1675o();
                break;
            case BERTags.DATE /* 31 */:
                g1 g1Var3 = r0Var.f3813e;
                g1Var3.f3748a = null;
                C2492h c2492h5 = r0Var.f3815g;
                String str5 = c2492h5.f13620b;
                String str6 = c2492h5.f13620b;
                if (str5.length() > 0) {
                    if (r0Var.m1666f()) {
                        g1Var3.f3748a = null;
                        if (str6.length() > 0 && (numM1665e3 = r0Var.m1665e()) != null) {
                            int iIntValue5 = numM1665e3.intValue();
                            r0Var.m1676p(iIntValue5, iIntValue5);
                        }
                    } else {
                        g1Var3.f3748a = null;
                        if (str6.length() > 0 && (numM1664d3 = r0Var.m1664d()) != null) {
                            int iIntValue6 = numM1664d3.intValue();
                            r0Var.m1676p(iIntValue6, iIntValue6);
                        }
                    }
                }
                r0Var.m1675o();
                break;
            case 32:
                g1 g1Var4 = r0Var.f3813e;
                g1Var4.f3748a = null;
                C2492h c2492h6 = r0Var.f3815g;
                String str7 = c2492h6.f13620b;
                String str8 = c2492h6.f13620b;
                if (str7.length() > 0) {
                    if (r0Var.m1666f()) {
                        g1Var4.f3748a = null;
                        if (str8.length() > 0 && (numM1664d4 = r0Var.m1664d()) != null) {
                            int iIntValue7 = numM1664d4.intValue();
                            r0Var.m1676p(iIntValue7, iIntValue7);
                        }
                    } else {
                        g1Var4.f3748a = null;
                        if (str8.length() > 0 && (numM1665e4 = r0Var.m1665e()) != null) {
                            int iIntValue8 = numM1665e4.intValue();
                            r0Var.m1676p(iIntValue8, iIntValue8);
                        }
                    }
                }
                r0Var.m1675o();
                break;
            case BERTags.DATE_TIME /* 33 */:
                r0Var.m1671k();
                r0Var.m1675o();
                break;
            case BERTags.DURATION /* 34 */:
                r0Var.m1670j();
                r0Var.m1675o();
                break;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                r0Var.m1674n();
                r0Var.m1675o();
                break;
            case BERTags.RELATIVE_OID_IRI /* 36 */:
                r0Var.m1673m();
                r0Var.m1675o();
                break;
            case 37:
                r0Var.f3813e.f3748a = null;
                if (r0Var.f3815g.f13620b.length() > 0) {
                    if (r0Var.m1666f()) {
                        r0Var.m1674n();
                    } else {
                        r0Var.m1673m();
                    }
                }
                r0Var.m1675o();
                break;
            case 38:
                r0Var.f3813e.f3748a = null;
                if (r0Var.f3815g.f13620b.length() > 0) {
                    if (r0Var.m1666f()) {
                        r0Var.m1673m();
                    } else {
                        r0Var.m1674n();
                    }
                }
                r0Var.m1675o();
                break;
            case 39:
                if (r0Var.f3815g.f13620b.length() > 0 && (l0Var3 = r0Var.f3811c) != null) {
                    int iM1667g3 = r0Var.m1667g(l0Var3, -1);
                    r0Var.m1676p(iM1667g3, iM1667g3);
                }
                r0Var.m1675o();
                break;
            case JPAKEParticipant.STATE_ROUND_2_VALIDATED /* 40 */:
                if (r0Var.f3815g.f13620b.length() > 0 && (l0Var4 = r0Var.f3811c) != null) {
                    int iM1667g4 = r0Var.m1667g(l0Var4, 1);
                    r0Var.m1676p(iM1667g4, iM1667g4);
                }
                r0Var.m1675o();
                break;
            case 41:
                if (r0Var.f3815g.f13620b.length() > 0 && (r1Var3 = r0Var.f3817i) != null) {
                    int iM1668h3 = r0Var.m1668h(r1Var3, -1);
                    r0Var.m1676p(iM1668h3, iM1668h3);
                }
                r0Var.m1675o();
                break;
            case 42:
                if (r0Var.f3815g.f13620b.length() > 0 && (r1Var4 = r0Var.f3817i) != null) {
                    int iM1668h4 = r0Var.m1668h(r1Var4, 1);
                    r0Var.m1676p(iM1668h4, iM1668h4);
                }
                r0Var.m1675o();
                break;
            case 43:
                r0Var.f3813e.f3748a = null;
                if (r0Var.f3815g.f13620b.length() > 0) {
                    r0Var.m1676p(0, 0);
                }
                r0Var.m1675o();
                break;
            case 44:
                r0Var.f3813e.f3748a = null;
                C2492h c2492h7 = r0Var.f3815g;
                if (c2492h7.f13620b.length() > 0) {
                    int length2 = c2492h7.f13620b.length();
                    r0Var.m1676p(length2, length2);
                }
                r0Var.m1675o();
                break;
            case 45:
                r0Var.f3813e.f3748a = null;
                if (r0Var.f3815g.f13620b.length() > 0) {
                    long j6 = r0Var.f3814f;
                    int i11 = g4.n0.f13685c;
                    int i12 = (int) (j6 & 4294967295L);
                    r0Var.m1676p(i12, i12);
                    break;
                }
                break;
            case 46:
                u1 u1Var = h1Var.f39513h;
                if (u1Var != null) {
                    u1Var.m15476a(C4381z.m9153a(r0Var.f3816h, r0Var.f3815g, r0Var.f3814f, 4));
                }
                u1 u1Var2 = h1Var.f39513h;
                if (u1Var2 != null) {
                    C7105p c7105p2 = u1Var2.f39695a;
                    if (c7105p2 != null && (c7105p = (C7105p) c7105p2.f34290b) != null) {
                        u1Var2.f39695a = c7105p;
                        u1Var2.f39697c -= ((C4381z) c7105p2.f34291c).f21945a.f13620b.length();
                        u1Var2.f39696b = new C7105p(i10, u1Var2.f39696b, (C4381z) c7105p2.f34291c);
                        c4381z = (C4381z) c7105p.f34291c;
                    }
                    if (c4381z != null) {
                        h1Var.f39516k.invoke(c4381z);
                        break;
                    }
                }
                break;
            case 47:
                u1 u1Var3 = h1Var.f39513h;
                if (u1Var3 != null) {
                    C7105p c7105p3 = u1Var3.f39696b;
                    if (c7105p3 != null) {
                        u1Var3.f39696b = (C7105p) c7105p3.f34290b;
                        C4381z c4381z2 = (C4381z) c7105p3.f34291c;
                        u1Var3.f39695a = new C7105p(i10, u1Var3.f39695a, c4381z2);
                        u1Var3.f39697c = c4381z2.f21945a.f13620b.length() + u1Var3.f39697c;
                        c4381z = (C4381z) c7105p3.f34291c;
                    }
                    if (c4381z != null) {
                        h1Var.f39516k.invoke(c4381z);
                        break;
                    }
                }
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Type inference failed for: r15v3, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // ex.InterfaceC2139c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0566x.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0566x(b3.e0 e0Var, C0585q c0585q, InterfaceC2139c interfaceC2139c) {
        super(1);
        this.f3854a = 2;
        this.f3855b = e0Var;
        this.f3856c = c0585q;
        this.f3857d = (AbstractC4155m) interfaceC2139c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0566x(C4164v c4164v, C2490f c2490f, g4.g0 g0Var) {
        super(1);
        this.f3854a = 22;
        this.f3857d = c4164v;
        this.f3855b = c2490f;
        this.f3856c = g0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0566x(C4165w c4165w, t1 t1Var, C4165w c4165w2, C3936k c3936k) {
        super(1);
        this.f3854a = 14;
        this.f3855b = c4165w;
        this.f3856c = t1Var;
        this.f3857d = c4165w2;
    }
}

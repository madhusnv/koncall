package x1;

import d4.AbstractC1592t;
import d4.C1583k;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import g4.AbstractC2499o;
import g4.C2490f;
import java.text.BreakIterator;
import java.util.List;
import k4.AbstractC3988i;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4360e;
import n4.C4953b;
import og.pe;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import r4.C6446a;
import r4.C6457l;
import r4.C6462q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.i */
/* loaded from: classes.dex */
public final class C8259i extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C8259i f39518b;

    /* renamed from: c */
    public static final C8259i f39519c;

    /* renamed from: d */
    public static final C8259i f39520d;

    /* renamed from: e */
    public static final C8259i f39521e;

    /* renamed from: f */
    public static final C8259i f39522f;

    /* renamed from: g */
    public static final C8259i f39523g;

    /* renamed from: h */
    public static final C8259i f39524h;

    /* renamed from: j */
    public static final C8259i f39525j;

    /* renamed from: k */
    public static final C8259i f39526k;

    /* renamed from: l */
    public static final C8259i f39527l;

    /* renamed from: m */
    public static final C8259i f39528m;

    /* renamed from: n */
    public static final C8259i f39529n;

    /* renamed from: p */
    public static final C8259i f39530p;

    /* renamed from: q */
    public static final C8259i f39531q;

    /* renamed from: r */
    public static final C8259i f39532r;

    /* renamed from: a */
    public final /* synthetic */ int f39533a;

    static {
        int i10 = 1;
        f39518b = new C8259i(i10, 0);
        f39519c = new C8259i(i10, 1);
        f39520d = new C8259i(i10, 2);
        f39521e = new C8259i(i10, 3);
        f39522f = new C8259i(i10, 4);
        f39523g = new C8259i(i10, 5);
        f39524h = new C8259i(i10, 6);
        f39525j = new C8259i(i10, 7);
        f39526k = new C8259i(i10, 8);
        f39527l = new C8259i(i10, 9);
        f39528m = new C8259i(i10, 10);
        f39529n = new C8259i(i10, 11);
        f39530p = new C8259i(i10, 12);
        f39531q = new C8259i(i10, 13);
        f39532r = new C8259i(i10, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8259i(int i10, int i11) {
        super(i10);
        this.f39533a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        g4.m0 m0VarMo6453a;
        g4.g0 g0Var;
        int i10 = this.f39533a;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i10) {
            case 0:
                return a0Var;
            case 1:
                return a0Var;
            case 2:
                return a0Var;
            case 3:
                return a0Var;
            case 4:
                return a0Var;
            case 5:
                return a0Var;
            case 6:
                b2.r0 r0Var = (b2.r0) obj;
                long j6 = r0Var.f3814f;
                int i11 = g4.n0.f13685c;
                String str = r0Var.f3815g.f13620b;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                return new C4360e(((int) (j6 & 4294967295L)) - characterInstance.preceding((int) (4294967295L & j6)), 0);
            case 7:
                b2.r0 r0Var2 = (b2.r0) obj;
                String str2 = r0Var2.f3815g.f13620b;
                long j10 = r0Var2.f3814f;
                int i12 = g4.n0.f13685c;
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(str2);
                int iFollowing = characterInstance2.following((int) (j10 & 4294967295L));
                if (iFollowing != -1) {
                    return new C4360e(0, iFollowing - ((int) (4294967295L & r0Var2.f3814f)));
                }
                return null;
            case 8:
                b2.r0 r0Var3 = (b2.r0) obj;
                Integer numM1665e = r0Var3.m1665e();
                if (numM1665e == null) {
                    return null;
                }
                int iIntValue = numM1665e.intValue();
                long j11 = r0Var3.f3814f;
                int i13 = g4.n0.f13685c;
                return new C4360e(((int) (4294967295L & j11)) - iIntValue, 0);
            case 9:
                b2.r0 r0Var4 = (b2.r0) obj;
                Integer numM1664d = r0Var4.m1664d();
                if (numM1664d == null) {
                    return null;
                }
                int iIntValue2 = numM1664d.intValue();
                long j12 = r0Var4.f3814f;
                int i14 = g4.n0.f13685c;
                return new C4360e(0, iIntValue2 - ((int) (4294967295L & j12)));
            case 10:
                b2.r0 r0Var5 = (b2.r0) obj;
                Integer numM1663c = r0Var5.m1663c();
                if (numM1663c == null) {
                    return null;
                }
                int iIntValue3 = numM1663c.intValue();
                long j13 = r0Var5.f3814f;
                int i15 = g4.n0.f13685c;
                return new C4360e(((int) (4294967295L & j13)) - iIntValue3, 0);
            case 11:
                b2.r0 r0Var6 = (b2.r0) obj;
                Integer numM1662b = r0Var6.m1662b();
                if (numM1662b == null) {
                    return null;
                }
                int iIntValue4 = numM1662b.intValue();
                long j14 = r0Var6.f3814f;
                int i16 = g4.n0.f13685c;
                return new C4360e(0, iIntValue4 - ((int) (4294967295L & j14)));
            case 12:
                List list = (List) obj;
                Object obj2 = list.get(1);
                AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                k1.x0 x0Var = ((Boolean) obj2).booleanValue() ? k1.x0.Vertical : k1.x0.Horizontal;
                Object obj3 = list.get(0);
                AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new p1(x0Var, ((Float) obj3).floatValue());
            case 13:
                C2490f c2490f = (C2490f) obj;
                Object obj4 = c2490f.f13595a;
                if (!(obj4 instanceof AbstractC2499o) || (m0VarMo6453a = ((AbstractC2499o) obj4).mo6453a()) == null || (m0VarMo6453a.f13678a == null && m0VarMo6453a.f13679b == null && m0VarMo6453a.f13680c == null && m0VarMo6453a.f13681d == null)) {
                    return pe.m10826a(c2490f);
                }
                Object obj5 = c2490f.f13595a;
                AbstractC4154l.m8921d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                g4.m0 m0VarMo6453a2 = ((AbstractC2499o) obj5).mo6453a();
                if (m0VarMo6453a2 == null || (g0Var = m0VarMo6453a2.f13678a) == null) {
                    g0Var = new g4.g0(0L, 0L, (C3998s) null, (C3994o) null, (C3995p) null, (AbstractC3988i) null, (String) null, 0L, (C6446a) null, (C6462q) null, (C4953b) null, 0L, (C6457l) null, (d3.k0) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                }
                return pe.m10826a(c2490f, new C2490f(g0Var, c2490f.f13596b, c2490f.f13597c));
            default:
                ((C1583k) ((InterfaceC1596x) obj)).m5202q(AbstractC1592t.f7941y, a0Var);
                return a0Var;
        }
    }
}

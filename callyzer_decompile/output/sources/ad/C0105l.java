package ad;

import bj.C0669a;
import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import pg.aa;
import pg.x9;
import qw.C6361k;
import qw.a0;
import rw.AbstractC6663m;
import sd.C6813g;
import zc.AbstractC8927d;
import zc.C8926c;
import zc.C8934k;
import zc.C8935l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ad.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C0105l implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f365a;

    /* renamed from: b */
    public final /* synthetic */ C0104k f366b;

    public /* synthetic */ C0105l(C0104k c0104k, int i10) {
        this.f365a = i10;
        this.f366b = c0104k;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C6361k c6361k;
        int i10 = this.f365a;
        int i11 = 2;
        a0 a0Var = a0.f30746a;
        C0104k c0104k = this.f366b;
        String it = (String) obj;
        switch (i10) {
            case 0:
                AbstractC4154l.m8923f(it, "it");
                C8935l c8935l = C8935l.f42908c;
                c0104k.f358a = aa.m11541a(it);
                return a0Var;
            case 1:
                AbstractC4154l.m8923f(it, "authority");
                C0669a c0669a = new C0669a(it);
                C6361k c6361kM1939a = c0669a.m1939a(new String[]{"@"});
                if (c6361kM1939a != null) {
                    String str = (String) c6361kM1939a.f30755a;
                    int iIntValue = ((Number) c6361kM1939a.f30756b).intValue();
                    String strSubstring = it.substring(c0669a.f4225b, iIntValue);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                    c0669a.f4225b = iIntValue;
                    c0104k.f363f.m13389n(strSubstring);
                    c0669a.f4225b = str.length() + c0669a.f4225b;
                }
                c0669a.m1941c(new String[0], new C0105l(c0104k, i11));
                return a0Var;
            default:
                AbstractC4154l.m8923f(it, "hostport");
                if (AbstractC5178p.m10113X(it, '[')) {
                    int iM10098I = AbstractC5178p.m10098I(it, ']', 0, 6);
                    if (iM10098I <= 0) {
                        throw new IllegalArgumentException("unmatched [ or ]");
                    }
                    String strSubstring2 = it.substring(1, iM10098I);
                    AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                    AbstractC8927d abstractC8927dM11935c = x9.m11935c(C6813g.f32357g.m12987c(strSubstring2));
                    if (!(abstractC8927dM11935c instanceof C8926c) || !(((C8926c) abstractC8927dM11935c).f42890a instanceof C8934k)) {
                        throw new IllegalArgumentException("non-ipv6 host was enclosed in []-brackets");
                    }
                    int i12 = iM10098I + 1;
                    Character chValueOf = (i12 < 0 || i12 >= it.length()) ? null : Character.valueOf(it.charAt(i12));
                    if (chValueOf != null && chValueOf.charValue() == ':') {
                        String strSubstring3 = it.substring(iM10098I + 2);
                        AbstractC4154l.m8922e(strSubstring3, "substring(...)");
                        numValueOf = Integer.valueOf(Integer.parseInt(strSubstring3));
                    } else if (chValueOf != null) {
                        throw new IllegalArgumentException("unexpected characters after ]");
                    }
                    c6361k = new C6361k(abstractC8927dM11935c, numValueOf);
                } else {
                    List listM10111V = AbstractC5178p.m10111V(it, new char[]{':'}, 0, 6);
                    AbstractC8927d abstractC8927dM11935c2 = x9.m11935c(C6813g.f32357g.m12987c((String) listM10111V.get(0)));
                    if ((abstractC8927dM11935c2 instanceof C8926c) && (((C8926c) abstractC8927dM11935c2).f42890a instanceof C8934k)) {
                        throw new IllegalArgumentException("ipv6 host given without []-brackets");
                    }
                    String str2 = (String) AbstractC6663m.m12744H(listM10111V, 1);
                    c6361k = new C6361k(abstractC8927dM11935c2, str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null);
                }
                AbstractC8927d abstractC8927d = (AbstractC8927d) c6361k.f30755a;
                Integer num = (Integer) c6361k.f30756b;
                AbstractC4154l.m8923f(abstractC8927d, "<set-?>");
                c0104k.f359b = abstractC8927d;
                if (num != null) {
                    c0104k.f360c = Integer.valueOf(num.intValue());
                }
                return a0Var;
        }
    }
}

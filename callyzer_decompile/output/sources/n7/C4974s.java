package n7;

import ex.InterfaceC2143g;
import g1.C2433m;
import h1.x0;
import java.util.List;
import java.util.ListIterator;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4409i;
import og.n1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import qw.a0;
import s2.AbstractC6740i;
import t2.C7006e;
import t2.InterfaceC7003b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n7.s */
/* loaded from: classes.dex */
public final class C4974s implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ x0 f24692a;

    /* renamed from: b */
    public final /* synthetic */ C4409i f24693b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7003b f24694c;

    /* renamed from: d */
    public final /* synthetic */ w0 f24695d;

    /* renamed from: e */
    public final /* synthetic */ h2 f24696e;

    public C4974s(x0 x0Var, C4409i c4409i, C7006e c7006e, w0 w0Var, h2 h2Var) {
        this.f24692a = x0Var;
        this.f24693b = c4409i;
        this.f24694c = c7006e;
        this.f24695d = w0Var;
        this.f24696e = h2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        C4409i c4409iPrevious;
        C2433m c2433m = (C2433m) obj;
        C4409i c4409i = (C4409i) obj2;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj3;
        ((Number) obj4).intValue();
        boolean zM8918a = AbstractC4154l.m8918a(this.f24692a.f15646c.getValue(), this.f24693b);
        if (!((Boolean) this.f24695d.getValue()).booleanValue() && !zM8918a) {
            List list = (List) this.f24696e.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c4409iPrevious = 0;
                    break;
                }
                c4409iPrevious = listIterator.previous();
                if (AbstractC4154l.m8918a(c4409i, (C4409i) c4409iPrevious)) {
                    break;
                }
            }
            c4409i = c4409iPrevious;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        if (c4409i == null) {
            c3966o.m8607Y(105930796);
        } else {
            c3966o.m8607Y(-1520603531);
            n1.m10771a(c4409i, this.f24694c, AbstractC6740i.m12902d(-1263531443, new C4967l(c4409i, c2433m), c3966o), c3966o, KyberEngine.KyberPolyBytes);
        }
        c3966o.m8623p(false);
        return a0.f30746a;
    }
}

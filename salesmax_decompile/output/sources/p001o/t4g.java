package p001o;

import java.util.concurrent.atomic.AtomicReference;
import p001o.vre;

/* loaded from: classes6.dex */
public final class t4g extends r9 {

    /* renamed from: a */
    public final AtomicReference f46367a = new AtomicReference(null);

    @Override // p001o.r9
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21435a(r4g r4gVar) {
        if (iq3.m32544a(this.f46367a) != null) {
            return false;
        }
        iq3.m32545b(this.f46367a, s4g.f44811a);
        return true;
    }

    /* renamed from: e */
    public final Object m49303e(n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        if (!ec3.m24748a(this.f46367a, s4g.f44811a, zb2Var)) {
            vre.C17665a c17665a = vre.f50797b;
            zb2Var.resumeWith(vre.m53351b(y3i.f54824a));
        }
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v == uq8.m51918f() ? objM59140v : y3i.f54824a;
    }

    @Override // p001o.r9
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public n64[] mo21436b(r4g r4gVar) {
        iq3.m32545b(this.f46367a, null);
        return q9.f41501a;
    }

    /* renamed from: g */
    public final void m49305g() {
        AtomicReference atomicReference = this.f46367a;
        while (true) {
            Object objM32544a = iq3.m32544a(atomicReference);
            if (objM32544a == null || objM32544a == s4g.f44812b) {
                return;
            }
            if (objM32544a == s4g.f44811a) {
                if (ec3.m24748a(this.f46367a, objM32544a, s4g.f44812b)) {
                    return;
                }
            } else if (ec3.m24748a(this.f46367a, objM32544a, s4g.f44811a)) {
                vre.C17665a c17665a = vre.f50797b;
                ((zb2) objM32544a).resumeWith(vre.m53351b(y3i.f54824a));
                return;
            }
        }
    }

    /* renamed from: h */
    public final boolean m49306h() {
        Object andSet = this.f46367a.getAndSet(s4g.f44811a);
        sq8.m48646e(andSet);
        return andSet == s4g.f44812b;
    }
}

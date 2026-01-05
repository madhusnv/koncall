package p001o;

import java.io.EOFException;
import p001o.m18;

/* loaded from: classes3.dex */
public abstract class gre {
    /* renamed from: c */
    public static final m18 m29407c(m18 m18Var, long j) throws EOFException {
        if (m18Var instanceof m18.AbstractC15197e) {
            return n18.m39985f(new tba(((m18.AbstractC15197e) m18Var).readFrom(), j), m18Var.getContentLength());
        }
        if (m18Var instanceof m18.AbstractC15194b) {
            return n18.m39984e(new sba(((m18.AbstractC15194b) m18Var).readFrom(), j), m18Var.getContentLength());
        }
        if (m18Var instanceof m18.AbstractC15193a) {
            m29408d(j, m18Var.getContentLength());
            return m18Var;
        }
        if (!sq8.m48644c(m18Var, m18.C15196d.f34631a)) {
            throw new szb();
        }
        m29408d(j, 0L);
        return m18Var;
    }

    /* renamed from: d */
    public static final void m29408d(long j, Long l) throws EOFException {
        if (l != null && j == l.longValue()) {
            return;
        }
        if (l == null || j <= l.longValue()) {
            throw new EOFException("Expected " + j + " bytes but received " + l + " bytes.");
        }
        throw new EOFException("Expected " + j + " bytes but received " + l + " bytes. The connection may have been closed prematurely.");
    }
}

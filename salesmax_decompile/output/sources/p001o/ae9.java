package p001o;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;
import p001o.xd9;

/* loaded from: classes4.dex */
public final class ae9 {

    /* renamed from: a */
    public final xd9.C18117b f14566a;

    public ae9(xd9.C18117b c18117b) {
        this.f14566a = c18117b;
    }

    /* renamed from: g */
    public static int m16944g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    /* renamed from: i */
    public static ae9 m16945i() {
        return new ae9(xd9.m56048O());
    }

    /* renamed from: j */
    public static ae9 m16946j(yd9 yd9Var) {
        return new ae9((xd9.C18117b) yd9Var.m57635f().toBuilder());
    }

    /* renamed from: a */
    public synchronized ae9 m16947a(hd9 hd9Var) {
        m16948b(hd9Var.m30255b(), false);
        return this;
    }

    /* renamed from: b */
    public synchronized int m16948b(id9 id9Var, boolean z) {
        xd9.C18118c c18118cM16951e;
        c18118cM16951e = m16951e(id9Var);
        this.f14566a.m56057t(c18118cM16951e);
        if (z) {
            this.f14566a.m56061x(c18118cM16951e.m56069L());
        }
        return c18118cM16951e.m56069L();
    }

    /* renamed from: c */
    public synchronized yd9 m16949c() {
        return yd9.m57633e((xd9) this.f14566a.m53060i());
    }

    /* renamed from: d */
    public final synchronized boolean m16950d(int i) {
        Iterator it = this.f14566a.m56060w().iterator();
        while (it.hasNext()) {
            if (((xd9.C18118c) it.next()).m56069L() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final synchronized xd9.C18118c m16951e(id9 id9Var) {
        nc9 nc9VarM21278p;
        int iM16952f;
        kgc kgcVarM31927K;
        nc9VarM21278p = che.m21278p(id9Var);
        iM16952f = m16952f();
        kgcVarM31927K = id9Var.m31927K();
        if (kgcVarM31927K == kgc.UNKNOWN_PREFIX) {
            kgcVarM31927K = kgc.TINK;
        }
        return (xd9.C18118c) xd9.C18118c.m56067P().m56077t(nc9VarM21278p).m56078u(iM16952f).m56080w(gd9.ENABLED).m56079v(kgcVarM31927K).m53060i();
    }

    /* renamed from: f */
    public final synchronized int m16952f() {
        int iM16944g;
        iM16944g = m16944g();
        while (m16950d(iM16944g)) {
            iM16944g = m16944g();
        }
        return iM16944g;
    }

    /* renamed from: h */
    public synchronized ae9 m16953h(int i) {
        for (int i2 = 0; i2 < this.f14566a.m56059v(); i2++) {
            xd9.C18118c c18118cM56058u = this.f14566a.m56058u(i2);
            if (c18118cM56058u.m56069L() == i) {
                if (!c18118cM56058u.m56071N().equals(gd9.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
                this.f14566a.m56061x(i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}

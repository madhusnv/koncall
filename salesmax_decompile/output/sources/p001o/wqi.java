package p001o;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import org.apache.http.protocol.HTTP;
import p001o.nc9;
import p001o.xd9;
import p001o.zd9;

/* loaded from: classes4.dex */
public abstract class wqi {

    /* renamed from: a */
    public static final Charset f52534a = Charset.forName(HTTP.UTF_8);

    /* renamed from: a */
    public static zd9.C18617c m54884a(xd9.C18118c c18118c) {
        return (zd9.C18617c) zd9.C18617c.m59235L().m59244w(c18118c.m56068K().m40322L()).m59243v(c18118c.m56071N()).m59242u(c18118c.m56070M()).m59241t(c18118c.m56069L()).m53060i();
    }

    /* renamed from: b */
    public static zd9 m54885b(xd9 xd9Var) {
        zd9.C18616b c18616bM59229u = zd9.m59223L().m59229u(xd9Var.m56055N());
        Iterator it = xd9Var.m56054M().iterator();
        while (it.hasNext()) {
            c18616bM59229u.m59228t(m54884a((xd9.C18118c) it.next()));
        }
        return (zd9) c18616bM59229u.m53060i();
    }

    /* renamed from: c */
    public static void m54886c(xd9.C18118c c18118c) throws GeneralSecurityException {
        if (!c18118c.m56072O()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c18118c.m56069L())));
        }
        if (c18118c.m56070M() == kgc.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c18118c.m56069L())));
        }
        if (c18118c.m56071N() == gd9.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c18118c.m56069L())));
        }
    }

    /* renamed from: d */
    public static void m54887d(xd9 xd9Var) throws GeneralSecurityException {
        int iM56055N = xd9Var.m56055N();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (xd9.C18118c c18118c : xd9Var.m56054M()) {
            if (c18118c.m56071N() == gd9.ENABLED) {
                m54886c(c18118c);
                if (c18118c.m56069L() == iM56055N) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (c18118c.m56068K().m40321K() != nc9.EnumC15545c.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}

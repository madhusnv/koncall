package g2;

import f00.InterfaceC2173b;
import h2.AbstractC2808m;
import h2.AbstractC2812q;
import h2.C2810o;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Locale;
import javax.crypto.KeyAgreement;
import k2.C3953b;
import kx.C4266h;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.SSHRuntimeException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a */
    public final Object f11535a;

    /* renamed from: b */
    public final Object f11536b;

    /* renamed from: c */
    public Object f11537c;

    /* renamed from: d */
    public Object f11538d;

    public f0(String str, String str2) {
        KeyPairGenerator keyPairGenerator;
        KeyAgreement keyAgreement;
        try {
            InterfaceC2173b interfaceC2173b = AbstractC5037q.f24786a;
            synchronized (AbstractC5037q.class) {
                AbstractC5037q.m9955h();
                keyPairGenerator = AbstractC5037q.m9953f() == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, AbstractC5037q.m9953f());
            }
            this.f11535a = keyPairGenerator;
            synchronized (AbstractC5037q.class) {
                AbstractC5037q.m9955h();
                keyAgreement = AbstractC5037q.m9953f() == null ? KeyAgreement.getInstance(str2) : KeyAgreement.getInstance(str2, AbstractC5037q.m9953f());
            }
            this.f11536b = keyAgreement;
        } catch (GeneralSecurityException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    /* renamed from: a */
    public abstract void mo6138a(byte[] bArr);

    /* renamed from: b */
    public abstract void mo6139b(AlgorithmParameterSpec algorithmParameterSpec);

    /* renamed from: c */
    public void m6140c(long j6) {
        C2810o c2810oMo6902f = ((AbstractC2808m) this.f11536b).mo6902f(j6);
        C4266h c4266h = (C4266h) this.f11535a;
        int i10 = c2810oMo6902f.f15747a;
        if (c4266h.m8986h(i10)) {
            ((k2.e1) this.f11538d).setValue(c2810oMo6902f);
            return;
        }
        throw new IllegalArgumentException(("The display month's year (" + i10 + ") is out of the years range of " + c4266h + '.').toString());
    }

    public f0(Long l9, C4266h c4266h, z9 z9Var, Locale locale) {
        C2810o c2810oMo6903g;
        this.f11535a = c4266h;
        AbstractC2808m abstractC2808mM6911c = AbstractC2812q.m6911c(locale);
        this.f11536b = abstractC2808mM6911c;
        this.f11537c = C3953b.m8517t(z9Var);
        if (l9 != null) {
            c2810oMo6903g = abstractC2808mM6911c.mo6902f(l9.longValue());
            int i10 = c2810oMo6903g.f15747a;
            if (!c4266h.m8986h(i10)) {
                throw new IllegalArgumentException(("The initial display month's year (" + i10 + ") is out of the years range of " + c4266h + '.').toString());
            }
        } else {
            c2810oMo6903g = abstractC2808mM6911c.mo6903g(abstractC2808mM6911c.mo6904h());
        }
        this.f11538d = C3953b.m8517t(c2810oMo6903g);
    }
}

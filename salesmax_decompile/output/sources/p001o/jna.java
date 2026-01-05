package p001o;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import p001o.aid;

/* loaded from: classes4.dex */
public class jna implements did {

    /* renamed from: a */
    public static final Logger f30786a = Logger.getLogger(jna.class.getName());

    /* renamed from: o.jna$b */
    public static class C14618b implements hna {

        /* renamed from: a */
        public final aid f30787a;

        /* renamed from: b */
        public final byte[] f30788b;

        @Override // p001o.hna
        /* renamed from: a */
        public void mo30848a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (aid.C12193b c12193b : this.f30787a.m17156c(bArrCopyOf)) {
                try {
                    if (c12193b.m17161b().equals(kgc.LEGACY)) {
                        ((hna) c12193b.m17162c()).mo30848a(bArrCopyOfRange, ar1.m17694a(bArr2, this.f30788b));
                        return;
                    } else {
                        ((hna) c12193b.m17162c()).mo30848a(bArrCopyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e) {
                    jna.f30786a.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            Iterator it = this.f30787a.m17158e().iterator();
            while (it.hasNext()) {
                try {
                    ((hna) ((aid.C12193b) it.next()).m17162c()).mo30848a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // p001o.hna
        /* renamed from: b */
        public byte[] mo30849b(byte[] bArr) {
            return this.f30787a.m17155b().m17161b().equals(kgc.LEGACY) ? ar1.m17694a(this.f30787a.m17155b().m17160a(), ((hna) this.f30787a.m17155b().m17162c()).mo30849b(ar1.m17694a(bArr, this.f30788b))) : ar1.m17694a(this.f30787a.m17155b().m17160a(), ((hna) this.f30787a.m17155b().m17162c()).mo30849b(bArr));
        }

        public C14618b(aid aidVar) {
            this.f30788b = new byte[]{0};
            this.f30787a = aidVar;
        }
    }

    /* renamed from: e */
    public static void m34123e() {
        che.m21280r(new jna());
    }

    @Override // p001o.did
    /* renamed from: a */
    public Class mo17646a() {
        return hna.class;
    }

    @Override // p001o.did
    /* renamed from: c */
    public Class mo17648c() {
        return hna.class;
    }

    @Override // p001o.did
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public hna mo17647b(aid aidVar) {
        return new C14618b(aidVar);
    }
}

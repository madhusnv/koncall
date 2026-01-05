package p001o;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import p001o.aid;

/* loaded from: classes4.dex */
public class r70 implements did {

    /* renamed from: a */
    public static final Logger f43099a = Logger.getLogger(r70.class.getName());

    /* renamed from: o.r70$b */
    public static class C16549b implements p70 {

        /* renamed from: a */
        public final aid f43100a;

        @Override // p001o.p70
        /* renamed from: a */
        public byte[] mo24514a(byte[] bArr, byte[] bArr2) {
            return ar1.m17694a(this.f43100a.m17155b().m17160a(), ((p70) this.f43100a.m17155b().m17162c()).mo24514a(bArr, bArr2));
        }

        @Override // p001o.p70
        /* renamed from: b */
        public byte[] mo24515b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator it = this.f43100a.m17156c(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return ((p70) ((aid.C12193b) it.next()).m17162c()).mo24515b(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        r70.f43099a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator it2 = this.f43100a.m17158e().iterator();
            while (it2.hasNext()) {
                try {
                    return ((p70) ((aid.C12193b) it2.next()).m17162c()).mo24515b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        public C16549b(aid aidVar) {
            this.f43100a = aidVar;
        }
    }

    /* renamed from: e */
    public static void m46301e() {
        che.m21280r(new r70());
    }

    @Override // p001o.did
    /* renamed from: a */
    public Class mo17646a() {
        return p70.class;
    }

    @Override // p001o.did
    /* renamed from: c */
    public Class mo17648c() {
        return p70.class;
    }

    @Override // p001o.did
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public p70 mo17647b(aid aidVar) {
        return new C16549b(aidVar);
    }
}

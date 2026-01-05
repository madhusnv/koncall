package p001o;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;
import p001o.aid;

/* loaded from: classes4.dex */
public class aq5 implements did {

    /* renamed from: a */
    public static final Logger f15126a = Logger.getLogger(aq5.class.getName());

    /* renamed from: o.aq5$a */
    public static class C12234a implements yp5 {

        /* renamed from: a */
        public aid f15127a;

        public C12234a(aid aidVar) {
            this.f15127a = aidVar;
        }

        @Override // p001o.yp5
        /* renamed from: a */
        public byte[] mo17650a(byte[] bArr, byte[] bArr2) {
            return ar1.m17694a(this.f15127a.m17155b().m17160a(), ((yp5) this.f15127a.m17155b().m17162c()).mo17650a(bArr, bArr2));
        }

        @Override // p001o.yp5
        /* renamed from: b */
        public byte[] mo17651b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator it = this.f15127a.m17156c(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return ((yp5) ((aid.C12193b) it.next()).m17162c()).mo17651b(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        aq5.f15126a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator it2 = this.f15127a.m17158e().iterator();
            while (it2.hasNext()) {
                try {
                    return ((yp5) ((aid.C12193b) it2.next()).m17162c()).mo17651b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* renamed from: e */
    public static void m17645e() {
        che.m21280r(new aq5());
    }

    @Override // p001o.did
    /* renamed from: a */
    public Class mo17646a() {
        return yp5.class;
    }

    @Override // p001o.did
    /* renamed from: c */
    public Class mo17648c() {
        return yp5.class;
    }

    @Override // p001o.did
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public yp5 mo17647b(aid aidVar) {
        return new C12234a(aidVar);
    }
}

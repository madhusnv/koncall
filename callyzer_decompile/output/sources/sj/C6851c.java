package sj;

import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sj.c */
/* loaded from: classes.dex */
public final class C6851c {

    /* renamed from: c */
    public static final String[] f32529c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    public final SharedPreferences f32530a;

    /* renamed from: b */
    public final String f32531b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6851c(ji.C3773g r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.m8293a()
            android.content.Context r0 = r4.f19662a
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f32530a = r0
            r4.m8293a()
            ji.i r0 = r4.f19664c
            java.lang.String r1 = r0.f19681e
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.m8293a()
            java.lang.String r1 = r0.f19678b
            java.lang.String r4 = "1:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.f32531b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.C6851c.<init>(ji.g):void");
    }

    /* renamed from: a */
    public final String m13050a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f32530a) {
            String strEncodeToString = null;
            String string = this.f32530a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
                e2.toString();
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return strEncodeToString;
        }
    }
}

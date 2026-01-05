package pf;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import sf.AbstractC6840z;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.k */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC5911k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ boolean f28762a;

    /* renamed from: b */
    public final /* synthetic */ String f28763b;

    /* renamed from: c */
    public final /* synthetic */ BinderC5914n f28764c;

    public /* synthetic */ CallableC5911k(boolean z6, String str, BinderC5914n binderC5914n) {
        this.f28762a = z6;
        this.f28763b = str;
        this.f28764c = binderC5914n;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        boolean z6 = this.f28762a;
        String str = this.f28763b;
        BinderC5914n binderC5914n = this.f28764c;
        String str2 = (z6 || !AbstractC5916p.m11527a(str, binderC5914n, true, false).f28782a) ? "not allowed" : "debug cert rejected";
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i10++;
        }
        AbstractC6840z.m13036g(messageDigest);
        byte[] bArrDigest = messageDigest.digest(binderC5914n.f28769g);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i11 = 0;
        for (byte b10 : bArrDigest) {
            char[] cArr2 = AbstractC8947b.f42953b;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
            i11 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z6 + ", ver=12451000.false";
    }
}

package p001o;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public class lf2 extends pi1 {

    /* renamed from: b */
    public static final byte[] f33705b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(ic9.f28450a);

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        messageDigest.update(f33705b);
    }

    @Override // p001o.pi1
    /* renamed from: c */
    public Bitmap mo37060c(mi1 mi1Var, Bitmap bitmap, int i, int i2) {
        return zuh.m59953b(mi1Var, bitmap, i, i2);
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        return obj instanceof lf2;
    }

    @Override // p001o.ic9
    public int hashCode() {
        return -599754482;
    }
}

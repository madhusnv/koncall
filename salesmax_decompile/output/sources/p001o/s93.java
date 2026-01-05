package p001o;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public class s93 extends pi1 {

    /* renamed from: b */
    public static final byte[] f45005b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(ic9.f28450a);

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        messageDigest.update(f45005b);
    }

    @Override // p001o.pi1
    /* renamed from: c */
    public Bitmap mo37060c(mi1 mi1Var, Bitmap bitmap, int i, int i2) {
        return zuh.m59955d(mi1Var, bitmap, i, i2);
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        return obj instanceof s93;
    }

    @Override // p001o.ic9
    public int hashCode() {
        return 1101716364;
    }
}

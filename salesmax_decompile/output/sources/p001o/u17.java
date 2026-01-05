package p001o;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public class u17 extends pi1 {

    /* renamed from: b */
    public static final byte[] f48175b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(ic9.f28450a);

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        messageDigest.update(f48175b);
    }

    @Override // p001o.pi1
    /* renamed from: c */
    public Bitmap mo37060c(mi1 mi1Var, Bitmap bitmap, int i, int i2) {
        return zuh.m59957f(mi1Var, bitmap, i, i2);
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        return obj instanceof u17;
    }

    @Override // p001o.ic9
    public int hashCode() {
        return 1572326941;
    }
}

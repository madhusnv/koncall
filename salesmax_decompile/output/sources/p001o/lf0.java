package p001o;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public final class lf0 implements ic9 {

    /* renamed from: b */
    public final int f33698b;

    /* renamed from: c */
    public final ic9 f33699c;

    public lf0(int i, ic9 ic9Var) {
        this.f33698b = i;
        this.f33699c = ic9Var;
    }

    /* renamed from: c */
    public static ic9 m37055c(Context context) {
        return new lf0(context.getResources().getConfiguration().uiMode & 48, xn0.m56489c(context));
    }

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        this.f33699c.mo19806a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f33698b).array());
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        if (!(obj instanceof lf0)) {
            return false;
        }
        lf0 lf0Var = (lf0) obj;
        return this.f33698b == lf0Var.f33698b && this.f33699c.equals(lf0Var.f33699c);
    }

    @Override // p001o.ic9
    public int hashCode() {
        return uqi.m51933n(this.f33699c, this.f33698b);
    }
}

package p001o;

import android.graphics.Matrix;
import p001o.hm6;

/* loaded from: classes2.dex */
public abstract class lf8 implements jd8 {
    /* renamed from: c */
    public static jd8 m37118c(wig wigVar, long j, int i, Matrix matrix) {
        return new s41(wigVar, j, i, matrix);
    }

    @Override // p001o.jd8
    /* renamed from: a */
    public abstract wig mo17845a();

    @Override // p001o.jd8
    /* renamed from: b */
    public void mo17846b(hm6.C13999b c13999b) {
        c13999b.m30803m(mo37119d());
    }

    /* renamed from: d */
    public abstract int mo37119d();

    /* renamed from: e */
    public abstract Matrix mo37120e();

    @Override // p001o.jd8
    public abstract long getTimestamp();
}

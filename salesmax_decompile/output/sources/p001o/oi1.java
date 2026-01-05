package p001o;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public class oi1 implements zne, ji8 {

    /* renamed from: a */
    public final Bitmap f38395a;

    /* renamed from: b */
    public final mi1 f38396b;

    public oi1(Bitmap bitmap, mi1 mi1Var) {
        this.f38395a = (Bitmap) bgd.m18887e(bitmap, "Bitmap must not be null");
        this.f38396b = (mi1) bgd.m18887e(mi1Var, "BitmapPool must not be null");
    }

    /* renamed from: d */
    public static oi1 m42257d(Bitmap bitmap, mi1 mi1Var) {
        if (bitmap == null) {
            return null;
        }
        return new oi1(bitmap, mi1Var);
    }

    @Override // p001o.ji8
    /* renamed from: a */
    public void mo33860a() {
        this.f38395a.prepareToDraw();
    }

    @Override // p001o.zne
    /* renamed from: b */
    public void mo19618b() {
        this.f38396b.mo38104c(this.f38395a);
    }

    @Override // p001o.zne
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f38395a;
    }

    @Override // p001o.zne
    /* renamed from: j */
    public int mo19619j() {
        return uqi.m51926g(this.f38395a);
    }

    @Override // p001o.zne
    /* renamed from: k */
    public Class mo19620k() {
        return Bitmap.class;
    }
}

package p001o;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class f0c extends ky5 {
    public f0c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: d */
    public static zne m25919d(Drawable drawable) {
        if (drawable != null) {
            return new f0c(drawable);
        }
        return null;
    }

    @Override // p001o.zne
    /* renamed from: b */
    public void mo19618b() {
    }

    @Override // p001o.zne
    /* renamed from: j */
    public int mo19619j() {
        return Math.max(1, this.f32807a.getIntrinsicWidth() * this.f32807a.getIntrinsicHeight() * 4);
    }

    @Override // p001o.zne
    /* renamed from: k */
    public Class mo19620k() {
        return this.f32807a.getClass();
    }
}

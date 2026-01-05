package p001o;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public class ni1 implements mi1 {
    @Override // p001o.mi1
    /* renamed from: a */
    public void mo39087a(int i) {
    }

    @Override // p001o.mi1
    /* renamed from: b */
    public void mo39088b() {
    }

    @Override // p001o.mi1
    /* renamed from: c */
    public void mo38104c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p001o.mi1
    /* renamed from: d */
    public Bitmap mo39089d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p001o.mi1
    /* renamed from: e */
    public Bitmap mo39090e(int i, int i2, Bitmap.Config config) {
        return mo39089d(i, i2, config);
    }
}

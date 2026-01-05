package p001o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public abstract class ky5 implements zne, ji8 {

    /* renamed from: a */
    public final Drawable f32807a;

    public ky5(Drawable drawable) {
        this.f32807a = (Drawable) bgd.m18886d(drawable);
    }

    @Override // p001o.ji8
    /* renamed from: a */
    public void mo33860a() {
        Drawable drawable = this.f32807a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof js7) {
            ((js7) drawable).m34459e().prepareToDraw();
        }
    }

    @Override // p001o.zne
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f32807a.getConstantState();
        return constantState == null ? this.f32807a : constantState.newDrawable();
    }
}

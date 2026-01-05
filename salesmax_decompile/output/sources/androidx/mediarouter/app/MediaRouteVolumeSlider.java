package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.google.firebase.perf.util.Constants;
import p001o.z5e;

/* loaded from: classes2.dex */
class MediaRouteVolumeSlider extends AppCompatSeekBar {

    /* renamed from: b */
    public final float f8938b;

    /* renamed from: c */
    public boolean f8939c;

    /* renamed from: d */
    public Drawable f8940d;

    /* renamed from: e */
    public int f8941e;

    /* renamed from: f */
    public int f8942f;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.seekBarStyle);
    }

    /* renamed from: a */
    public void m7899a(int i) {
        m7900b(i, i);
    }

    /* renamed from: b */
    public void m7900b(int i, int i2) {
        if (this.f8941e != i) {
            if (Color.alpha(i) != 255) {
                StringBuilder sb = new StringBuilder();
                sb.append("Volume slider progress and thumb color cannot be translucent: #");
                sb.append(Integer.toHexString(i));
            }
            this.f8941e = i;
        }
        if (this.f8942f != i2) {
            if (Color.alpha(i2) != 255) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Volume slider background color cannot be translucent: #");
                sb2.append(Integer.toHexString(i2));
            }
            this.f8942f = i2;
        }
    }

    /* renamed from: c */
    public void m7901c(boolean z) {
        if (this.f8939c == z) {
            return;
        }
        this.f8939c = z;
        super.setThumb(z ? null : this.f8940d);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? Constants.MAX_HOST_LENGTH : (int) (this.f8938b * 255.0f);
        this.f8940d.setColorFilter(this.f8941e, PorterDuff.Mode.SRC_IN);
        this.f8940d.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f8942f, PorterDuff.Mode.SRC_IN);
            progressDrawable = drawableFindDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.f8941e, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f8940d = drawable;
        if (this.f8939c) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8938b = AbstractC2307c.m8003h(context);
    }
}

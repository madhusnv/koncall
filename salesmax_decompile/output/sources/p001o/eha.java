package p001o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public final class eha extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public jh0 f21683a;

    /* renamed from: b */
    public final Context f21684b;

    /* renamed from: c */
    public final LoadingIndicatorSpec f21685c;

    /* renamed from: d */
    public fha f21686d;

    /* renamed from: e */
    public dha f21687e;

    /* renamed from: f */
    public Paint f21688f = new Paint();

    /* renamed from: g */
    public int f21689g;

    /* renamed from: h */
    public Drawable f21690h;

    public eha(Context context, LoadingIndicatorSpec loadingIndicatorSpec, fha fhaVar, dha dhaVar) {
        this.f21684b = context;
        this.f21685c = loadingIndicatorSpec;
        this.f21686d = fhaVar;
        this.f21687e = dhaVar;
        dhaVar.m23106j(this);
        setAlpha(Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: a */
    public static eha m25055a(Context context, LoadingIndicatorSpec loadingIndicatorSpec) {
        return new eha(context, loadingIndicatorSpec, new fha(loadingIndicatorSpec), new dha(loadingIndicatorSpec));
    }

    /* renamed from: b */
    public dha m25056b() {
        return this.f21687e;
    }

    /* renamed from: c */
    public fha m25057c() {
        return this.f21686d;
    }

    /* renamed from: d */
    public final boolean m25058d() {
        jh0 jh0Var = this.f21683a;
        return jh0Var != null && jh0Var.m33830a(this.f21684b.getContentResolver()) == 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (m25058d() && (drawable = this.f21690h) != null) {
                drawable.setBounds(bounds);
                this.f21690h.setTint(this.f21685c.f12709e[0]);
                this.f21690h.draw(canvas);
            } else {
                canvas.save();
                this.f21686d.m26698a(canvas, bounds);
                this.f21686d.m26699b(canvas, this.f21688f, this.f21685c.f12710f, getAlpha());
                this.f21686d.m26700c(canvas, this.f21688f, this.f21687e.f19851h, getAlpha());
                canvas.restore();
            }
        }
    }

    /* renamed from: e */
    public boolean m25059e(boolean z, boolean z2, boolean z3) {
        boolean visible = super.setVisible(z, z2);
        this.f21687e.m23101e();
        if (z && z3 && !m25058d()) {
            this.f21687e.m23110n();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21689g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f21686d.m26701d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f21686d.m26702e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f21689g != i) {
            this.f21689g = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21688f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return m25059e(z, z2, z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}

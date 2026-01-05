package p013o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public Drawable f25656a;

    /* renamed from: b */
    public boolean f25657b;

    /* renamed from: a */
    public final void m10293a(Canvas canvas) {
        this.f25656a.draw(canvas);
    }

    /* renamed from: b */
    public final void m10294b(float f6, float f10) {
        this.f25656a.setHotspot(f6, f10);
    }

    /* renamed from: c */
    public final void m10295c(int i10, int i11, int i12, int i13) {
        this.f25656a.setHotspotBounds(i10, i11, i12, i13);
    }

    /* renamed from: d */
    public final boolean m10296d(boolean z6, boolean z10) {
        return super.setVisible(z6, z10) || this.f25656a.setVisible(z6, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f25657b) {
            m10293a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f25656a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f25656a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f25656a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f25656a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f25656a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f25656a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f25656a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f25656a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f25656a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f25656a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f25656a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f25656a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f25656a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f25656a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f25656a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        scheduleSelf(runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f25656a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        this.f25656a.setAutoMirrored(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i10) {
        this.f25656a.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25656a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z6) {
        this.f25656a.setDither(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z6) {
        this.f25656a.setFilterBitmap(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f6, float f10) {
        if (this.f25657b) {
            m10294b(f6, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f25657b) {
            m10295c(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f25657b) {
            return this.f25656a.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f25656a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f25656a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f25656a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        if (this.f25657b) {
            return m10296d(z6, z10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

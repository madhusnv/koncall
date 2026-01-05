package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import p001o.fcc;
import p001o.hcc;
import p001o.p7d;
import p001o.ubc;
import p001o.wbc;
import p001o.ybc;

/* loaded from: classes5.dex */
public class PhotoView extends ImageView {

    /* renamed from: a */
    public p7d f11839a;

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m13629a() {
        this.f11839a = new p7d(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public p7d getAttacher() {
        return this.f11839a;
    }

    public RectF getDisplayRect() {
        return this.f11839a.m43133r();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f11839a.m43136u();
    }

    public float getMaximumScale() {
        return this.f11839a.m43139x();
    }

    public float getMediumScale() {
        return this.f11839a.m43140y();
    }

    public float getMinimumScale() {
        return this.f11839a.m43141z();
    }

    public float getScale() {
        return this.f11839a.m43101A();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f11839a.m43102B();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f11839a.m43105E(z);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f11839a.a0();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        p7d p7dVar = this.f11839a;
        if (p7dVar != null) {
            p7dVar.a0();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        p7d p7dVar = this.f11839a;
        if (p7dVar != null) {
            p7dVar.a0();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        p7d p7dVar = this.f11839a;
        if (p7dVar != null) {
            p7dVar.a0();
        }
    }

    public void setMaximumScale(float f) {
        this.f11839a.m43107G(f);
    }

    public void setMediumScale(float f) {
        this.f11839a.m43108H(f);
    }

    public void setMinimumScale(float f) {
        this.f11839a.m43109I(f);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f11839a.m43110J(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f11839a.m43111K(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11839a.m43112L(onLongClickListener);
    }

    public void setOnMatrixChangeListener(ubc ubcVar) {
        this.f11839a.m43113M(ubcVar);
    }

    public void setOnOutsidePhotoTapListener(wbc wbcVar) {
        this.f11839a.m43114N(wbcVar);
    }

    public void setOnPhotoTapListener(ybc ybcVar) {
        this.f11839a.m43115O(ybcVar);
    }

    public void setOnScaleChangeListener(fcc fccVar) {
        this.f11839a.m43116P(fccVar);
    }

    public void setOnSingleFlingListener(hcc hccVar) {
        this.f11839a.m43117Q(hccVar);
    }

    public void setRotationBy(float f) {
        this.f11839a.m43118R(f);
    }

    public void setRotationTo(float f) {
        this.f11839a.m43119S(f);
    }

    public void setScale(float f) {
        this.f11839a.m43120T(f);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        this.f11839a.m43123W(f, f2, f3);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        p7d p7dVar = this.f11839a;
        if (p7dVar != null) {
            p7dVar.m43124X(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f11839a.m43125Y(i);
    }

    public void setZoomable(boolean z) {
        this.f11839a.m43126Z(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setScale(float f, boolean z) {
        this.f11839a.m43122V(f, z);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13629a();
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        this.f11839a.m43121U(f, f2, f3, z);
    }
}

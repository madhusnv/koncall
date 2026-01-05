package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import c6.v0;
import com.google.android.material.datepicker.C1346j;
import lh.C4465a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p013o.C5236v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CheckableImageButton extends C5236v implements Checkable {

    /* renamed from: g */
    public static final int[] f6919g = {R.attr.state_checked};

    /* renamed from: d */
    public boolean f6920d;

    /* renamed from: e */
    public boolean f6921e;

    /* renamed from: f */
    public boolean f6922f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.websoptimization.callyzerbiz.R.attr.imageButtonStyle);
        this.f6921e = true;
        this.f6922f = true;
        v0.m2528j(this, new C1346j(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6920d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f6920d ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f6919g) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4465a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4465a c4465a = (C4465a) parcelable;
        super.onRestoreInstanceState(c4465a.f21992a);
        setChecked(c4465a.f22227c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C4465a c4465a = new C4465a(super.onSaveInstanceState());
        c4465a.f22227c = this.f6920d;
        return c4465a;
    }

    public void setCheckable(boolean z6) {
        if (this.f6921e != z6) {
            this.f6921e = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f6921e || this.f6920d == z6) {
            return;
        }
        this.f6920d = z6;
        refreshDrawableState();
        sendAccessibilityEvent(NewHope.SENDB_BYTES);
    }

    public void setPressable(boolean z6) {
        this.f6922f = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.f6922f) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f6920d);
    }
}

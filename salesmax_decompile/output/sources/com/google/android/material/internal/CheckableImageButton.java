package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import p001o.cc;
import p001o.db;
import p001o.wvi;
import p001o.z5e;

/* loaded from: classes3.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g */
    public static final int[] f12678g = {R.attr.state_checked};

    /* renamed from: d */
    public boolean f12679d;

    /* renamed from: e */
    public boolean f12680e;

    /* renamed from: f */
    public boolean f12681f;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11064a();

        /* renamed from: c */
        public boolean f12682c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        public class C11064a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void m14743b(Parcel parcel) {
            this.f12682c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12682c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m14743b(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C11065a extends db {
        public C11065a() {
        }

        @Override // p001o.db
        /* renamed from: f */
        public void mo5937f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5937f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.m0(CheckableImageButton.this.m14742a());
            ccVar.n0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public boolean m14742a() {
        return this.f12680e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f12679d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f12679d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f12678g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        setChecked(savedState.f12682c);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12682c = this.f12679d;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f12680e != z) {
            this.f12680e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f12680e || this.f12679d == z) {
            return;
        }
        this.f12679d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f12681f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f12681f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f12679d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12680e = true;
        this.f12681f = true;
        wvi.m0(this, new C11065a());
    }
}

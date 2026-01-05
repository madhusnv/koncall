package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import c6.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    public final boolean f6835a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC1361y.m4113c(null);
        if (C1351o.m4100n(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.websoptimization.callyzerbiz.R.id.cancel_button);
            setNextFocusRightId(com.websoptimization.callyzerbiz.R.id.confirm_button);
        }
        this.f6835a = C1351o.m4100n(getContext(), com.websoptimization.callyzerbiz.R.attr.nestedScrollable);
        v0.m2528j(this, new C1343g(1));
    }

    /* renamed from: a */
    public final C1354r m4089a() {
        return (C1354r) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C1354r) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C1354r) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1354r c1354r = (C1354r) super.getAdapter();
        c1354r.getClass();
        c1354r.getItem(c1354r.f6904a.m4104d());
        c1354r.getItem(c1354r.m4108b());
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z6, int i10, Rect rect) {
        if (!z6) {
            super.onFocusChanged(false, i10, rect);
            return;
        }
        if (i10 == 33) {
            setSelection(((C1354r) super.getAdapter()).m4108b());
        } else if (i10 == 130) {
            setSelection(((C1354r) super.getAdapter()).f6904a.m4104d());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C1354r) super.getAdapter()).f6904a.m4104d()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(((C1354r) super.getAdapter()).f6904a.m4104d());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f6835a) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < ((C1354r) super.getAdapter()).f6904a.m4104d()) {
            super.setSelection(((C1354r) super.getAdapter()).f6904a.m4104d());
        } else {
            super.setSelection(i10);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C1354r) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C1354r)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C1354r.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}

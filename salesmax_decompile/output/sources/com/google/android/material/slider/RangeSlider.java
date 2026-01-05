package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import p001o.bkh;
import p001o.ebe;
import p001o.hf9;
import p001o.x5e;

/* loaded from: classes3.dex */
public class RangeSlider extends BaseSlider<RangeSlider, Object, Object> {
    public float O1;
    public int P1;

    public static class RangeSliderState extends AbsSavedState {
        public static final Parcelable.Creator<RangeSliderState> CREATOR = new C11105a();

        /* renamed from: a */
        public float f12929a;

        /* renamed from: b */
        public int f12930b;

        /* renamed from: com.google.android.material.slider.RangeSlider$RangeSliderState$a */
        public class C11105a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RangeSliderState createFromParcel(Parcel parcel) {
                return new RangeSliderState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RangeSliderState[] newArray(int i) {
                return new RangeSliderState[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f12929a);
            parcel.writeInt(this.f12930b);
        }

        public RangeSliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public RangeSliderState(Parcel parcel) {
            super(parcel.readParcelable(RangeSliderState.class.getClassLoader()));
            this.f12929a = parcel.readFloat();
            this.f12930b = parcel.readInt();
        }
    }

    public RangeSlider(Context context) {
        this(context, null);
    }

    public static List l1(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < typedArray.length(); i++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i, -1.0f)));
        }
        return arrayList;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void G0() {
        super.G0();
    }

    @Override // com.google.android.material.slider.BaseSlider
    /* renamed from: Y */
    public /* bridge */ /* synthetic */ boolean mo15094Y() {
        return super.mo15094Y();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getMinSeparation() {
        return this.O1;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbHeight() {
        return super.getThumbHeight();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbTrackGapSize() {
        return super.getThumbTrackGapSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbWidth() {
        return super.getThumbWidth();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        return super.getTickActiveRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        return super.getTickInactiveRadius();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTickVisibilityMode() {
        return super.getTickVisibilityMode();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackCornerSize() {
        return super.getTrackCornerSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackIconActiveColor() {
        return super.getTrackIconActiveColor();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ Drawable getTrackIconActiveEnd() {
        return super.getTrackIconActiveEnd();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ Drawable getTrackIconActiveStart() {
        return super.getTrackIconActiveStart();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackIconInactiveColor() {
        return super.getTrackIconInactiveColor();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ Drawable getTrackIconInactiveEnd() {
        return super.getTrackIconInactiveEnd();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ Drawable getTrackIconInactiveStart() {
        return super.getTrackIconInactiveStart();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackIconSize() {
        return super.getTrackIconSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackInsideCornerSize() {
        return super.getTrackInsideCornerSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackStopIndicatorSize() {
        return super.getTrackStopIndicatorSize();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        RangeSliderState rangeSliderState = (RangeSliderState) parcelable;
        super.onRestoreInstanceState(rangeSliderState.getSuperState());
        this.O1 = rangeSliderState.f12929a;
        int i = rangeSliderState.f12930b;
        this.P1 = i;
        setSeparationUnit(i);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public Parcelable onSaveInstanceState() {
        RangeSliderState rangeSliderState = new RangeSliderState(super.onSaveInstanceState());
        rangeSliderState.f12929a = this.O1;
        rangeSliderState.f12930b = this.P1;
        return rangeSliderState;
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(int i) {
        super.setCustomThumbDrawable(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(int i) {
        super.setHaloRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(int i) {
        super.setHaloRadiusResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(hf9 hf9Var) {
        super.setLabelFormatter(hf9Var);
    }

    public void setMinSeparation(float f) {
        this.O1 = f;
        this.P1 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.O1 = f;
        this.P1 = 1;
        setSeparationUnit(1);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setOrientation(int i) {
        super.setOrientation(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevationResource(int i) {
        super.setThumbElevationResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(int i) {
        super.setThumbHeight(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeightResource(int i) {
        super.setThumbHeightResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(int i) {
        super.setThumbRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(int i) {
        super.setThumbRadiusResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(int i) {
        super.setThumbStrokeColorResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(int i) {
        super.setThumbStrokeWidthResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTintList(ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(int i) {
        super.setThumbTrackGapSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(int i) {
        super.setThumbWidth(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidthResource(int i) {
        super.setThumbWidthResource(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(int i) {
        super.setTickActiveRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(int i) {
        super.setTickInactiveRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickTintList(ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisibilityMode(int i) {
        super.setTickVisibilityMode(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    @Deprecated
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        super.setTickVisible(z);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackCornerSize(int i) {
        super.setTrackCornerSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(int i) {
        super.setTrackHeight(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveColor(ColorStateList colorStateList) {
        super.setTrackIconActiveColor(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveEnd(int i) {
        super.setTrackIconActiveEnd(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveStart(int i) {
        super.setTrackIconActiveStart(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveColor(ColorStateList colorStateList) {
        super.setTrackIconInactiveColor(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveEnd(int i) {
        super.setTrackIconInactiveEnd(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveStart(int i) {
        super.setTrackIconInactiveStart(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconSize(int i) {
        super.setTrackIconSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(int i) {
        super.setTrackInsideCornerSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(int i) {
        super.setTrackStopIndicatorSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackTintList(ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(Float... fArr) {
        super.setValues(fArr);
    }

    public RangeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.sliderStyle);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveEnd(Drawable drawable) {
        super.setTrackIconActiveEnd(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveStart(Drawable drawable) {
        super.setTrackIconActiveStart(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveEnd(Drawable drawable) {
        super.setTrackIconInactiveEnd(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveStart(Drawable drawable) {
        super.setTrackIconInactiveStart(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setValues(List<Float> list) {
        super.setValues(list);
    }

    public RangeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.RangeSlider, i, BaseSlider.J1, new int[0]);
        if (typedArrayM19305i.hasValue(ebe.RangeSlider_values)) {
            setValues(l1(typedArrayM19305i.getResources().obtainTypedArray(typedArrayM19305i.getResourceId(ebe.RangeSlider_values, 0))));
        }
        this.O1 = typedArrayM19305i.getDimension(ebe.RangeSlider_minSeparation, 0.0f);
        typedArrayM19305i.recycle();
    }
}

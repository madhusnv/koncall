package com.google.android.material.button;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c6.v0;
import com.google.android.material.datepicker.C1346j;
import com.google.android.material.timepicker.C1371h;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import d6.C1615e;
import gh.C2615d;
import gh.C2616e;
import gh.C2617f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import lh.AbstractC4475k;
import mb.o3;
import ph.C5946a;
import ph.C5955j;
import sh.AbstractC6844a;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l */
    public static final /* synthetic */ int f6797l = 0;

    /* renamed from: a */
    public final ArrayList f6798a;

    /* renamed from: b */
    public final C2616e f6799b;

    /* renamed from: c */
    public final C8986c f6800c;

    /* renamed from: d */
    public final LinkedHashSet f6801d;

    /* renamed from: e */
    public final C2615d f6802e;

    /* renamed from: f */
    public Integer[] f6803f;

    /* renamed from: g */
    public boolean f6804g;

    /* renamed from: h */
    public boolean f6805h;

    /* renamed from: j */
    public boolean f6806j;

    /* renamed from: k */
    public int f6807k;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC6844a.m13042a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f6798a = new ArrayList();
        this.f6799b = new C2616e(this);
        this.f6800c = new C8986c(14, this);
        this.f6801d = new LinkedHashSet();
        this.f6802e = new C2615d(0, this);
        this.f6804g = false;
        TypedArray typedArrayM9328e = AbstractC4475k.m9328e(getContext(), attributeSet, AbstractC0143a.f462k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM9328e.getBoolean(2, false));
        this.f6807k = typedArrayM9328e.getResourceId(0, -1);
        this.f6806j = typedArrayM9328e.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayM9328e.recycle();
        Field field = v0.f5527a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (m4074c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m4074c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && m4074c(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setCheckedId(int i10) {
        this.f6807k = i10;
        m4073b();
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            Field field = v0.f5527a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f6785e.add(this.f6799b);
        materialButton.setOnPressedChangeListenerInternal(this.f6800c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m4072a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i10 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i10, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.f6794p) {
                m4075d(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            C5955j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f6798a.add(new C2617f(shapeAppearanceModel.f29179e, shapeAppearanceModel.f29182h, shapeAppearanceModel.f29180f, shapeAppearanceModel.f29181g));
            v0.m2528j(materialButton, new C1346j(1, this));
        }
    }

    /* renamed from: b */
    public final void m4073b() {
        Iterator it = this.f6801d.iterator();
        while (it.hasNext()) {
            ((C1371h) it.next()).m4147a();
        }
    }

    /* renamed from: c */
    public final boolean m4074c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    /* renamed from: d */
    public final boolean m4075d(int i10, boolean z6) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f6806j && checkedButtonIds.isEmpty()) {
            View viewFindViewById = findViewById(i10);
            if (viewFindViewById instanceof MaterialButton) {
                this.f6804g = true;
                ((MaterialButton) viewFindViewById).setChecked(true);
                this.f6804g = false;
            }
            this.f6807k = i10;
            return false;
        }
        if (z6 && this.f6805h) {
            checkedButtonIds.remove(Integer.valueOf(i10));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                View viewFindViewById2 = findViewById(it.next().intValue());
                if (viewFindViewById2 instanceof MaterialButton) {
                    this.f6804g = true;
                    ((MaterialButton) viewFindViewById2).setChecked(false);
                    this.f6804g = false;
                }
                m4073b();
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f6802e);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f6803f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m4076e() {
        C2617f c2617f;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.getVisibility() != 8) {
                o3 o3VarM11996e = materialButton.getShapeAppearanceModel().m11996e();
                C2617f c2617f2 = (C2617f) this.f6798a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z6 = getOrientation() == 0;
                    C5946a c5946a = C2617f.f14177e;
                    if (i10 == firstVisibleChildIndex) {
                        if (z6) {
                            Field field = v0.f5527a;
                            c2617f = getLayoutDirection() == 1 ? new C2617f(c5946a, c5946a, c2617f2.f14179b, c2617f2.f14180c) : new C2617f(c2617f2.f14178a, c2617f2.f14181d, c5946a, c5946a);
                        } else {
                            c2617f = new C2617f(c2617f2.f14178a, c5946a, c2617f2.f14179b, c5946a);
                        }
                    } else if (i10 != lastVisibleChildIndex) {
                        c2617f2 = null;
                    } else if (z6) {
                        Field field2 = v0.f5527a;
                        c2617f = getLayoutDirection() == 1 ? new C2617f(c2617f2.f14178a, c2617f2.f14181d, c5946a, c5946a) : new C2617f(c5946a, c5946a, c2617f2.f14179b, c2617f2.f14180c);
                    } else {
                        c2617f = new C2617f(c5946a, c2617f2.f14181d, c5946a, c2617f2.f14180c);
                    }
                    c2617f2 = c2617f;
                }
                if (c2617f2 == null) {
                    o3VarM11996e.f23376e = new C5946a(DefinitionKt.NO_Float_VALUE);
                    o3VarM11996e.f23377f = new C5946a(DefinitionKt.NO_Float_VALUE);
                    o3VarM11996e.f23378g = new C5946a(DefinitionKt.NO_Float_VALUE);
                    o3VarM11996e.f23379h = new C5946a(DefinitionKt.NO_Float_VALUE);
                } else {
                    o3VarM11996e.f23376e = c2617f2.f14178a;
                    o3VarM11996e.f23379h = c2617f2.f14181d;
                    o3VarM11996e.f23377f = c2617f2.f14179b;
                    o3VarM11996e.f23378g = c2617f2.f14180c;
                }
                materialButton.setShapeAppearanceModel(o3VarM11996e.m9582a());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f6805h) {
            return this.f6807k;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.f6794p) {
                arrayList.add(Integer.valueOf(materialButton.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f6803f;
        return (numArr == null || i11 >= numArr.length) ? i11 : numArr[i11].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i10 = this.f6807k;
        if (i10 == -1 || (materialButton = (MaterialButton) findViewById(i10)) == null) {
            return;
        }
        materialButton.setChecked(true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1615e.m5279a(1, getVisibleButtonCount(), this.f6805h ? 1 : 2).f8059a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        m4076e();
        m4072a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f6785e.remove(this.f6799b);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f6798a.remove(iIndexOfChild);
        }
        m4076e();
        m4072a();
    }

    public void setSelectionRequired(boolean z6) {
        this.f6806j = z6;
    }

    public void setSingleSelection(boolean z6) {
        if (this.f6805h != z6) {
            this.f6805h = z6;
            this.f6804g = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i10);
                materialButton.setChecked(false);
                materialButton.getId();
                m4073b();
            }
            this.f6804g = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}

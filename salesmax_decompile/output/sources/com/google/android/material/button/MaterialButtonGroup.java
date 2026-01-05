package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.common.api.Api;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import p001o.bkh;
import p001o.ebe;
import p001o.gza;
import p001o.n74;
import p001o.o6;
import p001o.pae;
import p001o.v4g;
import p001o.w4g;
import p001o.x4g;
import p001o.x5e;
import p001o.xzi;
import p001o.ykf;

/* loaded from: classes3.dex */
public class MaterialButtonGroup extends LinearLayout {

    /* renamed from: x */
    public static final int f12240x = pae.Widget_Material3_MaterialButtonGroup;

    /* renamed from: a */
    public final List f12241a;

    /* renamed from: b */
    public final List f12242b;

    /* renamed from: c */
    public final C10979b f12243c;

    /* renamed from: d */
    public final Comparator f12244d;

    /* renamed from: e */
    public Integer[] f12245e;

    /* renamed from: f */
    public v4g f12246f;

    /* renamed from: g */
    public w4g f12247g;

    /* renamed from: h */
    public int f12248h;

    /* renamed from: q */
    public x4g f12249q;

    /* renamed from: s */
    public boolean f12250s;

    /* renamed from: com.google.android.material.button.MaterialButtonGroup$b */
    public class C10979b implements MaterialButton.InterfaceC10977c {
        public C10979b() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC10977c
        /* renamed from: a */
        public void mo14235a(MaterialButton materialButton, boolean z) {
            MaterialButtonGroup.this.invalidate();
        }
    }

    public MaterialButtonGroup(Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m14246j(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m14246j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ int m14237k(MaterialButton materialButton, MaterialButton materialButton2) {
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(indexOfChild(materialButton), indexOfChild(materialButton2));
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            this.f12250s = true;
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            materialButton.setOnPressedChangeListenerInternal(this.f12243c);
            this.f12241a.add(materialButton.getShapeAppearanceModel());
            this.f12242b.add(materialButton.getStateListShapeAppearanceModel());
            materialButton.setEnabled(isEnabled());
        }
    }

    /* renamed from: b */
    public final void m14238b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonM14242f = m14242f(i);
            int iMin = this.f12248h <= 0 ? Math.min(materialButtonM14242f.getStrokeWidth(), m14242f(i - 1).getStrokeWidth()) : 0;
            LinearLayout.LayoutParams layoutParamsM14240d = m14240d(materialButtonM14242f);
            if (getOrientation() == 0) {
                layoutParamsM14240d.setMarginEnd(0);
                layoutParamsM14240d.setMarginStart(this.f12248h - iMin);
                layoutParamsM14240d.topMargin = 0;
            } else {
                layoutParamsM14240d.bottomMargin = 0;
                layoutParamsM14240d.topMargin = this.f12248h - iMin;
                layoutParamsM14240d.setMarginStart(0);
            }
            materialButtonM14242f.setLayoutParams(layoutParamsM14240d);
        }
        m14248m(firstVisibleChildIndex);
    }

    /* renamed from: c */
    public final void m14239c() {
        if (this.f12249q == null) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (m14246j(i)) {
                int iM14241e = m14241e(i);
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iM14241e /= 2;
                }
                iMin = Math.min(iMin, iM14241e);
            }
        }
        int i2 = firstVisibleChildIndex;
        while (i2 <= lastVisibleChildIndex) {
            if (m14246j(i2)) {
                m14242f(i2).setSizeChange(this.f12249q);
                m14242f(i2).setWidthChangeMax((i2 == firstVisibleChildIndex || i2 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i2++;
        }
    }

    /* renamed from: d */
    public LinearLayout.LayoutParams m14240d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m14249n();
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final int m14241e(int i) {
        if (!m14246j(i) || this.f12249q == null) {
            return 0;
        }
        int iMax = Math.max(0, this.f12249q.m55632c(m14242f(i).getWidth()));
        MaterialButton materialButtonM14245i = m14245i(i);
        int allowedWidthDecrease = materialButtonM14245i == null ? 0 : materialButtonM14245i.getAllowedWidthDecrease();
        MaterialButton materialButtonM14243g = m14243g(i);
        return Math.min(iMax, allowedWidthDecrease + (materialButtonM14243g != null ? materialButtonM14243g.getAllowedWidthDecrease() : 0));
    }

    /* renamed from: f */
    public MaterialButton m14242f(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: g */
    public final MaterialButton m14243g(int i) {
        int childCount = getChildCount();
        do {
            i++;
            if (i >= childCount) {
                return null;
            }
        } while (!m14246j(i));
        return m14242f(i);
    }

    public x4g getButtonSizeChange() {
        return this.f12249q;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f12245e;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public n74 getInnerCornerSize() {
        return this.f12246f.m52323e();
    }

    public v4g getInnerCornerSizeStateList() {
        return this.f12246f;
    }

    public ykf getShapeAppearance() {
        w4g w4gVar = this.f12247g;
        if (w4gVar == null) {
            return null;
        }
        return w4gVar.m53942c(true);
    }

    public int getSpacing() {
        return this.f12248h;
    }

    public w4g getStateListShapeAppearance() {
        return this.f12247g;
    }

    /* renamed from: h */
    public final w4g.C17779b m14244h(boolean z, boolean z2, int i) {
        w4g w4gVar = this.f12247g;
        if (w4gVar == null || (!z && !z2)) {
            w4gVar = (w4g) this.f12242b.get(i);
        }
        return w4gVar == null ? new w4g.C17779b((ykf) this.f12241a.get(i)) : w4gVar.m53946i();
    }

    /* renamed from: i */
    public final MaterialButton m14245i(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (m14246j(i2)) {
                return m14242f(i2);
            }
        }
        return null;
    }

    /* renamed from: j */
    public final boolean m14246j(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: l */
    public void m14247l(MaterialButton materialButton, int i) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton materialButtonM14245i = m14245i(iIndexOfChild);
        MaterialButton materialButtonM14243g = m14243g(iIndexOfChild);
        if (materialButtonM14245i == null && materialButtonM14243g == null) {
            return;
        }
        if (materialButtonM14245i == null) {
            materialButtonM14243g.setDisplayedWidthDecrease(i);
        }
        if (materialButtonM14243g == null) {
            materialButtonM14245i.setDisplayedWidthDecrease(i);
        }
        if (materialButtonM14245i == null || materialButtonM14243g == null) {
            return;
        }
        materialButtonM14245i.setDisplayedWidthDecrease(i / 2);
        materialButtonM14243g.setDisplayedWidthDecrease((i + 1) / 2);
    }

    /* renamed from: m */
    public final void m14248m(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m14242f(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: n */
    public final void m14249n() {
        TreeMap treeMap = new TreeMap(this.f12244d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m14242f(i), Integer.valueOf(i));
        }
        this.f12245e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    /* renamed from: o */
    public void m14250o() {
        int iM53941h;
        if (!(this.f12246f == null && this.f12247g == null) && this.f12250s) {
            this.f12250s = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i = 0;
            while (i < childCount) {
                MaterialButton materialButtonM14242f = m14242f(i);
                if (materialButtonM14242f.getVisibility() != 8) {
                    boolean z = i == firstVisibleChildIndex;
                    boolean z2 = i == lastVisibleChildIndex;
                    w4g.C17779b c17779bM14244h = m14244h(z, z2, i);
                    boolean z3 = getOrientation() == 0;
                    boolean zM57079o = xzi.m57079o(this);
                    if (z3) {
                        iM53941h = z ? 5 : 0;
                        if (z2) {
                            iM53941h |= 10;
                        }
                        if (zM57079o) {
                            iM53941h = w4g.m53941h(iM53941h);
                        }
                    } else {
                        iM53941h = z ? 3 : 0;
                        if (z2) {
                            iM53941h |= 12;
                        }
                    }
                    w4g w4gVarM53956j = c17779bM14244h.m53960n(this.f12246f, ~iM53941h).m53956j();
                    if (w4gVarM53956j.m53945f()) {
                        materialButtonM14242f.setStateListShapeAppearanceModel(w4gVarM53956j);
                    } else {
                        materialButtonM14242f.setShapeAppearanceModel(w4gVarM53956j.m53942c(true));
                    }
                }
                i++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m14239c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m14250o();
        m14238b();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f12241a.remove(iIndexOfChild);
            this.f12242b.remove(iIndexOfChild);
        }
        this.f12250s = true;
        m14250o();
        m14238b();
    }

    public void setButtonSizeChange(x4g x4gVar) {
        if (this.f12249q != x4gVar) {
            this.f12249q = x4gVar;
            m14239c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            m14242f(i).setEnabled(z);
        }
    }

    public void setInnerCornerSize(n74 n74Var) {
        this.f12246f = v4g.m52320c(n74Var);
        this.f12250s = true;
        m14250o();
        invalidate();
    }

    public void setInnerCornerSizeStateList(v4g v4gVar) {
        this.f12246f = v4gVar;
        this.f12250s = true;
        m14250o();
        invalidate();
    }

    public void setShapeAppearance(ykf ykfVar) {
        this.f12247g = new w4g.C17779b(ykfVar).m53956j();
        this.f12250s = true;
        m14250o();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f12248h = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(w4g w4gVar) {
        this.f12247g = w4gVar;
        this.f12250s = true;
        m14250o();
        invalidate();
    }

    public MaterialButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialButtonGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12240x;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f12241a = new ArrayList();
        this.f12242b = new ArrayList();
        this.f12243c = new C10979b();
        this.f12244d = new Comparator() { // from class: o.vta
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.f50868a.m14237k((MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.f12250s = true;
        Context context2 = getContext();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.MaterialButtonGroup, i, i2, new int[0]);
        if (typedArrayM19305i.hasValue(ebe.MaterialButtonGroup_buttonSizeChange)) {
            this.f12249q = x4g.m55630b(context2, typedArrayM19305i, ebe.MaterialButtonGroup_buttonSizeChange);
        }
        if (typedArrayM19305i.hasValue(ebe.MaterialButtonGroup_shapeAppearance)) {
            w4g w4gVarM53939b = w4g.m53939b(context2, typedArrayM19305i, ebe.MaterialButtonGroup_shapeAppearance);
            this.f12247g = w4gVarM53939b;
            if (w4gVarM53939b == null) {
                this.f12247g = new w4g.C17779b(ykf.m57922b(context2, typedArrayM19305i.getResourceId(ebe.MaterialButtonGroup_shapeAppearance, 0), typedArrayM19305i.getResourceId(ebe.MaterialButtonGroup_shapeAppearanceOverlay, 0)).m57970m()).m53956j();
            }
        }
        if (typedArrayM19305i.hasValue(ebe.MaterialButtonGroup_innerCornerSize)) {
            this.f12246f = v4g.m52319b(context2, typedArrayM19305i, ebe.MaterialButtonGroup_innerCornerSize, new o6(0.0f));
        }
        this.f12248h = typedArrayM19305i.getDimensionPixelSize(ebe.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM19305i.getBoolean(ebe.MaterialButtonGroup_android_enabled, true));
        typedArrayM19305i.recycle();
    }
}

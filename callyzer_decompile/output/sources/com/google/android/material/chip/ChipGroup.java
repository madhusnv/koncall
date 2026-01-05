package com.google.android.material.chip;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import d6.C1615e;
import hh.C2929f;
import hh.C2930g;
import hh.InterfaceC2931h;
import hh.ViewGroupOnHierarchyChangeListenerC2932i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import lh.AbstractC4468d;
import lh.AbstractC4475k;
import sh.AbstractC6844a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ChipGroup extends AbstractC4468d {

    /* renamed from: e */
    public int f6827e;

    /* renamed from: f */
    public int f6828f;

    /* renamed from: g */
    public boolean f6829g;

    /* renamed from: h */
    public boolean f6830h;

    /* renamed from: j */
    public final C2929f f6831j;

    /* renamed from: k */
    public final ViewGroupOnHierarchyChangeListenerC2932i f6832k;

    /* renamed from: l */
    public int f6833l;

    /* renamed from: m */
    public boolean f6834m;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        Context contextM13042a = AbstractC6844a.m13042a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextM13042a, attributeSet, R.attr.chipGroupStyle);
        this.f22273c = false;
        TypedArray typedArrayObtainStyledAttributes = contextM13042a.getTheme().obtainStyledAttributes(attributeSet, AbstractC0143a.f459h, 0, 0);
        this.f22271a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f22272b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f6831j = new C2929f(this);
        ViewGroupOnHierarchyChangeListenerC2932i viewGroupOnHierarchyChangeListenerC2932i = new ViewGroupOnHierarchyChangeListenerC2932i(this);
        this.f6832k = viewGroupOnHierarchyChangeListenerC2932i;
        this.f6833l = -1;
        this.f6834m = false;
        TypedArray typedArrayM9328e = AbstractC4475k.m9328e(getContext(), attributeSet, AbstractC0143a.f454c, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM9328e.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM9328e.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM9328e.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM9328e.getBoolean(5, false));
        setSingleSelection(typedArrayM9328e.getBoolean(6, false));
        setSelectionRequired(typedArrayM9328e.getBoolean(4, false));
        int resourceId = typedArrayM9328e.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f6833l = resourceId;
        }
        typedArrayM9328e.recycle();
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC2932i);
        Field field = v0.f5527a;
        setImportantForAccessibility(1);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i10) {
        this.f6833l = i10;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i11 = this.f6833l;
                if (i11 != -1 && this.f6829g) {
                    m4088c(i11, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i10, layoutParams);
    }

    /* renamed from: b */
    public final void m4087b(int i10) {
        int i11 = this.f6833l;
        if (i10 == i11) {
            return;
        }
        if (i11 != -1 && this.f6829g) {
            m4088c(i11, false);
        }
        if (i10 != -1) {
            m4088c(i10, true);
        }
        setCheckedId(i10);
    }

    /* renamed from: c */
    public final void m4088c(int i10, boolean z6) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof Chip) {
            this.f6834m = true;
            ((Chip) viewFindViewById).setChecked(z6);
            this.f6834m = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2930g);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2930g(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2930g(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f6829g) {
            return this.f6833l;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f6829g) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f6827e;
    }

    public int getChipSpacingVertical() {
        return this.f6828f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f6833l;
        if (i10 != -1) {
            m4088c(i10, true);
            setCheckedId(this.f6833l);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1615e.m5279a(getRowCount(), this.f22273c ? getChipCount() : -1, this.f6829g ? 1 : 2).f8059a);
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f6827e != i10) {
            this.f6827e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f6828f != i10) {
            this.f6828f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f6832k.f15978a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z6) {
        this.f6830h = z6;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // lh.AbstractC4468d
    public void setSingleLine(boolean z6) {
        super.setSingleLine(z6);
    }

    public void setSingleSelection(boolean z6) {
        if (this.f6829g != z6) {
            this.f6829g = z6;
            this.f6834m = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f6834m = false;
            setCheckedId(-1);
        }
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2930g(layoutParams);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setOnCheckedChangeListener(InterfaceC2931h interfaceC2931h) {
    }
}

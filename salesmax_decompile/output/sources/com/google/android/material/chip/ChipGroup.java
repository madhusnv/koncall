package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.FlowLayout;
import java.util.List;
import java.util.Set;
import p001o.bkh;
import p001o.cc;
import p001o.ebe;
import p001o.gza;
import p001o.m83;
import p001o.pae;
import p001o.x5e;

/* loaded from: classes3.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: x */
    public static final int f12346x = pae.Widget_MaterialComponents_ChipGroup;

    /* renamed from: e */
    public int f12347e;

    /* renamed from: f */
    public int f12348f;

    /* renamed from: g */
    public InterfaceC10999d f12349g;

    /* renamed from: h */
    public final m83 f12350h;

    /* renamed from: q */
    public final int f12351q;

    /* renamed from: s */
    public final ViewGroupOnHierarchyChangeListenerC11000e f12352s;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    public class C10996a implements m83.InterfaceC15248b {
        public C10996a() {
        }

        @Override // p001o.m83.InterfaceC15248b
        /* renamed from: a */
        public void mo14412a(Set set) {
            if (ChipGroup.this.f12349g != null) {
                InterfaceC10999d interfaceC10999d = ChipGroup.this.f12349g;
                ChipGroup chipGroup = ChipGroup.this;
                interfaceC10999d.mo14413a(chipGroup, chipGroup.f12350h.m38539j(ChipGroup.this));
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C10997b implements InterfaceC10999d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10998c f12354a;

        public C10997b(InterfaceC10998c interfaceC10998c) {
            this.f12354a = interfaceC10998c;
        }

        @Override // com.google.android.material.chip.ChipGroup.InterfaceC10999d
        /* renamed from: a */
        public void mo14413a(ChipGroup chipGroup, List list) {
            if (ChipGroup.this.f12350h.m38541l()) {
                this.f12354a.mo14414a(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public interface InterfaceC10998c {
        /* renamed from: a */
        void mo14414a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface InterfaceC10999d {
        /* renamed from: a */
        void mo14413a(ChipGroup chipGroup, List list);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public class ViewGroupOnHierarchyChangeListenerC11000e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f12356a;

        public ViewGroupOnHierarchyChangeListenerC11000e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                ChipGroup.this.f12350h.m38534e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f12356a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f12350h.m38543n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f12356a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public /* synthetic */ ViewGroupOnHierarchyChangeListenerC11000e(ChipGroup chipGroup, C10996a c10996a) {
            this();
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && m14410j(i2)) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.FlowLayout
    /* renamed from: c */
    public boolean mo14406c() {
        return super.mo14406c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: g */
    public void m14407g(int i) {
        this.f12350h.m38535f(i);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f12350h.m38540k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f12350h.m38539j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f12347e;
    }

    public int getChipSpacingVertical() {
        return this.f12348f;
    }

    /* renamed from: h */
    public void m14408h() {
        this.f12350h.m38537h();
    }

    /* renamed from: i */
    public int m14409i(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && m14410j(i2)) {
                if (((Chip) childAt) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final boolean m14410j(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    /* renamed from: k */
    public boolean m14411k() {
        return this.f12350h.m38541l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f12351q;
        if (i != -1) {
            this.f12350h.m38535f(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cc.d1(accessibilityNodeInfo).q0(cc.C12628e.m20831b(getRowCount(), mo14406c() ? getVisibleChipCount() : -1, false, m14411k() ? 1 : 2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f12347e != i) {
            this.f12347e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f12348f != i) {
            this.f12348f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
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
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC10998c interfaceC10998c) {
        if (interfaceC10998c == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C10997b(interfaceC10998c));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC10999d interfaceC10999d) {
        this.f12349g = interfaceC10999d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f12352s.f12356a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f12350h.m38545p(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        this.f12350h.m38546q(z);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12346x;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        m83 m83Var = new m83();
        this.f12350h = m83Var;
        ViewGroupOnHierarchyChangeListenerC11000e viewGroupOnHierarchyChangeListenerC11000e = new ViewGroupOnHierarchyChangeListenerC11000e(this, null);
        this.f12352s = viewGroupOnHierarchyChangeListenerC11000e;
        TypedArray typedArrayM19305i = bkh.m19305i(getContext(), attributeSet, ebe.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = typedArrayM19305i.getDimensionPixelOffset(ebe.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayM19305i.getDimensionPixelOffset(ebe.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM19305i.getDimensionPixelOffset(ebe.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayM19305i.getBoolean(ebe.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayM19305i.getBoolean(ebe.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayM19305i.getBoolean(ebe.ChipGroup_selectionRequired, false));
        this.f12351q = typedArrayM19305i.getResourceId(ebe.ChipGroup_checkedChip, -1);
        typedArrayM19305i.recycle();
        m83Var.m38544o(new C10996a());
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC11000e);
        setImportantForAccessibility(1);
    }
}

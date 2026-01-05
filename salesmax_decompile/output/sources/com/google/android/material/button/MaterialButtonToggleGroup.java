package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p001o.bkh;
import p001o.cc;
import p001o.db;
import p001o.ebe;
import p001o.gza;
import p001o.o6;
import p001o.pae;
import p001o.v4g;
import p001o.wvi;
import p001o.x5e;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {
    public static final int i0 = pae.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: H */
    public boolean f12252H;

    /* renamed from: L */
    public boolean f12253L;

    /* renamed from: M */
    public boolean f12254M;

    /* renamed from: Q */
    public final int f12255Q;
    public Set h0;

    /* renamed from: y */
    public final LinkedHashSet f12256y;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C10980a extends db {
        public C10980a() {
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            ccVar.r0(cc.C12629f.m20832a(0, 1, MaterialButtonToggleGroup.this.m14262w(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public interface InterfaceC10981b {
        /* renamed from: a */
        void mo14266a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private String getChildrenA11yClassName() {
        return (this.f12253L ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m14251j(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: j */
    private boolean m14251j(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: A */
    public void m14253A(int i) {
        m14258s(i, false);
    }

    /* renamed from: B */
    public final void m14254B(Set set) {
        Set set2 = this.h0;
        this.h0 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = m14242f(i).getId();
            m14265z(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                m14261v(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    /* renamed from: C */
    public final void m14255C() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            m14242f(i).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setupButtonChild(materialButton);
            m14258s(materialButton.getId(), materialButton.isChecked());
            wvi.m0(materialButton, new C10980a());
        }
    }

    public int getCheckedButtonId() {
        if (!this.f12253L || this.h0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.h0.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = m14242f(i).getId();
            if (this.h0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f12255Q;
        if (i != -1) {
            m14254B(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cc.d1(accessibilityNodeInfo).q0(cc.C12628e.m20831b(1, getVisibleButtonCount(), false, m14263x() ? 1 : 2));
    }

    /* renamed from: q */
    public void m14256q(InterfaceC10981b interfaceC10981b) {
        this.f12256y.add(interfaceC10981b);
    }

    /* renamed from: r */
    public void m14257r(int i) {
        m14258s(i, true);
    }

    /* renamed from: s */
    public final void m14258s(int i, boolean z) {
        if (i == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Button ID is not valid: ");
            sb.append(i);
            return;
        }
        HashSet hashSet = new HashSet(this.h0);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f12253L && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f12254M || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m14254B(hashSet);
    }

    public void setSelectionRequired(boolean z) {
        this.f12254M = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f12253L != z) {
            this.f12253L = z;
            m14259t();
        }
        m14255C();
    }

    /* renamed from: t */
    public void m14259t() {
        m14254B(new HashSet());
    }

    /* renamed from: u */
    public void m14260u() {
        this.f12256y.clear();
    }

    /* renamed from: v */
    public final void m14261v(int i, boolean z) {
        Iterator it = this.f12256y.iterator();
        while (it.hasNext()) {
            ((InterfaceC10981b) it.next()).mo14266a(this, i, z);
        }
    }

    /* renamed from: w */
    public final int m14262w(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m14251j(i2)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public boolean m14263x() {
        return this.f12253L;
    }

    /* renamed from: y */
    public void m14264y(MaterialButton materialButton, boolean z) {
        if (this.f12252H) {
            return;
        }
        m14258s(materialButton.getId(), z);
    }

    /* renamed from: z */
    public final void m14265z(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.f12252H = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.f12252H = false;
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = i0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f12256y = new LinkedHashSet();
        this.f12252H = false;
        this.h0 = new HashSet();
        TypedArray typedArrayM19305i = bkh.m19305i(getContext(), attributeSet, ebe.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(typedArrayM19305i.getBoolean(ebe.MaterialButtonToggleGroup_singleSelection, false));
        this.f12255Q = typedArrayM19305i.getResourceId(ebe.MaterialButtonToggleGroup_checkedButton, -1);
        this.f12254M = typedArrayM19305i.getBoolean(ebe.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.f12246f == null) {
            this.f12246f = v4g.m52320c(new o6(0.0f));
        }
        setEnabled(typedArrayM19305i.getBoolean(ebe.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayM19305i.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}

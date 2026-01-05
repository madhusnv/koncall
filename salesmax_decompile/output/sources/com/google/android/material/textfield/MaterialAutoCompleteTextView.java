package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p001o.aqa;
import p001o.bkh;
import p001o.ebe;
import p001o.gua;
import p001o.gza;
import p001o.iae;
import p001o.n9e;
import p001o.x6e;
import p001o.yya;
import p001o.z5e;
import p001o.zya;

/* loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: e */
    public final ListPopupWindow f13087e;

    /* renamed from: f */
    public final AccessibilityManager f13088f;

    /* renamed from: g */
    public final Rect f13089g;

    /* renamed from: h */
    public final int f13090h;

    /* renamed from: q */
    public final float f13091q;

    /* renamed from: s */
    public ColorStateList f13092s;

    /* renamed from: x */
    public int f13093x;

    /* renamed from: y */
    public ColorStateList f13094y;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    public class C11145a implements AdapterView.OnItemClickListener {
        public C11145a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            Object objM4310u = i < 0 ? materialAutoCompleteTextView.f13087e.m4310u() : materialAutoCompleteTextView.getAdapter().getItem(i);
            MaterialAutoCompleteTextView materialAutoCompleteTextView2 = MaterialAutoCompleteTextView.this;
            materialAutoCompleteTextView2.setText(materialAutoCompleteTextView2.convertSelectionToString(objM4310u), false);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = MaterialAutoCompleteTextView.this.f13087e.m4313x();
                    i = MaterialAutoCompleteTextView.this.f13087e.m4312w();
                    j = MaterialAutoCompleteTextView.this.f13087e.m4311v();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f13087e.mo3992o(), view, i, j);
            }
            MaterialAutoCompleteTextView.this.f13087e.dismiss();
        }
    }

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$b */
    public class C11146b extends ArrayAdapter {

        /* renamed from: a */
        public ColorStateList f13096a;

        /* renamed from: b */
        public ColorStateList f13097b;

        public C11146b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            m15331f();
        }

        /* renamed from: a */
        public final ColorStateList m15326a() {
            if (!m15328c() || !m15329d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{gua.m29511j(MaterialAutoCompleteTextView.this.f13093x, MaterialAutoCompleteTextView.this.f13094y.getColorForState(iArr2, 0)), gua.m29511j(MaterialAutoCompleteTextView.this.f13093x, MaterialAutoCompleteTextView.this.f13094y.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.f13093x});
        }

        /* renamed from: b */
        public final Drawable m15327b() {
            if (!m15328c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f13093x);
            if (this.f13097b == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f13096a);
            return new RippleDrawable(this.f13097b, colorDrawable, null);
        }

        /* renamed from: c */
        public final boolean m15328c() {
            return MaterialAutoCompleteTextView.this.f13093x != 0;
        }

        /* renamed from: d */
        public final boolean m15329d() {
            return MaterialAutoCompleteTextView.this.f13094y != null;
        }

        /* renamed from: e */
        public final ColorStateList m15330e() {
            if (!m15329d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f13094y.getColorForState(iArr, 0), 0});
        }

        /* renamed from: f */
        public void m15331f() {
            this.f13097b = m15330e();
            this.f13096a = m15326a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? m15327b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (m15321g()) {
            this.f13087e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    /* renamed from: f */
    public final TextInputLayout m15320f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m15321g() {
        return m15323i() || m15322h();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f13092s;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM15320f = m15320f();
        return (textInputLayoutM15320f == null || !textInputLayoutM15320f.m15366V()) ? super.getHint() : textInputLayoutM15320f.getHint();
    }

    public float getPopupElevation() {
        return this.f13091q;
    }

    public int getSimpleItemSelectedColor() {
        return this.f13093x;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f13094y;
    }

    /* renamed from: h */
    public final boolean m15322h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f13088f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f13088f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m15323i() {
        AccessibilityManager accessibilityManager = this.f13088f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    /* renamed from: j */
    public final int m15324j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutM15320f = m15320f();
        int i = 0;
        if (adapter == null || textInputLayoutM15320f == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f13087e.m4312w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutM15320f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableM4302g = this.f13087e.m4302g();
        if (drawableM4302g != null) {
            drawableM4302g.getPadding(this.f13089g);
            Rect rect = this.f13089g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutM15320f.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: k */
    public final void m15325k() {
        TextInputLayout textInputLayoutM15320f = m15320f();
        if (textInputLayoutM15320f != null) {
            textInputLayoutM15320f.x0();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM15320f = m15320f();
        if (textInputLayoutM15320f != null && textInputLayoutM15320f.m15366V() && super.getHint() == null && aqa.m17659d()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13087e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m15324j()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (m15321g()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f13087e.mo4230m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f13087e;
        if (listPopupWindow != null) {
            listPopupWindow.m4299b(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f13092s = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof zya) {
            ((zya) dropDownBackground).g0(this.f13092s);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f13087e.m4293L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        m15325k();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f13093x = i;
        if (getAdapter() instanceof C11146b) {
            ((C11146b) getAdapter()).m15331f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f13094y = colorStateList;
        if (getAdapter() instanceof C11146b) {
            ((C11146b) getAdapter()).m15331f();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (m15321g()) {
            this.f13087e.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C11146b(getContext(), this.f13090h, strArr));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(gza.m29680d(context, attributeSet, i, 0), attributeSet, i);
        this.f13089g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.MaterialAutoCompleteTextView, i, iae.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM19305i.hasValue(ebe.MaterialAutoCompleteTextView_android_inputType) && typedArrayM19305i.getInt(ebe.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f13090h = typedArrayM19305i.getResourceId(ebe.MaterialAutoCompleteTextView_simpleItemLayout, n9e.mtrl_auto_complete_simple_item);
        this.f13091q = typedArrayM19305i.getDimensionPixelOffset(ebe.MaterialAutoCompleteTextView_android_popupElevation, x6e.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM19305i.hasValue(ebe.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.f13092s = ColorStateList.valueOf(typedArrayM19305i.getColor(ebe.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.f13093x = typedArrayM19305i.getColor(ebe.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f13094y = yya.m58494a(context2, typedArrayM19305i, ebe.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f13088f = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f13087e = listPopupWindow;
        listPopupWindow.m4290I(true);
        listPopupWindow.m4284C(this);
        listPopupWindow.m4289H(2);
        listPopupWindow.mo4230m(getAdapter());
        listPopupWindow.m4292K(new C11145a());
        if (typedArrayM19305i.hasValue(ebe.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayM19305i.getResourceId(ebe.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayM19305i.recycle();
    }
}

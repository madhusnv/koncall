package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC1797j;
import p001o.anh;
import p001o.bbe;
import p001o.g9e;
import p001o.r8e;
import p001o.z5e;

/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1797j.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: H */
    public boolean f5522H;

    /* renamed from: L */
    public Drawable f5523L;

    /* renamed from: M */
    public boolean f5524M;

    /* renamed from: Q */
    public LayoutInflater f5525Q;

    /* renamed from: a */
    public C1794g f5526a;

    /* renamed from: b */
    public ImageView f5527b;

    /* renamed from: c */
    public RadioButton f5528c;

    /* renamed from: d */
    public TextView f5529d;

    /* renamed from: e */
    public CheckBox f5530e;

    /* renamed from: f */
    public TextView f5531f;

    /* renamed from: g */
    public ImageView f5532g;

    /* renamed from: h */
    public ImageView f5533h;
    public boolean h0;

    /* renamed from: q */
    public LinearLayout f5534q;

    /* renamed from: s */
    public Drawable f5535s;

    /* renamed from: x */
    public int f5536x;

    /* renamed from: y */
    public Context f5537y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f5525Q == null) {
            this.f5525Q = LayoutInflater.from(getContext());
        }
        return this.f5525Q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f5532g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void m3958a(View view) {
        m3959b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f5533h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5533h.getLayoutParams();
        rect.top += this.f5533h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final void m3959b(View view, int i) {
        LinearLayout linearLayout = this.f5534q;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: c */
    public void mo3948c(C1794g c1794g, int i) {
        this.f5526a = c1794g;
        setVisibility(c1794g.isVisible() ? 0 : 8);
        setTitle(c1794g.m4077i(this));
        setCheckable(c1794g.isCheckable());
        setShortcut(c1794g.m4068A(), c1794g.m4075g());
        setIcon(c1794g.getIcon());
        setEnabled(c1794g.isEnabled());
        setSubMenuArrowVisible(c1794g.hasSubMenu());
        setContentDescription(c1794g.getContentDescription());
    }

    /* renamed from: d */
    public final void m3960d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g9e.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f5530e = checkBox;
        m3958a(checkBox);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: e */
    public boolean mo3949e() {
        return false;
    }

    /* renamed from: f */
    public final void m3961f() {
        ImageView imageView = (ImageView) getInflater().inflate(g9e.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f5527b = imageView;
        m3959b(imageView, 0);
    }

    /* renamed from: g */
    public final void m3962g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g9e.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f5528c = radioButton;
        m3958a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    public C1794g getItemData() {
        return this.f5526a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f5535s);
        TextView textView = (TextView) findViewById(r8e.title);
        this.f5529d = textView;
        int i = this.f5536x;
        if (i != -1) {
            textView.setTextAppearance(this.f5537y, i);
        }
        this.f5531f = (TextView) findViewById(r8e.shortcut);
        ImageView imageView = (ImageView) findViewById(r8e.submenuarrow);
        this.f5532g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f5523L);
        }
        this.f5533h = (ImageView) findViewById(r8e.group_divider);
        this.f5534q = (LinearLayout) findViewById(r8e.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f5527b != null && this.f5522H) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f5527b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f5528c == null && this.f5530e == null) {
            return;
        }
        if (this.f5526a.m4081m()) {
            if (this.f5528c == null) {
                m3962g();
            }
            compoundButton = this.f5528c;
            view = this.f5530e;
        } else {
            if (this.f5530e == null) {
                m3960d();
            }
            compoundButton = this.f5530e;
            view = this.f5528c;
        }
        if (z) {
            compoundButton.setChecked(this.f5526a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f5530e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f5528c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f5526a.m4081m()) {
            if (this.f5528c == null) {
                m3962g();
            }
            compoundButton = this.f5528c;
        } else {
            if (this.f5530e == null) {
                m3960d();
            }
            compoundButton = this.f5530e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.h0 = z;
        this.f5522H = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f5533h;
        if (imageView != null) {
            imageView.setVisibility((this.f5524M || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f5526a.m4094z() || this.h0;
        if (z || this.f5522H) {
            ImageView imageView = this.f5527b;
            if (imageView == null && drawable == null && !this.f5522H) {
                return;
            }
            if (imageView == null) {
                m3961f();
            }
            if (drawable == null && !this.f5522H) {
                this.f5527b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f5527b;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f5527b.getVisibility() != 0) {
                this.f5527b.setVisibility(0);
            }
        }
    }

    public void setShortcut(boolean z, char c) {
        int i = (z && this.f5526a.m4068A()) ? 0 : 8;
        if (i == 0) {
            this.f5531f.setText(this.f5526a.m4076h());
        }
        if (this.f5531f.getVisibility() != i) {
            this.f5531f.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f5529d.getVisibility() != 8) {
                this.f5529d.setVisibility(8);
            }
        } else {
            this.f5529d.setText(charSequence);
            if (this.f5529d.getVisibility() != 0) {
                this.f5529d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        anh anhVarM17525v = anh.m17525v(getContext(), attributeSet, bbe.MenuView, i, 0);
        this.f5535s = anhVarM17525v.m17532g(bbe.MenuView_android_itemBackground);
        this.f5536x = anhVarM17525v.m17539n(bbe.MenuView_android_itemTextAppearance, -1);
        this.f5522H = anhVarM17525v.m17526a(bbe.MenuView_preserveIconSpacing, false);
        this.f5537y = context;
        this.f5523L = anhVarM17525v.m17532g(bbe.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, z5e.dropDownListViewStyle, 0);
        this.f5524M = typedArrayObtainStyledAttributes.hasValue(0);
        anhVarM17525v.m17546x();
        typedArrayObtainStyledAttributes.recycle();
    }
}

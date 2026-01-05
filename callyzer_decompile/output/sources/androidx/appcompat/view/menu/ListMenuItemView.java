package androidx.appcompat.view.menu;

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
import com.websoptimization.callyzerbiz.R;
import l4.C4367l;
import p009j.AbstractC3500a;
import p012n.InterfaceC4936p;
import p012n.MenuC4929i;
import p012n.MenuItemC4930j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC4936p, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    public MenuItemC4930j f1684a;

    /* renamed from: b */
    public ImageView f1685b;

    /* renamed from: c */
    public RadioButton f1686c;

    /* renamed from: d */
    public TextView f1687d;

    /* renamed from: e */
    public CheckBox f1688e;

    /* renamed from: f */
    public TextView f1689f;

    /* renamed from: g */
    public ImageView f1690g;

    /* renamed from: h */
    public ImageView f1691h;

    /* renamed from: j */
    public LinearLayout f1692j;

    /* renamed from: k */
    public final Drawable f1693k;

    /* renamed from: l */
    public final int f1694l;

    /* renamed from: m */
    public final Context f1695m;

    /* renamed from: n */
    public boolean f1696n;

    /* renamed from: p */
    public final Drawable f1697p;

    /* renamed from: q */
    public final boolean f1698q;

    /* renamed from: r */
    public LayoutInflater f1699r;

    /* renamed from: s */
    public boolean f1700s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C4367l c4367lM9117H = C4367l.m9117H(getContext(), attributeSet, AbstractC3500a.f18359p, R.attr.listMenuViewStyle);
        this.f1693k = c4367lM9117H.m9145y(5);
        TypedArray typedArray = (TypedArray) c4367lM9117H.f21922c;
        this.f1694l = typedArray.getResourceId(1, -1);
        this.f1696n = typedArray.getBoolean(7, false);
        this.f1695m = context;
        this.f1697p = c4367lM9117H.m9145y(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1698q = typedArrayObtainStyledAttributes.hasValue(0);
        c4367lM9117H.m9124I();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1699r == null) {
            this.f1699r = LayoutInflater.from(getContext());
        }
        return this.f1699r;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f1690g;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // p012n.InterfaceC4936p
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo550a(p012n.MenuItemC4930j r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo550a(n.j):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1691h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1691h.getLayoutParams();
        rect.top = this.f1691h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p012n.InterfaceC4936p
    public MenuItemC4930j getItemData() {
        return this.f1684a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1693k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1687d = textView;
        int i10 = this.f1694l;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1695m, i10);
        }
        this.f1689f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1690g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1697p);
        }
        this.f1691h = (ImageView) findViewById(R.id.group_divider);
        this.f1692j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f1685b != null && this.f1696n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1685b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f1686c == null && this.f1688e == null) {
            return;
        }
        if ((this.f1684a.f24578x & 4) != 0) {
            if (this.f1686c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1686c = radioButton;
                LinearLayout linearLayout = this.f1692j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1686c;
            view = this.f1688e;
        } else {
            if (this.f1688e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1688e = checkBox;
                LinearLayout linearLayout2 = this.f1692j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1688e;
            view = this.f1686c;
        }
        if (z6) {
            compoundButton.setChecked(this.f1684a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1688e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1686c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if ((this.f1684a.f24578x & 4) != 0) {
            if (this.f1686c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1686c = radioButton;
                LinearLayout linearLayout = this.f1692j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1686c;
        } else {
            if (this.f1688e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1688e = checkBox;
                LinearLayout linearLayout2 = this.f1692j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1688e;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f1700s = z6;
        this.f1696n = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f1691h;
        if (imageView != null) {
            imageView.setVisibility((this.f1698q || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC4929i menuC4929i = this.f1684a.f24568n;
        boolean z6 = this.f1700s;
        if (z6 || this.f1696n) {
            ImageView imageView = this.f1685b;
            if (imageView == null && drawable == null && !this.f1696n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1685b = imageView2;
                LinearLayout linearLayout = this.f1692j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1696n) {
                this.f1685b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1685b;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1685b.getVisibility() != 0) {
                this.f1685b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1687d.getVisibility() != 8) {
                this.f1687d.setVisibility(8);
            }
        } else {
            this.f1687d.setText(charSequence);
            if (this.f1687d.getVisibility() != 0) {
                this.f1687d.setVisibility(0);
            }
        }
    }
}

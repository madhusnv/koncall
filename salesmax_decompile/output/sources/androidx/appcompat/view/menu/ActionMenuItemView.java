package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.InterfaceC1797j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import p001o.bbe;
import p001o.brf;
import p001o.jsh;
import p001o.of7;

/* loaded from: classes2.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC1797j.a, View.OnClickListener, ActionMenuView.InterfaceC1814a {

    /* renamed from: H */
    public AbstractC1787b f5509H;

    /* renamed from: L */
    public boolean f5510L;

    /* renamed from: M */
    public boolean f5511M;

    /* renamed from: Q */
    public int f5512Q;

    /* renamed from: h */
    public C1794g f5513h;
    public int h0;
    public int i0;

    /* renamed from: q */
    public CharSequence f5514q;

    /* renamed from: s */
    public Drawable f5515s;

    /* renamed from: x */
    public C1792e.b f5516x;

    /* renamed from: y */
    public of7 f5517y;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C1786a extends of7 {
        public C1786a() {
            super(ActionMenuItemView.this);
        }

        @Override // p001o.of7
        /* renamed from: b */
        public brf mo3953b() {
            AbstractC1787b abstractC1787b = ActionMenuItemView.this.f5509H;
            if (abstractC1787b != null) {
                return abstractC1787b.mo3955a();
            }
            return null;
        }

        @Override // p001o.of7
        /* renamed from: c */
        public boolean mo3954c() {
            brf brfVarMo3953b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C1792e.b bVar = actionMenuItemView.f5516x;
            return bVar != null && bVar.mo3957d(actionMenuItemView.f5513h) && (brfVarMo3953b = mo3953b()) != null && brfVarMo3953b.mo3986a();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC1787b {
        /* renamed from: a */
        public abstract brf mo3955a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1814a
    /* renamed from: a */
    public boolean mo3946a() {
        return m3950s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1814a
    /* renamed from: b */
    public boolean mo3947b() {
        return m3950s() && this.f5513h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: c */
    public void mo3948c(C1794g c1794g, int i) {
        this.f5513h = c1794g;
        setIcon(c1794g.getIcon());
        setTitle(c1794g.m4077i(this));
        setId(c1794g.getItemId());
        setVisibility(c1794g.isVisible() ? 0 : 8);
        setEnabled(c1794g.isEnabled());
        if (c1794g.hasSubMenu() && this.f5517y == null) {
            this.f5517y = new C1786a();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: e */
    public boolean mo3949e() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    public C1794g getItemData() {
        return this.f5513h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C1792e.b bVar = this.f5516x;
        if (bVar != null) {
            bVar.mo3957d(this.f5513h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5510L = m3951t();
        m3952u();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zM3950s = m3950s();
        if (zM3950s && (i3 = this.h0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f5512Q) : this.f5512Q;
        if (mode != 1073741824 && this.f5512Q > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zM3950s || this.f5515s == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f5515s.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        of7 of7Var;
        if (this.f5513h.hasSubMenu() && (of7Var = this.f5517y) != null && of7Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: s */
    public boolean m3950s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f5511M != z) {
            this.f5511M = z;
            C1794g c1794g = this.f5513h;
            if (c1794g != null) {
                c1794g.m4072c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f5515s = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.i0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m3952u();
    }

    public void setItemInvoker(C1792e.b bVar) {
        this.f5516x = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.h0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC1787b abstractC1787b) {
        this.f5509H = abstractC1787b;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f5514q = charSequence;
        m3952u();
    }

    /* renamed from: t */
    public final boolean m3951t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: u */
    public final void m3952u() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f5514q);
        if (this.f5515s != null && (!this.f5513h.m4069B() || (!this.f5510L && !this.f5511M))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f5514q : null);
        CharSequence contentDescription = this.f5513h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f5513h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f5513h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            jsh.m34483a(this, z3 ? null : this.f5513h.getTitle());
        } else {
            jsh.m34483a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f5510L = m3951t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbe.ActionMenuItemView, i, 0);
        this.f5512Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(bbe.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.i0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.h0 = -1;
        setSaveEnabled(false);
    }
}

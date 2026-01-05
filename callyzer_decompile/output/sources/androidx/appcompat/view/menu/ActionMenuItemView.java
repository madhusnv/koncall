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
import og.ia;
import p009j.AbstractC3500a;
import p012n.AbstractC4922b;
import p012n.InterfaceC4928h;
import p012n.InterfaceC4936p;
import p012n.MenuC4929i;
import p012n.MenuItemC4930j;
import p012n.ViewOnTouchListenerC4921a;
import p013o.InterfaceC5224j;
import p013o.j0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends j0 implements InterfaceC4936p, View.OnClickListener, InterfaceC5224j {

    /* renamed from: a */
    public MenuItemC4930j f1672a;

    /* renamed from: b */
    public CharSequence f1673b;

    /* renamed from: c */
    public Drawable f1674c;

    /* renamed from: d */
    public InterfaceC4928h f1675d;

    /* renamed from: e */
    public ViewOnTouchListenerC4921a f1676e;

    /* renamed from: f */
    public AbstractC4922b f1677f;

    /* renamed from: g */
    public boolean f1678g;

    /* renamed from: h */
    public boolean f1679h;

    /* renamed from: j */
    public final int f1680j;

    /* renamed from: k */
    public int f1681k;

    /* renamed from: l */
    public final int f1682l;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1678g = m553d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3500a.f18346c, 0, 0);
        this.f1680j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1682l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1681k = -1;
        setSaveEnabled(false);
    }

    @Override // p012n.InterfaceC4936p
    /* renamed from: a */
    public final void mo550a(MenuItemC4930j menuItemC4930j) {
        this.f1672a = menuItemC4930j;
        setIcon(menuItemC4930j.getIcon());
        setTitle(menuItemC4930j.getTitleCondensed());
        setId(menuItemC4930j.f24555a);
        setVisibility(menuItemC4930j.isVisible() ? 0 : 8);
        setEnabled(menuItemC4930j.isEnabled());
        if (menuItemC4930j.hasSubMenu() && this.f1676e == null) {
            this.f1676e = new ViewOnTouchListenerC4921a(this);
        }
    }

    @Override // p013o.InterfaceC5224j
    /* renamed from: b */
    public final boolean mo551b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p013o.InterfaceC5224j
    /* renamed from: c */
    public final boolean mo552c() {
        return !TextUtils.isEmpty(getText()) && this.f1672a.getIcon() == null;
    }

    /* renamed from: d */
    public final boolean m553d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* renamed from: e */
    public final void m554e() {
        boolean z6 = true;
        boolean z10 = !TextUtils.isEmpty(this.f1673b);
        if (this.f1674c != null && ((this.f1672a.f24579y & 4) != 4 || (!this.f1678g && !this.f1679h))) {
            z6 = false;
        }
        boolean z11 = z10 & z6;
        setText(z11 ? this.f1673b : null);
        CharSequence charSequence = this.f1672a.f24571q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f1672a.f24559e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1672a.f24572r;
        if (TextUtils.isEmpty(charSequence2)) {
            ia.m10698b(this, z11 ? null : this.f1672a.f24559e);
        } else {
            ia.m10698b(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p012n.InterfaceC4936p
    public MenuItemC4930j getItemData() {
        return this.f1672a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC4928h interfaceC4928h = this.f1675d;
        if (interfaceC4928h != null) {
            interfaceC4928h.mo555b(this.f1672a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1678g = m553d();
        m554e();
    }

    @Override // p013o.j0, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i12 = this.f1681k) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f1680j;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zIsEmpty || this.f1674c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1674c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC4921a viewOnTouchListenerC4921a;
        if (this.f1672a.hasSubMenu() && (viewOnTouchListenerC4921a = this.f1676e) != null && viewOnTouchListenerC4921a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f1679h != z6) {
            this.f1679h = z6;
            MenuItemC4930j menuItemC4930j = this.f1672a;
            if (menuItemC4930j != null) {
                MenuC4929i menuC4929i = menuItemC4930j.f24568n;
                menuC4929i.f24543k = true;
                menuC4929i.m9866o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1674c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1682l;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        m554e();
    }

    public void setItemInvoker(InterfaceC4928h interfaceC4928h) {
        this.f1675d = interfaceC4928h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f1681k = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC4922b abstractC4922b) {
        this.f1677f = abstractC4922b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1673b = charSequence;
        m554e();
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }
}

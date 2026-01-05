package p013o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import iz.C3378k;
import l4.C4367l;
import p009j.AbstractC3500a;
import pg.g6;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.p */
/* loaded from: classes.dex */
public abstract class AbstractC5230p extends CheckBox {

    /* renamed from: a */
    public final C5231q f25609a;

    /* renamed from: b */
    public final C5228n f25610b;

    /* renamed from: c */
    public final f0 f25611c;

    /* renamed from: d */
    public C5235u f25612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5230p(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.chipStyle);
        w1.m10301a(context);
        v1.m10297a(getContext(), this);
        this.f25609a = new C5231q(this);
        Context context2 = getContext();
        int[] iArr = AbstractC3500a.f18353j;
        C4367l c4367lM9117H = C4367l.m9117H(context2, attributeSet, iArr, R.attr.chipStyle);
        TypedArray typedArray = (TypedArray) c4367lM9117H.f21922c;
        v0.m2527i(this, getContext(), iArr, attributeSet, (TypedArray) c4367lM9117H.f21922c, R.attr.chipStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setButtonDrawable(s8.m11864b(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setButtonDrawable(s8.m11864b(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setButtonTintList(c4367lM9117H.m9140t(2));
            }
            if (typedArray.hasValue(3)) {
                setButtonTintMode(r0.m10287b(typedArray.getInt(3, -1), null));
            }
            c4367lM9117H.m9124I();
            C5228n c5228n = new C5228n(this);
            this.f25610b = c5228n;
            c5228n.m10258d(attributeSet, R.attr.chipStyle);
            f0 f0Var = new f0(this);
            this.f25611c = f0Var;
            f0Var.m10229d(attributeSet, R.attr.chipStyle);
            getEmojiTextViewHelper().m10290a(attributeSet, R.attr.chipStyle);
        } catch (Throwable th2) {
            c4367lM9117H.m9124I();
            throw th2;
        }
    }

    private C5235u getEmojiTextViewHelper() {
        if (this.f25612d == null) {
            this.f25612d = new C5235u(this);
        }
        return this.f25612d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5228n c5228n = this.f25610b;
        if (c5228n != null) {
            c5228n.m10255a();
        }
        f0 f0Var = this.f25611c;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5228n c5228n = this.f25610b;
        if (c5228n != null) {
            return c5228n.m10256b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5228n c5228n = this.f25610b;
        if (c5228n != null) {
            return c5228n.m10257c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C5231q c5231q = this.f25609a;
        if (c5231q != null) {
            return c5231q.f25614b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C5231q c5231q = this.f25609a;
        if (c5231q != null) {
            return c5231q.f25615c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C3378k c3378k = this.f25611c.f25487h;
        if (c3378k != null) {
            return (ColorStateList) c3378k.f17915c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C3378k c3378k = this.f25611c.f25487h;
        if (c3378k != null) {
            return (PorterDuff.Mode) c3378k.f17916d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        ((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11654f(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5228n c5228n = this.f25610b;
        if (c5228n != null) {
            c5228n.m10259e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5228n c5228n = this.f25610b;
        if (c5228n != null) {
            c5228n.m10260f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5231q c5231q = this.f25609a;
        if (c5231q != null) {
            if (c5231q.f25618f) {
                c5231q.f25618f = false;
            } else {
                c5231q.f25618f = true;
                c5231q.m10274a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f25611c;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f25611c;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        ((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11655g(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11652a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5228n c5228n = this.f25610b;
        if (c5228n != null) {
            c5228n.m10262h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5228n c5228n = this.f25610b;
        if (c5228n != null) {
            c5228n.m10263i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C5231q c5231q = this.f25609a;
        if (c5231q != null) {
            c5231q.f25614b = colorStateList;
            c5231q.f25616d = true;
            c5231q.m10274a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C5231q c5231q = this.f25609a;
        if (c5231q != null) {
            c5231q.f25615c = mode;
            c5231q.f25617e = true;
            c5231q.m10274a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f25611c;
        f0Var.m10234i(colorStateList);
        f0Var.m10228b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f25611c;
        f0Var.m10235j(mode);
        f0Var.m10228b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(s8.m11864b(getContext(), i10));
    }
}

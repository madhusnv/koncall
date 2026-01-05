package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p001o.dkh;
import p001o.ik0;
import p001o.oj0;
import p001o.xmh;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AppCompatImageButton extends ImageButton {

    /* renamed from: a */
    public final oj0 f5808a;

    /* renamed from: b */
    public final ik0 f5809b;

    /* renamed from: c */
    public boolean f5810c;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        oj0 oj0Var = this.f5808a;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
        ik0 ik0Var = this.f5809b;
        if (ik0Var != null) {
            ik0Var.m32219c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5808a;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5808a;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        ik0 ik0Var = this.f5809b;
        if (ik0Var != null) {
            return ik0Var.m32220d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        ik0 ik0Var = this.f5809b;
        if (ik0Var != null) {
            return ik0Var.m32221e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f5809b.m32222f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5808a;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5808a;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ik0 ik0Var = this.f5809b;
        if (ik0Var != null) {
            ik0Var.m32219c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ik0 ik0Var = this.f5809b;
        if (ik0Var != null && drawable != null && !this.f5810c) {
            ik0Var.m32224h(drawable);
        }
        super.setImageDrawable(drawable);
        ik0 ik0Var2 = this.f5809b;
        if (ik0Var2 != null) {
            ik0Var2.m32219c();
            if (this.f5810c) {
                return;
            }
            this.f5809b.m32218b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f5810c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f5809b.m32225i(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ik0 ik0Var = this.f5809b;
        if (ik0Var != null) {
            ik0Var.m32219c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oj0 oj0Var = this.f5808a;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5808a;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ik0 ik0Var = this.f5809b;
        if (ik0Var != null) {
            ik0Var.m32226j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ik0 ik0Var = this.f5809b;
        if (ik0Var != null) {
            ik0Var.m32227k(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(xmh.m56486b(context), attributeSet, i);
        this.f5810c = false;
        dkh.m23377a(this, getContext());
        oj0 oj0Var = new oj0(this);
        this.f5808a = oj0Var;
        oj0Var.m42286e(attributeSet, i);
        ik0 ik0Var = new ik0(this);
        this.f5809b = ik0Var;
        ik0Var.m32223g(attributeSet, i);
    }
}

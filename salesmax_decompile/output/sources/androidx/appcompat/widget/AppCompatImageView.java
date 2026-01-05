package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p001o.dkh;
import p001o.ik0;
import p001o.oj0;
import p001o.xmh;

/* loaded from: classes2.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: a */
    public final oj0 f5811a;

    /* renamed from: b */
    public final ik0 f5812b;

    /* renamed from: c */
    public boolean f5813c;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        oj0 oj0Var = this.f5811a;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
        ik0 ik0Var = this.f5812b;
        if (ik0Var != null) {
            ik0Var.m32219c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5811a;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5811a;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        ik0 ik0Var = this.f5812b;
        if (ik0Var != null) {
            return ik0Var.m32220d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        ik0 ik0Var = this.f5812b;
        if (ik0Var != null) {
            return ik0Var.m32221e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f5812b.m32222f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5811a;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5811a;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ik0 ik0Var = this.f5812b;
        if (ik0Var != null) {
            ik0Var.m32219c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ik0 ik0Var = this.f5812b;
        if (ik0Var != null && drawable != null && !this.f5813c) {
            ik0Var.m32224h(drawable);
        }
        super.setImageDrawable(drawable);
        ik0 ik0Var2 = this.f5812b;
        if (ik0Var2 != null) {
            ik0Var2.m32219c();
            if (this.f5813c) {
                return;
            }
            this.f5812b.m32218b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f5813c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        ik0 ik0Var = this.f5812b;
        if (ik0Var != null) {
            ik0Var.m32225i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ik0 ik0Var = this.f5812b;
        if (ik0Var != null) {
            ik0Var.m32219c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oj0 oj0Var = this.f5811a;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5811a;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ik0 ik0Var = this.f5812b;
        if (ik0Var != null) {
            ik0Var.m32226j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ik0 ik0Var = this.f5812b;
        if (ik0Var != null) {
            ik0Var.m32227k(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(xmh.m56486b(context), attributeSet, i);
        this.f5813c = false;
        dkh.m23377a(this, getContext());
        oj0 oj0Var = new oj0(this);
        this.f5811a = oj0Var;
        oj0Var.m42286e(attributeSet, i);
        ik0 ik0Var = new ik0(this);
        this.f5812b = ik0Var;
        ik0Var.m32223g(attributeSet, i);
    }
}

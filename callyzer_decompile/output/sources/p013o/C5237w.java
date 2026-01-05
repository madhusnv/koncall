package p013o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;
import b2.C0554l;
import iz.C3378k;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.w */
/* loaded from: classes.dex */
public class C5237w extends ImageView {

    /* renamed from: a */
    public final C5228n f25665a;

    /* renamed from: b */
    public final C0554l f25666b;

    /* renamed from: c */
    public boolean f25667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5237w(Context context, int i10) {
        super(context, null, i10);
        w1.m10301a(context);
        this.f25667c = false;
        v1.m10297a(getContext(), this);
        C5228n c5228n = new C5228n(this);
        this.f25665a = c5228n;
        c5228n.m10258d(null, i10);
        C0554l c0554l = new C0554l(this);
        this.f25666b = c0554l;
        c0554l.m1640j(null, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5228n c5228n = this.f25665a;
        if (c5228n != null) {
            c5228n.m10255a();
        }
        C0554l c0554l = this.f25666b;
        if (c0554l != null) {
            c0554l.m1633b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5228n c5228n = this.f25665a;
        if (c5228n != null) {
            return c5228n.m10256b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5228n c5228n = this.f25665a;
        if (c5228n != null) {
            return c5228n.m10257c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C3378k c3378k;
        C0554l c0554l = this.f25666b;
        if (c0554l == null || (c3378k = (C3378k) c0554l.f3780d) == null) {
            return null;
        }
        return (ColorStateList) c3378k.f17915c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C3378k c3378k;
        C0554l c0554l = this.f25666b;
        if (c0554l == null || (c3378k = (C3378k) c0554l.f3780d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c3378k.f17916d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f25666b.f3779c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5228n c5228n = this.f25665a;
        if (c5228n != null) {
            c5228n.m10259e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5228n c5228n = this.f25665a;
        if (c5228n != null) {
            c5228n.m10260f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0554l c0554l = this.f25666b;
        if (c0554l != null) {
            c0554l.m1633b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0554l c0554l = this.f25666b;
        if (c0554l != null && drawable != null && !this.f25667c) {
            c0554l.f3778b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0554l != null) {
            c0554l.m1633b();
            if (this.f25667c) {
                return;
            }
            ImageView imageView = (ImageView) c0554l.f3779c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0554l.f3778b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f25667c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C0554l c0554l = this.f25666b;
        if (c0554l != null) {
            ImageView imageView = (ImageView) c0554l.f3779c;
            if (i10 != 0) {
                Drawable drawableM11864b = s8.m11864b(imageView.getContext(), i10);
                if (drawableM11864b != null) {
                    r0.m10286a(drawableM11864b);
                }
                imageView.setImageDrawable(drawableM11864b);
            } else {
                imageView.setImageDrawable(null);
            }
            c0554l.m1633b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0554l c0554l = this.f25666b;
        if (c0554l != null) {
            c0554l.m1633b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5228n c5228n = this.f25665a;
        if (c5228n != null) {
            c5228n.m10262h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5228n c5228n = this.f25665a;
        if (c5228n != null) {
            c5228n.m10263i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0554l c0554l = this.f25666b;
        if (c0554l != null) {
            if (((C3378k) c0554l.f3780d) == null) {
                c0554l.f3780d = new C3378k();
            }
            C3378k c3378k = (C3378k) c0554l.f3780d;
            c3378k.f17915c = colorStateList;
            c3378k.f17914b = true;
            c0554l.m1633b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0554l c0554l = this.f25666b;
        if (c0554l != null) {
            if (((C3378k) c0554l.f3780d) == null) {
                c0554l.f3780d = new C3378k();
            }
            C3378k c3378k = (C3378k) c0554l.f3780d;
            c3378k.f17916d = mode;
            c3378k.f17913a = true;
            c0554l.m1633b();
        }
    }
}

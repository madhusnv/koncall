package p001o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: classes2.dex */
public abstract class p83 {

    /* renamed from: o.p83$a */
    public static class C16021a {
        /* renamed from: a */
        public static void m43162a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        public static void m43163b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m43159a(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    /* renamed from: b */
    public static void m43160b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        C16021a.m43162a(checkedTextView, colorStateList);
    }

    /* renamed from: c */
    public static void m43161c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        C16021a.m43163b(checkedTextView, mode);
    }
}

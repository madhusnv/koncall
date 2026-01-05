package p001o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes2.dex */
public abstract class op3 {

    /* renamed from: o.op3$a */
    public static class C15861a {
        /* renamed from: a */
        public static ColorStateList m42528a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m42529b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        public static void m42530c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m42531d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: o.op3$b */
    public static class C15862b {
        /* renamed from: a */
        public static Drawable m42532a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m42523a(CompoundButton compoundButton) {
        return C15862b.m42532a(compoundButton);
    }

    /* renamed from: b */
    public static ColorStateList m42524b(CompoundButton compoundButton) {
        return C15861a.m42528a(compoundButton);
    }

    /* renamed from: c */
    public static PorterDuff.Mode m42525c(CompoundButton compoundButton) {
        return C15861a.m42529b(compoundButton);
    }

    /* renamed from: d */
    public static void m42526d(CompoundButton compoundButton, ColorStateList colorStateList) {
        C15861a.m42530c(compoundButton, colorStateList);
    }

    /* renamed from: e */
    public static void m42527e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C15861a.m42531d(compoundButton, mode);
    }
}

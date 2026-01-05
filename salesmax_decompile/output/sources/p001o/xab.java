package p001o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* loaded from: classes2.dex */
public abstract class xab {

    /* renamed from: o.xab$a */
    public static class C18095a {
        /* renamed from: a */
        public static int m55903a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        public static CharSequence m55904b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        public static ColorStateList m55905c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        public static PorterDuff.Mode m55906d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        public static int m55907e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        public static CharSequence m55908f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        public static MenuItem m55909g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: h */
        public static MenuItem m55910h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        public static MenuItem m55911i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        public static MenuItem m55912j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        public static MenuItem m55913k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: l */
        public static MenuItem m55914l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        /* renamed from: m */
        public static MenuItem m55915m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static wm m55895a(MenuItem menuItem) {
        if (menuItem instanceof aeg) {
            return ((aeg) menuItem).mo4070a();
        }
        return null;
    }

    /* renamed from: b */
    public static MenuItem m55896b(MenuItem menuItem, wm wmVar) {
        return menuItem instanceof aeg ? ((aeg) menuItem).mo4071b(wmVar) : menuItem;
    }

    /* renamed from: c */
    public static void m55897c(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof aeg) {
            ((aeg) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18095a.m55909g(menuItem, c, i);
        }
    }

    /* renamed from: d */
    public static void m55898d(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof aeg) {
            ((aeg) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18095a.m55910h(menuItem, charSequence);
        }
    }

    /* renamed from: e */
    public static void m55899e(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof aeg) {
            ((aeg) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18095a.m55911i(menuItem, colorStateList);
        }
    }

    /* renamed from: f */
    public static void m55900f(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof aeg) {
            ((aeg) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18095a.m55912j(menuItem, mode);
        }
    }

    /* renamed from: g */
    public static void m55901g(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof aeg) {
            ((aeg) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18095a.m55913k(menuItem, c, i);
        }
    }

    /* renamed from: h */
    public static void m55902h(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof aeg) {
            ((aeg) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C18095a.m55915m(menuItem, charSequence);
        }
    }
}

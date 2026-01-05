package p011m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import bg.AbstractC0656a;
import i0.m0;
import java.lang.reflect.Constructor;
import p012n.MenuItemC4930j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m.c */
/* loaded from: classes.dex */
public final class C4605c {

    /* renamed from: A */
    public CharSequence f22778A;

    /* renamed from: D */
    public final /* synthetic */ C4606d f22781D;

    /* renamed from: a */
    public final Menu f22782a;

    /* renamed from: h */
    public boolean f22789h;

    /* renamed from: i */
    public int f22790i;

    /* renamed from: j */
    public int f22791j;

    /* renamed from: k */
    public CharSequence f22792k;

    /* renamed from: l */
    public CharSequence f22793l;

    /* renamed from: m */
    public int f22794m;

    /* renamed from: n */
    public char f22795n;

    /* renamed from: o */
    public int f22796o;

    /* renamed from: p */
    public char f22797p;

    /* renamed from: q */
    public int f22798q;

    /* renamed from: r */
    public int f22799r;

    /* renamed from: s */
    public boolean f22800s;

    /* renamed from: t */
    public boolean f22801t;

    /* renamed from: u */
    public boolean f22802u;

    /* renamed from: v */
    public int f22803v;

    /* renamed from: w */
    public int f22804w;

    /* renamed from: x */
    public String f22805x;

    /* renamed from: y */
    public String f22806y;

    /* renamed from: z */
    public CharSequence f22807z;

    /* renamed from: B */
    public ColorStateList f22779B = null;

    /* renamed from: C */
    public PorterDuff.Mode f22780C = null;

    /* renamed from: b */
    public int f22783b = 0;

    /* renamed from: c */
    public int f22784c = 0;

    /* renamed from: d */
    public int f22785d = 0;

    /* renamed from: e */
    public int f22786e = 0;

    /* renamed from: f */
    public boolean f22787f = true;

    /* renamed from: g */
    public boolean f22788g = true;

    public C4605c(C4606d c4606d, Menu menu) {
        this.f22781D = c4606d;
        this.f22782a = menu;
    }

    /* renamed from: a */
    public final Object m9477a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f22781D.f22812c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void m9478b(MenuItem menuItem) {
        C4606d c4606d = this.f22781D;
        Context context = c4606d.f22812c;
        boolean z6 = false;
        menuItem.setChecked(this.f22800s).setVisible(this.f22801t).setEnabled(this.f22802u).setCheckable(this.f22799r >= 1).setTitleCondensed(this.f22793l).setIcon(this.f22794m);
        int i10 = this.f22803v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f22806y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c4606d.f22813d == null) {
                c4606d.f22813d = C4606d.m9479a(context);
            }
            Object obj = c4606d.f22813d;
            String str = this.f22806y;
            MenuItemOnMenuItemClickListenerC4604b menuItemOnMenuItemClickListenerC4604b = new MenuItemOnMenuItemClickListenerC4604b();
            menuItemOnMenuItemClickListenerC4604b.f22776a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC4604b.f22777b = cls.getMethod(str, MenuItemOnMenuItemClickListenerC4604b.f22775c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC4604b);
            } catch (Exception e2) {
                StringBuilder sbM7383p = m0.m7383p("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbM7383p.append(cls.getName());
                InflateException inflateException = new InflateException(sbM7383p.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f22799r >= 2 && (menuItem instanceof MenuItemC4930j)) {
            MenuItemC4930j menuItemC4930j = (MenuItemC4930j) menuItem;
            menuItemC4930j.f24578x = (menuItemC4930j.f24578x & (-5)) | 4;
        }
        String str2 = this.f22805x;
        if (str2 != null) {
            menuItem.setActionView((View) m9477a(str2, C4606d.f22808e, c4606d.f22810a));
            z6 = true;
        }
        int i11 = this.f22804w;
        if (i11 > 0 && !z6) {
            menuItem.setActionView(i11);
        }
        CharSequence charSequence = this.f22807z;
        boolean z10 = menuItem instanceof MenuItemC4930j;
        if (z10) {
            ((MenuItemC4930j) menuItem).m9873c(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0656a.m1914w(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f22778A;
        if (z10) {
            ((MenuItemC4930j) menuItem).m9875e(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0656a.m1889E(menuItem, charSequence2);
        }
        char c2 = this.f22795n;
        int i12 = this.f22796o;
        if (z10) {
            ((MenuItemC4930j) menuItem).setAlphabeticShortcut(c2, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0656a.m1911t(menuItem, c2, i12);
        }
        char c10 = this.f22797p;
        int i13 = this.f22798q;
        if (z10) {
            ((MenuItemC4930j) menuItem).setNumericShortcut(c10, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0656a.m1885A(menuItem, c10, i13);
        }
        PorterDuff.Mode mode = this.f22780C;
        if (mode != null) {
            if (z10) {
                ((MenuItemC4930j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0656a.m1917z(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f22779B;
        if (colorStateList != null) {
            if (z10) {
                ((MenuItemC4930j) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0656a.m1916y(menuItem, colorStateList);
            }
        }
    }
}

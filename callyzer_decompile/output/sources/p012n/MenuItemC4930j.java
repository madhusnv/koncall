package p012n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.j */
/* loaded from: classes.dex */
public final class MenuItemC4930j implements MenuItem {

    /* renamed from: A */
    public MenuItem.OnActionExpandListener f24553A;

    /* renamed from: a */
    public final int f24555a;

    /* renamed from: b */
    public final int f24556b;

    /* renamed from: c */
    public final int f24557c;

    /* renamed from: d */
    public final int f24558d;

    /* renamed from: e */
    public CharSequence f24559e;

    /* renamed from: f */
    public CharSequence f24560f;

    /* renamed from: g */
    public Intent f24561g;

    /* renamed from: h */
    public char f24562h;

    /* renamed from: j */
    public char f24564j;

    /* renamed from: l */
    public Drawable f24566l;

    /* renamed from: n */
    public final MenuC4929i f24568n;

    /* renamed from: o */
    public SubMenuC4939s f24569o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f24570p;

    /* renamed from: q */
    public CharSequence f24571q;

    /* renamed from: r */
    public CharSequence f24572r;

    /* renamed from: z */
    public View f24580z;

    /* renamed from: i */
    public int f24563i = 4096;

    /* renamed from: k */
    public int f24565k = 4096;

    /* renamed from: m */
    public int f24567m = 0;

    /* renamed from: s */
    public ColorStateList f24573s = null;

    /* renamed from: t */
    public PorterDuff.Mode f24574t = null;

    /* renamed from: u */
    public boolean f24575u = false;

    /* renamed from: v */
    public boolean f24576v = false;

    /* renamed from: w */
    public boolean f24577w = false;

    /* renamed from: x */
    public int f24578x = 16;

    /* renamed from: B */
    public boolean f24554B = false;

    /* renamed from: y */
    public int f24579y = 0;

    public MenuItemC4930j(MenuC4929i menuC4929i, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f24568n = menuC4929i;
        this.f24555a = i11;
        this.f24556b = i10;
        this.f24557c = i12;
        this.f24558d = i13;
        this.f24559e = charSequence;
    }

    /* renamed from: a */
    public static void m9871a(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    /* renamed from: b */
    public final Drawable m9872b(Drawable drawable) {
        if (drawable != null && this.f24577w && (this.f24575u || this.f24576v)) {
            drawable = drawable.mutate();
            if (this.f24575u) {
                drawable.setTintList(this.f24573s);
            }
            if (this.f24576v) {
                drawable.setTintMode(this.f24574t);
            }
            this.f24577w = false;
        }
        return drawable;
    }

    /* renamed from: c */
    public final MenuItemC4930j m9873c(CharSequence charSequence) {
        this.f24571q = charSequence;
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f24579y & 8) == 0) {
            return false;
        }
        if (this.f24580z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f24553A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f24568n.mo9855d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final void m9874d(boolean z6) {
        if (z6) {
            this.f24578x |= 32;
        } else {
            this.f24578x &= -33;
        }
    }

    /* renamed from: e */
    public final MenuItemC4930j m9875e(CharSequence charSequence) {
        this.f24572r = charSequence;
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f24579y & 8) == 0 || this.f24580z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f24553A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f24568n.mo9857f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f24580z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f24565k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f24564j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f24571q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f24556b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f24566l;
        if (drawable != null) {
            return m9872b(drawable);
        }
        int i10 = this.f24567m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableM11864b = s8.m11864b(this.f24568n.f24533a, i10);
        this.f24567m = 0;
        this.f24566l = drawableM11864b;
        return m9872b(drawableM11864b);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f24573s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f24574t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f24561g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f24555a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f24563i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f24562h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f24557c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f24569o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f24559e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f24560f;
        return charSequence != null ? charSequence : this.f24559e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f24572r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f24569o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f24554B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f24578x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f24578x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f24578x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f24578x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f24580z = view;
        if (view != null && view.getId() == -1 && (i10 = this.f24555a) > 0) {
            view.setId(i10);
        }
        MenuC4929i menuC4929i = this.f24568n;
        menuC4929i.f24543k = true;
        menuC4929i.m9866o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f24564j == c2) {
            return this;
        }
        this.f24564j = Character.toLowerCase(c2);
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        int i10 = this.f24578x;
        int i11 = (z6 ? 1 : 0) | (i10 & (-2));
        this.f24578x = i11;
        if (i10 != i11) {
            this.f24568n.m9866o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        int i10 = this.f24578x;
        int i11 = i10 & 4;
        MenuC4929i menuC4929i = this.f24568n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z6 ? 2 : 0);
            this.f24578x = i12;
            if (i10 != i12) {
                menuC4929i.m9866o(false);
            }
            return this;
        }
        ArrayList arrayList = menuC4929i.f24538f;
        int size = arrayList.size();
        menuC4929i.m9870s();
        for (int i13 = 0; i13 < size; i13++) {
            MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayList.get(i13);
            if (menuItemC4930j.f24556b == this.f24556b && (menuItemC4930j.f24578x & 4) != 0 && menuItemC4930j.isCheckable()) {
                boolean z10 = menuItemC4930j == this;
                int i14 = menuItemC4930j.f24578x;
                int i15 = (z10 ? 2 : 0) | (i14 & (-3));
                menuItemC4930j.f24578x = i15;
                if (i14 != i15) {
                    menuItemC4930j.f24568n.m9866o(false);
                }
            }
        }
        menuC4929i.m9869r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        m9873c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f24578x |= 16;
        } else {
            this.f24578x &= -17;
        }
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f24567m = 0;
        this.f24566l = drawable;
        this.f24577w = true;
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24573s = colorStateList;
        this.f24575u = true;
        this.f24577w = true;
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24574t = mode;
        this.f24576v = true;
        this.f24577w = true;
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f24561g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f24562h == c2) {
            return this;
        }
        this.f24562h = c2;
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24553A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24570p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c10) {
        this.f24562h = c2;
        this.f24564j = Character.toLowerCase(c10);
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f24579y = i10;
        MenuC4929i menuC4929i = this.f24568n;
        menuC4929i.f24543k = true;
        menuC4929i.m9866o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f24559e = charSequence;
        this.f24568n.m9866o(false);
        SubMenuC4939s subMenuC4939s = this.f24569o;
        if (subMenuC4939s != null) {
            subMenuC4939s.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24560f = charSequence;
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        m9875e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        int i10 = this.f24578x;
        int i11 = (z6 ? 0 : 8) | (i10 & (-9));
        this.f24578x = i11;
        if (i10 != i11) {
            MenuC4929i menuC4929i = this.f24568n;
            menuC4929i.f24540h = true;
            menuC4929i.m9866o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f24559e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i10) {
        if (this.f24564j == c2 && this.f24565k == i10) {
            return this;
        }
        this.f24564j = Character.toLowerCase(c2);
        this.f24565k = KeyEvent.normalizeMetaState(i10);
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i10) {
        if (this.f24562h == c2 && this.f24563i == i10) {
            return this;
        }
        this.f24562h = c2;
        this.f24563i = KeyEvent.normalizeMetaState(i10);
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c10, int i10, int i11) {
        this.f24562h = c2;
        this.f24563i = KeyEvent.normalizeMetaState(i10);
        this.f24564j = Character.toLowerCase(c10);
        this.f24565k = KeyEvent.normalizeMetaState(i11);
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f24566l = null;
        this.f24567m = i10;
        this.f24577w = true;
        this.f24568n.m9866o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f24568n.f24533a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        MenuC4929i menuC4929i = this.f24568n;
        Context context = menuC4929i.f24533a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f24580z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f24555a) > 0) {
            viewInflate.setId(i11);
        }
        menuC4929i.f24543k = true;
        menuC4929i.m9866o(true);
        return this;
    }
}

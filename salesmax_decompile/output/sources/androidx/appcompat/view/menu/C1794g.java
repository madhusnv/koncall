package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC1797j;
import p001o.aeg;
import p001o.fy5;
import p001o.lk0;
import p001o.wm;
import p001o.y9e;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes2.dex */
public final class C1794g implements aeg {

    /* renamed from: A */
    public View f5625A;

    /* renamed from: B */
    public wm f5626B;

    /* renamed from: C */
    public MenuItem.OnActionExpandListener f5627C;

    /* renamed from: E */
    public ContextMenu.ContextMenuInfo f5629E;

    /* renamed from: a */
    public final int f5630a;

    /* renamed from: b */
    public final int f5631b;

    /* renamed from: c */
    public final int f5632c;

    /* renamed from: d */
    public final int f5633d;

    /* renamed from: e */
    public CharSequence f5634e;

    /* renamed from: f */
    public CharSequence f5635f;

    /* renamed from: g */
    public Intent f5636g;

    /* renamed from: h */
    public char f5637h;

    /* renamed from: j */
    public char f5639j;

    /* renamed from: l */
    public Drawable f5641l;

    /* renamed from: n */
    public C1792e f5643n;

    /* renamed from: o */
    public SubMenuC1799l f5644o;

    /* renamed from: p */
    public Runnable f5645p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f5646q;

    /* renamed from: r */
    public CharSequence f5647r;

    /* renamed from: s */
    public CharSequence f5648s;

    /* renamed from: z */
    public int f5655z;

    /* renamed from: i */
    public int f5638i = 4096;

    /* renamed from: k */
    public int f5640k = 4096;

    /* renamed from: m */
    public int f5642m = 0;

    /* renamed from: t */
    public ColorStateList f5649t = null;

    /* renamed from: u */
    public PorterDuff.Mode f5650u = null;

    /* renamed from: v */
    public boolean f5651v = false;

    /* renamed from: w */
    public boolean f5652w = false;

    /* renamed from: x */
    public boolean f5653x = false;

    /* renamed from: y */
    public int f5654y = 16;

    /* renamed from: D */
    public boolean f5628D = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public class a implements wm.InterfaceC17928b {
        public a() {
        }

        @Override // p001o.wm.InterfaceC17928b
        public void onActionProviderVisibilityChanged(boolean z) {
            C1794g c1794g = C1794g.this;
            c1794g.f5643n.m4026M(c1794g);
        }
    }

    public C1794g(C1792e c1792e, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f5643n = c1792e;
        this.f5630a = i2;
        this.f5631b = i;
        this.f5632c = i3;
        this.f5633d = i4;
        this.f5634e = charSequence;
        this.f5655z = i5;
    }

    /* renamed from: d */
    public static void m4067d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: A */
    public boolean m4068A() {
        return this.f5643n.mo4024K() && m4075g() != 0;
    }

    /* renamed from: B */
    public boolean m4069B() {
        return (this.f5655z & 4) == 4;
    }

    @Override // p001o.aeg
    /* renamed from: a */
    public wm mo4070a() {
        return this.f5626B;
    }

    @Override // p001o.aeg
    /* renamed from: b */
    public aeg mo4071b(wm wmVar) {
        wm wmVar2 = this.f5626B;
        if (wmVar2 != null) {
            wmVar2.m54699j();
        }
        this.f5625A = null;
        this.f5626B = wmVar;
        this.f5643n.mo4027N(true);
        wm wmVar3 = this.f5626B;
        if (wmVar3 != null) {
            wmVar3.mo54701l(new a());
        }
        return this;
    }

    /* renamed from: c */
    public void m4072c() {
        this.f5643n.m4025L(this);
    }

    @Override // p001o.aeg, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f5655z & 8) == 0) {
            return false;
        }
        if (this.f5625A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5627C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f5643n.mo4045f(this);
        }
        return false;
    }

    /* renamed from: e */
    public final Drawable m4073e(Drawable drawable) {
        if (drawable != null && this.f5653x && (this.f5651v || this.f5652w)) {
            drawable = fy5.m27744r(drawable).mutate();
            if (this.f5651v) {
                fy5.m27741o(drawable, this.f5649t);
            }
            if (this.f5652w) {
                fy5.m27742p(drawable, this.f5650u);
            }
            this.f5653x = false;
        }
        return drawable;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public boolean expandActionView() {
        if (!m4078j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5627C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f5643n.mo4052m(this);
        }
        return false;
    }

    /* renamed from: f */
    public int m4074f() {
        return this.f5633d;
    }

    /* renamed from: g */
    public char m4075g() {
        return this.f5643n.mo4023J() ? this.f5639j : this.f5637h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p001o.aeg, android.view.MenuItem
    public View getActionView() {
        View view = this.f5625A;
        if (view != null) {
            return view;
        }
        wm wmVar = this.f5626B;
        if (wmVar == null) {
            return null;
        }
        View viewMo54696e = wmVar.mo54696e(this);
        this.f5625A = viewMo54696e;
        return viewMo54696e;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5640k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5639j;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5647r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f5631b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f5641l;
        if (drawable != null) {
            return m4073e(drawable);
        }
        if (this.f5642m == 0) {
            return null;
        }
        Drawable drawableM37353b = lk0.m37353b(this.f5643n.m4061w(), this.f5642m);
        this.f5642m = 0;
        this.f5641l = drawableM37353b;
        return m4073e(drawableM37353b);
    }

    @Override // p001o.aeg, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5649t;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5650u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5636g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f5630a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5629E;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5638i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5637h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f5632c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f5644o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f5634e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5635f;
        return charSequence != null ? charSequence : this.f5634e;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5648s;
    }

    /* renamed from: h */
    public String m4076h() {
        char cM4075g = m4075g();
        if (cM4075g == 0) {
            return "";
        }
        Resources resources = this.f5643n.m4061w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f5643n.m4061w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(y9e.abc_prepend_shortcut_label));
        }
        int i = this.f5643n.mo4023J() ? this.f5640k : this.f5638i;
        m4067d(sb, i, 65536, resources.getString(y9e.abc_menu_meta_shortcut_label));
        m4067d(sb, i, 4096, resources.getString(y9e.abc_menu_ctrl_shortcut_label));
        m4067d(sb, i, 2, resources.getString(y9e.abc_menu_alt_shortcut_label));
        m4067d(sb, i, 1, resources.getString(y9e.abc_menu_shift_shortcut_label));
        m4067d(sb, i, 4, resources.getString(y9e.abc_menu_sym_shortcut_label));
        m4067d(sb, i, 8, resources.getString(y9e.abc_menu_function_shortcut_label));
        if (cM4075g == '\b') {
            sb.append(resources.getString(y9e.abc_menu_delete_shortcut_label));
        } else if (cM4075g == '\n') {
            sb.append(resources.getString(y9e.abc_menu_enter_shortcut_label));
        } else if (cM4075g != ' ') {
            sb.append(cM4075g);
        } else {
            sb.append(resources.getString(y9e.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f5644o != null;
    }

    /* renamed from: i */
    public CharSequence m4077i(InterfaceC1797j.a aVar) {
        return (aVar == null || !aVar.mo3949e()) ? getTitle() : getTitleCondensed();
    }

    @Override // p001o.aeg, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f5628D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f5654y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f5654y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f5654y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        wm wmVar = this.f5626B;
        return (wmVar == null || !wmVar.mo7876h()) ? (this.f5654y & 8) == 0 : (this.f5654y & 8) == 0 && this.f5626B.mo7873c();
    }

    /* renamed from: j */
    public boolean m4078j() {
        wm wmVar;
        if ((this.f5655z & 8) == 0) {
            return false;
        }
        if (this.f5625A == null && (wmVar = this.f5626B) != null) {
            this.f5625A = wmVar.mo54696e(this);
        }
        return this.f5625A != null;
    }

    /* renamed from: k */
    public boolean m4079k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f5646q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C1792e c1792e = this.f5643n;
        if (c1792e.mo4047h(c1792e, this)) {
            return true;
        }
        Runnable runnable = this.f5645p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f5636g != null) {
            try {
                this.f5643n.m4061w().startActivity(this.f5636g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        wm wmVar = this.f5626B;
        return wmVar != null && wmVar.mo7875f();
    }

    /* renamed from: l */
    public boolean m4080l() {
        return (this.f5654y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m4081m() {
        return (this.f5654y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m4082n() {
        return (this.f5655z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m4083o() {
        return (this.f5655z & 2) == 2;
    }

    @Override // p001o.aeg, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public aeg setActionView(int i) {
        Context contextM4061w = this.f5643n.m4061w();
        setActionView(LayoutInflater.from(contextM4061w).inflate(i, (ViewGroup) new LinearLayout(contextM4061w), false));
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public aeg setActionView(View view) {
        int i;
        this.f5625A = view;
        this.f5626B = null;
        if (view != null && view.getId() == -1 && (i = this.f5630a) > 0) {
            view.setId(i);
        }
        this.f5643n.m4025L(this);
        return this;
    }

    /* renamed from: r */
    public void m4086r(boolean z) {
        this.f5628D = z;
        this.f5643n.mo4027N(false);
    }

    /* renamed from: s */
    public void m4087s(boolean z) {
        int i = this.f5654y;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f5654y = i2;
        if (i != i2) {
            this.f5643n.mo4027N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f5639j == c) {
            return this;
        }
        this.f5639j = Character.toLowerCase(c);
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f5654y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f5654y = i2;
        if (i != i2) {
            this.f5643n.mo4027N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f5654y & 4) != 0) {
            this.f5643n.m4038Y(this);
        } else {
            m4087s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f5654y |= 16;
        } else {
            this.f5654y &= -17;
        }
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5642m = 0;
        this.f5641l = drawable;
        this.f5653x = true;
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5649t = colorStateList;
        this.f5651v = true;
        this.f5653x = true;
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5650u = mode;
        this.f5652w = true;
        this.f5653x = true;
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5636g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f5637h == c) {
            return this;
        }
        this.f5637h = c;
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5627C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5646q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f5637h = c;
        this.f5639j = Character.toLowerCase(c2);
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f5655z = i;
        this.f5643n.m4025L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5634e = charSequence;
        this.f5643n.mo4027N(false);
        SubMenuC1799l subMenuC1799l = this.f5644o;
        if (subMenuC1799l != null) {
            subMenuC1799l.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5635f = charSequence;
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m4093y(z)) {
            this.f5643n.m4026M(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m4088t(boolean z) {
        this.f5654y = (z ? 4 : 0) | (this.f5654y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f5634e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m4089u(boolean z) {
        if (z) {
            this.f5654y |= 32;
        } else {
            this.f5654y &= -33;
        }
    }

    /* renamed from: v */
    public void m4090v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f5629E = contextMenuInfo;
    }

    @Override // p001o.aeg, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public aeg setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void m4092x(SubMenuC1799l subMenuC1799l) {
        this.f5644o = subMenuC1799l;
        subMenuC1799l.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    public boolean m4093y(boolean z) {
        int i = this.f5654y;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f5654y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean m4094z() {
        return this.f5643n.m4017C();
    }

    @Override // android.view.MenuItem
    public aeg setContentDescription(CharSequence charSequence) {
        this.f5647r = charSequence;
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public aeg setTooltipText(CharSequence charSequence) {
        this.f5648s = charSequence;
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f5639j == c && this.f5640k == i) {
            return this;
        }
        this.f5639j = Character.toLowerCase(c);
        this.f5640k = KeyEvent.normalizeMetaState(i);
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f5637h == c && this.f5638i == i) {
            return this;
        }
        this.f5637h = c;
        this.f5638i = KeyEvent.normalizeMetaState(i);
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f5637h = c;
        this.f5638i = KeyEvent.normalizeMetaState(i);
        this.f5639j = Character.toLowerCase(c2);
        this.f5640k = KeyEvent.normalizeMetaState(i2);
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f5641l = null;
        this.f5642m = i;
        this.f5653x = true;
        this.f5643n.mo4027N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f5643n.m4061w().getString(i));
    }
}

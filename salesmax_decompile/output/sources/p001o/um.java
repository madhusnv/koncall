package p001o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes2.dex */
public class um implements aeg {

    /* renamed from: a */
    public final int f49098a;

    /* renamed from: b */
    public final int f49099b;

    /* renamed from: c */
    public final int f49100c;

    /* renamed from: d */
    public CharSequence f49101d;

    /* renamed from: e */
    public CharSequence f49102e;

    /* renamed from: f */
    public Intent f49103f;

    /* renamed from: g */
    public char f49104g;

    /* renamed from: i */
    public char f49106i;

    /* renamed from: k */
    public Drawable f49108k;

    /* renamed from: l */
    public Context f49109l;

    /* renamed from: m */
    public MenuItem.OnMenuItemClickListener f49110m;

    /* renamed from: n */
    public CharSequence f49111n;

    /* renamed from: o */
    public CharSequence f49112o;

    /* renamed from: h */
    public int f49105h = 4096;

    /* renamed from: j */
    public int f49107j = 4096;

    /* renamed from: p */
    public ColorStateList f49113p = null;

    /* renamed from: q */
    public PorterDuff.Mode f49114q = null;

    /* renamed from: r */
    public boolean f49115r = false;

    /* renamed from: s */
    public boolean f49116s = false;

    /* renamed from: t */
    public int f49117t = 16;

    public um(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f49109l = context;
        this.f49098a = i2;
        this.f49099b = i;
        this.f49100c = i4;
        this.f49101d = charSequence;
    }

    @Override // p001o.aeg
    /* renamed from: a */
    public wm mo4070a() {
        return null;
    }

    @Override // p001o.aeg
    /* renamed from: b */
    public aeg mo4071b(wm wmVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m51771c() {
        Drawable drawable = this.f49108k;
        if (drawable != null) {
            if (this.f49115r || this.f49116s) {
                Drawable drawableM27744r = fy5.m27744r(drawable);
                this.f49108k = drawableM27744r;
                Drawable drawableMutate = drawableM27744r.mutate();
                this.f49108k = drawableMutate;
                if (this.f49115r) {
                    fy5.m27741o(drawableMutate, this.f49113p);
                }
                if (this.f49116s) {
                    fy5.m27742p(this.f49108k, this.f49114q);
                }
            }
        }
    }

    @Override // p001o.aeg, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p001o.aeg, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public aeg setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p001o.aeg, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public aeg setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p001o.aeg, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p001o.aeg, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public aeg setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p001o.aeg, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f49107j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f49106i;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f49111n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f49099b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f49108k;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f49113p;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f49114q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f49103f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f49098a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f49105h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f49104g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f49100c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f49101d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f49102e;
        return charSequence != null ? charSequence : this.f49101d;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f49112o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f49117t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f49117t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f49117t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f49117t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f49106i = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f49117t = (z ? 1 : 0) | (this.f49117t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f49117t = (z ? 2 : 0) | (this.f49117t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f49117t = (z ? 16 : 0) | (this.f49117t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f49108k = drawable;
        m51771c();
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f49113p = colorStateList;
        this.f49115r = true;
        m51771c();
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f49114q = mode;
        this.f49116s = true;
        m51771c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f49103f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f49104g = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f49110m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f49104g = c;
        this.f49106i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f49101d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f49102e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f49117t = (this.f49117t & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f49106i = Character.toLowerCase(c);
        this.f49107j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public aeg setContentDescription(CharSequence charSequence) {
        this.f49111n = charSequence;
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f49104g = c;
        this.f49105h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f49101d = this.f49109l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public aeg setTooltipText(CharSequence charSequence) {
        this.f49112o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f49108k = c64.getDrawable(this.f49109l, i);
        m51771c();
        return this;
    }

    @Override // p001o.aeg, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f49104g = c;
        this.f49105h = KeyEvent.normalizeMetaState(i);
        this.f49106i = Character.toLowerCase(c2);
        this.f49107j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}

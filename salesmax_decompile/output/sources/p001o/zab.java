package p001o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p001o.wm;

/* loaded from: classes2.dex */
public class zab extends ce1 implements MenuItem {

    /* renamed from: d */
    public final aeg f56845d;

    /* renamed from: e */
    public Method f56846e;

    /* renamed from: o.zab$a */
    public class ActionProviderVisibilityListenerC18599a extends wm implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public wm.InterfaceC17928b f56847d;

        /* renamed from: e */
        public final ActionProvider f56848e;

        public ActionProviderVisibilityListenerC18599a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f56848e = actionProvider;
        }

        @Override // p001o.wm
        /* renamed from: b */
        public boolean mo54695b() {
            return this.f56848e.hasSubMenu();
        }

        @Override // p001o.wm
        /* renamed from: c */
        public boolean mo7873c() {
            return this.f56848e.isVisible();
        }

        @Override // p001o.wm
        /* renamed from: d */
        public View mo7874d() {
            return this.f56848e.onCreateActionView();
        }

        @Override // p001o.wm
        /* renamed from: e */
        public View mo54696e(MenuItem menuItem) {
            return this.f56848e.onCreateActionView(menuItem);
        }

        @Override // p001o.wm
        /* renamed from: f */
        public boolean mo7875f() {
            return this.f56848e.onPerformDefaultAction();
        }

        @Override // p001o.wm
        /* renamed from: g */
        public void mo54697g(SubMenu subMenu) {
            this.f56848e.onPrepareSubMenu(zab.this.m21034d(subMenu));
        }

        @Override // p001o.wm
        /* renamed from: h */
        public boolean mo7876h() {
            return this.f56848e.overridesItemVisibility();
        }

        @Override // p001o.wm
        /* renamed from: l */
        public void mo54701l(wm.InterfaceC17928b interfaceC17928b) {
            this.f56847d = interfaceC17928b;
            this.f56848e.setVisibilityListener(interfaceC17928b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            wm.InterfaceC17928b interfaceC17928b = this.f56847d;
            if (interfaceC17928b != null) {
                interfaceC17928b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: o.zab$b */
    public static class C18600b extends FrameLayout implements pg3 {

        /* renamed from: a */
        public final CollapsibleActionView f56850a;

        /* JADX WARN: Multi-variable type inference failed */
        public C18600b(View view) {
            super(view.getContext());
            this.f56850a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public View m59083a() {
            return (View) this.f56850a;
        }

        @Override // p001o.pg3
        /* renamed from: b */
        public void mo4363b() {
            this.f56850a.onActionViewExpanded();
        }

        @Override // p001o.pg3
        /* renamed from: f */
        public void mo4364f() {
            this.f56850a.onActionViewCollapsed();
        }
    }

    /* renamed from: o.zab$c */
    public class MenuItemOnActionExpandListenerC18601c implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f56851a;

        public MenuItemOnActionExpandListenerC18601c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f56851a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f56851a.onMenuItemActionCollapse(zab.this.m21033c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f56851a.onMenuItemActionExpand(zab.this.m21033c(menuItem));
        }
    }

    /* renamed from: o.zab$d */
    public class MenuItemOnMenuItemClickListenerC18602d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f56853a;

        public MenuItemOnMenuItemClickListenerC18602d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f56853a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f56853a.onMenuItemClick(zab.this.m21033c(menuItem));
        }
    }

    public zab(Context context, aeg aegVar) {
        super(context);
        if (aegVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f56845d = aegVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f56845d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f56845d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        wm wmVarMo4070a = this.f56845d.mo4070a();
        if (wmVarMo4070a instanceof ActionProviderVisibilityListenerC18599a) {
            return ((ActionProviderVisibilityListenerC18599a) wmVarMo4070a).f56848e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f56845d.getActionView();
        return actionView instanceof C18600b ? ((C18600b) actionView).m59083a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f56845d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f56845d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f56845d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f56845d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f56845d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f56845d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f56845d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f56845d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f56845d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f56845d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f56845d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f56845d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f56845d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m21034d(this.f56845d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f56845d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f56845d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f56845d.getTooltipText();
    }

    /* renamed from: h */
    public void m59081h(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f56846e == null) {
                this.f56846e = this.f56845d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f56846e.invoke(this.f56845d, Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f56845d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f56845d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f56845d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f56845d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f56845d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f56845d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC18599a actionProviderVisibilityListenerC18599a = new ActionProviderVisibilityListenerC18599a(this.f17978a, actionProvider);
        aeg aegVar = this.f56845d;
        if (actionProvider == null) {
            actionProviderVisibilityListenerC18599a = null;
        }
        aegVar.mo4071b(actionProviderVisibilityListenerC18599a);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C18600b(view);
        }
        this.f56845d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f56845d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f56845d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f56845d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f56845d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f56845d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f56845d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f56845d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f56845d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f56845d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f56845d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f56845d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC18601c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f56845d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC18602d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f56845d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f56845d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f56845d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f56845d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f56845d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f56845d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f56845d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f56845d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f56845d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f56845d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f56845d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f56845d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f56845d.setActionView(i);
        View actionView = this.f56845d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f56845d.setActionView(new C18600b(actionView));
        }
        return this;
    }
}

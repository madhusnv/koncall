package p012n;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import c6.AbstractC0879i;
import c6.w0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.C4001v;
import l1.C4327p;
import p013o.InterfaceC5226l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.i */
/* loaded from: classes.dex */
public class MenuC4929i implements Menu {

    /* renamed from: u */
    public static final int[] f24532u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f24533a;

    /* renamed from: b */
    public final Resources f24534b;

    /* renamed from: c */
    public boolean f24535c;

    /* renamed from: d */
    public final boolean f24536d;

    /* renamed from: e */
    public C4327p f24537e;

    /* renamed from: f */
    public final ArrayList f24538f;

    /* renamed from: g */
    public final ArrayList f24539g;

    /* renamed from: h */
    public boolean f24540h;

    /* renamed from: i */
    public final ArrayList f24541i;

    /* renamed from: j */
    public final ArrayList f24542j;

    /* renamed from: k */
    public boolean f24543k;

    /* renamed from: l */
    public CharSequence f24544l;

    /* renamed from: s */
    public MenuItemC4930j f24551s;

    /* renamed from: m */
    public boolean f24545m = false;

    /* renamed from: n */
    public boolean f24546n = false;

    /* renamed from: o */
    public boolean f24547o = false;

    /* renamed from: p */
    public boolean f24548p = false;

    /* renamed from: q */
    public final ArrayList f24549q = new ArrayList();

    /* renamed from: r */
    public final CopyOnWriteArrayList f24550r = new CopyOnWriteArrayList();

    /* renamed from: t */
    public boolean f24552t = false;

    public MenuC4929i(Context context) {
        boolean zM2413y;
        boolean z6 = false;
        this.f24533a = context;
        Resources resources = context.getResources();
        this.f24534b = resources;
        this.f24538f = new ArrayList();
        this.f24539g = new ArrayList();
        this.f24540h = true;
        this.f24541i = new ArrayList();
        this.f24542j = new ArrayList();
        this.f24543k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = w0.f5534a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM2413y = AbstractC0879i.m2413y(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM2413y = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM2413y) {
                z6 = true;
            }
        }
        this.f24536d = z6;
    }

    /* renamed from: a */
    public final MenuItemC4930j m9852a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f24532u[i14] << 16) | (65535 & i12);
        MenuItemC4930j menuItemC4930j = new MenuItemC4930j(this, i10, i11, i12, i15, charSequence);
        ArrayList arrayList = this.f24538f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((MenuItemC4930j) arrayList.get(size)).f24558d <= i15) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, menuItemC4930j);
        m9866o(true);
        return menuItemC4930j;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m9852a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f24533a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC4930j menuItemC4930jM9852a = m9852a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            menuItemC4930jM9852a.setIcon(resolveInfo.loadIcon(packageManager));
            menuItemC4930jM9852a.f24561g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = menuItemC4930jM9852a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m9853b(InterfaceC4935o interfaceC4935o, Context context) {
        this.f24550r.add(new WeakReference(interfaceC4935o));
        interfaceC4935o.mo9877b(context, this);
        this.f24543k = true;
    }

    /* renamed from: c */
    public final void m9854c(boolean z6) {
        if (this.f24548p) {
            return;
        }
        this.f24548p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f24550r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC4935o interfaceC4935o = (InterfaceC4935o) weakReference.get();
            if (interfaceC4935o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC4935o.mo9833a(this, z6);
            }
        }
        this.f24548p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC4930j menuItemC4930j = this.f24551s;
        if (menuItemC4930j != null) {
            mo9855d(menuItemC4930j);
        }
        this.f24538f.clear();
        m9866o(true);
    }

    public final void clearHeader() {
        this.f24544l = null;
        m9866o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m9854c(true);
    }

    /* renamed from: d */
    public boolean mo9855d(MenuItemC4930j menuItemC4930j) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f24550r;
        boolean zMo9879k = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f24551s == menuItemC4930j) {
            m9870s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC4935o interfaceC4935o = (InterfaceC4935o) weakReference.get();
                if (interfaceC4935o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo9879k = interfaceC4935o.mo9879k(menuItemC4930j);
                    if (zMo9879k) {
                        break;
                    }
                }
            }
            m9869r();
            if (zMo9879k) {
                this.f24551s = null;
            }
        }
        return zMo9879k;
    }

    /* renamed from: e */
    public boolean mo9856e(MenuC4929i menuC4929i, MenuItem menuItem) {
        InterfaceC5226l interfaceC5226l;
        C4327p c4327p = this.f24537e;
        return (c4327p == null || (interfaceC5226l = ((ActionMenuView) c4327p.f21788b).f1751C) == null || !((Toolbar) ((C4001v) interfaceC5226l).f20704b).f1783L.m2486a(menuItem)) ? false : true;
    }

    /* renamed from: f */
    public boolean mo9857f(MenuItemC4930j menuItemC4930j) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f24550r;
        boolean zMo9878i = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m9870s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC4935o interfaceC4935o = (InterfaceC4935o) weakReference.get();
            if (interfaceC4935o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zMo9878i = interfaceC4935o.mo9878i(menuItemC4930j);
                if (zMo9878i) {
                    break;
                }
            }
        }
        m9869r();
        if (zMo9878i) {
            this.f24551s = menuItemC4930j;
        }
        return zMo9878i;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f24538f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayList.get(i11);
            if (menuItemC4930j.f24555a == i10) {
                return menuItemC4930j;
            }
            if (menuItemC4930j.hasSubMenu() && (menuItemFindItem = menuItemC4930j.f24569o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final MenuItemC4930j m9858g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f24549q;
        arrayList.clear();
        m9859h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC4930j) arrayList.get(0);
        }
        boolean zMo9864m = mo9864m();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayList.get(i11);
            char c2 = zMo9864m ? menuItemC4930j.f24564j : menuItemC4930j.f24562h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zMo9864m && c2 == '\b' && i10 == 67))) {
                return menuItemC4930j;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f24538f.get(i10);
    }

    /* renamed from: h */
    public final void m9859h(List list, int i10, KeyEvent keyEvent) {
        boolean zMo9864m = mo9864m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f24538f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayList.get(i11);
                if (menuItemC4930j.hasSubMenu()) {
                    menuItemC4930j.f24569o.m9859h(list, i10, keyEvent);
                }
                char c2 = zMo9864m ? menuItemC4930j.f24564j : menuItemC4930j.f24562h;
                if ((modifiers & 69647) == ((zMo9864m ? menuItemC4930j.f24565k : menuItemC4930j.f24563i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zMo9864m && c2 == '\b' && i10 == 67)) && menuItemC4930j.isEnabled()) {
                        list.add(menuItemC4930j);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f24538f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((MenuItemC4930j) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m9860i() {
        ArrayList arrayListM9862k = m9862k();
        if (this.f24543k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f24550r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zMo9835d = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC4935o interfaceC4935o = (InterfaceC4935o) weakReference.get();
                if (interfaceC4935o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo9835d |= interfaceC4935o.mo9835d();
                }
            }
            ArrayList arrayList = this.f24541i;
            ArrayList arrayList2 = this.f24542j;
            if (zMo9835d) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM9862k.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayListM9862k.get(i10);
                    if ((menuItemC4930j.f24578x & 32) == 32) {
                        arrayList.add(menuItemC4930j);
                    } else {
                        arrayList2.add(menuItemC4930j);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m9862k());
            }
            this.f24543k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return m9858g(i10, keyEvent) != null;
    }

    /* renamed from: k */
    public final ArrayList m9862k() {
        boolean z6 = this.f24540h;
        ArrayList arrayList = this.f24539g;
        if (!z6) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f24538f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayList2.get(i10);
            if (menuItemC4930j.isVisible()) {
                arrayList.add(menuItemC4930j);
            }
        }
        this.f24540h = false;
        this.f24543k = true;
        return arrayList;
    }

    /* renamed from: l */
    public boolean mo9863l() {
        return this.f24552t;
    }

    /* renamed from: m */
    public boolean mo9864m() {
        return this.f24535c;
    }

    /* renamed from: n */
    public boolean mo9865n() {
        return this.f24536d;
    }

    /* renamed from: o */
    public final void m9866o(boolean z6) {
        if (this.f24545m) {
            this.f24546n = true;
            if (z6) {
                this.f24547o = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f24540h = true;
            this.f24543k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f24550r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m9870s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC4935o interfaceC4935o = (InterfaceC4935o) weakReference.get();
            if (interfaceC4935o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC4935o.mo9838g();
            }
        }
        m9869r();
    }

    /* renamed from: p */
    public final boolean m9867p(MenuItem menuItem, AbstractC4931k abstractC4931k, int i10) {
        boolean zExpandActionView;
        MenuItemC4930j menuItemC4930j = (MenuItemC4930j) menuItem;
        if (menuItemC4930j == null || !menuItemC4930j.isEnabled()) {
            return false;
        }
        MenuC4929i menuC4929i = menuItemC4930j.f24568n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemC4930j.f24570p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemC4930j)) && !menuC4929i.mo9856e(menuC4929i, menuItemC4930j)) {
            Intent intent = menuItemC4930j.f24561g;
            if (intent != null) {
                try {
                    menuC4929i.f24533a.startActivity(intent);
                    zExpandActionView = true;
                } catch (ActivityNotFoundException unused) {
                }
            }
            zExpandActionView = false;
        } else {
            zExpandActionView = true;
        }
        if ((menuItemC4930j.f24579y & 8) != 0 && menuItemC4930j.f24580z != null) {
            zExpandActionView |= menuItemC4930j.expandActionView();
            if (zExpandActionView) {
                m9854c(true);
            }
        } else if (menuItemC4930j.hasSubMenu()) {
            if ((i10 & 4) == 0) {
                m9854c(false);
            }
            if (!menuItemC4930j.hasSubMenu()) {
                SubMenuC4939s subMenuC4939s = new SubMenuC4939s(this.f24533a, this, menuItemC4930j);
                menuItemC4930j.f24569o = subMenuC4939s;
                subMenuC4939s.setHeaderTitle(menuItemC4930j.f24559e);
            }
            SubMenuC4939s subMenuC4939s2 = menuItemC4930j.f24569o;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f24550r;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo9834c = abstractC4931k != null ? abstractC4931k.mo9834c(subMenuC4939s2) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    InterfaceC4935o interfaceC4935o = (InterfaceC4935o) weakReference.get();
                    if (interfaceC4935o == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo9834c) {
                        zMo9834c = interfaceC4935o.mo9834c(subMenuC4939s2);
                    }
                }
            }
            zExpandActionView |= zMo9834c;
            if (!zExpandActionView) {
                m9854c(true);
            }
        } else if ((i10 & 1) == 0) {
            m9854c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return m9867p(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        MenuItemC4930j menuItemC4930jM9858g = m9858g(i10, keyEvent);
        boolean zM9867p = menuItemC4930jM9858g != null ? m9867p(menuItemC4930jM9858g, null, i11) : false;
        if ((i11 & 2) != 0) {
            m9854c(true);
        }
        return zM9867p;
    }

    /* renamed from: q */
    public final void m9868q(int i10, CharSequence charSequence, int i11, View view) {
        if (view != null) {
            this.f24544l = null;
        } else {
            if (i10 > 0) {
                this.f24544l = this.f24534b.getText(i10);
            } else if (charSequence != null) {
                this.f24544l = charSequence;
            }
            if (i11 > 0) {
                this.f24533a.getDrawable(i11);
            }
        }
        m9866o(false);
    }

    /* renamed from: r */
    public final void m9869r() {
        this.f24545m = false;
        if (this.f24546n) {
            this.f24546n = false;
            m9866o(this.f24547o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f24538f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((MenuItemC4930j) arrayList.get(i12)).f24556b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((MenuItemC4930j) arrayList.get(i12)).f24556b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            m9866o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f24538f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((MenuItemC4930j) arrayList.get(i11)).f24555a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        m9866o(true);
    }

    /* renamed from: s */
    public final void m9870s() {
        if (this.f24545m) {
            return;
        }
        this.f24545m = true;
        this.f24546n = false;
        this.f24547o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z6, boolean z10) {
        ArrayList arrayList = this.f24538f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayList.get(i11);
            if (menuItemC4930j.f24556b == i10) {
                menuItemC4930j.f24578x = (menuItemC4930j.f24578x & (-5)) | (z10 ? 4 : 0);
                menuItemC4930j.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f24552t = z6;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z6) {
        ArrayList arrayList = this.f24538f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayList.get(i11);
            if (menuItemC4930j.f24556b == i10) {
                menuItemC4930j.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z6) {
        ArrayList arrayList = this.f24538f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayList.get(i11);
            if (menuItemC4930j.f24556b == i10) {
                int i12 = menuItemC4930j.f24578x;
                int i13 = (i12 & (-9)) | (z6 ? 0 : 8);
                menuItemC4930j.f24578x = i13;
                if (i12 != i13) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            m9866o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f24535c = z6;
        m9866o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f24538f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return m9852a(0, 0, 0, this.f24534b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f24534b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m9852a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        MenuItemC4930j menuItemC4930jM9852a = m9852a(i10, i11, i12, charSequence);
        SubMenuC4939s subMenuC4939s = new SubMenuC4939s(this.f24533a, this, menuItemC4930jM9852a);
        menuItemC4930jM9852a.f24569o = subMenuC4939s;
        subMenuC4939s.setHeaderTitle(menuItemC4930jM9852a.f24559e);
        return subMenuC4939s;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return m9852a(i10, i11, i12, this.f24534b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f24534b.getString(i13));
    }

    /* renamed from: j */
    public MenuC4929i mo9861j() {
        return this;
    }
}

package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.c64;
import p001o.cwi;
import p001o.wm;
import p001o.ydg;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes2.dex */
public class C1792e implements ydg {

    /* renamed from: A */
    public static final int[] f5594A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f5595a;

    /* renamed from: b */
    public final Resources f5596b;

    /* renamed from: c */
    public boolean f5597c;

    /* renamed from: d */
    public boolean f5598d;

    /* renamed from: e */
    public a f5599e;

    /* renamed from: m */
    public ContextMenu.ContextMenuInfo f5607m;

    /* renamed from: n */
    public CharSequence f5608n;

    /* renamed from: o */
    public Drawable f5609o;

    /* renamed from: p */
    public View f5610p;

    /* renamed from: x */
    public C1794g f5618x;

    /* renamed from: z */
    public boolean f5620z;

    /* renamed from: l */
    public int f5606l = 0;

    /* renamed from: q */
    public boolean f5611q = false;

    /* renamed from: r */
    public boolean f5612r = false;

    /* renamed from: s */
    public boolean f5613s = false;

    /* renamed from: t */
    public boolean f5614t = false;

    /* renamed from: u */
    public boolean f5615u = false;

    /* renamed from: v */
    public ArrayList f5616v = new ArrayList();

    /* renamed from: w */
    public CopyOnWriteArrayList f5617w = new CopyOnWriteArrayList();

    /* renamed from: y */
    public boolean f5619y = false;

    /* renamed from: f */
    public ArrayList f5600f = new ArrayList();

    /* renamed from: g */
    public ArrayList f5601g = new ArrayList();

    /* renamed from: h */
    public boolean f5602h = true;

    /* renamed from: i */
    public ArrayList f5603i = new ArrayList();

    /* renamed from: j */
    public ArrayList f5604j = new ArrayList();

    /* renamed from: k */
    public boolean f5605k = true;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    public interface a {
        /* renamed from: a */
        boolean mo3808a(C1792e c1792e, MenuItem menuItem);

        /* renamed from: b */
        void mo3809b(C1792e c1792e);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    public interface b {
        /* renamed from: d */
        boolean mo3957d(C1794g c1794g);
    }

    public C1792e(Context context) {
        this.f5595a = context;
        this.f5596b = context.getResources();
        g0(true);
    }

    /* renamed from: D */
    public static int m4013D(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f5594A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: p */
    public static int m4014p(ArrayList arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C1794g) arrayList.get(size)).m4074f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View m4015A() {
        return this.f5610p;
    }

    /* renamed from: B */
    public ArrayList m4016B() {
        m4058t();
        return this.f5604j;
    }

    /* renamed from: C */
    public boolean m4017C() {
        return this.f5614t;
    }

    /* renamed from: E */
    public Resources m4018E() {
        return this.f5596b;
    }

    /* renamed from: F */
    public C1792e mo4019F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList m4020G() {
        if (!this.f5602h) {
            return this.f5601g;
        }
        this.f5601g.clear();
        int size = this.f5600f.size();
        for (int i = 0; i < size; i++) {
            C1794g c1794g = (C1794g) this.f5600f.get(i);
            if (c1794g.isVisible()) {
                this.f5601g.add(c1794g);
            }
        }
        this.f5602h = false;
        this.f5605k = true;
        return this.f5601g;
    }

    /* renamed from: H */
    public boolean m4021H() {
        return !this.f5611q;
    }

    /* renamed from: I */
    public boolean mo4022I() {
        return this.f5619y;
    }

    /* renamed from: J */
    public boolean mo4023J() {
        return this.f5597c;
    }

    /* renamed from: K */
    public boolean mo4024K() {
        return this.f5598d;
    }

    /* renamed from: L */
    public void m4025L(C1794g c1794g) {
        this.f5605k = true;
        mo4027N(true);
    }

    /* renamed from: M */
    public void m4026M(C1794g c1794g) {
        this.f5602h = true;
        mo4027N(true);
    }

    /* renamed from: N */
    public void mo4027N(boolean z) {
        if (this.f5611q) {
            this.f5612r = true;
            if (z) {
                this.f5613s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f5602h = true;
            this.f5605k = true;
        }
        m4048i(z);
    }

    /* renamed from: O */
    public boolean m4028O(MenuItem menuItem, int i) {
        return m4029P(menuItem, null, i);
    }

    /* renamed from: P */
    public boolean m4029P(MenuItem menuItem, InterfaceC1796i interfaceC1796i, int i) {
        C1794g c1794g = (C1794g) menuItem;
        if (c1794g == null || !c1794g.isEnabled()) {
            return false;
        }
        boolean zM4079k = c1794g.m4079k();
        wm wmVarMo4070a = c1794g.mo4070a();
        boolean z = wmVarMo4070a != null && wmVarMo4070a.mo54695b();
        if (c1794g.m4078j()) {
            zM4079k |= c1794g.expandActionView();
            if (zM4079k) {
                m4044e(true);
            }
        } else if (c1794g.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m4044e(false);
            }
            if (!c1794g.hasSubMenu()) {
                c1794g.m4092x(new SubMenuC1799l(m4061w(), this, c1794g));
            }
            SubMenuC1799l subMenuC1799l = (SubMenuC1799l) c1794g.getSubMenu();
            if (z) {
                wmVarMo4070a.mo54697g(subMenuC1799l);
            }
            zM4079k |= m4051l(subMenuC1799l, interfaceC1796i);
            if (!zM4079k) {
                m4044e(true);
            }
        } else if ((i & 1) == 0) {
            m4044e(true);
        }
        return zM4079k;
    }

    /* renamed from: Q */
    public final void m4030Q(int i, boolean z) {
        if (i < 0 || i >= this.f5600f.size()) {
            return;
        }
        this.f5600f.remove(i);
        if (z) {
            mo4027N(true);
        }
    }

    /* renamed from: R */
    public void m4031R(InterfaceC1796i interfaceC1796i) {
        Iterator it = this.f5617w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1796i interfaceC1796i2 = (InterfaceC1796i) weakReference.get();
            if (interfaceC1796i2 == null || interfaceC1796i2 == interfaceC1796i) {
                this.f5617w.remove(weakReference);
            }
        }
    }

    /* renamed from: S */
    public void m4032S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo4060v());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1799l) item.getSubMenu()).m4032S(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* renamed from: T */
    public void m4033T(Bundle bundle) {
        m4049j(bundle);
    }

    /* renamed from: U */
    public void m4034U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1799l) item.getSubMenu()).m4034U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo4060v(), sparseArray);
        }
    }

    /* renamed from: V */
    public void m4035V(Bundle bundle) {
        m4050k(bundle);
    }

    /* renamed from: W */
    public void mo4036W(a aVar) {
        this.f5599e = aVar;
    }

    /* renamed from: X */
    public C1792e m4037X(int i) {
        this.f5606l = i;
        return this;
    }

    /* renamed from: Y */
    public void m4038Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f5600f.size();
        i0();
        for (int i = 0; i < size; i++) {
            C1794g c1794g = (C1794g) this.f5600f.get(i);
            if (c1794g.getGroupId() == groupId && c1794g.m4081m() && c1794g.isCheckable()) {
                c1794g.m4087s(c1794g == menuItem);
            }
        }
        h0();
    }

    /* renamed from: Z */
    public C1792e m4039Z(int i) {
        b0(0, null, i, null, null);
        return this;
    }

    /* renamed from: a */
    public MenuItem mo4040a(int i, int i2, int i3, CharSequence charSequence) {
        int iM4013D = m4013D(i3);
        C1794g c1794gM4046g = m4046g(i, i2, i3, iM4013D, charSequence, this.f5606l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f5607m;
        if (contextMenuInfo != null) {
            c1794gM4046g.m4090v(contextMenuInfo);
        }
        ArrayList arrayList = this.f5600f;
        arrayList.add(m4014p(arrayList, iM4013D), c1794gM4046g);
        mo4027N(true);
        return c1794gM4046g;
    }

    public C1792e a0(Drawable drawable) {
        b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo4040a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f5595a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m4041b(InterfaceC1796i interfaceC1796i) {
        m4042c(interfaceC1796i, this.f5595a);
    }

    public final void b0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resourcesM4018E = m4018E();
        if (view != null) {
            this.f5610p = view;
            this.f5608n = null;
            this.f5609o = null;
        } else {
            if (i > 0) {
                this.f5608n = resourcesM4018E.getText(i);
            } else if (charSequence != null) {
                this.f5608n = charSequence;
            }
            if (i2 > 0) {
                this.f5609o = c64.getDrawable(m4061w(), i2);
            } else if (drawable != null) {
                this.f5609o = drawable;
            }
            this.f5610p = null;
        }
        mo4027N(false);
    }

    /* renamed from: c */
    public void m4042c(InterfaceC1796i interfaceC1796i, Context context) {
        this.f5617w.add(new WeakReference(interfaceC1796i));
        interfaceC1796i.mo3969k(context, this);
        this.f5605k = true;
    }

    public C1792e c0(int i) {
        b0(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C1794g c1794g = this.f5618x;
        if (c1794g != null) {
            mo4045f(c1794g);
        }
        this.f5600f.clear();
        mo4027N(true);
    }

    public void clearHeader() {
        this.f5609o = null;
        this.f5608n = null;
        this.f5610p = null;
        mo4027N(false);
    }

    @Override // android.view.Menu
    public void close() {
        m4044e(true);
    }

    /* renamed from: d */
    public void m4043d() {
        a aVar = this.f5599e;
        if (aVar != null) {
            aVar.mo3809b(this);
        }
    }

    public C1792e d0(CharSequence charSequence) {
        b0(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: e */
    public final void m4044e(boolean z) {
        if (this.f5615u) {
            return;
        }
        this.f5615u = true;
        Iterator it = this.f5617w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1796i interfaceC1796i = (InterfaceC1796i) weakReference.get();
            if (interfaceC1796i == null) {
                this.f5617w.remove(weakReference);
            } else {
                interfaceC1796i.mo3963b(this, z);
            }
        }
        this.f5615u = false;
    }

    public C1792e e0(View view) {
        b0(0, null, 0, null, view);
        return this;
    }

    /* renamed from: f */
    public boolean mo4045f(C1794g c1794g) {
        boolean zMo3968j = false;
        if (!this.f5617w.isEmpty() && this.f5618x == c1794g) {
            i0();
            Iterator it = this.f5617w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1796i interfaceC1796i = (InterfaceC1796i) weakReference.get();
                if (interfaceC1796i == null) {
                    this.f5617w.remove(weakReference);
                } else {
                    zMo3968j = interfaceC1796i.mo3968j(this, c1794g);
                    if (zMo3968j) {
                        break;
                    }
                }
            }
            h0();
            if (zMo3968j) {
                this.f5618x = null;
            }
        }
        return zMo3968j;
    }

    public void f0(boolean z) {
        this.f5620z = z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C1794g c1794g = (C1794g) this.f5600f.get(i2);
            if (c1794g.getItemId() == i) {
                return c1794g;
            }
            if (c1794g.hasSubMenu() && (menuItemFindItem = c1794g.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C1794g m4046g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C1794g(this, i, i2, i3, i4, charSequence, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f5596b.getConfiguration().keyboard != 1 && cwi.m21953l(ViewConfiguration.get(this.f5595a), this.f5595a);
        }
        this.f5598d = z2;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.f5600f.get(i);
    }

    /* renamed from: h */
    public boolean mo4047h(C1792e c1792e, MenuItem menuItem) {
        a aVar = this.f5599e;
        return aVar != null && aVar.mo3808a(c1792e, menuItem);
    }

    public void h0() {
        this.f5611q = false;
        if (this.f5612r) {
            this.f5612r = false;
            mo4027N(this.f5613s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f5620z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C1794g) this.f5600f.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m4048i(boolean z) {
        if (this.f5617w.isEmpty()) {
            return;
        }
        i0();
        Iterator it = this.f5617w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1796i interfaceC1796i = (InterfaceC1796i) weakReference.get();
            if (interfaceC1796i == null) {
                this.f5617w.remove(weakReference);
            } else {
                interfaceC1796i.mo3967h(z);
            }
        }
        h0();
    }

    public void i0() {
        if (this.f5611q) {
            return;
        }
        this.f5611q = true;
        this.f5612r = false;
        this.f5613s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m4056r(i, keyEvent) != null;
    }

    /* renamed from: j */
    public final void m4049j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f5617w.isEmpty()) {
            return;
        }
        Iterator it = this.f5617w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1796i interfaceC1796i = (InterfaceC1796i) weakReference.get();
            if (interfaceC1796i == null) {
                this.f5617w.remove(weakReference);
            } else {
                int id = interfaceC1796i.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC1796i.mo3987e(parcelable);
                }
            }
        }
    }

    /* renamed from: k */
    public final void m4050k(Bundle bundle) {
        Parcelable parcelableMo3988g;
        if (this.f5617w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = this.f5617w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1796i interfaceC1796i = (InterfaceC1796i) weakReference.get();
            if (interfaceC1796i == null) {
                this.f5617w.remove(weakReference);
            } else {
                int id = interfaceC1796i.getId();
                if (id > 0 && (parcelableMo3988g = interfaceC1796i.mo3988g()) != null) {
                    sparseArray.put(id, parcelableMo3988g);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: l */
    public final boolean m4051l(SubMenuC1799l subMenuC1799l, InterfaceC1796i interfaceC1796i) {
        if (this.f5617w.isEmpty()) {
            return false;
        }
        boolean zMo3966f = interfaceC1796i != null ? interfaceC1796i.mo3966f(subMenuC1799l) : false;
        Iterator it = this.f5617w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1796i interfaceC1796i2 = (InterfaceC1796i) weakReference.get();
            if (interfaceC1796i2 == null) {
                this.f5617w.remove(weakReference);
            } else if (!zMo3966f) {
                zMo3966f = interfaceC1796i2.mo3966f(subMenuC1799l);
            }
        }
        return zMo3966f;
    }

    /* renamed from: m */
    public boolean mo4052m(C1794g c1794g) {
        boolean zMo3964c = false;
        if (this.f5617w.isEmpty()) {
            return false;
        }
        i0();
        Iterator it = this.f5617w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1796i interfaceC1796i = (InterfaceC1796i) weakReference.get();
            if (interfaceC1796i == null) {
                this.f5617w.remove(weakReference);
            } else {
                zMo3964c = interfaceC1796i.mo3964c(this, c1794g);
                if (zMo3964c) {
                    break;
                }
            }
        }
        h0();
        if (zMo3964c) {
            this.f5618x = c1794g;
        }
        return zMo3964c;
    }

    /* renamed from: n */
    public int m4053n(int i) {
        return m4054o(i, 0);
    }

    /* renamed from: o */
    public int m4054o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C1794g) this.f5600f.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m4028O(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1794g c1794gM4056r = m4056r(i, keyEvent);
        boolean zM4028O = c1794gM4056r != null ? m4028O(c1794gM4056r, i2) : false;
        if ((i2 & 2) != 0) {
            m4044e(true);
        }
        return zM4028O;
    }

    /* renamed from: q */
    public int m4055q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C1794g) this.f5600f.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public C1794g m4056r(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f5616v;
        arrayList.clear();
        m4057s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1794g) arrayList.get(0);
        }
        boolean zMo4023J = mo4023J();
        for (int i2 = 0; i2 < size; i2++) {
            C1794g c1794g = (C1794g) arrayList.get(i2);
            char alphabeticShortcut = zMo4023J ? c1794g.getAlphabeticShortcut() : c1794g.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zMo4023J && alphabeticShortcut == '\b' && i == 67))) {
                return c1794g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iM4053n = m4053n(i);
        if (iM4053n >= 0) {
            int size = this.f5600f.size() - iM4053n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C1794g) this.f5600f.get(iM4053n)).getGroupId() != i) {
                    break;
                }
                m4030Q(iM4053n, false);
                i2 = i3;
            }
            mo4027N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m4030Q(m4055q(i), true);
    }

    /* renamed from: s */
    public void m4057s(List list, int i, KeyEvent keyEvent) {
        boolean zMo4023J = mo4023J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f5600f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1794g c1794g = (C1794g) this.f5600f.get(i2);
                if (c1794g.hasSubMenu()) {
                    ((C1792e) c1794g.getSubMenu()).m4057s(list, i, keyEvent);
                }
                char alphabeticShortcut = zMo4023J ? c1794g.getAlphabeticShortcut() : c1794g.getNumericShortcut();
                if (((modifiers & 69647) == ((zMo4023J ? c1794g.getAlphabeticModifiers() : c1794g.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zMo4023J && alphabeticShortcut == '\b' && i == 67)) && c1794g.isEnabled()) {
                        list.add(c1794g);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f5600f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1794g c1794g = (C1794g) this.f5600f.get(i2);
            if (c1794g.getGroupId() == i) {
                c1794g.m4088t(z2);
                c1794g.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f5619y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f5600f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1794g c1794g = (C1794g) this.f5600f.get(i2);
            if (c1794g.getGroupId() == i) {
                c1794g.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f5600f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1794g c1794g = (C1794g) this.f5600f.get(i2);
            if (c1794g.getGroupId() == i && c1794g.m4093y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo4027N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f5597c = z;
        mo4027N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f5600f.size();
    }

    /* renamed from: t */
    public void m4058t() {
        ArrayList arrayListM4020G = m4020G();
        if (this.f5605k) {
            Iterator it = this.f5617w.iterator();
            boolean zMo3989i = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1796i interfaceC1796i = (InterfaceC1796i) weakReference.get();
                if (interfaceC1796i == null) {
                    this.f5617w.remove(weakReference);
                } else {
                    zMo3989i |= interfaceC1796i.mo3989i();
                }
            }
            if (zMo3989i) {
                this.f5603i.clear();
                this.f5604j.clear();
                int size = arrayListM4020G.size();
                for (int i = 0; i < size; i++) {
                    C1794g c1794g = (C1794g) arrayListM4020G.get(i);
                    if (c1794g.m4080l()) {
                        this.f5603i.add(c1794g);
                    } else {
                        this.f5604j.add(c1794g);
                    }
                }
            } else {
                this.f5603i.clear();
                this.f5604j.clear();
                this.f5604j.addAll(m4020G());
            }
            this.f5605k = false;
        }
    }

    /* renamed from: u */
    public ArrayList m4059u() {
        m4058t();
        return this.f5603i;
    }

    /* renamed from: v */
    public String mo4060v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context m4061w() {
        return this.f5595a;
    }

    /* renamed from: x */
    public C1794g m4062x() {
        return this.f5618x;
    }

    /* renamed from: y */
    public Drawable m4063y() {
        return this.f5609o;
    }

    /* renamed from: z */
    public CharSequence m4064z() {
        return this.f5608n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo4040a(0, 0, 0, this.f5596b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f5596b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo4040a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1794g c1794g = (C1794g) mo4040a(i, i2, i3, charSequence);
        SubMenuC1799l subMenuC1799l = new SubMenuC1799l(this.f5595a, this, c1794g);
        c1794g.m4092x(subMenuC1799l);
        return subMenuC1799l;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo4040a(i, i2, i3, this.f5596b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f5596b.getString(i4));
    }
}

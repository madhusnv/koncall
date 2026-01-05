package p001o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.objectweb.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class zdg extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f56998e;

    /* renamed from: f */
    public static final Class[] f56999f;

    /* renamed from: a */
    public final Object[] f57000a;

    /* renamed from: b */
    public final Object[] f57001b;

    /* renamed from: c */
    public Context f57002c;

    /* renamed from: d */
    public Object f57003d;

    /* renamed from: o.zdg$a */
    public static class MenuItemOnMenuItemClickListenerC18620a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class[] f57004c = {MenuItem.class};

        /* renamed from: a */
        public Object f57005a;

        /* renamed from: b */
        public Method f57006b;

        public MenuItemOnMenuItemClickListenerC18620a(Object obj, String str) {
            this.f57005a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f57006b = cls.getMethod(str, f57004c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f57006b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f57006b.invoke(this.f57005a, menuItem)).booleanValue();
                }
                this.f57006b.invoke(this.f57005a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: o.zdg$b */
    public class C18621b {

        /* renamed from: A */
        public wm f57007A;

        /* renamed from: B */
        public CharSequence f57008B;

        /* renamed from: C */
        public CharSequence f57009C;

        /* renamed from: D */
        public ColorStateList f57010D = null;

        /* renamed from: E */
        public PorterDuff.Mode f57011E = null;

        /* renamed from: a */
        public Menu f57013a;

        /* renamed from: b */
        public int f57014b;

        /* renamed from: c */
        public int f57015c;

        /* renamed from: d */
        public int f57016d;

        /* renamed from: e */
        public int f57017e;

        /* renamed from: f */
        public boolean f57018f;

        /* renamed from: g */
        public boolean f57019g;

        /* renamed from: h */
        public boolean f57020h;

        /* renamed from: i */
        public int f57021i;

        /* renamed from: j */
        public int f57022j;

        /* renamed from: k */
        public CharSequence f57023k;

        /* renamed from: l */
        public CharSequence f57024l;

        /* renamed from: m */
        public int f57025m;

        /* renamed from: n */
        public char f57026n;

        /* renamed from: o */
        public int f57027o;

        /* renamed from: p */
        public char f57028p;

        /* renamed from: q */
        public int f57029q;

        /* renamed from: r */
        public int f57030r;

        /* renamed from: s */
        public boolean f57031s;

        /* renamed from: t */
        public boolean f57032t;

        /* renamed from: u */
        public boolean f57033u;

        /* renamed from: v */
        public int f57034v;

        /* renamed from: w */
        public int f57035w;

        /* renamed from: x */
        public String f57036x;

        /* renamed from: y */
        public String f57037y;

        /* renamed from: z */
        public String f57038z;

        public C18621b(Menu menu) {
            this.f57013a = menu;
            m59271h();
        }

        /* renamed from: a */
        public void m59264a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f57020h = true;
            m59272i(this.f57013a.add(this.f57014b, this.f57021i, this.f57022j, this.f57023k));
        }

        /* renamed from: b */
        public SubMenu m59265b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f57020h = true;
            SubMenu subMenuAddSubMenu = this.f57013a.addSubMenu(this.f57014b, this.f57021i, this.f57022j, this.f57023k);
            m59272i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* renamed from: c */
        public final char m59266c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean m59267d() {
            return this.f57020h;
        }

        /* renamed from: e */
        public final Object m59268e(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, zdg.this.f57002c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                return null;
            }
        }

        /* renamed from: f */
        public void m59269f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = zdg.this.f57002c.obtainStyledAttributes(attributeSet, bbe.MenuGroup);
            this.f57014b = typedArrayObtainStyledAttributes.getResourceId(bbe.MenuGroup_android_id, 0);
            this.f57015c = typedArrayObtainStyledAttributes.getInt(bbe.MenuGroup_android_menuCategory, 0);
            this.f57016d = typedArrayObtainStyledAttributes.getInt(bbe.MenuGroup_android_orderInCategory, 0);
            this.f57017e = typedArrayObtainStyledAttributes.getInt(bbe.MenuGroup_android_checkableBehavior, 0);
            this.f57018f = typedArrayObtainStyledAttributes.getBoolean(bbe.MenuGroup_android_visible, true);
            this.f57019g = typedArrayObtainStyledAttributes.getBoolean(bbe.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m59270g(AttributeSet attributeSet) {
            anh anhVarM17524u = anh.m17524u(zdg.this.f57002c, attributeSet, bbe.MenuItem);
            this.f57021i = anhVarM17524u.m17539n(bbe.MenuItem_android_id, 0);
            this.f57022j = (anhVarM17524u.m17536k(bbe.MenuItem_android_menuCategory, this.f57015c) & Opcodes.V_PREVIEW) | (anhVarM17524u.m17536k(bbe.MenuItem_android_orderInCategory, this.f57016d) & 65535);
            this.f57023k = anhVarM17524u.m17541p(bbe.MenuItem_android_title);
            this.f57024l = anhVarM17524u.m17541p(bbe.MenuItem_android_titleCondensed);
            this.f57025m = anhVarM17524u.m17539n(bbe.MenuItem_android_icon, 0);
            this.f57026n = m59266c(anhVarM17524u.m17540o(bbe.MenuItem_android_alphabeticShortcut));
            this.f57027o = anhVarM17524u.m17536k(bbe.MenuItem_alphabeticModifiers, 4096);
            this.f57028p = m59266c(anhVarM17524u.m17540o(bbe.MenuItem_android_numericShortcut));
            this.f57029q = anhVarM17524u.m17536k(bbe.MenuItem_numericModifiers, 4096);
            if (anhVarM17524u.m17544s(bbe.MenuItem_android_checkable)) {
                this.f57030r = anhVarM17524u.m17526a(bbe.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f57030r = this.f57017e;
            }
            this.f57031s = anhVarM17524u.m17526a(bbe.MenuItem_android_checked, false);
            this.f57032t = anhVarM17524u.m17526a(bbe.MenuItem_android_visible, this.f57018f);
            this.f57033u = anhVarM17524u.m17526a(bbe.MenuItem_android_enabled, this.f57019g);
            this.f57034v = anhVarM17524u.m17536k(bbe.MenuItem_showAsAction, -1);
            this.f57038z = anhVarM17524u.m17540o(bbe.MenuItem_android_onClick);
            this.f57035w = anhVarM17524u.m17539n(bbe.MenuItem_actionLayout, 0);
            this.f57036x = anhVarM17524u.m17540o(bbe.MenuItem_actionViewClass);
            String strM17540o = anhVarM17524u.m17540o(bbe.MenuItem_actionProviderClass);
            this.f57037y = strM17540o;
            if ((strM17540o != null) && this.f57035w == 0 && this.f57036x == null) {
                this.f57007A = (wm) m59268e(strM17540o, zdg.f56999f, zdg.this.f57001b);
            } else {
                this.f57007A = null;
            }
            this.f57008B = anhVarM17524u.m17541p(bbe.MenuItem_contentDescription);
            this.f57009C = anhVarM17524u.m17541p(bbe.MenuItem_tooltipText);
            if (anhVarM17524u.m17544s(bbe.MenuItem_iconTintMode)) {
                this.f57011E = vy5.m53599e(anhVarM17524u.m17536k(bbe.MenuItem_iconTintMode, -1), this.f57011E);
            } else {
                this.f57011E = null;
            }
            if (anhVarM17524u.m17544s(bbe.MenuItem_iconTint)) {
                this.f57010D = anhVarM17524u.m17528c(bbe.MenuItem_iconTint);
            } else {
                this.f57010D = null;
            }
            anhVarM17524u.m17546x();
            this.f57020h = false;
        }

        /* renamed from: h */
        public void m59271h() {
            this.f57014b = 0;
            this.f57015c = 0;
            this.f57016d = 0;
            this.f57017e = 0;
            this.f57018f = true;
            this.f57019g = true;
        }

        /* renamed from: i */
        public final void m59272i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z = false;
            menuItem.setChecked(this.f57031s).setVisible(this.f57032t).setEnabled(this.f57033u).setCheckable(this.f57030r >= 1).setTitleCondensed(this.f57024l).setIcon(this.f57025m);
            int i = this.f57034v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f57038z != null) {
                if (zdg.this.f57002c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC18620a(zdg.this.m59262b(), this.f57038z));
            }
            if (this.f57030r >= 2) {
                if (menuItem instanceof C1794g) {
                    ((C1794g) menuItem).m4088t(true);
                } else if (menuItem instanceof zab) {
                    ((zab) menuItem).m59081h(true);
                }
            }
            String str = this.f57036x;
            if (str != null) {
                menuItem.setActionView((View) m59268e(str, zdg.f56998e, zdg.this.f57000a));
                z = true;
            }
            int i2 = this.f57035w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            wm wmVar = this.f57007A;
            if (wmVar != null) {
                xab.m55896b(menuItem, wmVar);
            }
            xab.m55898d(menuItem, this.f57008B);
            xab.m55902h(menuItem, this.f57009C);
            xab.m55897c(menuItem, this.f57026n, this.f57027o);
            xab.m55901g(menuItem, this.f57028p, this.f57029q);
            PorterDuff.Mode mode = this.f57011E;
            if (mode != null) {
                xab.m55900f(menuItem, mode);
            }
            ColorStateList colorStateList = this.f57010D;
            if (colorStateList != null) {
                xab.m55899e(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f56998e = clsArr;
        f56999f = clsArr;
    }

    public zdg(Context context) {
        super(context);
        this.f57002c = context;
        Object[] objArr = {context};
        this.f57000a = objArr;
        this.f57001b = objArr;
    }

    /* renamed from: a */
    public final Object m59261a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m59261a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public Object m59262b() {
        if (this.f57003d == null) {
            this.f57003d = m59261a(this.f57002c);
        }
        return this.f57003d;
    }

    /* renamed from: c */
    public final void m59263c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C18621b c18621b = new C18621b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        c18621b.m59271h();
                    } else if (name2.equals("item")) {
                        if (!c18621b.m59267d()) {
                            wm wmVar = c18621b.f57007A;
                            if (wmVar == null || !wmVar.mo54695b()) {
                                c18621b.m59264a();
                            } else {
                                c18621b.m59265b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    c18621b.m59269f(attributeSet);
                } else if (name3.equals("item")) {
                    c18621b.m59270g(attributeSet);
                } else if (name3.equals("menu")) {
                    m59263c(xmlPullParser, attributeSet, c18621b.m59265b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof ydg)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f57002c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C1792e) {
                    C1792e c1792e = (C1792e) menu;
                    if (c1792e.m4021H()) {
                        c1792e.i0();
                        z = true;
                    }
                }
                m59263c(layout, attributeSetAsAttributeSet, menu);
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (z) {
                ((C1792e) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
        }
    }
}

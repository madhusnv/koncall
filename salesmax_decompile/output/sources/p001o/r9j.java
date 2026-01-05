package p001o;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes2.dex */
public class r9j {

    /* renamed from: b */
    public static final r9j f43261b;

    /* renamed from: a */
    public final C16575l f43262a;

    /* renamed from: o.r9j$a */
    public static class C16564a {

        /* renamed from: a */
        public static Field f43263a;

        /* renamed from: b */
        public static Field f43264b;

        /* renamed from: c */
        public static Field f43265c;

        /* renamed from: d */
        public static boolean f43266d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f43263a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f43264b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f43265c = declaredField3;
                declaredField3.setAccessible(true);
                f43266d = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets from AttachInfo ");
                sb.append(e.getMessage());
            }
        }

        /* renamed from: a */
        public static r9j m46407a(View view) throws IllegalAccessException, IllegalArgumentException {
            if (f43266d && view.isAttachedToWindow()) {
                try {
                    Object obj = f43263a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f43264b.get(obj);
                        Rect rect2 = (Rect) f43265c.get(obj);
                        if (rect != null && rect2 != null) {
                            r9j r9jVarM46408a = new C16565b().m46410c(sj8.m48375c(rect)).m46411d(sj8.m48375c(rect2)).m46408a();
                            r9jVarM46408a.m46404t(r9jVarM46408a);
                            r9jVarM46408a.m46389d(view.getRootView());
                            return r9jVarM46408a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get insets from AttachInfo. ");
                    sb.append(e.getMessage());
                }
            }
            return null;
        }
    }

    /* renamed from: o.r9j$e */
    public static class C16568e extends C16567d {
        public C16568e() {
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: c */
        public void mo46419c(int i, sj8 sj8Var) {
            this.f43274c.setInsets(C16577n.m46450a(i), sj8Var.m48377e());
        }

        public C16568e(r9j r9jVar) {
            super(r9jVar);
        }
    }

    /* renamed from: o.r9j$f */
    public static class C16569f {

        /* renamed from: a */
        public final r9j f43275a;

        /* renamed from: b */
        public sj8[] f43276b;

        public C16569f() {
            this(new r9j((r9j) null));
        }

        /* renamed from: a */
        public final void m46420a() {
            sj8[] sj8VarArr = this.f43276b;
            if (sj8VarArr != null) {
                sj8 sj8VarM46391f = sj8VarArr[C16576m.m46447c(1)];
                sj8 sj8VarM46391f2 = this.f43276b[C16576m.m46447c(2)];
                if (sj8VarM46391f2 == null) {
                    sj8VarM46391f2 = this.f43275a.m46391f(2);
                }
                if (sj8VarM46391f == null) {
                    sj8VarM46391f = this.f43275a.m46391f(1);
                }
                mo46415g(sj8.m48373a(sj8VarM46391f, sj8VarM46391f2));
                sj8 sj8Var = this.f43276b[C16576m.m46447c(16)];
                if (sj8Var != null) {
                    mo46417f(sj8Var);
                }
                sj8 sj8Var2 = this.f43276b[C16576m.m46447c(32)];
                if (sj8Var2 != null) {
                    mo46416d(sj8Var2);
                }
                sj8 sj8Var3 = this.f43276b[C16576m.m46447c(64)];
                if (sj8Var3 != null) {
                    mo46418h(sj8Var3);
                }
            }
        }

        /* renamed from: b */
        public abstract r9j mo46413b();

        /* renamed from: c */
        public void mo46419c(int i, sj8 sj8Var) {
            if (this.f43276b == null) {
                this.f43276b = new sj8[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f43276b[C16576m.m46447c(i2)] = sj8Var;
                }
            }
        }

        /* renamed from: d */
        public void mo46416d(sj8 sj8Var) {
        }

        /* renamed from: e */
        public abstract void mo46414e(sj8 sj8Var);

        /* renamed from: f */
        public void mo46417f(sj8 sj8Var) {
        }

        /* renamed from: g */
        public abstract void mo46415g(sj8 sj8Var);

        /* renamed from: h */
        public void mo46418h(sj8 sj8Var) {
        }

        public C16569f(r9j r9jVar) {
            this.f43275a = r9jVar;
        }
    }

    /* renamed from: o.r9j$i */
    public static class C16572i extends C16571h {
        public C16572i(r9j r9jVar, WindowInsets windowInsets) {
            super(r9jVar, windowInsets);
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: a */
        public r9j mo46440a() {
            return r9j.m46384w(this.f43282c.consumeDisplayCutout());
        }

        @Override // p001o.r9j.C16570g, p001o.r9j.C16575l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16572i)) {
                return false;
            }
            C16572i c16572i = (C16572i) obj;
            return Objects.equals(this.f43282c, c16572i.f43282c) && Objects.equals(this.f43286g, c16572i.f43286g);
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: f */
        public nu5 mo46441f() {
            return nu5.m41151e(this.f43282c.getDisplayCutout());
        }

        @Override // p001o.r9j.C16575l
        public int hashCode() {
            return this.f43282c.hashCode();
        }

        public C16572i(r9j r9jVar, C16572i c16572i) {
            super(r9jVar, c16572i);
        }
    }

    /* renamed from: o.r9j$k */
    public static class C16574k extends C16573j {

        /* renamed from: q */
        public static final r9j f43291q = r9j.m46384w(WindowInsets.CONSUMED);

        public C16574k(r9j r9jVar, WindowInsets windowInsets) {
            super(r9jVar, windowInsets);
        }

        @Override // p001o.r9j.C16570g, p001o.r9j.C16575l
        /* renamed from: d */
        public final void mo46425d(View view) {
        }

        @Override // p001o.r9j.C16570g, p001o.r9j.C16575l
        /* renamed from: g */
        public sj8 mo46427g(int i) {
            return sj8.m48376d(this.f43282c.getInsets(C16577n.m46450a(i)));
        }

        public C16574k(r9j r9jVar, C16574k c16574k) {
            super(r9jVar, c16574k);
        }
    }

    /* renamed from: o.r9j$l */
    public static class C16575l {

        /* renamed from: b */
        public static final r9j f43292b = new C16565b().m46408a().m46386a().m46387b().m46388c();

        /* renamed from: a */
        public final r9j f43293a;

        public C16575l(r9j r9jVar) {
            this.f43293a = r9jVar;
        }

        /* renamed from: a */
        public r9j mo46440a() {
            return this.f43293a;
        }

        /* renamed from: b */
        public r9j mo46435b() {
            return this.f43293a;
        }

        /* renamed from: c */
        public r9j mo46436c() {
            return this.f43293a;
        }

        /* renamed from: d */
        public void mo46425d(View view) {
        }

        /* renamed from: e */
        public void mo46426e(r9j r9jVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16575l)) {
                return false;
            }
            C16575l c16575l = (C16575l) obj;
            return mo46430o() == c16575l.mo46430o() && mo46438n() == c16575l.mo46438n() && s6c.m47909a(mo46428k(), c16575l.mo46428k()) && s6c.m47909a(mo46437i(), c16575l.mo46437i()) && s6c.m47909a(mo46441f(), c16575l.mo46441f());
        }

        /* renamed from: f */
        public nu5 mo46441f() {
            return null;
        }

        /* renamed from: g */
        public sj8 mo46427g(int i) {
            return sj8.f45476e;
        }

        /* renamed from: h */
        public sj8 mo46442h() {
            return mo46428k();
        }

        public int hashCode() {
            return s6c.m47910b(Boolean.valueOf(mo46430o()), Boolean.valueOf(mo46438n()), mo46428k(), mo46437i(), mo46441f());
        }

        /* renamed from: i */
        public sj8 mo46437i() {
            return sj8.f45476e;
        }

        /* renamed from: j */
        public sj8 mo46443j() {
            return mo46428k();
        }

        /* renamed from: k */
        public sj8 mo46428k() {
            return sj8.f45476e;
        }

        /* renamed from: l */
        public sj8 mo46444l() {
            return mo46428k();
        }

        /* renamed from: m */
        public r9j mo46429m(int i, int i2, int i3, int i4) {
            return f43292b;
        }

        /* renamed from: n */
        public boolean mo46438n() {
            return false;
        }

        /* renamed from: o */
        public boolean mo46430o() {
            return false;
        }

        /* renamed from: p */
        public void mo46431p(sj8[] sj8VarArr) {
        }

        /* renamed from: q */
        public void mo46432q(sj8 sj8Var) {
        }

        /* renamed from: r */
        public void mo46433r(r9j r9jVar) {
        }

        /* renamed from: s */
        public void mo46439s(sj8 sj8Var) {
        }
    }

    /* renamed from: o.r9j$m */
    public static final class C16576m {
        /* renamed from: a */
        public static int m46445a() {
            return 128;
        }

        /* renamed from: b */
        public static int m46446b() {
            return 8;
        }

        /* renamed from: c */
        public static int m46447c(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        /* renamed from: d */
        public static int m46448d() {
            return 32;
        }

        /* renamed from: e */
        public static int m46449e() {
            return 7;
        }
    }

    /* renamed from: o.r9j$n */
    public static final class C16577n {
        /* renamed from: a */
        public static int m46450a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f43261b = C16574k.f43291q;
        } else {
            f43261b = C16575l.f43292b;
        }
    }

    public r9j(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f43262a = new C16574k(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f43262a = new C16573j(this, windowInsets);
        } else if (i >= 28) {
            this.f43262a = new C16572i(this, windowInsets);
        } else {
            this.f43262a = new C16571h(this, windowInsets);
        }
    }

    /* renamed from: o */
    public static sj8 m46383o(sj8 sj8Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, sj8Var.f45477a - i);
        int iMax2 = Math.max(0, sj8Var.f45478b - i2);
        int iMax3 = Math.max(0, sj8Var.f45479c - i3);
        int iMax4 = Math.max(0, sj8Var.f45480d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? sj8Var : sj8.m48374b(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: w */
    public static r9j m46384w(WindowInsets windowInsets) {
        return m46385x(windowInsets, null);
    }

    /* renamed from: x */
    public static r9j m46385x(WindowInsets windowInsets, View view) {
        r9j r9jVar = new r9j((WindowInsets) fgd.m26663g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            r9jVar.m46404t(wvi.m55094G(view));
            r9jVar.m46389d(view.getRootView());
        }
        return r9jVar;
    }

    /* renamed from: a */
    public r9j m46386a() {
        return this.f43262a.mo46440a();
    }

    /* renamed from: b */
    public r9j m46387b() {
        return this.f43262a.mo46435b();
    }

    /* renamed from: c */
    public r9j m46388c() {
        return this.f43262a.mo46436c();
    }

    /* renamed from: d */
    public void m46389d(View view) {
        this.f43262a.mo46425d(view);
    }

    /* renamed from: e */
    public nu5 m46390e() {
        return this.f43262a.mo46441f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r9j) {
            return s6c.m47909a(this.f43262a, ((r9j) obj).f43262a);
        }
        return false;
    }

    /* renamed from: f */
    public sj8 m46391f(int i) {
        return this.f43262a.mo46427g(i);
    }

    /* renamed from: g */
    public sj8 m46392g() {
        return this.f43262a.mo46437i();
    }

    /* renamed from: h */
    public sj8 m46393h() {
        return this.f43262a.mo46443j();
    }

    public int hashCode() {
        C16575l c16575l = this.f43262a;
        if (c16575l == null) {
            return 0;
        }
        return c16575l.hashCode();
    }

    /* renamed from: i */
    public int m46394i() {
        return this.f43262a.mo46428k().f45480d;
    }

    /* renamed from: j */
    public int m46395j() {
        return this.f43262a.mo46428k().f45477a;
    }

    /* renamed from: k */
    public int m46396k() {
        return this.f43262a.mo46428k().f45479c;
    }

    /* renamed from: l */
    public int m46397l() {
        return this.f43262a.mo46428k().f45478b;
    }

    /* renamed from: m */
    public boolean m46398m() {
        return !this.f43262a.mo46428k().equals(sj8.f45476e);
    }

    /* renamed from: n */
    public r9j m46399n(int i, int i2, int i3, int i4) {
        return this.f43262a.mo46429m(i, i2, i3, i4);
    }

    /* renamed from: p */
    public boolean m46400p() {
        return this.f43262a.mo46438n();
    }

    /* renamed from: q */
    public r9j m46401q(int i, int i2, int i3, int i4) {
        return new C16565b(this).m46411d(sj8.m48374b(i, i2, i3, i4)).m46408a();
    }

    /* renamed from: r */
    public void m46402r(sj8[] sj8VarArr) {
        this.f43262a.mo46431p(sj8VarArr);
    }

    /* renamed from: s */
    public void m46403s(sj8 sj8Var) {
        this.f43262a.mo46432q(sj8Var);
    }

    /* renamed from: t */
    public void m46404t(r9j r9jVar) {
        this.f43262a.mo46433r(r9jVar);
    }

    /* renamed from: u */
    public void m46405u(sj8 sj8Var) {
        this.f43262a.mo46439s(sj8Var);
    }

    /* renamed from: v */
    public WindowInsets m46406v() {
        C16575l c16575l = this.f43262a;
        if (c16575l instanceof C16570g) {
            return ((C16570g) c16575l).f43282c;
        }
        return null;
    }

    /* renamed from: o.r9j$c */
    public static class C16566c extends C16569f {

        /* renamed from: e */
        public static Field f43268e = null;

        /* renamed from: f */
        public static boolean f43269f = false;

        /* renamed from: g */
        public static Constructor f43270g = null;

        /* renamed from: h */
        public static boolean f43271h = false;

        /* renamed from: c */
        public WindowInsets f43272c;

        /* renamed from: d */
        public sj8 f43273d;

        public C16566c() {
            this.f43272c = m46412i();
        }

        /* renamed from: i */
        private static WindowInsets m46412i() {
            if (!f43269f) {
                try {
                    f43268e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f43269f = true;
            }
            Field field = f43268e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f43271h) {
                try {
                    f43270g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f43271h = true;
            }
            Constructor constructor = f43270g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: b */
        public r9j mo46413b() {
            m46420a();
            r9j r9jVarM46384w = r9j.m46384w(this.f43272c);
            r9jVarM46384w.m46402r(this.f43276b);
            r9jVarM46384w.m46405u(this.f43273d);
            return r9jVarM46384w;
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: e */
        public void mo46414e(sj8 sj8Var) {
            this.f43273d = sj8Var;
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: g */
        public void mo46415g(sj8 sj8Var) {
            WindowInsets windowInsets = this.f43272c;
            if (windowInsets != null) {
                this.f43272c = windowInsets.replaceSystemWindowInsets(sj8Var.f45477a, sj8Var.f45478b, sj8Var.f45479c, sj8Var.f45480d);
            }
        }

        public C16566c(r9j r9jVar) {
            super(r9jVar);
            this.f43272c = r9jVar.m46406v();
        }
    }

    /* renamed from: o.r9j$d */
    public static class C16567d extends C16569f {

        /* renamed from: c */
        public final WindowInsets.Builder f43274c;

        public C16567d() {
            this.f43274c = p0g.m42839a();
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: b */
        public r9j mo46413b() {
            m46420a();
            r9j r9jVarM46384w = r9j.m46384w(this.f43274c.build());
            r9jVarM46384w.m46402r(this.f43276b);
            return r9jVarM46384w;
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: d */
        public void mo46416d(sj8 sj8Var) {
            this.f43274c.setMandatorySystemGestureInsets(sj8Var.m48377e());
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: e */
        public void mo46414e(sj8 sj8Var) {
            this.f43274c.setStableInsets(sj8Var.m48377e());
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: f */
        public void mo46417f(sj8 sj8Var) {
            this.f43274c.setSystemGestureInsets(sj8Var.m48377e());
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: g */
        public void mo46415g(sj8 sj8Var) {
            this.f43274c.setSystemWindowInsets(sj8Var.m48377e());
        }

        @Override // p001o.r9j.C16569f
        /* renamed from: h */
        public void mo46418h(sj8 sj8Var) {
            this.f43274c.setTappableElementInsets(sj8Var.m48377e());
        }

        public C16567d(r9j r9jVar) {
            WindowInsets.Builder builderM42839a;
            super(r9jVar);
            WindowInsets windowInsetsM46406v = r9jVar.m46406v();
            if (windowInsetsM46406v != null) {
                builderM42839a = x9j.m55883a(windowInsetsM46406v);
            } else {
                builderM42839a = p0g.m42839a();
            }
            this.f43274c = builderM42839a;
        }
    }

    /* renamed from: o.r9j$h */
    public static class C16571h extends C16570g {

        /* renamed from: m */
        public sj8 f43287m;

        public C16571h(r9j r9jVar, WindowInsets windowInsets) {
            super(r9jVar, windowInsets);
            this.f43287m = null;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: b */
        public r9j mo46435b() {
            return r9j.m46384w(this.f43282c.consumeStableInsets());
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: c */
        public r9j mo46436c() {
            return r9j.m46384w(this.f43282c.consumeSystemWindowInsets());
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: i */
        public final sj8 mo46437i() {
            if (this.f43287m == null) {
                this.f43287m = sj8.m48374b(this.f43282c.getStableInsetLeft(), this.f43282c.getStableInsetTop(), this.f43282c.getStableInsetRight(), this.f43282c.getStableInsetBottom());
            }
            return this.f43287m;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: n */
        public boolean mo46438n() {
            return this.f43282c.isConsumed();
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: s */
        public void mo46439s(sj8 sj8Var) {
            this.f43287m = sj8Var;
        }

        public C16571h(r9j r9jVar, C16571h c16571h) {
            super(r9jVar, c16571h);
            this.f43287m = null;
            this.f43287m = c16571h.f43287m;
        }
    }

    /* renamed from: o.r9j$g */
    public static class C16570g extends C16575l {

        /* renamed from: h */
        public static boolean f43277h = false;

        /* renamed from: i */
        public static Method f43278i;

        /* renamed from: j */
        public static Class f43279j;

        /* renamed from: k */
        public static Field f43280k;

        /* renamed from: l */
        public static Field f43281l;

        /* renamed from: c */
        public final WindowInsets f43282c;

        /* renamed from: d */
        public sj8[] f43283d;

        /* renamed from: e */
        public sj8 f43284e;

        /* renamed from: f */
        public r9j f43285f;

        /* renamed from: g */
        public sj8 f43286g;

        public C16570g(r9j r9jVar, WindowInsets windowInsets) {
            super(r9jVar);
            this.f43284e = null;
            this.f43282c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private sj8 m46421t(int i, boolean z) {
            sj8 sj8VarM48373a = sj8.f45476e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    sj8VarM48373a = sj8.m48373a(sj8VarM48373a, m46434u(i2, z));
                }
            }
            return sj8VarM48373a;
        }

        /* renamed from: v */
        private sj8 m46422v() {
            r9j r9jVar = this.f43285f;
            return r9jVar != null ? r9jVar.m46392g() : sj8.f45476e;
        }

        /* renamed from: w */
        private sj8 m46423w(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f43277h) {
                m46424x();
            }
            Method method = f43278i;
            if (method != null && f43279j != null && f43280k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f43280k.get(f43281l.get(objInvoke));
                    if (rect != null) {
                        return sj8.m48375c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get visible insets. (Reflection error). ");
                    sb.append(e.getMessage());
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m46424x() throws ClassNotFoundException, SecurityException {
            try {
                f43278i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f43279j = cls;
                f43280k = cls.getDeclaredField("mVisibleInsets");
                f43281l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f43280k.setAccessible(true);
                f43281l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get visible insets. (Reflection error). ");
                sb.append(e.getMessage());
            }
            f43277h = true;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: d */
        public void mo46425d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            sj8 sj8VarM46423w = m46423w(view);
            if (sj8VarM46423w == null) {
                sj8VarM46423w = sj8.f45476e;
            }
            mo46432q(sj8VarM46423w);
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: e */
        public void mo46426e(r9j r9jVar) {
            r9jVar.m46404t(this.f43285f);
            r9jVar.m46403s(this.f43286g);
        }

        @Override // p001o.r9j.C16575l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f43286g, ((C16570g) obj).f43286g);
            }
            return false;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: g */
        public sj8 mo46427g(int i) {
            return m46421t(i, false);
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: k */
        public final sj8 mo46428k() {
            if (this.f43284e == null) {
                this.f43284e = sj8.m48374b(this.f43282c.getSystemWindowInsetLeft(), this.f43282c.getSystemWindowInsetTop(), this.f43282c.getSystemWindowInsetRight(), this.f43282c.getSystemWindowInsetBottom());
            }
            return this.f43284e;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: m */
        public r9j mo46429m(int i, int i2, int i3, int i4) {
            C16565b c16565b = new C16565b(r9j.m46384w(this.f43282c));
            c16565b.m46411d(r9j.m46383o(mo46428k(), i, i2, i3, i4));
            c16565b.m46410c(r9j.m46383o(mo46437i(), i, i2, i3, i4));
            return c16565b.m46408a();
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: o */
        public boolean mo46430o() {
            return this.f43282c.isRound();
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: p */
        public void mo46431p(sj8[] sj8VarArr) {
            this.f43283d = sj8VarArr;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: q */
        public void mo46432q(sj8 sj8Var) {
            this.f43286g = sj8Var;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: r */
        public void mo46433r(r9j r9jVar) {
            this.f43285f = r9jVar;
        }

        /* renamed from: u */
        public sj8 m46434u(int i, boolean z) {
            sj8 sj8VarM46392g;
            int i2;
            if (i == 1) {
                return z ? sj8.m48374b(0, Math.max(m46422v().f45478b, mo46428k().f45478b), 0, 0) : sj8.m48374b(0, mo46428k().f45478b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    sj8 sj8VarM46422v = m46422v();
                    sj8 sj8VarMo46437i = mo46437i();
                    return sj8.m48374b(Math.max(sj8VarM46422v.f45477a, sj8VarMo46437i.f45477a), 0, Math.max(sj8VarM46422v.f45479c, sj8VarMo46437i.f45479c), Math.max(sj8VarM46422v.f45480d, sj8VarMo46437i.f45480d));
                }
                sj8 sj8VarMo46428k = mo46428k();
                r9j r9jVar = this.f43285f;
                sj8VarM46392g = r9jVar != null ? r9jVar.m46392g() : null;
                int iMin = sj8VarMo46428k.f45480d;
                if (sj8VarM46392g != null) {
                    iMin = Math.min(iMin, sj8VarM46392g.f45480d);
                }
                return sj8.m48374b(sj8VarMo46428k.f45477a, 0, sj8VarMo46428k.f45479c, iMin);
            }
            if (i != 8) {
                if (i == 16) {
                    return mo46443j();
                }
                if (i == 32) {
                    return mo46442h();
                }
                if (i == 64) {
                    return mo46444l();
                }
                if (i != 128) {
                    return sj8.f45476e;
                }
                r9j r9jVar2 = this.f43285f;
                nu5 nu5VarM46390e = r9jVar2 != null ? r9jVar2.m46390e() : mo46441f();
                return nu5VarM46390e != null ? sj8.m48374b(nu5VarM46390e.m41153b(), nu5VarM46390e.m41155d(), nu5VarM46390e.m41154c(), nu5VarM46390e.m41152a()) : sj8.f45476e;
            }
            sj8[] sj8VarArr = this.f43283d;
            sj8VarM46392g = sj8VarArr != null ? sj8VarArr[C16576m.m46447c(8)] : null;
            if (sj8VarM46392g != null) {
                return sj8VarM46392g;
            }
            sj8 sj8VarMo46428k2 = mo46428k();
            sj8 sj8VarM46422v2 = m46422v();
            int i3 = sj8VarMo46428k2.f45480d;
            if (i3 > sj8VarM46422v2.f45480d) {
                return sj8.m48374b(0, 0, 0, i3);
            }
            sj8 sj8Var = this.f43286g;
            return (sj8Var == null || sj8Var.equals(sj8.f45476e) || (i2 = this.f43286g.f45480d) <= sj8VarM46422v2.f45480d) ? sj8.f45476e : sj8.m48374b(0, 0, 0, i2);
        }

        public C16570g(r9j r9jVar, C16570g c16570g) {
            this(r9jVar, new WindowInsets(c16570g.f43282c));
        }
    }

    /* renamed from: o.r9j$j */
    public static class C16573j extends C16572i {

        /* renamed from: n */
        public sj8 f43288n;

        /* renamed from: o */
        public sj8 f43289o;

        /* renamed from: p */
        public sj8 f43290p;

        public C16573j(r9j r9jVar, WindowInsets windowInsets) {
            super(r9jVar, windowInsets);
            this.f43288n = null;
            this.f43289o = null;
            this.f43290p = null;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: h */
        public sj8 mo46442h() {
            if (this.f43289o == null) {
                this.f43289o = sj8.m48376d(this.f43282c.getMandatorySystemGestureInsets());
            }
            return this.f43289o;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: j */
        public sj8 mo46443j() {
            if (this.f43288n == null) {
                this.f43288n = sj8.m48376d(this.f43282c.getSystemGestureInsets());
            }
            return this.f43288n;
        }

        @Override // p001o.r9j.C16575l
        /* renamed from: l */
        public sj8 mo46444l() {
            if (this.f43290p == null) {
                this.f43290p = sj8.m48376d(this.f43282c.getTappableElementInsets());
            }
            return this.f43290p;
        }

        @Override // p001o.r9j.C16570g, p001o.r9j.C16575l
        /* renamed from: m */
        public r9j mo46429m(int i, int i2, int i3, int i4) {
            return r9j.m46384w(this.f43282c.inset(i, i2, i3, i4));
        }

        @Override // p001o.r9j.C16571h, p001o.r9j.C16575l
        /* renamed from: s */
        public void mo46439s(sj8 sj8Var) {
        }

        public C16573j(r9j r9jVar, C16573j c16573j) {
            super(r9jVar, c16573j);
            this.f43288n = null;
            this.f43289o = null;
            this.f43290p = null;
        }
    }

    /* renamed from: o.r9j$b */
    public static final class C16565b {

        /* renamed from: a */
        public final C16569f f43267a;

        public C16565b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f43267a = new C16568e();
            } else if (i >= 29) {
                this.f43267a = new C16567d();
            } else {
                this.f43267a = new C16566c();
            }
        }

        /* renamed from: a */
        public r9j m46408a() {
            return this.f43267a.mo46413b();
        }

        /* renamed from: b */
        public C16565b m46409b(int i, sj8 sj8Var) {
            this.f43267a.mo46419c(i, sj8Var);
            return this;
        }

        /* renamed from: c */
        public C16565b m46410c(sj8 sj8Var) {
            this.f43267a.mo46414e(sj8Var);
            return this;
        }

        /* renamed from: d */
        public C16565b m46411d(sj8 sj8Var) {
            this.f43267a.mo46415g(sj8Var);
            return this;
        }

        public C16565b(r9j r9jVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f43267a = new C16568e(r9jVar);
            } else if (i >= 29) {
                this.f43267a = new C16567d(r9jVar);
            } else {
                this.f43267a = new C16566c(r9jVar);
            }
        }
    }

    public r9j(r9j r9jVar) {
        if (r9jVar != null) {
            C16575l c16575l = r9jVar.f43262a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (c16575l instanceof C16574k)) {
                this.f43262a = new C16574k(this, (C16574k) c16575l);
            } else if (i >= 29 && (c16575l instanceof C16573j)) {
                this.f43262a = new C16573j(this, (C16573j) c16575l);
            } else if (i >= 28 && (c16575l instanceof C16572i)) {
                this.f43262a = new C16572i(this, (C16572i) c16575l);
            } else if (c16575l instanceof C16571h) {
                this.f43262a = new C16571h(this, (C16571h) c16575l);
            } else if (c16575l instanceof C16570g) {
                this.f43262a = new C16570g(this, (C16570g) c16575l);
            } else {
                this.f43262a = new C16575l(this);
            }
            c16575l.mo46426e(this);
            return;
        }
        this.f43262a = new C16575l(this);
    }
}

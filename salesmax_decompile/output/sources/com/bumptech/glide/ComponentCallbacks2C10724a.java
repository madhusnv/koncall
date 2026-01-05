package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.bgd;
import p001o.dab;
import p001o.dhe;
import p001o.eab;
import p001o.hme;
import p001o.jm0;
import p001o.jme;
import p001o.jt3;
import p001o.mi1;
import p001o.oe8;
import p001o.pjg;
import p001o.qme;
import p001o.tq;
import p001o.uqi;
import p001o.wo0;
import p001o.xpa;
import p001o.yf6;

/* renamed from: com.bumptech.glide.a */
/* loaded from: classes5.dex */
public class ComponentCallbacks2C10724a implements ComponentCallbacks2 {

    /* renamed from: x */
    public static volatile ComponentCallbacks2C10724a f11152x;

    /* renamed from: y */
    public static volatile boolean f11153y;

    /* renamed from: a */
    public final yf6 f11154a;

    /* renamed from: b */
    public final mi1 f11155b;

    /* renamed from: c */
    public final dab f11156c;

    /* renamed from: d */
    public final C10726c f11157d;

    /* renamed from: e */
    public final wo0 f11158e;

    /* renamed from: f */
    public final jme f11159f;

    /* renamed from: g */
    public final jt3 f11160g;

    /* renamed from: q */
    public final a f11162q;

    /* renamed from: h */
    public final List f11161h = new ArrayList();

    /* renamed from: s */
    public eab f11163s = eab.NORMAL;

    /* renamed from: com.bumptech.glide.a$a */
    public interface a {
        qme build();
    }

    public ComponentCallbacks2C10724a(Context context, yf6 yf6Var, dab dabVar, mi1 mi1Var, wo0 wo0Var, jme jmeVar, jt3 jt3Var, int i, a aVar, Map map, List list, List list2, jm0 jm0Var, C10727d c10727d) {
        this.f11154a = yf6Var;
        this.f11155b = mi1Var;
        this.f11158e = wo0Var;
        this.f11156c = dabVar;
        this.f11159f = jmeVar;
        this.f11160g = jt3Var;
        this.f11162q = aVar;
        this.f11157d = new C10726c(context, wo0Var, AbstractC10728e.m12683d(this, list2, jm0Var), new oe8(), aVar, map, list, yf6Var, c10727d, i);
    }

    /* renamed from: a */
    public static void m12646a(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (f11153y) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f11153y = true;
        m12650m(context, generatedAppGlideModule);
        f11153y = false;
    }

    /* renamed from: c */
    public static ComponentCallbacks2C10724a m12647c(Context context) {
        if (f11152x == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM12648d = m12648d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C10724a.class) {
                if (f11152x == null) {
                    m12646a(context, generatedAppGlideModuleM12648d);
                }
            }
        }
        return f11152x;
    }

    /* renamed from: d */
    public static GeneratedAppGlideModule m12648d(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e) {
            m12652q(e);
            return null;
        } catch (InstantiationException e2) {
            m12652q(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            m12652q(e3);
            return null;
        } catch (InvocationTargetException e4) {
            m12652q(e4);
            return null;
        }
    }

    /* renamed from: l */
    public static jme m12649l(Context context) {
        bgd.m18887e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m12647c(context).m12661k();
    }

    /* renamed from: m */
    public static void m12650m(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m12651n(context, new C10725b(), generatedAppGlideModule);
    }

    /* renamed from: n */
    public static void m12651n(Context context, C10725b c10725b, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Context applicationContext = context.getApplicationContext();
        List listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo12644c()) {
            listEmptyList = new xpa(applicationContext).m56570a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo12641d().isEmpty()) {
            generatedAppGlideModule.mo12641d();
            Iterator it = listEmptyList.iterator();
            if (it.hasNext()) {
                tq.m50332a(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listEmptyList.iterator();
            if (it2.hasNext()) {
                tq.m50332a(it2.next());
                new StringBuilder().append("Discovered GlideModule from manifest: ");
                throw null;
            }
        }
        c10725b.m12667b(generatedAppGlideModule != null ? generatedAppGlideModule.mo12642e() : null);
        Iterator it3 = listEmptyList.iterator();
        if (it3.hasNext()) {
            tq.m50332a(it3.next());
            throw null;
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo12643b(applicationContext, c10725b);
        }
        ComponentCallbacks2C10724a componentCallbacks2C10724aM12666a = c10725b.m12666a(applicationContext, listEmptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(componentCallbacks2C10724aM12666a);
        f11152x = componentCallbacks2C10724aM12666a;
    }

    /* renamed from: q */
    public static void m12652q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static hme m12653t(Context context) {
        return m12649l(context).m34095f(context);
    }

    /* renamed from: b */
    public void m12654b() {
        uqi.m51920a();
        this.f11156c.m22701b();
        this.f11155b.mo39088b();
        this.f11158e.mo46963b();
    }

    /* renamed from: e */
    public wo0 m12655e() {
        return this.f11158e;
    }

    /* renamed from: f */
    public mi1 m12656f() {
        return this.f11155b;
    }

    /* renamed from: g */
    public jt3 m12657g() {
        return this.f11160g;
    }

    /* renamed from: h */
    public Context m12658h() {
        return this.f11157d.getBaseContext();
    }

    /* renamed from: i */
    public C10726c m12659i() {
        return this.f11157d;
    }

    /* renamed from: j */
    public dhe m12660j() {
        return this.f11157d.m12676i();
    }

    /* renamed from: k */
    public jme m12661k() {
        return this.f11159f;
    }

    /* renamed from: o */
    public void m12662o(hme hmeVar) {
        synchronized (this.f11161h) {
            if (this.f11161h.contains(hmeVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f11161h.add(hmeVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m12654b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m12664r(i);
    }

    /* renamed from: p */
    public boolean m12663p(pjg pjgVar) {
        synchronized (this.f11161h) {
            Iterator it = this.f11161h.iterator();
            while (it.hasNext()) {
                if (((hme) it.next()).m30818A(pjgVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void m12664r(int i) {
        uqi.m51920a();
        synchronized (this.f11161h) {
            Iterator it = this.f11161h.iterator();
            while (it.hasNext()) {
                ((hme) it.next()).onTrimMemory(i);
            }
        }
        this.f11156c.mo19441a(i);
        this.f11155b.mo39087a(i);
        this.f11158e.mo46962a(i);
    }

    /* renamed from: s */
    public void m12665s(hme hmeVar) {
        synchronized (this.f11161h) {
            if (!this.f11161h.contains(hmeVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f11161h.remove(hmeVar);
        }
    }
}

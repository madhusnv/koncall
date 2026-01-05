package p001o;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hi7 {

    /* renamed from: a */
    public static final hi7 f27012a = new hi7();

    /* renamed from: b */
    public static C13976c f27013b = C13976c.f27015d;

    /* renamed from: o.hi7$a */
    public enum EnumC13974a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: o.hi7$b */
    public interface InterfaceC13975b {
    }

    /* renamed from: o.hi7$c */
    public static final class C13976c {

        /* renamed from: c */
        public static final a f27014c = new a(null);

        /* renamed from: d */
        public static final C13976c f27015d = new C13976c(nif.m40664e(), null, isa.m32681h());

        /* renamed from: a */
        public final Set f27016a;

        /* renamed from: b */
        public final Map f27017b;

        /* renamed from: o.hi7$c$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C13976c(Set set, InterfaceC13975b interfaceC13975b, Map map) {
            sq8.m48649h(set, "flags");
            sq8.m48649h(map, "allowedViolations");
            this.f27016a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f27017b = linkedHashMap;
        }

        /* renamed from: a */
        public final Set m30627a() {
            return this.f27016a;
        }

        /* renamed from: b */
        public final InterfaceC13975b m30628b() {
            return null;
        }

        /* renamed from: c */
        public final Map m30629c() {
            return this.f27017b;
        }
    }

    /* renamed from: d */
    public static final void m30611d(String str, o0j o0jVar) {
        sq8.m48649h(o0jVar, "$violation");
        StringBuilder sb = new StringBuilder();
        sb.append("Policy violation with PENALTY_DEATH in ");
        sb.append(str);
        throw o0jVar;
    }

    /* renamed from: f */
    public static final void m30612f(Fragment fragment, String str) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(str, "previousFragmentId");
        zh7 zh7Var = new zh7(fragment, str);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(zh7Var);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_FRAGMENT_REUSE) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), zh7Var.getClass())) {
            hi7Var.m30623c(c13976cM30622b, zh7Var);
        }
    }

    /* renamed from: g */
    public static final void m30613g(Fragment fragment, ViewGroup viewGroup) {
        sq8.m48649h(fragment, "fragment");
        ii7 ii7Var = new ii7(fragment, viewGroup);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(ii7Var);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_FRAGMENT_TAG_USAGE) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), ii7Var.getClass())) {
            hi7Var.m30623c(c13976cM30622b, ii7Var);
        }
    }

    /* renamed from: h */
    public static final void m30614h(Fragment fragment) {
        sq8.m48649h(fragment, "fragment");
        br7 br7Var = new br7(fragment);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(br7Var);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_RETAIN_INSTANCE_USAGE) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), br7Var.getClass())) {
            hi7Var.m30623c(c13976cM30622b, br7Var);
        }
    }

    /* renamed from: i */
    public static final void m30615i(Fragment fragment) {
        sq8.m48649h(fragment, "fragment");
        nr7 nr7Var = new nr7(fragment);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(nr7Var);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_TARGET_FRAGMENT_USAGE) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), nr7Var.getClass())) {
            hi7Var.m30623c(c13976cM30622b, nr7Var);
        }
    }

    /* renamed from: j */
    public static final void m30616j(Fragment fragment) {
        sq8.m48649h(fragment, "fragment");
        or7 or7Var = new or7(fragment);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(or7Var);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_TARGET_FRAGMENT_USAGE) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), or7Var.getClass())) {
            hi7Var.m30623c(c13976cM30622b, or7Var);
        }
    }

    /* renamed from: k */
    public static final void m30617k(Fragment fragment) {
        sq8.m48649h(fragment, "fragment");
        zhf zhfVar = new zhf(fragment);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(zhfVar);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_RETAIN_INSTANCE_USAGE) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), zhfVar.getClass())) {
            hi7Var.m30623c(c13976cM30622b, zhfVar);
        }
    }

    /* renamed from: l */
    public static final void m30618l(Fragment fragment, Fragment fragment2, int i) {
        sq8.m48649h(fragment, "violatingFragment");
        sq8.m48649h(fragment2, "targetFragment");
        bif bifVar = new bif(fragment, fragment2, i);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(bifVar);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_TARGET_FRAGMENT_USAGE) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), bifVar.getClass())) {
            hi7Var.m30623c(c13976cM30622b, bifVar);
        }
    }

    /* renamed from: m */
    public static final void m30619m(Fragment fragment, boolean z) {
        sq8.m48649h(fragment, "fragment");
        iif iifVar = new iif(fragment, z);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(iifVar);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_SET_USER_VISIBLE_HINT) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), iifVar.getClass())) {
            hi7Var.m30623c(c13976cM30622b, iifVar);
        }
    }

    /* renamed from: n */
    public static final void m30620n(Fragment fragment, ViewGroup viewGroup) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(viewGroup, "container");
        hdj hdjVar = new hdj(fragment, viewGroup);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(hdjVar);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_WRONG_FRAGMENT_CONTAINER) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), hdjVar.getClass())) {
            hi7Var.m30623c(c13976cM30622b, hdjVar);
        }
    }

    /* renamed from: o */
    public static final void m30621o(Fragment fragment, Fragment fragment2, int i) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(fragment2, "expectedParentFragment");
        idj idjVar = new idj(fragment, fragment2, i);
        hi7 hi7Var = f27012a;
        hi7Var.m30624e(idjVar);
        C13976c c13976cM30622b = hi7Var.m30622b(fragment);
        if (c13976cM30622b.m30627a().contains(EnumC13974a.DETECT_WRONG_NESTED_HIERARCHY) && hi7Var.m30626q(c13976cM30622b, fragment.getClass(), idjVar.getClass())) {
            hi7Var.m30623c(c13976cM30622b, idjVar);
        }
    }

    /* renamed from: b */
    public final C13976c m30622b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                sq8.m48648g(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.I0() != null) {
                    C13976c c13976cI0 = parentFragmentManager.I0();
                    sq8.m48646e(c13976cI0);
                    return c13976cI0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f27013b;
    }

    /* renamed from: c */
    public final void m30623c(C13976c c13976c, final o0j o0jVar) {
        Fragment fragmentM41342a = o0jVar.m41342a();
        final String name = fragmentM41342a.getClass().getName();
        if (c13976c.m30627a().contains(EnumC13974a.PENALTY_LOG)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
        }
        c13976c.m30628b();
        if (c13976c.m30627a().contains(EnumC13974a.PENALTY_DEATH)) {
            m30625p(fragmentM41342a, new Runnable() { // from class: o.gi7
                @Override // java.lang.Runnable
                public final void run() {
                    hi7.m30611d(name, o0jVar);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m30624e(o0j o0jVar) {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("StrictMode violation in ");
            sb.append(o0jVar.m41342a().getClass().getName());
        }
    }

    /* renamed from: p */
    public final void m30625p(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerM18968h = fragment.getParentFragmentManager().C0().m18968h();
        if (sq8.m48644c(handlerM18968h.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerM18968h.post(runnable);
        }
    }

    /* renamed from: q */
    public final boolean m30626q(C13976c c13976c, Class cls, Class cls2) {
        Set set = (Set) c13976c.m30629c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (sq8.m48644c(cls2.getSuperclass(), o0j.class) || !kh3.m35708X(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}

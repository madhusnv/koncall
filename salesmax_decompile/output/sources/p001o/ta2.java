package p001o;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p001o.b92;
import p001o.v92;

/* loaded from: classes2.dex */
public final class ta2 implements b92.InterfaceC12302a {

    /* renamed from: a */
    public final StringBuilder f46689a = new StringBuilder();

    /* renamed from: b */
    public final Object f46690b;

    /* renamed from: c */
    public int f46691c;

    /* renamed from: d */
    public final b92 f46692d;

    /* renamed from: e */
    public final Map f46693e;

    /* renamed from: f */
    public int f46694f;

    /* renamed from: o.ta2$a */
    public static class C17037a {

        /* renamed from: a */
        public v92.EnumC17532a f46695a;

        /* renamed from: b */
        public final Executor f46696b;

        /* renamed from: c */
        public final InterfaceC17038b f46697c;

        /* renamed from: d */
        public final InterfaceC17039c f46698d;

        public C17037a(v92.EnumC17532a enumC17532a, Executor executor, InterfaceC17038b interfaceC17038b, InterfaceC17039c interfaceC17039c) {
            this.f46695a = enumC17532a;
            this.f46696b = executor;
            this.f46697c = interfaceC17038b;
            this.f46698d = interfaceC17039c;
        }

        /* renamed from: a */
        public v92.EnumC17532a m49607a() {
            return this.f46695a;
        }

        /* renamed from: b */
        public void m49608b() {
            try {
                Executor executor = this.f46696b;
                final InterfaceC17038b interfaceC17038b = this.f46697c;
                Objects.requireNonNull(interfaceC17038b);
                executor.execute(new Runnable() { // from class: o.sa2
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC17038b.mo26131a();
                    }
                });
            } catch (RejectedExecutionException e) {
                wja.m54630d("CameraStateRegistry", "Unable to notify camera to configure.", e);
            }
        }

        /* renamed from: c */
        public void m49609c() {
            try {
                Executor executor = this.f46696b;
                final InterfaceC17039c interfaceC17039c = this.f46698d;
                Objects.requireNonNull(interfaceC17039c);
                executor.execute(new Runnable() { // from class: o.ra2
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC17039c.mo26129a();
                    }
                });
            } catch (RejectedExecutionException e) {
                wja.m54630d("CameraStateRegistry", "Unable to notify camera to open.", e);
            }
        }

        /* renamed from: d */
        public v92.EnumC17532a m49610d(v92.EnumC17532a enumC17532a) {
            v92.EnumC17532a enumC17532a2 = this.f46695a;
            this.f46695a = enumC17532a;
            return enumC17532a2;
        }
    }

    /* renamed from: o.ta2$b */
    public interface InterfaceC17038b {
        /* renamed from: a */
        void mo26131a();
    }

    /* renamed from: o.ta2$c */
    public interface InterfaceC17039c {
        /* renamed from: a */
        void mo26129a();
    }

    public ta2(b92 b92Var, int i) {
        Object obj = new Object();
        this.f46690b = obj;
        this.f46693e = new HashMap();
        this.f46691c = i;
        synchronized (obj) {
            this.f46692d = b92Var;
            this.f46694f = this.f46691c;
        }
    }

    /* renamed from: d */
    public static boolean m49596d(v92.EnumC17532a enumC17532a) {
        return enumC17532a != null && enumC17532a.holdsCameraSlot();
    }

    /* renamed from: h */
    public static void m49597h(g72 g72Var, v92.EnumC17532a enumC17532a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (vsh.m53387d()) {
            vsh.m53389f("CX:State[" + g72Var + "]", enumC17532a.ordinal());
        }
    }

    @Override // p001o.b92.InterfaceC12302a
    /* renamed from: a */
    public void mo18289a(int i, int i2) {
        synchronized (this.f46690b) {
            boolean z = true;
            this.f46691c = i2 == 2 ? 2 : 1;
            boolean z2 = i != 2 && i2 == 2;
            if (i != 2 || i2 == 2) {
                z = false;
            }
            if (z2 || z) {
                m49601f();
            }
        }
    }

    /* renamed from: b */
    public final C17037a m49598b(String str) {
        for (g72 g72Var : this.f46693e.keySet()) {
            if (str.equals(((u92) g72Var.mo28113a()).mo38380b())) {
                return (C17037a) this.f46693e.get(g72Var);
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean m49599c() {
        synchronized (this.f46690b) {
            Iterator it = this.f46693e.entrySet().iterator();
            while (it.hasNext()) {
                if (((C17037a) ((Map.Entry) it.next()).getValue()).m49607a() == v92.EnumC17532a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m49600e(g72 g72Var, v92.EnumC17532a enumC17532a, boolean z) {
        C17037a c17037aM49598b;
        synchronized (this.f46690b) {
            int i = this.f46694f;
            if ((enumC17532a == v92.EnumC17532a.RELEASED ? m49605k(g72Var) : m49606l(g72Var, enumC17532a)) == enumC17532a) {
                return;
            }
            HashMap map = null;
            if (this.f46692d.mo18287c() == 2 && enumC17532a == v92.EnumC17532a.CONFIGURED) {
                String strMo18286b = this.f46692d.mo18286b(((u92) g72Var.mo28113a()).mo38380b());
                if (strMo18286b != null) {
                    c17037aM49598b = m49598b(strMo18286b);
                }
            } else {
                c17037aM49598b = null;
            }
            if (i < 1 && this.f46694f > 0) {
                map = new HashMap();
                for (Map.Entry entry : this.f46693e.entrySet()) {
                    if (((C17037a) entry.getValue()).m49607a() == v92.EnumC17532a.PENDING_OPEN) {
                        map.put((g72) entry.getKey(), (C17037a) entry.getValue());
                    }
                }
            } else if (enumC17532a == v92.EnumC17532a.PENDING_OPEN && this.f46694f > 0) {
                map = new HashMap();
                map.put(g72Var, (C17037a) this.f46693e.get(g72Var));
            }
            if (map != null && !z) {
                map.remove(g72Var);
            }
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((C17037a) it.next()).m49609c();
                }
            }
            if (c17037aM49598b != null) {
                c17037aM49598b.m49608b();
            }
        }
    }

    /* renamed from: f */
    public final void m49601f() {
        if (wja.m54632f("CameraStateRegistry")) {
            this.f46689a.setLength(0);
            this.f46689a.append("Recalculating open cameras:\n");
            this.f46689a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f46689a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.f46693e.entrySet()) {
            if (wja.m54632f("CameraStateRegistry")) {
                this.f46689a.append(String.format(Locale.US, "%-45s%-22s\n", ((g72) entry.getKey()).toString(), ((C17037a) entry.getValue()).m49607a() != null ? ((C17037a) entry.getValue()).m49607a().toString() : "UNKNOWN"));
            }
            if (m49596d(((C17037a) entry.getValue()).m49607a())) {
                i++;
            }
        }
        if (wja.m54632f("CameraStateRegistry")) {
            this.f46689a.append("-------------------------------------------------------------------\n");
            this.f46689a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f46691c)));
            wja.m54627a("CameraStateRegistry", this.f46689a.toString());
        }
        this.f46694f = Math.max(this.f46691c - i, 0);
    }

    /* renamed from: g */
    public void m49602g(g72 g72Var, Executor executor, InterfaceC17038b interfaceC17038b, InterfaceC17039c interfaceC17039c) {
        synchronized (this.f46690b) {
            fgd.m26666j(!this.f46693e.containsKey(g72Var), "Camera is already registered: " + g72Var);
            this.f46693e.put(g72Var, new C17037a(null, executor, interfaceC17038b, interfaceC17039c));
        }
    }

    /* renamed from: i */
    public boolean m49603i(g72 g72Var) {
        boolean z;
        synchronized (this.f46690b) {
            C17037a c17037a = (C17037a) fgd.m26664h((C17037a) this.f46693e.get(g72Var), "Camera must first be registered with registerCamera()");
            if (wja.m54632f("CameraStateRegistry")) {
                this.f46689a.setLength(0);
                this.f46689a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", g72Var, Integer.valueOf(this.f46694f), Boolean.valueOf(m49596d(c17037a.m49607a())), c17037a.m49607a()));
            }
            if (this.f46694f > 0 || m49596d(c17037a.m49607a())) {
                v92.EnumC17532a enumC17532a = v92.EnumC17532a.OPENING;
                c17037a.m49610d(enumC17532a);
                m49597h(g72Var, enumC17532a);
                z = true;
            } else {
                z = false;
            }
            if (wja.m54632f("CameraStateRegistry")) {
                StringBuilder sb = this.f46689a;
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                objArr[0] = z ? "SUCCESS" : "FAIL";
                sb.append(String.format(locale, " --> %s", objArr));
                wja.m54627a("CameraStateRegistry", this.f46689a.toString());
            }
            if (z) {
                m49601f();
            }
        }
        return z;
    }

    /* renamed from: j */
    public boolean m49604j(String str, String str2) {
        synchronized (this.f46690b) {
            boolean z = true;
            if (this.f46692d.mo18287c() != 2) {
                return true;
            }
            C17037a c17037aM49598b = m49598b(str);
            v92.EnumC17532a enumC17532aM49607a = c17037aM49598b != null ? c17037aM49598b.m49607a() : null;
            C17037a c17037aM49598b2 = str2 != null ? m49598b(str2) : null;
            v92.EnumC17532a enumC17532aM49607a2 = c17037aM49598b2 != null ? c17037aM49598b2.m49607a() : null;
            v92.EnumC17532a enumC17532a = v92.EnumC17532a.OPEN;
            boolean z2 = enumC17532a.equals(enumC17532aM49607a) || v92.EnumC17532a.CONFIGURED.equals(enumC17532aM49607a);
            boolean z3 = enumC17532a.equals(enumC17532aM49607a2) || v92.EnumC17532a.CONFIGURED.equals(enumC17532aM49607a2);
            if (!z2 || !z3) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: k */
    public final v92.EnumC17532a m49605k(g72 g72Var) {
        C17037a c17037a = (C17037a) this.f46693e.remove(g72Var);
        if (c17037a == null) {
            return null;
        }
        m49601f();
        return c17037a.m49607a();
    }

    /* renamed from: l */
    public final v92.EnumC17532a m49606l(g72 g72Var, v92.EnumC17532a enumC17532a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        v92.EnumC17532a enumC17532aM49610d = ((C17037a) fgd.m26664h((C17037a) this.f46693e.get(g72Var), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).m49610d(enumC17532a);
        v92.EnumC17532a enumC17532a2 = v92.EnumC17532a.OPENING;
        if (enumC17532a == enumC17532a2) {
            fgd.m26666j(m49596d(enumC17532a) || enumC17532aM49610d == enumC17532a2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (enumC17532aM49610d != enumC17532a) {
            m49597h(g72Var, enumC17532a);
            m49601f();
        }
        return enumC17532aM49610d;
    }
}

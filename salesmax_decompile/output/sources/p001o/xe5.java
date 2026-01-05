package p001o;

import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class xe5 implements eka {

    /* renamed from: c */
    public static String f53614c = "o.xe5";

    /* renamed from: a */
    public we5 f53615a;

    /* renamed from: b */
    public vja f53616b;

    /* renamed from: o.xe5$a */
    public static /* synthetic */ class C18122a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53617a;

        static {
            int[] iArr = new int[wba.values().length];
            f53617a = iArr;
            try {
                iArr[wba.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53617a[wba.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53617a[wba.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53617a[wba.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53617a[wba.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public xe5(vja vjaVar, wba wbaVar) {
        this.f53616b = vjaVar;
        this.f53615a = new we5(wbaVar, vjaVar);
    }

    @Override // p001o.eka
    /* renamed from: a */
    public eka mo25189a(Throwable th) {
        this.f53615a.m54261k(th);
        return this;
    }

    @Override // p001o.eka
    /* renamed from: b */
    public eka mo25190b(Supplier supplier) {
        this.f53615a.m54260j((String) supplier.get());
        return this;
    }

    @Override // p001o.eka
    /* renamed from: c */
    public void mo25191c() {
        m56150e(this.f53615a);
    }

    @Override // p001o.eka
    /* renamed from: d */
    public eka mo25192d(String str, Object obj) {
        this.f53615a.m54257g(str, obj);
        return this;
    }

    /* renamed from: e */
    public void m56150e(dka dkaVar) {
        if (dkaVar.mo23365d() == null) {
            m56156k(f53614c);
        }
        m56151f(dkaVar);
    }

    /* renamed from: f */
    public final void m56151f(dka dkaVar) {
        Object[] objArrMo23362a = dkaVar.mo23362a();
        int length = objArrMo23362a == null ? 0 : objArrMo23362a.length;
        Throwable thMo23367f = dkaVar.mo23367f();
        Object[] objArr = new Object[(thMo23367f == null ? 0 : 1) + length];
        if (objArrMo23362a != null) {
            System.arraycopy(objArrMo23362a, 0, objArr, 0, length);
        }
        if (thMo23367f != null) {
            objArr[length] = thMo23367f;
        }
        String strM56154i = m56154i(dkaVar);
        int i = C18122a.f53617a[dkaVar.mo23366e().ordinal()];
        if (i == 1) {
            this.f53616b.mo20737j(strM56154i, objArr);
            return;
        }
        if (i == 2) {
            this.f53616b.mo20734g(strM56154i, objArr);
            return;
        }
        if (i == 3) {
            this.f53616b.mo20742o(strM56154i, objArr);
        } else if (i == 4) {
            this.f53616b.mo20731d(strM56154i, objArr);
        } else {
            if (i != 5) {
                return;
            }
            this.f53616b.mo20732e(strM56154i, objArr);
        }
    }

    /* renamed from: g */
    public final StringBuilder m56152g(List list, StringBuilder sb) {
        if (list != null && !list.isEmpty()) {
            if (sb == null) {
                sb = new StringBuilder();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nd9 nd9Var = (nd9) it.next();
                sb.append(nd9Var.f36704a);
                sb.append('=');
                sb.append(nd9Var.f36705b);
                sb.append(TokenParser.SP);
            }
        }
        return sb;
    }

    /* renamed from: h */
    public final StringBuilder m56153h(List list, StringBuilder sb) {
        if (list != null && !list.isEmpty()) {
            if (sb == null) {
                sb = new StringBuilder();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tq.m50332a(it.next());
                sb.append((Object) null);
                sb.append(TokenParser.SP);
            }
        }
        return sb;
    }

    /* renamed from: i */
    public final String m56154i(dka dkaVar) {
        return m56155j(dkaVar.getMessage(), m56152g(dkaVar.mo23364c(), m56153h(dkaVar.mo23363b(), null)));
    }

    /* renamed from: j */
    public final String m56155j(String str, StringBuilder sb) {
        if (sb == null) {
            return str;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: k */
    public void m56156k(String str) {
        this.f53615a.m54259i(str);
    }
}

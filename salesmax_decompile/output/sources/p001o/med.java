package p001o;

import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import ai.salesmax.util.C1670a;
import android.content.Context;

/* loaded from: classes.dex */
public final class med {

    /* renamed from: a */
    public final String f35279a;

    /* renamed from: b */
    public final Context f35280b;

    /* renamed from: c */
    public final C1670a f35281c;

    /* renamed from: d */
    public final Leads f35282d;

    /* renamed from: e */
    public final String f35283e;

    /* renamed from: f */
    public final Tasks f35284f;

    /* renamed from: g */
    public final String f35285g;

    public /* synthetic */ med(String str, Context context, C1670a c1670a, Leads leads, String str2, Tasks tasks, String str3, id5 id5Var) {
        this(str, context, c1670a, leads, str2, tasks, str3);
    }

    /* renamed from: a */
    public final String m38837a() {
        return this.f35285g;
    }

    /* renamed from: b */
    public final C1670a m38838b() {
        return this.f35281c;
    }

    /* renamed from: c */
    public final Context m38839c() {
        return this.f35280b;
    }

    /* renamed from: d */
    public final Leads m38840d() {
        return this.f35282d;
    }

    /* renamed from: e */
    public final String m38841e() {
        return this.f35283e;
    }

    /* renamed from: f */
    public final String m38842f() {
        return this.f35279a;
    }

    /* renamed from: g */
    public final Tasks m38843g() {
        return this.f35284f;
    }

    public String toString() {
        return "PopupContext(popupAction='" + this.f35279a + "', context=" + this.f35280b + ", callUtil=" + this.f35281c + ", leads=" + this.f35282d + ", number=" + this.f35283e + ", tasks=" + this.f35284f + ", callStatus=" + this.f35285g + ")";
    }

    /* renamed from: o.med$a */
    public static final class C15299a {

        /* renamed from: a */
        public String f35286a;

        /* renamed from: b */
        public Context f35287b;

        /* renamed from: c */
        public C1670a f35288c;

        /* renamed from: d */
        public Leads f35289d;

        /* renamed from: e */
        public String f35290e;

        /* renamed from: f */
        public Tasks f35291f;

        /* renamed from: g */
        public String f35292g;

        public C15299a() {
            this.f35286a = "";
        }

        /* renamed from: a */
        public final C15299a m38844a(C1670a c1670a) {
            sq8.m48649h(c1670a, "callUtil");
            this.f35288c = c1670a;
            return this;
        }

        /* renamed from: b */
        public final med m38845b() {
            if (this.f35288c == null) {
                throw new IllegalArgumentException("CallUtil must be initialized");
            }
            String str = this.f35286a;
            Context context = this.f35287b;
            C1670a c1670a = this.f35288c;
            if (c1670a == null) {
                sq8.m48667z("callUtil");
                c1670a = null;
            }
            return new med(str, context, c1670a, this.f35289d, this.f35290e, this.f35291f, this.f35292g, null);
        }

        /* renamed from: c */
        public final C15299a m38846c(String str) {
            this.f35292g = str;
            return this;
        }

        /* renamed from: d */
        public final C15299a m38847d(Context context) {
            this.f35287b = context;
            return this;
        }

        /* renamed from: e */
        public final C15299a m38848e(Leads leads) {
            this.f35289d = leads;
            return this;
        }

        /* renamed from: f */
        public final C15299a m38849f(String str) {
            this.f35290e = str;
            return this;
        }

        /* renamed from: g */
        public final C15299a m38850g(String str) {
            sq8.m48649h(str, "popupAction");
            this.f35286a = str;
            return this;
        }

        /* renamed from: h */
        public final C15299a m38851h(Tasks tasks) {
            this.f35291f = tasks;
            return this;
        }

        public C15299a(med medVar) {
            sq8.m48649h(medVar, "popupContext");
            this.f35286a = "";
            this.f35286a = medVar.m38842f();
            this.f35287b = medVar.m38839c();
            this.f35288c = medVar.m38838b();
            this.f35289d = medVar.m38840d();
            this.f35290e = medVar.m38841e();
            this.f35291f = medVar.m38843g();
            this.f35292g = medVar.m38837a();
        }
    }

    public med(String str, Context context, C1670a c1670a, Leads leads, String str2, Tasks tasks, String str3) {
        this.f35279a = str;
        this.f35280b = context;
        this.f35281c = c1670a;
        this.f35282d = leads;
        this.f35283e = str2;
        this.f35284f = tasks;
        this.f35285g = str3;
    }
}

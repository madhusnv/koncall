package p001o;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC10732a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p001o.gjb;
import p001o.lu4;
import p001o.mu4;

/* loaded from: classes5.dex */
public class ozf implements mu4, mu4.InterfaceC15433a {

    /* renamed from: a */
    public final t75 f39108a;

    /* renamed from: b */
    public final mu4.InterfaceC15433a f39109b;

    /* renamed from: c */
    public volatile int f39110c;

    /* renamed from: d */
    public volatile au4 f39111d;

    /* renamed from: e */
    public volatile Object f39112e;

    /* renamed from: f */
    public volatile gjb.C13758a f39113f;

    /* renamed from: g */
    public volatile bu4 f39114g;

    /* renamed from: o.ozf$a */
    public class C15920a implements lu4.InterfaceC15153a {

        /* renamed from: a */
        public final /* synthetic */ gjb.C13758a f39115a;

        public C15920a(gjb.C13758a c13758a) {
            this.f39115a = c13758a;
        }

        @Override // p001o.lu4.InterfaceC15153a
        /* renamed from: c */
        public void mo17835c(Exception exc) {
            if (ozf.this.m42816g(this.f39115a)) {
                ozf.this.m42818i(this.f39115a, exc);
            }
        }

        @Override // p001o.lu4.InterfaceC15153a
        /* renamed from: f */
        public void mo17836f(Object obj) {
            if (ozf.this.m42816g(this.f39115a)) {
                ozf.this.m42817h(this.f39115a, obj);
            }
        }
    }

    public ozf(t75 t75Var, mu4.InterfaceC15433a interfaceC15433a) {
        this.f39108a = t75Var;
        this.f39109b = interfaceC15433a;
    }

    @Override // p001o.mu4.InterfaceC15433a
    /* renamed from: a */
    public void mo39690a(ic9 ic9Var, Exception exc, lu4 lu4Var, ez4 ez4Var) {
        this.f39109b.mo39690a(ic9Var, exc, lu4Var, this.f39113f.f25339c.mo18156e());
    }

    @Override // p001o.mu4
    /* renamed from: b */
    public boolean mo17834b() {
        if (this.f39112e != null) {
            Object obj = this.f39112e;
            this.f39112e = null;
            try {
                if (!m42814d(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f39111d != null && this.f39111d.mo17834b()) {
            return true;
        }
        this.f39111d = null;
        this.f39113f = null;
        boolean z = false;
        while (!z && m42815f()) {
            List listM49507g = this.f39108a.m49507g();
            int i = this.f39110c;
            this.f39110c = i + 1;
            this.f39113f = (gjb.C13758a) listM49507g.get(i);
            if (this.f39113f != null && (this.f39108a.m49505e().mo45830c(this.f39113f.f25339c.mo18156e()) || this.f39108a.m49521u(this.f39113f.f25339c.mo18153a()))) {
                m42819j(this.f39113f);
                z = true;
            }
        }
        return z;
    }

    @Override // p001o.mu4.InterfaceC15433a
    /* renamed from: c */
    public void mo39691c(ic9 ic9Var, Object obj, lu4 lu4Var, ez4 ez4Var, ic9 ic9Var2) {
        this.f39109b.mo39691c(ic9Var, obj, lu4Var, this.f39113f.f25339c.mo18156e(), ic9Var);
    }

    @Override // p001o.mu4
    public void cancel() {
        gjb.C13758a c13758a = this.f39113f;
        if (c13758a != null) {
            c13758a.f25339c.cancel();
        }
    }

    /* renamed from: d */
    public final boolean m42814d(Object obj) throws Throwable {
        long jM37350b = lja.m37350b();
        boolean z = false;
        try {
            InterfaceC10732a interfaceC10732aM49515o = this.f39108a.m49515o(obj);
            Object objMo12701c = interfaceC10732aM49515o.mo12701c();
            i76 i76VarM49517q = this.f39108a.m49517q(objMo12701c);
            cu4 cu4Var = new cu4(i76VarM49517q, objMo12701c, this.f39108a.m49511k());
            bu4 bu4Var = new bu4(this.f39113f.f25337a, this.f39108a.m49516p());
            ot5 ot5VarM49504d = this.f39108a.m49504d();
            ot5VarM49504d.mo42649a(bu4Var, cu4Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Finished encoding source to cache, key: ");
                sb.append(bu4Var);
                sb.append(", data: ");
                sb.append(obj);
                sb.append(", encoder: ");
                sb.append(i76VarM49517q);
                sb.append(", duration: ");
                sb.append(lja.m37349a(jM37350b));
            }
            if (ot5VarM49504d.mo42650b(bu4Var) != null) {
                this.f39114g = bu4Var;
                this.f39111d = new au4(Collections.singletonList(this.f39113f.f25337a), this.f39108a, this);
                this.f39113f.f25339c.mo18154b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Attempt to write: ");
                sb2.append(this.f39114g);
                sb2.append(", data: ");
                sb2.append(obj);
                sb2.append(" to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f39109b.mo39691c(this.f39113f.f25337a, interfaceC10732aM49515o.mo12701c(), this.f39113f.f25339c, this.f39113f.f25339c.mo18156e(), this.f39113f.f25337a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f39113f.f25339c.mo18154b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p001o.mu4.InterfaceC15433a
    /* renamed from: e */
    public void mo39692e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final boolean m42815f() {
        return this.f39110c < this.f39108a.m49507g().size();
    }

    /* renamed from: g */
    public boolean m42816g(gjb.C13758a c13758a) {
        gjb.C13758a c13758a2 = this.f39113f;
        return c13758a2 != null && c13758a2 == c13758a;
    }

    /* renamed from: h */
    public void m42817h(gjb.C13758a c13758a, Object obj) {
        qt5 qt5VarM49505e = this.f39108a.m49505e();
        if (obj != null && qt5VarM49505e.mo45830c(c13758a.f25339c.mo18156e())) {
            this.f39112e = obj;
            this.f39109b.mo39692e();
        } else {
            mu4.InterfaceC15433a interfaceC15433a = this.f39109b;
            ic9 ic9Var = c13758a.f25337a;
            lu4 lu4Var = c13758a.f25339c;
            interfaceC15433a.mo39691c(ic9Var, obj, lu4Var, lu4Var.mo18156e(), this.f39114g);
        }
    }

    /* renamed from: i */
    public void m42818i(gjb.C13758a c13758a, Exception exc) {
        mu4.InterfaceC15433a interfaceC15433a = this.f39109b;
        bu4 bu4Var = this.f39114g;
        lu4 lu4Var = c13758a.f25339c;
        interfaceC15433a.mo39690a(bu4Var, exc, lu4Var, lu4Var.mo18156e());
    }

    /* renamed from: j */
    public final void m42819j(gjb.C13758a c13758a) {
        this.f39113f.f25339c.mo18155d(this.f39108a.m49512l(), new C15920a(c13758a));
    }
}

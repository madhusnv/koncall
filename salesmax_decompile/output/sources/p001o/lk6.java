package p001o;

import java.util.Queue;

/* loaded from: classes6.dex */
public class lk6 extends mba {

    /* renamed from: a */
    public String f33940a;

    /* renamed from: b */
    public cbg f33941b;

    /* renamed from: c */
    public Queue f33942c;

    public lk6(cbg cbgVar, Queue queue) {
        this.f33941b = cbgVar;
        this.f33940a = cbgVar.getName();
        this.f33942c = queue;
    }

    @Override // p001o.h8, p001o.vja
    public String getName() {
        return this.f33940a;
    }

    @Override // p001o.vja
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // p001o.vja
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // p001o.vja
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // p001o.vja
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // p001o.vja
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // p001o.h8
    /* renamed from: r */
    public void mo29958r(wba wbaVar, osa osaVar, String str, Object[] objArr, Throwable th) {
        ebg ebgVar = new ebg();
        ebgVar.m24740p(System.currentTimeMillis());
        ebgVar.m24734j(wbaVar);
        ebgVar.m24735k(this.f33941b);
        ebgVar.m24736l(this.f33940a);
        if (osaVar != null) {
            ebgVar.m24731g(osaVar);
        }
        ebgVar.m24737m(str);
        ebgVar.m24738n(Thread.currentThread().getName());
        ebgVar.m24733i(objArr);
        ebgVar.m24739o(th);
        this.f33942c.add(ebgVar);
    }
}

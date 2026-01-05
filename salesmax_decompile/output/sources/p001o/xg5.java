package p001o;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p001o.sgg;

/* loaded from: classes5.dex */
public class xg5 implements d5f {

    /* renamed from: f */
    public static final Logger f53723f = Logger.getLogger(cxh.class.getName());

    /* renamed from: a */
    public final qbj f53724a;

    /* renamed from: b */
    public final Executor f53725b;

    /* renamed from: c */
    public final n91 f53726c;

    /* renamed from: d */
    public final nk6 f53727d;

    /* renamed from: e */
    public final sgg f53728e;

    public xg5(Executor executor, n91 n91Var, qbj qbjVar, nk6 nk6Var, sgg sggVar) {
        this.f53725b = executor;
        this.f53726c = n91Var;
        this.f53724a = qbjVar;
        this.f53727d = nk6Var;
        this.f53728e = sggVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m56247d(qwh qwhVar, ak6 ak6Var) {
        this.f53727d.m1(qwhVar, ak6Var);
        this.f53724a.mo45069b(qwhVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m56248e(final qwh qwhVar, fxh fxhVar, ak6 ak6Var) {
        try {
            pwh pwhVar = this.f53726c.get(qwhVar.mo45892b());
            if (pwhVar == null) {
                String str = String.format("Transport backend '%s' is not registered", qwhVar.mo45892b());
                f53723f.warning(str);
                fxhVar.mo15693a(new IllegalArgumentException(str));
            } else {
                final ak6 ak6VarMo44262b = pwhVar.mo44262b(ak6Var);
                this.f53728e.mo48328a(new sgg.InterfaceC16841a() { // from class: o.vg5
                    @Override // p001o.sgg.InterfaceC16841a
                    public final Object execute() {
                        return this.f50298a.m56247d(qwhVar, ak6VarMo44262b);
                    }
                });
                fxhVar.mo15693a(null);
            }
        } catch (Exception e) {
            f53723f.warning("Error scheduling event " + e.getMessage());
            fxhVar.mo15693a(e);
        }
    }

    @Override // p001o.d5f
    /* renamed from: a */
    public void mo22330a(final qwh qwhVar, final ak6 ak6Var, final fxh fxhVar) {
        this.f53725b.execute(new Runnable() { // from class: o.ug5
            @Override // java.lang.Runnable
            public final void run() {
                this.f48899a.m56248e(qwhVar, fxhVar, ak6Var);
            }
        });
    }
}

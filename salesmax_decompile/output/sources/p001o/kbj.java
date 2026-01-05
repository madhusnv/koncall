package p001o;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p001o.sgg;

/* loaded from: classes5.dex */
public class kbj {

    /* renamed from: a */
    public final Executor f31896a;

    /* renamed from: b */
    public final nk6 f31897b;

    /* renamed from: c */
    public final qbj f31898c;

    /* renamed from: d */
    public final sgg f31899d;

    public kbj(Executor executor, nk6 nk6Var, qbj qbjVar, sgg sggVar) {
        this.f31896a = executor;
        this.f31897b = nk6Var;
        this.f31898c = qbjVar;
        this.f31899d = sggVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m35365d() {
        Iterator it = this.f31897b.mo40725U().iterator();
        while (it.hasNext()) {
            this.f31898c.mo45069b((qwh) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m35366e() {
        this.f31899d.mo48328a(new sgg.InterfaceC16841a() { // from class: o.jbj
            @Override // p001o.sgg.InterfaceC16841a
            public final Object execute() {
                return this.f30128a.m35365d();
            }
        });
    }

    /* renamed from: c */
    public void m35367c() {
        this.f31896a.execute(new Runnable() { // from class: o.ibj
            @Override // java.lang.Runnable
            public final void run() {
                this.f28444a.m35366e();
            }
        });
    }
}

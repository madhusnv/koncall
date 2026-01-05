package androidx.camera.view;

import androidx.camera.view.PreviewView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.bn7;
import p001o.g32;
import p001o.gb2;
import p001o.hpb;
import p001o.j72;
import p001o.qm7;
import p001o.rm7;
import p001o.t92;
import p001o.u72;
import p001o.u92;
import p001o.v6c;
import p001o.v92;
import p001o.wja;
import p001o.wr0;
import p001o.zfa;
import p001o.zl7;

/* renamed from: androidx.camera.view.a */
/* loaded from: classes2.dex */
public final class C1906a implements v6c.InterfaceC17516a {

    /* renamed from: a */
    public final u92 f6158a;

    /* renamed from: b */
    public final hpb f6159b;

    /* renamed from: c */
    public PreviewView.EnumC1903f f6160c;

    /* renamed from: d */
    public final AbstractC1908c f6161d;

    /* renamed from: e */
    public zfa f6162e;

    /* renamed from: f */
    public boolean f6163f = false;

    /* renamed from: androidx.camera.view.a$a */
    public class a implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ List f6164a;

        /* renamed from: b */
        public final /* synthetic */ t92 f6165b;

        public a(List list, t92 t92Var) {
            this.f6164a = list;
            this.f6165b = t92Var;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            C1906a.this.f6162e = null;
            if (this.f6164a.isEmpty()) {
                return;
            }
            Iterator it = this.f6164a.iterator();
            while (it.hasNext()) {
                ((u92) this.f6165b).mo38381c((j72) it.next());
            }
            this.f6164a.clear();
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            C1906a.this.f6162e = null;
        }
    }

    /* renamed from: androidx.camera.view.a$b */
    public class b extends j72 {

        /* renamed from: a */
        public final /* synthetic */ g32.C13614a f6167a;

        /* renamed from: b */
        public final /* synthetic */ t92 f6168b;

        public b(g32.C13614a c13614a, t92 t92Var) {
            this.f6167a = c13614a;
            this.f6168b = t92Var;
        }

        @Override // p001o.j72
        /* renamed from: b */
        public void mo4682b(int i, u72 u72Var) {
            this.f6167a.m28005c(null);
            ((u92) this.f6168b).mo38381c(this);
        }
    }

    public C1906a(u92 u92Var, hpb hpbVar, AbstractC1908c abstractC1908c) {
        this.f6158a = u92Var;
        this.f6159b = hpbVar;
        this.f6161d = abstractC1908c;
        synchronized (this) {
            this.f6160c = (PreviewView.EnumC1903f) hpbVar.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ zfa m4751g(Void r1) {
        return this.f6161d.mo4791j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Void m4752h(Void r1) {
        m4759l(PreviewView.EnumC1903f.STREAMING);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object m4753i(t92 t92Var, List list, g32.C13614a c13614a) {
        b bVar = new b(c13614a, t92Var);
        list.add(bVar);
        ((u92) t92Var).mo38388k(gb2.m28293a(), bVar);
        return "waitForCaptureResult";
    }

    /* renamed from: e */
    public final void m4755e() {
        zfa zfaVar = this.f6162e;
        if (zfaVar != null) {
            zfaVar.cancel(false);
            this.f6162e = null;
        }
    }

    /* renamed from: f */
    public void m4756f() {
        m4755e();
    }

    @Override // p001o.v6c.InterfaceC17516a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo4754a(v92.EnumC17532a enumC17532a) {
        if (enumC17532a == v92.EnumC17532a.CLOSING || enumC17532a == v92.EnumC17532a.CLOSED || enumC17532a == v92.EnumC17532a.RELEASING || enumC17532a == v92.EnumC17532a.RELEASED) {
            m4759l(PreviewView.EnumC1903f.IDLE);
            if (this.f6163f) {
                this.f6163f = false;
                m4755e();
                return;
            }
            return;
        }
        if ((enumC17532a == v92.EnumC17532a.OPENING || enumC17532a == v92.EnumC17532a.OPEN || enumC17532a == v92.EnumC17532a.PENDING_OPEN) && !this.f6163f) {
            m4758k(this.f6158a);
            this.f6163f = true;
        }
    }

    /* renamed from: k */
    public final void m4758k(t92 t92Var) {
        m4759l(PreviewView.EnumC1903f.IDLE);
        ArrayList arrayList = new ArrayList();
        rm7 rm7VarM46960d = rm7.m46957a(m4760m(t92Var, arrayList)).m46961e(new wr0() { // from class: o.dhd
            @Override // p001o.wr0
            public final zfa apply(Object obj) {
                return this.f19853a.m4751g((Void) obj);
            }
        }, gb2.m28293a()).m46960d(new zl7() { // from class: o.ehd
            @Override // p001o.zl7
            public final Object apply(Object obj) {
                return this.f21691a.m4752h((Void) obj);
            }
        }, gb2.m28293a());
        this.f6162e = rm7VarM46960d;
        bn7.m19424j(rm7VarM46960d, new a(arrayList, t92Var), gb2.m28293a());
    }

    /* renamed from: l */
    public void m4759l(PreviewView.EnumC1903f enumC1903f) {
        synchronized (this) {
            if (this.f6160c.equals(enumC1903f)) {
                return;
            }
            this.f6160c = enumC1903f;
            wja.m54627a("StreamStateObserver", "Update Preview stream state to " + enumC1903f);
            this.f6159b.postValue(enumC1903f);
        }
    }

    /* renamed from: m */
    public final zfa m4760m(final t92 t92Var, final List list) {
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.fhd
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f23340a.m4753i(t92Var, list, c13614a);
            }
        });
    }

    @Override // p001o.v6c.InterfaceC17516a
    public void onError(Throwable th) {
        m4756f();
        m4759l(PreviewView.EnumC1903f.IDLE);
    }
}

package p001o;

import androidx.camera.core.AbstractC1892b;
import androidx.camera.core.InterfaceC1893c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p001o.mjg;

/* loaded from: classes2.dex */
public class gjg implements AbstractC1892b.a, mjg.InterfaceC15344a {

    /* renamed from: b */
    public final uc8 f25353b;

    /* renamed from: c */
    public rd8 f25354c;

    /* renamed from: d */
    public bne f25355d;

    /* renamed from: e */
    public final List f25356e;

    /* renamed from: a */
    public final Deque f25352a = new ArrayDeque();

    /* renamed from: f */
    public boolean f25357f = false;

    /* renamed from: o.gjg$a */
    public class C13759a implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ ma2 f25358a;

        public C13759a(ma2 ma2Var) {
            this.f25358a = ma2Var;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            if (this.f25358a.m38613b()) {
                return;
            }
            int iM20884f = ((cd2) this.f25358a.m38612a().get(0)).m20884f();
            if (th instanceof vc8) {
                gjg.this.f25354c.m46553j(AbstractC13760b.m28899c(iM20884f, (vc8) th));
            } else {
                gjg.this.f25354c.m46553j(AbstractC13760b.m28899c(iM20884f, new vc8(2, "Failed to submit capture request", th)));
            }
            gjg.this.f25353b.mo48158c();
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
            gjg.this.f25353b.mo48158c();
        }
    }

    /* renamed from: o.gjg$b */
    public static abstract class AbstractC13760b {
        /* renamed from: c */
        public static AbstractC13760b m28899c(int i, vc8 vc8Var) {
            return new w51(i, vc8Var);
        }

        /* renamed from: a */
        public abstract vc8 mo28900a();

        /* renamed from: b */
        public abstract int mo28901b();
    }

    public gjg(uc8 uc8Var) {
        elh.m25220a();
        this.f25353b = uc8Var;
        this.f25356e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m28886h() {
        this.f25355d = null;
        m28891g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m28887i(bne bneVar) {
        this.f25356e.remove(bneVar);
    }

    @Override // p001o.mjg.InterfaceC15344a
    /* renamed from: a */
    public void mo28888a(mjg mjgVar) {
        elh.m25220a();
        wja.m54627a("TakePictureManager", "Add a new request for retrying.");
        this.f25352a.addFirst(mjgVar);
        m28891g();
    }

    @Override // androidx.camera.core.AbstractC1892b.a
    /* renamed from: b */
    public void mo4662b(InterfaceC1893c interfaceC1893c) {
        gb2.m28295c().execute(new Runnable() { // from class: o.fjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f23537a.m28891g();
            }
        });
    }

    /* renamed from: e */
    public void m28889e() {
        elh.m25220a();
        vc8 vc8Var = new vc8(3, "Camera is closed.", null);
        Iterator it = this.f25352a.iterator();
        while (it.hasNext()) {
            ((mjg) it.next()).m39248x(vc8Var);
        }
        this.f25352a.clear();
        Iterator it2 = new ArrayList(this.f25356e).iterator();
        while (it2.hasNext()) {
            ((bne) it2.next()).m19465l(vc8Var);
        }
    }

    /* renamed from: f */
    public boolean m28890f() {
        return this.f25355d != null;
    }

    /* renamed from: g */
    public void m28891g() {
        mjg mjgVar;
        elh.m25220a();
        if (m28890f() || this.f25357f || this.f25354c.m46551h() == 0 || (mjgVar = (mjg) this.f25352a.poll()) == null) {
            return;
        }
        bne bneVar = new bne(mjgVar, this);
        m28897o(bneVar);
        iwc iwcVarM46548e = this.f25354c.m46548e(mjgVar, bneVar, bneVar.m19468o());
        ma2 ma2Var = (ma2) iwcVarM46548e.f29291a;
        Objects.requireNonNull(ma2Var);
        gjd gjdVar = (gjd) iwcVarM46548e.f29292b;
        Objects.requireNonNull(gjdVar);
        this.f25354c.m46556m(gjdVar);
        bneVar.m19472u(m28896n(ma2Var));
    }

    /* renamed from: j */
    public void m28892j(mjg mjgVar) {
        elh.m25220a();
        this.f25352a.offer(mjgVar);
        m28891g();
    }

    /* renamed from: k */
    public void m28893k() {
        elh.m25220a();
        this.f25357f = true;
        bne bneVar = this.f25355d;
        if (bneVar != null) {
            bneVar.m19466m();
        }
    }

    /* renamed from: l */
    public void m28894l() {
        elh.m25220a();
        this.f25357f = false;
        m28891g();
    }

    /* renamed from: m */
    public void m28895m(rd8 rd8Var) {
        elh.m25220a();
        this.f25354c = rd8Var;
        rd8Var.m46554k(this);
    }

    /* renamed from: n */
    public final zfa m28896n(ma2 ma2Var) {
        elh.m25220a();
        this.f25353b.mo48157b();
        zfa zfaVarMo48156a = this.f25353b.mo48156a(ma2Var.m38612a());
        bn7.m19424j(zfaVarMo48156a, new C13759a(ma2Var), gb2.m28295c());
        return zfaVarMo48156a;
    }

    /* renamed from: o */
    public final void m28897o(final bne bneVar) {
        fgd.m26665i(!m28890f());
        this.f25355d = bneVar;
        bneVar.m19468o().addListener(new Runnable() { // from class: o.djg
            @Override // java.lang.Runnable
            public final void run() {
                this.f20127a.m28886h();
            }
        }, gb2.m28293a());
        this.f25356e.add(bneVar);
        bneVar.m19469p().addListener(new Runnable() { // from class: o.ejg
            @Override // java.lang.Runnable
            public final void run() {
                this.f21767a.m28887i(bneVar);
            }
        }, gb2.m28293a());
    }
}

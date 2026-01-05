package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class b57 extends o7 {

    /* renamed from: c */
    public final rl7 f15553c;

    /* renamed from: o.b57$a */
    public static final class C12282a implements h67, rag {

        /* renamed from: a */
        public final qag f15554a;

        /* renamed from: b */
        public final rl7 f15555b;

        /* renamed from: c */
        public boolean f15556c;

        /* renamed from: d */
        public rag f15557d;

        public C12282a(qag qagVar, rl7 rl7Var) {
            this.f15554a = qagVar;
            this.f15555b = rl7Var;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f15557d, ragVar)) {
                this.f15557d = ragVar;
                this.f15554a.mo18165b(this);
            }
        }

        @Override // p001o.rag
        public void cancel() {
            this.f15557d.cancel();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f15556c) {
                if (obj instanceof u1c) {
                    u1c u1cVar = (u1c) obj;
                    if (u1cVar.m50853g()) {
                        fwe.m27599r(u1cVar.m50850d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Object objApply = this.f15555b.apply(obj);
                Objects.requireNonNull(objApply, "The selector returned a null Notification");
                u1c u1cVar2 = (u1c) objApply;
                if (u1cVar2.m50853g()) {
                    this.f15557d.cancel();
                    onError(u1cVar2.m50850d());
                } else if (!u1cVar2.m50852f()) {
                    this.f15554a.mo18166e(u1cVar2.m50851e());
                } else {
                    this.f15557d.cancel();
                    onComplete();
                }
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f15557d.cancel();
                onError(th);
            }
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f15556c) {
                return;
            }
            this.f15556c = true;
            this.f15554a.onComplete();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f15556c) {
                fwe.m27599r(th);
            } else {
                this.f15556c = true;
                this.f15554a.onError(th);
            }
        }

        @Override // p001o.rag
        public void request(long j) {
            this.f15557d.request(j);
        }
    }

    public b57(s47 s47Var, rl7 rl7Var) {
        super(s47Var);
        this.f15553c = rl7Var;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C12282a(qagVar, this.f15553c));
    }
}

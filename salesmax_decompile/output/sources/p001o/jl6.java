package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Set;

/* loaded from: classes3.dex */
public final class jl6 implements tob, h84 {

    /* renamed from: d */
    public static final C14588a f30660d = new C14588a(null);

    /* renamed from: a */
    public final /* synthetic */ tob f30661a;

    /* renamed from: b */
    public final q74 f30662b;

    /* renamed from: c */
    public final tob f30663c;

    /* renamed from: o.jl6$a */
    public static final class C14588a {
        public C14588a() {
        }

        public /* synthetic */ C14588a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.jl6$b */
    public static final class C14589b {

        /* renamed from: a */
        public tob f30664a = tx0.m50740e();

        /* renamed from: a */
        public final tob m34005a() {
            return this.f30664a;
        }
    }

    public jl6(C14589b c14589b) {
        this.f30661a = c14589b.m34005a();
        this.f30662b = a79.m16544b(null, 1, null);
        this.f30663c = c14589b.m34005a();
    }

    @Override // p001o.h84
    /* renamed from: D */
    public q74 mo6529D() {
        return this.f30662b;
    }

    @Override // p001o.qx0
    /* renamed from: a */
    public Set mo18190a() {
        return this.f30661a.mo18190a();
    }

    @Override // p001o.qx0
    /* renamed from: b */
    public Object mo18191b(kx0 kx0Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        return this.f30661a.mo18191b(kx0Var);
    }

    @Override // p001o.qx0
    /* renamed from: c */
    public boolean mo18192c(kx0 kx0Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        return this.f30661a.mo18192c(kx0Var);
    }

    /* renamed from: d */
    public final tob m34001d() {
        return this.f30663c;
    }

    @Override // p001o.qx0
    public boolean isEmpty() {
        return this.f30661a.isEmpty();
    }

    @Override // p001o.tob
    /* renamed from: p */
    public void mo34002p(kx0 kx0Var, Object obj) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        this.f30661a.mo34002p(kx0Var, obj);
    }

    @Override // p001o.tob
    /* renamed from: q */
    public void mo34003q(kx0 kx0Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        this.f30661a.mo34003q(kx0Var);
    }

    @Override // p001o.tob
    /* renamed from: r */
    public Object mo34004r(kx0 kx0Var, uk7 uk7Var) {
        sq8.m48649h(kx0Var, TransferTable.COLUMN_KEY);
        sq8.m48649h(uk7Var, "block");
        return this.f30661a.mo34004r(kx0Var, uk7Var);
    }

    public jl6() {
        this(new C14589b());
    }
}

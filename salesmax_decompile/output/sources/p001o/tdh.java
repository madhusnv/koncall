package p001o;

import java.io.IOException;
import p001o.q74;

/* loaded from: classes3.dex */
public final class tdh extends i7 implements fkh {

    /* renamed from: c */
    public static final C17063a f46909c = new C17063a(null);

    /* renamed from: b */
    public final x54 f46910b;

    /* renamed from: o.tdh$a */
    public static final class C17063a implements q74.InterfaceC16312c {
        public C17063a() {
        }

        public /* synthetic */ C17063a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdh(x54 x54Var) {
        super(f46909c);
        sq8.m48649h(x54Var, "context");
        this.f46910b = x54Var;
    }

    /* renamed from: K */
    public final x54 m49755K() {
        return this.f46910b;
    }

    @Override // p001o.fkh
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo26969H(q74 q74Var, d6f d6fVar) throws IOException {
        sq8.m48649h(q74Var, "context");
        sq8.m48649h(d6fVar, "oldState");
        d6fVar.close();
    }

    @Override // p001o.fkh
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public d6f f0(q74 q74Var) {
        sq8.m48649h(q74Var, "context");
        return this.f46910b.mo26223a();
    }
}

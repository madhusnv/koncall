package p001o;

import java.util.UUID;
import p001o.c9i;
import p001o.d9i;

/* loaded from: classes2.dex */
public class i7g implements c9i.InterfaceC12595a {

    /* renamed from: a */
    public final qpb f28209a;

    public i7g() {
        this(qpb.a0());
    }

    @Override // p001o.hp6
    /* renamed from: a */
    public vob mo17073a() {
        return this.f28209a;
    }

    @Override // p001o.c9i.InterfaceC12595a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public j7g mo17074b() {
        return new j7g(tec.m49792Y(this.f28209a));
    }

    /* renamed from: d */
    public i7g m31700d(d9i.EnumC12848b enumC12848b) {
        mo17073a().mo45760N(c9i.f17561E, enumC12848b);
        return this;
    }

    /* renamed from: e */
    public i7g m31701e(Class cls) {
        mo17073a().mo45760N(sjg.f45490v, cls);
        if (mo17073a().mo36958d(sjg.f45489u, null) == null) {
            m31702f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    /* renamed from: f */
    public i7g m31702f(String str) {
        mo17073a().mo45760N(sjg.f45489u, str);
        return this;
    }

    public i7g(qpb qpbVar) {
        this.f28209a = qpbVar;
        Class cls = (Class) qpbVar.mo36958d(sjg.f45490v, null);
        if (cls == null || cls.equals(h7g.class)) {
            m31700d(d9i.EnumC12848b.STREAM_SHARING);
            m31701e(h7g.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}

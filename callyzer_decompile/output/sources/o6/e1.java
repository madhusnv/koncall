package o6;

import ex.InterfaceC2141e;
import pg.x5;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 implements InterfaceC7562f {

    /* renamed from: a */
    public final e1 f26034a;

    /* renamed from: b */
    public final C5321w f26035b;

    public e1(e1 e1Var, C5321w c5321w) {
        this.f26034a = e1Var;
        this.f26035b = c5321w;
    }

    @Override // uw.InterfaceC7564h
    public final Object A0(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(obj, this);
    }

    /* renamed from: a */
    public final void m10446a(C5321w c5321w) {
        if (this.f26035b == c5321w) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        e1 e1Var = this.f26034a;
        if (e1Var != null) {
            e1Var.m10446a(c5321w);
        }
    }

    @Override // uw.InterfaceC7562f
    public final InterfaceC7563g getKey() {
        return d1.f26022a;
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7562f o0(InterfaceC7563g interfaceC7563g) {
        return x5.m11926a(this, interfaceC7563g);
    }

    @Override // uw.InterfaceC7564h
    public final InterfaceC7564h t0(InterfaceC7564h interfaceC7564h) {
        return x5.m11928d(this, interfaceC7564h);
    }

    @Override // uw.InterfaceC7564h
    /* renamed from: z */
    public final InterfaceC7564h mo1766z(InterfaceC7563g interfaceC7563g) {
        return x5.m11927b(this, interfaceC7563g);
    }
}

package og;

import java.io.Serializable;
import java.util.HashMap;
import jj.InterfaceC3778c;
import kj.InterfaceC4080a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 implements InterfaceC4080a {

    /* renamed from: d */
    public static final o0 f26755d = new o0(1);

    /* renamed from: a */
    public Object f26756a;

    /* renamed from: b */
    public Serializable f26757b;

    /* renamed from: c */
    public Object f26758c;

    @Override // kj.InterfaceC4080a
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC4080a mo8850c(Class cls, InterfaceC3778c interfaceC3778c) {
        ((HashMap) this.f26756a).put(cls, interfaceC3778c);
        ((HashMap) this.f26757b).remove(cls);
        return this;
    }
}

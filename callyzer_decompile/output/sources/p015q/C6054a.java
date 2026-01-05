package p015q;

import java.util.HashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q.a */
/* loaded from: classes.dex */
public final class C6054a extends C6059f {

    /* renamed from: e */
    public final HashMap f29545e = new HashMap();

    @Override // p015q.C6059f
    /* renamed from: a */
    public final C6056c mo12061a(Object obj) {
        return (C6056c) this.f29545e.get(obj);
    }

    @Override // p015q.C6059f
    /* renamed from: b */
    public final Object mo12062b(Object obj) {
        Object objMo12062b = super.mo12062b(obj);
        this.f29545e.remove(obj);
        return objMo12062b;
    }
}

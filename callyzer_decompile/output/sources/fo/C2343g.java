package fo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fo.g */
/* loaded from: classes3.dex */
public final class C2343g extends AbstractC8193c {

    /* renamed from: a */
    public String f10607a;

    /* renamed from: b */
    public String f10608b;

    /* renamed from: c */
    public /* synthetic */ Object f10609c;

    /* renamed from: d */
    public final /* synthetic */ C2348l f10610d;

    /* renamed from: e */
    public int f10611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2343g(C2348l c2348l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10610d = c2348l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10609c = obj;
        this.f10611e |= Integer.MIN_VALUE;
        return this.f10610d.m6044d(null, null, this);
    }
}

package kb;

import kc.C4055j;
import ww.AbstractC8193c;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kb.i */
/* loaded from: classes.dex */
public final class C4045i extends AbstractC8193c {

    /* renamed from: a */
    public C4055j f20884a;

    /* renamed from: b */
    public /* synthetic */ Object f20885b;

    /* renamed from: c */
    public final /* synthetic */ C8986c f20886c;

    /* renamed from: d */
    public int f20887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4045i(C8986c c8986c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f20886c = c8986c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f20885b = obj;
        this.f20887d |= Integer.MIN_VALUE;
        return this.f20886c.mo8836X(null, this);
    }
}

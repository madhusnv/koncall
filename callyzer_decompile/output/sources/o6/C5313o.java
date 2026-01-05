package o6;

import dy.C1855c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.o */
/* loaded from: classes.dex */
public final class C5313o extends AbstractC8193c {

    /* renamed from: a */
    public C5321w f26096a;

    /* renamed from: b */
    public C1855c f26097b;

    /* renamed from: c */
    public /* synthetic */ Object f26098c;

    /* renamed from: d */
    public final /* synthetic */ C5321w f26099d;

    /* renamed from: e */
    public int f26100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5313o(C5321w c5321w, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f26099d = c5321w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26098c = obj;
        this.f26100e |= Integer.MIN_VALUE;
        return C5321w.m10457b(this.f26099d, this);
    }
}

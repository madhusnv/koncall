package tb;

import wc.C7985s;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.a */
/* loaded from: classes.dex */
public final class C7090a extends AbstractC8193c {

    /* renamed from: a */
    public C7985s f34201a;

    /* renamed from: b */
    public long f34202b;

    /* renamed from: c */
    public /* synthetic */ Object f34203c;

    /* renamed from: d */
    public final /* synthetic */ C7105p f34204d;

    /* renamed from: e */
    public int f34205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7090a(C7105p c7105p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f34204d = c7105p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f34203c = obj;
        this.f34205e |= Integer.MIN_VALUE;
        return this.f34204d.read(null, 0L, this);
    }
}

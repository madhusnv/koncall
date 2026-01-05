package b8;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.s */
/* loaded from: classes.dex */
public final class C0624s extends AbstractC8193c {

    /* renamed from: a */
    public C0627v f4067a;

    /* renamed from: b */
    public C0612g f4068b;

    /* renamed from: c */
    public boolean f4069c;

    /* renamed from: d */
    public /* synthetic */ Object f4070d;

    /* renamed from: e */
    public final /* synthetic */ C0627v f4071e;

    /* renamed from: f */
    public int f4072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624s(C0627v c0627v, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4071e = c0627v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4070d = obj;
        this.f4072f |= Integer.MIN_VALUE;
        return this.f4071e.m1785f(false, this);
    }
}

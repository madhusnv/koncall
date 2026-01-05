package wm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wm.i */
/* loaded from: classes3.dex */
public final class C8113i extends AbstractC8193c {

    /* renamed from: a */
    public Object f38820a;

    /* renamed from: b */
    public Throwable f38821b;

    /* renamed from: c */
    public int f38822c;

    /* renamed from: d */
    public /* synthetic */ Object f38823d;

    /* renamed from: e */
    public final /* synthetic */ C8114j f38824e;

    /* renamed from: f */
    public int f38825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8113i(C8114j c8114j, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38824e = c8114j;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38823d = obj;
        this.f38825f |= Integer.MIN_VALUE;
        return C8114j.m15290e(this.f38824e, this);
    }
}

package kc;

import ec.InterfaceC2004b;
import tb.C7096g;
import tc.C7117b;
import ww.AbstractC8193c;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kc.f */
/* loaded from: classes.dex */
public final class C4051f extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC2004b f20893a;

    /* renamed from: b */
    public C7117b f20894b;

    /* renamed from: c */
    public C7096g f20895c;

    /* renamed from: d */
    public /* synthetic */ Object f20896d;

    /* renamed from: e */
    public final /* synthetic */ C8989c f20897e;

    /* renamed from: f */
    public int f20898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4051f(C8989c c8989c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f20897e = c8989c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f20896d = obj;
        this.f20898f |= Integer.MIN_VALUE;
        return this.f20897e.mo8836X(null, this);
    }
}

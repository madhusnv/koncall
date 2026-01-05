package sn;

import c9.C0908c;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sn.h */
/* loaded from: classes3.dex */
public final class C6872h extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f32671a;

    /* renamed from: b */
    public final /* synthetic */ C0908c f32672b;

    /* renamed from: c */
    public int f32673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6872h(C0908c c0908c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32672b = c0908c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32671a = obj;
        this.f32673c |= Integer.MIN_VALUE;
        Object objM2576u = this.f32672b.m2576u(0, null, this);
        return objM2576u == EnumC7794a.COROUTINE_SUSPENDED ? objM2576u : new C6364n(objM2576u);
    }
}

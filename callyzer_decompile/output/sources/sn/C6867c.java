package sn;

import c9.C0908c;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sn.c */
/* loaded from: classes3.dex */
public final class C6867c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f32646a;

    /* renamed from: b */
    public final /* synthetic */ C0908c f32647b;

    /* renamed from: c */
    public int f32648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6867c(C0908c c0908c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32647b = c0908c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32646a = obj;
        this.f32648c |= Integer.MIN_VALUE;
        Object objM2569n = this.f32647b.m2569n(null, false, null, null, null, false, null, 0, this);
        return objM2569n == EnumC7794a.COROUTINE_SUSPENDED ? objM2569n : new C6364n(objM2569n);
    }
}

package sn;

import c9.C0908c;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sn.b */
/* loaded from: classes3.dex */
public final class C6866b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f32643a;

    /* renamed from: b */
    public final /* synthetic */ C0908c f32644b;

    /* renamed from: c */
    public int f32645c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6866b(C0908c c0908c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32644b = c0908c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32643a = obj;
        this.f32645c |= Integer.MIN_VALUE;
        Object objM2568m = this.f32644b.m2568m(null, false, null, null, null, false, null, 0, 0, this);
        return objM2568m == EnumC7794a.COROUTINE_SUSPENDED ? objM2568m : new C6364n(objM2568m);
    }
}

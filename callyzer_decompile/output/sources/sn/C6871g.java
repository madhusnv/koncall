package sn;

import c9.C0908c;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sn.g */
/* loaded from: classes3.dex */
public final class C6871g extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f32668a;

    /* renamed from: b */
    public final /* synthetic */ C0908c f32669b;

    /* renamed from: c */
    public int f32670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6871g(C0908c c0908c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32669b = c0908c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32668a = obj;
        this.f32670c |= Integer.MIN_VALUE;
        Object objM2575t = this.f32669b.m2575t(null, false, null, null, null, false, null, 0, 0, this);
        return objM2575t == EnumC7794a.COROUTINE_SUSPENDED ? objM2575t : new C6364n(objM2575t);
    }
}

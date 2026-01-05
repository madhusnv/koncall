package sn;

import c9.C0908c;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sn.f */
/* loaded from: classes3.dex */
public final class C6870f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f32665a;

    /* renamed from: b */
    public final /* synthetic */ C0908c f32666b;

    /* renamed from: c */
    public int f32667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6870f(C0908c c0908c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32666b = c0908c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32665a = obj;
        this.f32667c |= Integer.MIN_VALUE;
        Object objM2573r = this.f32666b.m2573r(0, null, this);
        return objM2573r == EnumC7794a.COROUTINE_SUSPENDED ? objM2573r : new C6364n(objM2573r);
    }
}

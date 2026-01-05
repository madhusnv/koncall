package ia;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ia.f */
/* loaded from: classes.dex */
public final class C3214f extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f17333a;

    /* renamed from: b */
    public final /* synthetic */ C3215g f17334b;

    /* renamed from: c */
    public int f17335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3214f(C3215g c3215g, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f17334b = c3215g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17333a = obj;
        this.f17335c |= Integer.MIN_VALUE;
        return this.f17334b.m7559c(this);
    }
}

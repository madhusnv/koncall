package vv;

import bp.C0717a;
import bp.C0720d;
import d7.InterfaceC1649u;
import ex.InterfaceC2139c;
import k2.f0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vv.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7789a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f37455a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1649u f37456b;

    /* renamed from: c */
    public final /* synthetic */ w0 f37457c;

    public /* synthetic */ C7789a(InterfaceC1649u interfaceC1649u, w0 w0Var, int i10) {
        this.f37455a = i10;
        this.f37456b = interfaceC1649u;
        this.f37457c = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        f0 DisposableEffect = (f0) obj;
        switch (this.f37455a) {
            case 0:
                AbstractC4154l.m8923f(DisposableEffect, "$this$DisposableEffect");
                C0717a c0717a = new C0717a(this.f37457c, 1);
                InterfaceC1649u interfaceC1649u = this.f37456b;
                interfaceC1649u.getLifecycle().mo5343a(c0717a);
                return new C0720d(13, interfaceC1649u, c0717a);
            default:
                AbstractC4154l.m8923f(DisposableEffect, "$this$DisposableEffect");
                C0717a c0717a2 = new C0717a(this.f37457c, 2);
                InterfaceC1649u interfaceC1649u2 = this.f37456b;
                interfaceC1649u2.getLifecycle().mo5343a(c0717a2);
                return new C0720d(14, interfaceC1649u2, c0717a2);
        }
    }
}

package gv;

import b3.C0592x;
import b3.InterfaceC0586r;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gv.e */
/* loaded from: classes3.dex */
public final class C2734e implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f15267a;

    /* renamed from: b */
    public final /* synthetic */ C0592x f15268b;

    /* renamed from: c */
    public final /* synthetic */ C0592x f15269c;

    public /* synthetic */ C2734e(C0592x c0592x, C0592x c0592x2, int i10) {
        this.f15267a = i10;
        this.f15268b = c0592x;
        this.f15269c = c0592x2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f15267a) {
            case 0:
                InterfaceC0586r focusProperties = (InterfaceC0586r) obj;
                AbstractC4154l.m8923f(focusProperties, "$this$focusProperties");
                focusProperties.mo1750a(this.f15268b);
                focusProperties.mo1752c(this.f15269c);
                break;
            case 1:
                InterfaceC0586r focusProperties2 = (InterfaceC0586r) obj;
                AbstractC4154l.m8923f(focusProperties2, "$this$focusProperties");
                focusProperties2.mo1752c(this.f15268b);
                focusProperties2.mo1750a(this.f15269c);
                break;
            default:
                InterfaceC0586r focusProperties3 = (InterfaceC0586r) obj;
                AbstractC4154l.m8923f(focusProperties3, "$this$focusProperties");
                focusProperties3.mo1752c(this.f15268b);
                focusProperties3.mo1750a(this.f15269c);
                break;
        }
        return a0.f30746a;
    }
}

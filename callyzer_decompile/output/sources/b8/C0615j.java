package b8;

import cj.C0979e;
import ex.InterfaceC2139c;
import qw.a0;
import rt.C6617a;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.j */
/* loaded from: classes.dex */
public final class C0615j implements InterfaceC8209j {

    /* renamed from: a */
    public final /* synthetic */ int f4031a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8209j f4032b;

    /* renamed from: c */
    public final /* synthetic */ Object f4033c;

    /* renamed from: d */
    public final /* synthetic */ Object f4034d;

    public /* synthetic */ C0615j(InterfaceC8209j interfaceC8209j, Object obj, Object obj2, int i10) {
        this.f4031a = i10;
        this.f4032b = interfaceC8209j;
        this.f4033c = obj;
        this.f4034d = obj2;
    }

    @Override // wx.InterfaceC8209j
    public final Object collect(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        switch (this.f4031a) {
            case 0:
                Object objCollect = this.f4032b.collect(new C0614i(0, interfaceC8210k, (AbstractC8894w) this.f4033c, (InterfaceC2139c) this.f4034d), interfaceC7559c);
                if (objCollect != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f4032b.collect(new C0614i(7, interfaceC8210k, (C0979e) this.f4033c, (C6617a) this.f4034d), interfaceC7559c);
                if (objCollect2 != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return a0.f30746a;
    }
}

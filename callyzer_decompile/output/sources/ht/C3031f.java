package ht;

import k2.w0;
import m1.C4634p;
import m1.InterfaceC4628j;
import qw.a0;
import uw.InterfaceC7559c;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ht.f */
/* loaded from: classes3.dex */
public final class C3031f implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f16352a;

    /* renamed from: b */
    public final /* synthetic */ w0 f16353b;

    public /* synthetic */ C3031f(w0 w0Var, int i10) {
        this.f16352a = i10;
        this.f16353b = w0Var;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f16352a) {
            case 0:
                if (((InterfaceC4628j) obj) instanceof C4634p) {
                    this.f16353b.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                if (((InterfaceC4628j) obj) instanceof C4634p) {
                    this.f16353b.setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                }
                break;
            default:
                if (((InterfaceC4628j) obj) instanceof C4634p) {
                    this.f16353b.setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
                }
                break;
        }
        return a0.f30746a;
    }
}

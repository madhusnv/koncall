package gr;

import fr.C2369a;
import im.C3303e;
import im.C3305g;
import im.C3306h;
import im.InterfaceC3307i;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.InterfaceC8210k;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gr.c */
/* loaded from: classes3.dex */
public final class C2707c implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f15110a;

    /* renamed from: b */
    public final /* synthetic */ C2713i f15111b;

    public /* synthetic */ C2707c(C2713i c2713i, int i10) {
        this.f15110a = i10;
        this.f15111b = c2713i;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) throws Throwable {
        switch (this.f15110a) {
            case 0:
                ((Number) obj).intValue();
                C2713i c2713i = this.f15111b;
                Object objM6712e = C2713i.m6712e(c2713i, ((C2369a) c2713i.f15135j.getValue()).f10772b, interfaceC7559c);
                if (objM6712e != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) obj;
                C2713i c2713i2 = this.f15111b;
                C8810d c8810d = c2713i2.f15134i;
                InterfaceC7559c interfaceC7559c2 = null;
                if (AbstractC4154l.m8918a(interfaceC3307i, C3305g.f17555a) || (interfaceC3307i instanceof C3306h)) {
                    Object objM13475K = c0.m13475K(c8810d.f42488a, new C2708d(c2713i2, interfaceC7559c2, 7), interfaceC7559c);
                    if (objM13475K == EnumC7794a.COROUTINE_SUSPENDED) {
                    }
                } else if ((interfaceC3307i instanceof C3303e) && (r5 = c0.m13475K(c8810d.f42488a, new C2708d(c2713i2, interfaceC7559c2, 7), interfaceC7559c)) == EnumC7794a.COROUTINE_SUSPENDED) {
                }
                break;
        }
        return a0.f30746a;
    }
}

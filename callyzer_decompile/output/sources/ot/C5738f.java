package ot;

import android.content.Context;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import og.od;
import p005f.C2162k;
import qw.a0;
import r5.AbstractC6468c;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ot.f */
/* loaded from: classes3.dex */
public final class C5738f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f28280a;

    /* renamed from: b */
    public final /* synthetic */ Context f28281b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f28282c;

    /* renamed from: d */
    public final /* synthetic */ C2162k f28283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5738f(Context context, InterfaceC2139c interfaceC2139c, C2162k c2162k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f28280a = i10;
        this.f28281b = context;
        this.f28282c = interfaceC2139c;
        this.f28283d = c2162k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f28280a) {
            case 0:
                return new C5738f(this.f28281b, this.f28282c, this.f28283d, interfaceC7559c, 0);
            default:
                return new C5738f(this.f28281b, this.f28282c, this.f28283d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f28280a) {
            case 0:
                C5738f c5738f = (C5738f) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c5738f.invokeSuspend(a0Var);
                return a0Var;
            default:
                C5738f c5738f2 = (C5738f) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c5738f2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f28280a;
        a0 a0Var = a0.f30746a;
        C2162k c2162k = this.f28283d;
        InterfaceC2139c interfaceC2139c = this.f28282c;
        Context context = this.f28281b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (AbstractC6468c.m12450a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    c2162k.mo1274a("android.permission.WRITE_EXTERNAL_STORAGE");
                    break;
                } else {
                    interfaceC2139c.invoke(Boolean.TRUE);
                    break;
                }
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (AbstractC6468c.m12450a(context, "android.permission.CAMERA") != 0) {
                    c2162k.mo1274a("android.permission.CAMERA");
                    break;
                } else {
                    interfaceC2139c.invoke(Boolean.TRUE);
                    break;
                }
        }
        return a0Var;
    }
}

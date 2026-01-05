package jc;

import aws.smithy.kotlin.runtime.http.engine.HttpClientEngineClosedException;
import bd.C0645a;
import com.google.android.gms.internal.measurement.d4;
import hp.C2995b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import ld.C4448h;
import md.C4715d;
import md.C4717f;
import mq.C4833a;
import nc.C5008s;
import nc.InterfaceC4991b;
import nd.C5019j;
import og.u0;
import rw.C6669s;
import sc.C6785e;
import sc.C6802v;
import tc.C7117b;
import tc.C7123h;
import tx.C7263w;
import tx.C7265y;
import tx.e1;
import tx.f1;
import uw.C7565i;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import wc.InterfaceC7971e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements InterfaceC7971e {

    /* renamed from: a */
    public final /* synthetic */ int f19578a;

    /* renamed from: b */
    public final Object f19579b;

    public /* synthetic */ i0(InterfaceC7971e interfaceC7971e, int i10) {
        this.f19578a = i10;
        this.f19579b = interfaceC7971e;
    }

    @Override // wc.InterfaceC7971e
    /* renamed from: a */
    public final Object mo8275a(Object obj, AbstractC8193c abstractC8193c) {
        switch (this.f19578a) {
            case 0:
                C6802v c6802v = (C6802v) obj;
                return m8276b(c6802v.f32331a, ((C7117b) c6802v.f32332b).m13401a(), abstractC8193c);
            case 1:
                return ((C6785e) this.f19579b).m12978b((C6802v) obj, abstractC8193c);
            default:
                return ((InterfaceC7971e) this.f19579b).mo8275a((C6802v) obj, abstractC8193c);
        }
    }

    /* renamed from: b */
    public Object m8276b(C0645a c0645a, C7123h c7123h, AbstractC8193c abstractC8193c) {
        Map map;
        InterfaceC4991b interfaceC4991b = (InterfaceC4991b) this.f19579b;
        if (!tx.c0.m13495r(interfaceC4991b.mo1865w()).mo13509h()) {
            throw new HttpClientEngineClosedException(0);
        }
        InterfaceC7564h outerContext = abstractC8193c.getContext();
        AbstractC4154l.m8923f(outerContext, "outerContext");
        InterfaceC7564h interfaceC7564hMo1865w = interfaceC4991b.mo1865w();
        C7263w c7263w = C7263w.f34689b;
        f1 f1Var = new f1((e1) interfaceC7564hMo1865w.o0(c7263w));
        InterfaceC7564h interfaceC7564hT0 = interfaceC4991b.mo1865w().t0(f1Var).t0(new C7265y("call-context")).t0(new C4448h(d4.m3227a(outerContext)));
        C5019j c5019j = (C5019j) outerContext.o0(C5019j.f24768c);
        if (c5019j == null || (map = c5019j.f24769b) == null) {
            map = C6669s.f31944a;
        }
        InterfaceC7564h interfaceC7564hT02 = interfaceC7564hT0.t0(new C5019j(map));
        C4715d c4715dM10939a = u0.m10939a(outerContext);
        InterfaceC7564h interfaceC7564hT03 = interfaceC7564hT02.t0(c4715dM10939a != null ? new C4717f(c4715dM10939a) : C7565i.f36440a);
        e1 e1Var = (e1) outerContext.o0(c7263w);
        if (e1Var != null) {
            f1Var.v0(new C4833a(3, e1Var.a0(true, true, new C4833a(2, f1Var))));
        }
        Object objM13563m = tx.c0.m13482e(interfaceC4991b, interfaceC7564hT03.t0(new C5008s(interfaceC7564hT03)), new C2995b(this, c0645a, c7123h, null, 6), 2).m13563m(abstractC8193c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM13563m;
    }

    public i0(InterfaceC4991b engine) {
        this.f19578a = 0;
        AbstractC4154l.m8923f(engine, "engine");
        this.f19579b = engine;
    }
}

package qa;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import og.ud;
import pg.AbstractC5926g;
import sc.AbstractC6791k;
import sc.C6802v;
import tc.C7117b;
import wc.InterfaceC7971e;
import ww.AbstractC8193c;
import yc.InterfaceC8613b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qa.a */
/* loaded from: classes.dex */
public final class C6150a implements InterfaceC8613b {

    /* renamed from: a */
    public int f29991a;

    /* renamed from: b */
    public Integer f29992b;

    @Override // yc.InterfaceC8613b
    /* renamed from: a */
    public final Object mo12192a(Object obj, InterfaceC7971e interfaceC7971e, AbstractC8193c abstractC8193c) {
        String strM9730d;
        C6802v c6802v = (C6802v) obj;
        this.f29991a++;
        C7117b c7117b = (C7117b) c6802v.f32332b;
        C0645a c0645a = c6802v.f32331a;
        AbstractC4154l.m8923f(c0645a, "<this>");
        AbstractC5926g.m11642d(c7117b, "amz-sdk-invocation-id", (String) ud.m10978d(c0645a, AbstractC6791k.f32294c));
        int i10 = this.f29991a;
        Integer num = this.f29992b;
        if (num == null || (strM9730d = AbstractC4801l.m9730d(num.intValue(), "; max=")) == null) {
            strM9730d = "";
        }
        AbstractC5926g.m11642d((C7117b) c6802v.f32332b, "amz-sdk-request", "attempt=" + i10 + strM9730d);
        return interfaceC7971e.mo8275a(c6802v, abstractC8193c);
    }
}

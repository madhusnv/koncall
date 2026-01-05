package fk;

import android.content.Context;
import android.os.Process;
import aw.C0465e;
import ex.InterfaceC2137a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import qw.C6361k;
import qw.C6366p;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public final Context f10379a;

    /* renamed from: b */
    public final C6366p f10380b;

    /* renamed from: c */
    public final int f10381c;

    /* renamed from: d */
    public final C6366p f10382d;

    /* renamed from: e */
    public final C6366p f10383e;

    /* renamed from: f */
    public boolean f10384f;

    public f0(Context appContext, n1 uuidGenerator) {
        AbstractC4154l.m8923f(appContext, "appContext");
        AbstractC4154l.m8923f(uuidGenerator, "uuidGenerator");
        this.f10379a = appContext;
        final int i10 = 0;
        this.f10380b = nd.m10782c(new InterfaceC2137a(this) { // from class: fk.e0

            /* renamed from: b */
            public final /* synthetic */ f0 f10372b;

            {
                this.f10372b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ((g0) this.f10372b.f10383e.getValue()).f10392a;
                    default:
                        return h0.m5970b(this.f10372b.f10379a);
                }
            }
        });
        this.f10381c = Process.myPid();
        this.f10382d = nd.m10782c(new C0465e(8, uuidGenerator));
        final int i11 = 1;
        this.f10383e = nd.m10782c(new InterfaceC2137a(this) { // from class: fk.e0

            /* renamed from: b */
            public final /* synthetic */ f0 f10372b;

            {
                this.f10372b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ((g0) this.f10372b.f10383e.getValue()).f10392a;
                    default:
                        return h0.m5970b(this.f10372b.f10379a);
                }
            }
        });
    }

    /* renamed from: a */
    public final String m5967a() {
        return (String) this.f10380b.getValue();
    }

    /* renamed from: b */
    public final Map m5968b(Map map) {
        C6366p c6366p = this.f10382d;
        if (map == null) {
            return AbstractC6674x.m12777e(new C6361k(m5967a(), new d0(Process.myPid(), (String) c6366p.getValue())));
        }
        LinkedHashMap linkedHashMapM12786n = AbstractC6674x.m12786n(map);
        linkedHashMapM12786n.put(m5967a(), new d0(Process.myPid(), (String) c6366p.getValue()));
        return AbstractC6674x.m12785m(linkedHashMapM12786n);
    }
}

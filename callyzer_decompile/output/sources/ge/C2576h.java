package ge;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import d7.AbstractC1646r;
import d7.InterfaceC1649u;
import eb.i3;
import he.C2912c;
import he.EnumC2913d;
import he.EnumC2915f;
import he.InterfaceC2917h;
import he.InterfaceC2918i;
import ie.InterfaceC3244a;
import iz.C3389v;
import java.util.LinkedHashMap;
import java.util.List;
import je.C3757a;
import ke.AbstractC4064e;
import ke.AbstractC4066g;
import pg.h9;
import rw.AbstractC6674x;
import rw.C6668r;
import tx.AbstractC7262v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.h */
/* loaded from: classes.dex */
public final class C2576h {

    /* renamed from: a */
    public final Context f14002a;

    /* renamed from: b */
    public C2571c f14003b;

    /* renamed from: c */
    public Object f14004c;

    /* renamed from: d */
    public InterfaceC3244a f14005d;

    /* renamed from: e */
    public EnumC2913d f14006e;

    /* renamed from: f */
    public final List f14007f;

    /* renamed from: g */
    public final i3 f14008g;

    /* renamed from: h */
    public final LinkedHashMap f14009h;

    /* renamed from: i */
    public final boolean f14010i;

    /* renamed from: j */
    public final boolean f14011j;

    /* renamed from: k */
    public final C2581m f14012k;

    /* renamed from: l */
    public InterfaceC2917h f14013l;

    /* renamed from: m */
    public EnumC2915f f14014m;

    /* renamed from: n */
    public AbstractC1646r f14015n;

    /* renamed from: o */
    public InterfaceC2917h f14016o;

    /* renamed from: p */
    public EnumC2915f f14017p;

    public C2576h(Context context) {
        this.f14002a = context;
        this.f14003b = AbstractC4064e.f20918a;
        this.f14004c = null;
        this.f14005d = null;
        this.f14006e = null;
        this.f14007f = C6668r.f31943a;
        this.f14008g = null;
        this.f14009h = null;
        this.f14010i = true;
        this.f14011j = true;
        this.f14012k = null;
        this.f14013l = null;
        this.f14014m = null;
        this.f14015n = null;
        this.f14016o = null;
        this.f14017p = null;
    }

    /* renamed from: a */
    public final C2577i m6574a() {
        InterfaceC2917h interfaceC2917h;
        Object obj = this.f14004c;
        if (obj == null) {
            obj = C2579k.f14044a;
        }
        Object obj2 = obj;
        InterfaceC3244a interfaceC3244a = this.f14005d;
        C2571c c2571c = this.f14003b;
        Bitmap.Config config = c2571c.f13989g;
        EnumC2913d enumC2913d = this.f14006e;
        if (enumC2913d == null) {
            enumC2913d = c2571c.f13988f;
        }
        EnumC2913d enumC2913d2 = enumC2913d;
        C3757a c3757a = c2571c.f13987e;
        i3 i3Var = this.f14008g;
        C3389v c3389vM5727e = i3Var != null ? i3Var.m5727e() : null;
        if (c3389vM5727e == null) {
            c3389vM5727e = AbstractC4066g.f20922c;
        } else {
            Bitmap.Config[] configArr = AbstractC4066g.f20920a;
        }
        C3389v c3389v = c3389vM5727e;
        LinkedHashMap linkedHashMap = this.f14009h;
        C2584p c2584p = linkedHashMap != null ? new C2584p(h9.m11689c(linkedHashMap)) : null;
        if (c2584p == null) {
            c2584p = C2584p.f14070b;
        }
        C2584p c2584p2 = c2584p;
        C2571c c2571c2 = this.f14003b;
        boolean z6 = c2571c2.f13990h;
        c2571c2.getClass();
        C2571c c2571c3 = this.f14003b;
        EnumC2570b enumC2570b = c2571c3.f13991i;
        EnumC2570b enumC2570b2 = c2571c3.f13992j;
        EnumC2570b enumC2570b3 = c2571c3.f13993k;
        AbstractC7262v abstractC7262v = c2571c3.f13983a;
        AbstractC7262v abstractC7262v2 = c2571c3.f13984b;
        AbstractC7262v abstractC7262v3 = c2571c3.f13985c;
        AbstractC7262v abstractC7262v4 = c2571c3.f13986d;
        AbstractC1646r lifecycle = this.f14015n;
        Context context = this.f14002a;
        if (lifecycle == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof InterfaceC1649u) {
                    lifecycle = ((InterfaceC1649u) baseContext).getLifecycle();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = C2575g.f14000a;
            }
        }
        AbstractC1646r abstractC1646r = lifecycle;
        InterfaceC2917h interfaceC2917h2 = this.f14013l;
        if (interfaceC2917h2 == null) {
            InterfaceC2917h c2912c = this.f14016o;
            if (c2912c == null) {
                c2912c = new C2912c(context);
            }
            interfaceC2917h = c2912c;
        } else {
            interfaceC2917h = interfaceC2917h2;
        }
        EnumC2915f enumC2915f = this.f14014m;
        if (enumC2915f == null && (enumC2915f = this.f14017p) == null) {
            if ((interfaceC2917h2 instanceof InterfaceC2918i ? (InterfaceC2918i) interfaceC2917h2 : null) != null) {
                throw null;
            }
            enumC2915f = EnumC2915f.FIT;
        }
        EnumC2915f enumC2915f2 = enumC2915f;
        C2581m c2581m = this.f14012k;
        C2582n c2582n = c2581m != null ? new C2582n(h9.m11689c(c2581m.f14060a)) : null;
        if (c2582n == null) {
            c2582n = C2582n.f14061b;
        }
        return new C2577i(context, obj2, interfaceC3244a, config, enumC2913d2, this.f14007f, c3757a, c3389v, c2584p2, this.f14010i, z6, false, this.f14011j, enumC2570b, enumC2570b2, enumC2570b3, abstractC7262v, abstractC7262v2, abstractC7262v3, abstractC7262v4, abstractC1646r, interfaceC2917h, enumC2915f2, c2582n, new C2572d(this.f14013l, this.f14014m, this.f14006e), this.f14003b);
    }

    public C2576h(C2577i c2577i, Context context) {
        this.f14002a = context;
        this.f14003b = c2577i.f14043z;
        this.f14004c = c2577i.f14019b;
        this.f14005d = c2577i.f14020c;
        C2572d c2572d = c2577i.f14042y;
        this.f14006e = c2572d.f13996c;
        this.f14007f = c2577i.f14023f;
        this.f14008g = c2577i.f14025h.m7789j();
        this.f14009h = AbstractC6674x.m12786n(c2577i.f14026i.f14071a);
        this.f14010i = c2577i.f14027j;
        this.f14011j = c2577i.f14030m;
        this.f14012k = new C2581m(c2577i.f14041x);
        this.f14013l = c2572d.f13994a;
        this.f14014m = c2572d.f13995b;
        if (c2577i.f14018a == context) {
            this.f14015n = c2577i.f14038u;
            this.f14016o = c2577i.f14039v;
            this.f14017p = c2577i.f14040w;
        } else {
            this.f14015n = null;
            this.f14016o = null;
            this.f14017p = null;
        }
    }
}

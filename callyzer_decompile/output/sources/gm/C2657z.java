package gm;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import c0.b1;
import c0.j1;
import c0.x1;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.websoptimization.callyzerbiz.MainActivity;
import g4.C2492h;
import h1.InterfaceC2792w;
import i0.c1;
import i0.d1;
import iz.AbstractC3386s;
import iz.InterfaceC3385r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4373r;
import l4.i0;
import l4.k0;
import m0.C4610d;
import mk.C4776o;
import mk.InterfaceC4777p;
import nz.C5205p;
import og.u1;
import p007h.C2749a;
import p007h.InterfaceC2750b;
import p016r.InterfaceC6409a;
import p020v.x0;
import pg.o7;
import pg.t8;
import qi.InterfaceC6222e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gm.z */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2657z implements InterfaceC2750b, c1, InterfaceC2792w, InterfaceC6222e, InterfaceC6409a, InterfaceC3385r, k0, j1, InterfaceC4777p {

    /* renamed from: a */
    public final /* synthetic */ int f14389a;

    public /* synthetic */ C2657z(int i10) {
        this.f14389a = i10;
    }

    @Override // c0.j1
    /* renamed from: C */
    public void mo2206C(x1 x1Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(x1Var.f5259b.getWidth(), x1Var.f5259b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        x1Var.m2236a(surface, t8.m11872a(), new C4610d(0, surface, surfaceTexture));
    }

    @Override // p007h.InterfaceC2750b
    /* renamed from: a */
    public void mo24a(Object obj) {
        C2749a result = (C2749a) obj;
        int i10 = MainActivity.f7256m;
        AbstractC4154l.m8923f(result, "result");
        result.toString();
    }

    @Override // iz.InterfaceC3385r
    /* renamed from: b */
    public AbstractC3386s mo1955b(C5205p c5205p) {
        return AbstractC3386s.f17972a;
    }

    @Override // i0.c1
    /* renamed from: d */
    public void mo18d(d1 d1Var) throws Exception {
        try {
            b1 b1VarMo1878h = d1Var.mo1878h();
            if (b1VarMo1878h != null) {
                o7.m11806a();
                b1VarMo1878h.toString();
                u1.m10951j("CaptureNode");
                b1VarMo1878h.close();
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(x0 x0Var) {
        switch (this.f14389a) {
            case 8:
                return TransportRegistrar.lambda$getComponents$0(x0Var);
            case 9:
                return TransportRegistrar.lambda$getComponents$1(x0Var);
            case 10:
                return TransportRegistrar.lambda$getComponents$2(x0Var);
            default:
                return AbtRegistrar.lambda$getComponents$0(x0Var);
        }
    }

    @Override // mk.InterfaceC4777p
    /* renamed from: i */
    public Object mo28i() {
        switch (this.f14389a) {
            case 22:
                return new C4776o(true);
            case 23:
                return new LinkedHashMap();
            case 24:
                return new TreeMap();
            case 25:
                return new ConcurrentHashMap();
            case 26:
                return new ConcurrentSkipListMap();
            case 27:
                return new ArrayList();
            case 28:
                return new LinkedHashSet();
            default:
                return new TreeSet();
        }
    }

    @Override // l4.k0
    /* renamed from: y */
    public i0 mo6334y(C2492h c2492h) {
        return new i0(c2492h, C4373r.f21928a);
    }

    @Override // p016r.InterfaceC6409a
    public Object apply(Object obj) {
        return obj;
    }

    @Override // h1.InterfaceC2792w
    /* renamed from: c */
    public float mo6654c(float f6) {
        return f6;
    }
}

package p020v;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.AbstractC4308h;
import l0.C4310j;
import og.y0;
import pg.a6;
import pg.i7;
import ug.C7439j;
import x4.C8299i;
import x4.InterfaceC8300j;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C7602l implements InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ int f36620a;

    /* renamed from: b */
    public final /* synthetic */ C7612v f36621b;

    public /* synthetic */ C7602l(C7612v c7612v, int i10) {
        this.f36620a = i10;
        this.f36621b = c7612v;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(final C8299i c8299i) {
        switch (this.f36620a) {
            case 0:
                C7612v c7612v = this.f36621b;
                try {
                    ArrayList arrayList = new ArrayList(c7612v.f36719a.m5868d().m7337b().f16469c);
                    arrayList.add((h0) c7612v.f36709G.f36759g);
                    arrayList.add(new C7607q(c7612v, c8299i));
                    c7612v.f36720b.f37624a.mo2550C(c7612v.f36728k.f36742a, c7612v.f36721c, a6.m11533a(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | RuntimeException e2) {
                    c7612v.m14455w("Unable to open camera for configAndClose: " + e2.getMessage());
                    c8299i.m15509d(e2);
                    return "configAndCloseTask";
                }
            case 1:
            default:
                final C7612v c7612v2 = this.f36621b;
                final int i10 = 0;
                c7612v2.f36721c.execute(new Runnable() { // from class: v.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7439j c7439j;
                        switch (i10) {
                            case 0:
                                C7612v c7612v3 = c7612v2;
                                C8299i c8299i2 = c8299i;
                                if (c7612v3.f36733q == null) {
                                    if (c7612v3.f36723e != EnumC7610t.RELEASED) {
                                        c7612v3.f36733q = i7.m11697b(new C7602l(c7612v3, 2));
                                    } else {
                                        c7612v3.f36733q = C4310j.f21736c;
                                    }
                                }
                                InterfaceFutureC8957d interfaceFutureC8957d = c7612v3.f36733q;
                                switch (c7612v3.f36723e.ordinal()) {
                                    case 1:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        if (!c7612v3.f36727j.m14430a() && ((c7439j = (C7439j) c7612v3.f36718V.f5594b) == null || ((AtomicBoolean) c7439j.f35538c).get())) {
                                            z = false;
                                        }
                                        c7612v3.f36718V.m2640d();
                                        c7612v3.m14442G(EnumC7610t.RELEASING);
                                        if (z) {
                                            y0.m11056f(null, c7612v3.f36735s.isEmpty());
                                            c7612v3.m14453u();
                                            break;
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                        y0.m11056f(null, c7612v3.f36729l == null);
                                        c7612v3.m14442G(EnumC7610t.RELEASING);
                                        y0.m11056f(null, c7612v3.f36735s.isEmpty());
                                        c7612v3.m14453u();
                                        break;
                                    case 9:
                                    case 10:
                                        c7612v3.m14442G(EnumC7610t.RELEASING);
                                        c7612v3.m14452t();
                                        break;
                                    default:
                                        c7612v3.m14455w("release() ignored due to being in state: " + c7612v3.f36723e);
                                        break;
                                }
                                AbstractC4308h.m9035e(interfaceFutureC8957d, c8299i2);
                                break;
                            default:
                                C7612v c7612v4 = c7612v2;
                                C8299i c8299i3 = c8299i;
                                x0 x0Var = c7612v4.f36708F;
                                c8299i3.m15507b(Boolean.valueOf(x0Var == null ? false : c7612v4.f36719a.m5871g(C7612v.m14436z(x0Var))));
                                break;
                        }
                    }
                });
                return "Release[request=" + c7612v2.f36732p.getAndIncrement() + "]";
            case 2:
                C7612v c7612v3 = this.f36621b;
                y0.m11056f("Camera can only be released once, so release completer should be null on creation.", c7612v3.f36734r == null);
                c7612v3.f36734r = c8299i;
                return "Release[camera=" + c7612v3 + "]";
            case 3:
                final C7612v c7612v4 = this.f36621b;
                try {
                    final int i11 = 1;
                    c7612v4.f36721c.execute(new Runnable() { // from class: v.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7439j c7439j;
                            switch (i11) {
                                case 0:
                                    C7612v c7612v32 = c7612v4;
                                    C8299i c8299i2 = c8299i;
                                    if (c7612v32.f36733q == null) {
                                        if (c7612v32.f36723e != EnumC7610t.RELEASED) {
                                            c7612v32.f36733q = i7.m11697b(new C7602l(c7612v32, 2));
                                        } else {
                                            c7612v32.f36733q = C4310j.f21736c;
                                        }
                                    }
                                    InterfaceFutureC8957d interfaceFutureC8957d = c7612v32.f36733q;
                                    switch (c7612v32.f36723e.ordinal()) {
                                        case 1:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            if (!c7612v32.f36727j.m14430a() && ((c7439j = (C7439j) c7612v32.f36718V.f5594b) == null || ((AtomicBoolean) c7439j.f35538c).get())) {
                                                z = false;
                                            }
                                            c7612v32.f36718V.m2640d();
                                            c7612v32.m14442G(EnumC7610t.RELEASING);
                                            if (z) {
                                                y0.m11056f(null, c7612v32.f36735s.isEmpty());
                                                c7612v32.m14453u();
                                                break;
                                            }
                                            break;
                                        case 2:
                                        case 3:
                                        case 4:
                                            y0.m11056f(null, c7612v32.f36729l == null);
                                            c7612v32.m14442G(EnumC7610t.RELEASING);
                                            y0.m11056f(null, c7612v32.f36735s.isEmpty());
                                            c7612v32.m14453u();
                                            break;
                                        case 9:
                                        case 10:
                                            c7612v32.m14442G(EnumC7610t.RELEASING);
                                            c7612v32.m14452t();
                                            break;
                                        default:
                                            c7612v32.m14455w("release() ignored due to being in state: " + c7612v32.f36723e);
                                            break;
                                    }
                                    AbstractC4308h.m9035e(interfaceFutureC8957d, c8299i2);
                                    break;
                                default:
                                    C7612v c7612v42 = c7612v4;
                                    C8299i c8299i3 = c8299i;
                                    x0 x0Var = c7612v42.f36708F;
                                    c8299i3.m15507b(Boolean.valueOf(x0Var == null ? false : c7612v42.f36719a.m5871g(C7612v.m14436z(x0Var))));
                                    break;
                            }
                        }
                    });
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    c8299i.m15509d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
        }
    }
}

package b2;

import a1.C0005d;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkerStoppedException;
import d3.C1552f;
import d3.C1559m;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f3.C2196b;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC4155m;
import nf.C5047i;
import o8.AbstractC5325a;
import og.oa;
import t8.AbstractC7076v;
import t8.C7077w;
import u8.C7378z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.h */
/* loaded from: classes.dex */
public final class C0550h extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3749a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3750b;

    /* renamed from: c */
    public final /* synthetic */ Object f3751c;

    /* renamed from: d */
    public final /* synthetic */ Object f3752d;

    /* renamed from: e */
    public final /* synthetic */ Object f3753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0550h(int i10, Object obj, Object obj2, Object obj3, boolean z6) {
        super(1);
        this.f3749a = i10;
        this.f3751c = obj;
        this.f3750b = z6;
        this.f3752d = obj2;
        this.f3753e = obj3;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        switch (this.f3749a) {
            case 0:
                C1559m c1559m = (C1559m) this.f3753e;
                C1552f c1552f = (C1552f) this.f3752d;
                v3.i0 i0Var = (v3.i0) obj;
                i0Var.m14622b();
                C2196b c2196b = i0Var.f36917a;
                if (((Boolean) ((InterfaceC2137a) this.f3751c).invoke()).booleanValue()) {
                    if (this.f3750b) {
                        long jI0 = c2196b.i0();
                        C0005d c0005d = c2196b.f10124b;
                        long jM81z = c0005d.m81z();
                        c0005d.m75t().mo5107i();
                        try {
                            ((C5047i) c0005d.f24b).m9984V(-1.0f, 1.0f, jI0);
                            c2196b.m5901d(c1552f, c1559m);
                        } finally {
                            i0.m0.m7392y(c0005d, jM81z);
                        }
                    } else {
                        c2196b.m5901d(c1552f, c1559m);
                    }
                }
                return qw.a0.f30746a;
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof WorkerStoppedException) {
                    ((AbstractC7076v) this.f3751c).stop(((WorkerStoppedException) th2).f2881a);
                }
                if (this.f3750b && (str = (String) this.f3752d) != null) {
                    C7378z c7378z = (C7378z) this.f3753e;
                    C7077w c7077w = c7378z.f35071f.f34116l;
                    int iHashCode = c7378z.f35066a.hashCode();
                    c7077w.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC5325a.m10472b(iHashCode, oa.m10795e(str));
                    } else {
                        String strM10795e = oa.m10795e(str);
                        try {
                            if (oa.f26704d == null) {
                                oa.f26704d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            oa.f26704d.invoke(null, Long.valueOf(oa.f26701a), strM10795e, Integer.valueOf(iHashCode));
                        } catch (Exception e2) {
                            oa.m10792b(e2);
                        }
                    }
                }
                return qw.a0.f30746a;
        }
    }
}

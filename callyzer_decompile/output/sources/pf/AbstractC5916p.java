package pf;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import cg.BinderC0969b;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import dg.C1716e;
import lg.AbstractC4464a;
import pg.AbstractC5932m;
import sf.AbstractBinderC6838x;
import sf.AbstractC6840z;
import sf.C6837w;
import sf.InterfaceC6839y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.p */
/* loaded from: classes.dex */
public abstract class AbstractC5916p {

    /* renamed from: a */
    public static final BinderC5912l f28771a;

    /* renamed from: b */
    public static final BinderC5912l f28772b;

    /* renamed from: c */
    public static volatile InterfaceC6839y f28773c;

    /* renamed from: d */
    public static final Object f28774d;

    /* renamed from: e */
    public static Context f28775e;

    static {
        new BinderC5912l(AbstractBinderC5913m.m11524R("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new BinderC5912l(AbstractBinderC5913m.m11524R("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f28771a = new BinderC5912l(AbstractBinderC5913m.m11524R("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f28772b = new BinderC5912l(AbstractBinderC5913m.m11524R("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
        f28774d = new Object();
    }

    /* renamed from: a */
    public static C5919s m11527a(String str, BinderC5914n binderC5914n, boolean z6, boolean z10) {
        try {
            m11528b();
            AbstractC6840z.m13036g(f28775e);
            try {
                InterfaceC6839y interfaceC6839y = f28773c;
                BinderC0969b binderC0969b = new BinderC0969b(f28775e.getPackageManager());
                C6837w c6837w = (C6837w) interfaceC6839y;
                Parcel parcelM3750Q = c6837w.m3750Q();
                int i10 = AbstractC4464a.f22226a;
                boolean z11 = true;
                parcelM3750Q.writeInt(1);
                int iM11783k = AbstractC5932m.m11783k(parcelM3750Q, 20293);
                AbstractC5932m.m11778f(parcelM3750Q, 1, str);
                AbstractC5932m.m11776d(parcelM3750Q, 2, binderC5914n);
                AbstractC5932m.m11785m(parcelM3750Q, 3, 4);
                parcelM3750Q.writeInt(z6 ? 1 : 0);
                AbstractC5932m.m11785m(parcelM3750Q, 4, 4);
                parcelM3750Q.writeInt(z10 ? 1 : 0);
                AbstractC5932m.m11784l(parcelM3750Q, iM11783k);
                AbstractC4464a.m9311c(parcelM3750Q, binderC0969b);
                Parcel parcelM3748O = c6837w.m3748O(parcelM3750Q, 5);
                if (parcelM3748O.readInt() == 0) {
                    z11 = false;
                }
                parcelM3748O.recycle();
                return z11 ? C5919s.f28781c : new C5918r(new CallableC5911k(z6, str, binderC5914n));
            } catch (RemoteException e2) {
                return new C5919s(false, "module call", e2);
            }
        } catch (DynamiteModule$LoadingException e10) {
            return new C5919s(false, "module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }

    /* renamed from: b */
    public static void m11528b() {
        InterfaceC6839y c6837w;
        if (f28773c != null) {
            return;
        }
        AbstractC6840z.m13036g(f28775e);
        synchronized (f28774d) {
            try {
                if (f28773c == null) {
                    IBinder iBinderM5410b = C1716e.m5404c(f28775e, C1716e.f8346e, "com.google.android.gms.googlecertificates").m5410b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = AbstractBinderC6838x.f32499f;
                    if (iBinderM5410b == null) {
                        c6837w = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM5410b.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        c6837w = iInterfaceQueryLocalInterface instanceof InterfaceC6839y ? (InterfaceC6839y) iInterfaceQueryLocalInterface : new C6837w(iBinderM5410b, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 3);
                    }
                    f28773c = c6837w;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

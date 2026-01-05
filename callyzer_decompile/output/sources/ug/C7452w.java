package ug;

import al.C0176d;
import al.C0179g;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.u8;
import com.websoptimization.callyzerbiz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.ExecutorC3900j;
import k0.ScheduledExecutorServiceC3894d;
import kn.C4121a;
import kn.C4132l;
import net.schmizz.sshj.transport.TransportException;
import nx.AbstractC5178p;
import ny.InterfaceC5188b;
import org.bouncycastle.iana.AEADAlgorithm;
import p020v.C7599i;
import p021w.C7843i;
import pg.i9;
import qi.InterfaceC6222e;
import sk.C6860h;
import wk.InterfaceC8101a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C7452w implements InterfaceC7450u, InterfaceC5188b, InterfaceC8101a, InterfaceC6222e {

    /* renamed from: b */
    public static final /* synthetic */ C7452w f35872b = new C7452w(0);

    /* renamed from: c */
    public static final /* synthetic */ C7452w f35873c = new C7452w(1);

    /* renamed from: d */
    public static final /* synthetic */ C7452w f35874d = new C7452w(2);

    /* renamed from: e */
    public static final /* synthetic */ C7452w f35875e = new C7452w(3);

    /* renamed from: f */
    public static final /* synthetic */ C7452w f35876f = new C7452w(4);

    /* renamed from: g */
    public static final /* synthetic */ C7452w f35877g = new C7452w(5);

    /* renamed from: h */
    public static final /* synthetic */ C7452w f35878h = new C7452w(6);

    /* renamed from: j */
    public static final /* synthetic */ C7452w f35879j = new C7452w(7);

    /* renamed from: k */
    public static final /* synthetic */ C7452w f35880k = new C7452w(8);

    /* renamed from: l */
    public static final /* synthetic */ C7452w f35881l = new C7452w(9);

    /* renamed from: m */
    public static final /* synthetic */ C7452w f35882m = new C7452w(10);

    /* renamed from: n */
    public static final /* synthetic */ C7452w f35883n = new C7452w(11);

    /* renamed from: p */
    public static final /* synthetic */ C7452w f35884p = new C7452w(12);

    /* renamed from: q */
    public static final /* synthetic */ C7452w f35885q = new C7452w(13);

    /* renamed from: r */
    public static final /* synthetic */ C7452w f35886r = new C7452w(14);

    /* renamed from: s */
    public static final /* synthetic */ C7452w f35887s = new C7452w(15);

    /* renamed from: t */
    public static final /* synthetic */ C7452w f35888t = new C7452w(16);

    /* renamed from: v */
    public static final /* synthetic */ C7452w f35889v = new C7452w(17);

    /* renamed from: w */
    public static final /* synthetic */ C7452w f35890w = new C7452w(18);

    /* renamed from: a */
    public final /* synthetic */ int f35891a;

    public /* synthetic */ C7452w(int i10) {
        this.f35891a = i10;
    }

    /* renamed from: i */
    public static C4132l m14173i(String str) {
        return AbstractC5178p.m10101L(str) ? new C4132l(false, Integer.valueOf(R.string.enter_company_code)) : (str.length() < 11 || str.length() > 12) ? new C4132l(false, Integer.valueOf(R.string.correct_company_code)) : new C4132l();
    }

    /* renamed from: j */
    public static ArrayList m14174j() {
        return xm.s2.f40809m;
    }

    /* renamed from: k */
    public static boolean m14175k(int i10) {
        ArrayList arrayList = xm.s2.f40811o;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (((C4121a) obj).f21054a.f23832a == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m14176l() {
        return xm.s2.f40812p;
    }

    @Override // wk.InterfaceC8101a
    /* renamed from: a */
    public Object mo14177a(C6860h c6860h) {
        return c6860h.f32574N;
    }

    /* renamed from: b */
    public synchronized void m14178b(List list) {
        xm.s2.f40809m.addAll(list);
    }

    @Override // ny.InterfaceC5188b
    /* renamed from: c */
    public Throwable mo394c(Exception exc) {
        return exc instanceof TransportException ? (TransportException) exc : new TransportException(exc);
    }

    /* renamed from: d */
    public synchronized void m14179d(List list) {
        try {
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                C4121a c4121a = (C4121a) it.next();
                ArrayList arrayList = xm.s2.f40810n;
                if (!arrayList.contains(c4121a)) {
                    arrayList.add(c4121a);
                    i10++;
                }
            }
            if (i10 > 0) {
                xm.s2.f40813q = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: e */
    public synchronized void m14180e(List list) {
        try {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C4121a c4121a = (C4121a) it.next();
                    ArrayList arrayList = xm.s2.f40811o;
                    if (!arrayList.contains(c4121a)) {
                        arrayList.add(c4121a);
                    }
                }
            }
            xm.s2.f40813q = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public synchronized void m14181f() {
        xm.s2.f40809m.clear();
    }

    /* renamed from: g */
    public synchronized void m14182g() {
        xm.s2.f40811o.clear();
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(p020v.x0 x0Var) {
        return new C0176d(x0Var.mo12236c(C0179g.class));
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        switch (this.f35891a) {
            case 0:
                List list = f0.f35406a;
                p8.f6344b.get();
                Boolean bool = (Boolean) r8.f6364c.m3530b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43872l0.m3530b()).longValue());
            case 2:
                List list3 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6166n.m3530b();
            case 3:
                List list4 = f0.f35406a;
                c7.f6100b.get();
                Long l9 = (Long) e7.f6136J.m3530b();
                l9.getClass();
                return l9;
            case 4:
                List list5 = f0.f35406a;
                c7.f6100b.get();
                Long l10 = (Long) e7.f6144R.m3530b();
                l10.getClass();
                return l10;
            case 5:
                List list6 = f0.f35406a;
                c7.f6100b.get();
                Long l11 = (Long) e7.f43868h0.m3530b();
                l11.getClass();
                return l11;
            case 6:
                List list7 = f0.f35406a;
                c7.f6100b.get();
                Long l12 = (Long) e7.f6132F.m3530b();
                l12.getClass();
                return l12;
            case 7:
                List list8 = f0.f35406a;
                c7.f6100b.get();
                Long l13 = (Long) e7.f6165m.m3530b();
                l13.getClass();
                return l13;
            case 8:
                List list9 = f0.f35406a;
                m8.f6301b.get();
                return (String) o8.f6337f.m3530b();
            case 9:
                List list10 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6171s.m3530b()).longValue());
            case 10:
                List list11 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43870j0.m3530b()).longValue());
            case 11:
                List list12 = f0.f35406a;
                c7.f6100b.get();
                Long l14 = (Long) e7.f6162j.m3530b();
                l14.getClass();
                return l14;
            case 12:
                List list13 = f0.f35406a;
                c7.f6100b.get();
                Long l15 = (Long) e7.f6152Z.m3530b();
                l15.getClass();
                return l15;
            case 13:
                List list14 = f0.f35406a;
                c7.f6100b.get();
                Boolean bool2 = (Boolean) e7.f6129C.m3530b();
                bool2.getClass();
                return bool2;
            case 14:
                List list15 = f0.f35406a;
                Boolean bool3 = (Boolean) l8.f6289a.m3530b();
                bool3.getClass();
                return bool3;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list16 = f0.f35406a;
                Boolean bool4 = (Boolean) d9.f6118a.m3530b();
                bool4.getClass();
                return bool4;
            case 16:
                List list17 = f0.f35406a;
                p8.f6344b.get();
                Boolean bool5 = (Boolean) r8.f6368g.m3530b();
                bool5.getClass();
                return bool5;
            case 17:
                List list18 = f0.f35406a;
                p8.f6344b.get();
                Boolean bool6 = (Boolean) r8.f6365d.m3530b();
                bool6.getClass();
                return bool6;
            default:
                return new Boolean(((Boolean) u8.f6414a.m3530b()).booleanValue());
        }
    }

    public C7452w(eb.i3 i3Var) {
        this.f35891a = 25;
        i3Var.m5728f(UseTorchAsFlashQuirk.class);
    }

    public C7452w(C7599i c7599i, C7843i c7843i, eb.i3 i3Var, ExecutorC3900j executorC3900j, ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894d) {
        this.f35891a = 20;
        Integer num = (Integer) c7843i.m14823a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            num.intValue();
        }
        new C7452w(i3Var);
        i9.m11700b(new a1.c0(29, c7843i));
    }
}

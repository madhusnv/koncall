package ug;

import al.C0173a;
import al.C0184l;
import al.RunnableC0183k;
import android.media.CamcorderProfile;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.m9;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.p9;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.x8;
import com.websoptimization.callyzerbiz.R;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kn.C4132l;
import kotlin.jvm.internal.AbstractC4154l;
import l0.RunnableC4307g;
import nx.AbstractC5178p;
import org.bouncycastle.iana.AEADAlgorithm;
import p020v.InterfaceC7595e;
import qi.InterfaceC6222e;
import sk.C6860h;
import uw.InterfaceC7563g;
import wk.InterfaceC8101a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.x */
/* loaded from: classes.dex */
public final /* synthetic */ class C7453x implements InterfaceC7450u, InterfaceC7595e, InterfaceC8101a, InterfaceC6222e, InterfaceC7563g {

    /* renamed from: b */
    public static final /* synthetic */ C7453x f35895b = new C7453x(0);

    /* renamed from: c */
    public static final /* synthetic */ C7453x f35896c = new C7453x(1);

    /* renamed from: d */
    public static final /* synthetic */ C7453x f35897d = new C7453x(2);

    /* renamed from: e */
    public static final /* synthetic */ C7453x f35898e = new C7453x(3);

    /* renamed from: f */
    public static final /* synthetic */ C7453x f35899f = new C7453x(4);

    /* renamed from: g */
    public static final /* synthetic */ C7453x f35900g = new C7453x(5);

    /* renamed from: h */
    public static final /* synthetic */ C7453x f35901h = new C7453x(6);

    /* renamed from: j */
    public static final /* synthetic */ C7453x f35902j = new C7453x(7);

    /* renamed from: k */
    public static final /* synthetic */ C7453x f35903k = new C7453x(8);

    /* renamed from: l */
    public static final /* synthetic */ C7453x f35904l = new C7453x(9);

    /* renamed from: m */
    public static final /* synthetic */ C7453x f35905m = new C7453x(10);

    /* renamed from: n */
    public static final /* synthetic */ C7453x f35906n = new C7453x(11);

    /* renamed from: p */
    public static final /* synthetic */ C7453x f35907p = new C7453x(12);

    /* renamed from: q */
    public static final /* synthetic */ C7453x f35908q = new C7453x(13);

    /* renamed from: r */
    public static final /* synthetic */ C7453x f35909r = new C7453x(14);

    /* renamed from: s */
    public static final /* synthetic */ C7453x f35910s = new C7453x(15);

    /* renamed from: t */
    public static final /* synthetic */ C7453x f35911t = new C7453x(16);

    /* renamed from: v */
    public static final /* synthetic */ C7453x f35912v = new C7453x(17);

    /* renamed from: w */
    public static final /* synthetic */ C7453x f35913w = new C7453x(18);

    /* renamed from: a */
    public final /* synthetic */ int f35914a;

    public /* synthetic */ C7453x(int i10) {
        this.f35914a = i10;
    }

    /* renamed from: d */
    public static C4132l m14183d(String empCode, boolean z6) {
        AbstractC4154l.m8923f(empCode, "empCode");
        if (z6 && AbstractC5178p.m10101L(empCode)) {
            return new C4132l(false, Integer.valueOf(R.string.enter_emp_code));
        }
        if (!AbstractC5178p.m10101L(empCode)) {
            if (empCode.length() > 20) {
                return new C4132l(false, Integer.valueOf(R.string.emp_code_not_more_then_20_char));
            }
            Pattern patternCompile = Pattern.compile("^[A-Za-z0-9$&+=?@#|'<>^*()%!:_`\\-\\s\\/\\\\]*$");
            AbstractC4154l.m8922e(patternCompile, "compile(...)");
            if (!patternCompile.matcher(empCode).matches()) {
                return new C4132l(false, Integer.valueOf(R.string.enter_valid_emp_code));
            }
        }
        return new C4132l();
    }

    @Override // wk.InterfaceC8101a
    /* renamed from: a */
    public Object mo14177a(C6860h c6860h) {
        return Integer.valueOf(c6860h.f32575O);
    }

    @Override // p020v.InterfaceC7595e
    /* renamed from: b */
    public CamcorderProfile mo14155b(int i10, int i11) {
        return CamcorderProfile.get(i10, i11);
    }

    @Override // p020v.InterfaceC7595e
    /* renamed from: c */
    public boolean mo14156c(int i10, int i11) {
        return CamcorderProfile.hasProfile(i10, i11);
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(p020v.x0 x0Var) {
        C0173a c0173a = new C0173a();
        RunnableC0183k runnableC0183k = new RunnableC0183k(0);
        ReferenceQueue referenceQueue = c0173a.f534a;
        Set set = c0173a.f535b;
        set.add(new C0184l(c0173a, referenceQueue, set, runnableC0183k));
        Thread thread = new Thread(new RunnableC4307g(1, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c0173a;
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        switch (this.f35914a) {
            case 0:
                List list = f0.f35406a;
                Boolean bool = (Boolean) m9.f6303a.m3530b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43875o0.m3530b()).longValue());
            case 2:
                List list3 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6139M.m3530b();
            case 3:
                List list4 = f0.f35406a;
                c7.f6100b.get();
                Long l9 = (Long) e7.f6138L.m3530b();
                l9.getClass();
                return l9;
            case 4:
                List list5 = f0.f35406a;
                c7.f6100b.get();
                Long l10 = (Long) e7.f6143Q.m3530b();
                l10.getClass();
                return l10;
            case 5:
                List list6 = f0.f35406a;
                c7.f6100b.get();
                Long l11 = (Long) e7.f6131E.m3530b();
                l11.getClass();
                return l11;
            case 6:
                List list7 = f0.f35406a;
                c7.f6100b.get();
                Long l12 = (Long) e7.f43867g0.m3530b();
                l12.getClass();
                return l12;
            case 7:
                List list8 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6167o.m3530b()).longValue());
            case 8:
                List list9 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6159g.m3530b();
            case 9:
                List list10 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6173u.m3530b()).longValue());
            case 10:
                List list11 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6176x.m3530b()).longValue());
            case 11:
                List list12 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6130D.m3530b();
            case 12:
                List list13 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6149W.m3530b()).longValue());
            case 13:
                List list14 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6128B.m3530b()).longValue());
            case 14:
                List list15 = f0.f35406a;
                Boolean bool2 = (Boolean) p9.f6346a.m3530b();
                bool2.getClass();
                return bool2;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list16 = f0.f35406a;
                Boolean bool3 = (Boolean) j9.f6261a.m3530b();
                bool3.getClass();
                return bool3;
            case 16:
                List list17 = f0.f35406a;
                p8.f6344b.get();
                Boolean bool4 = (Boolean) r8.f6363b.m3530b();
                bool4.getClass();
                return bool4;
            case 17:
                List list18 = f0.f35406a;
                Boolean bool5 = (Boolean) x8.f6450a.m3530b();
                bool5.getClass();
                return bool5;
            default:
                return new Boolean(((Boolean) g9.f6221a.m3530b()).booleanValue());
        }
    }
}

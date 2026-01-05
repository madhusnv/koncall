package ug;

import android.media.CamcorderProfile;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.y6;
import com.websoptimization.callyzerbiz.R;
import dy.InterfaceC1853a;
import java.util.List;
import java.util.regex.Pattern;
import kc.C4049d;
import kn.C4132l;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.iana.AEADAlgorithm;
import p020v.InterfaceC7595e;
import qi.C6234q;
import qi.InterfaceC6222e;
import qw.C6366p;
import vc.InterfaceC7700c;
import vc.InterfaceC7703f;
import zk.C8988b;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.v */
/* loaded from: classes.dex */
public final /* synthetic */ class C7451v implements InterfaceC7450u, InterfaceC7595e, InterfaceC7703f, InterfaceC6222e {

    /* renamed from: b */
    public static final /* synthetic */ C7451v f35839b = new C7451v(0);

    /* renamed from: c */
    public static final /* synthetic */ C7451v f35840c = new C7451v(1);

    /* renamed from: d */
    public static final /* synthetic */ C7451v f35841d = new C7451v(2);

    /* renamed from: e */
    public static final /* synthetic */ C7451v f35842e = new C7451v(3);

    /* renamed from: f */
    public static final /* synthetic */ C7451v f35843f = new C7451v(4);

    /* renamed from: g */
    public static final /* synthetic */ C7451v f35844g = new C7451v(5);

    /* renamed from: h */
    public static final /* synthetic */ C7451v f35845h = new C7451v(6);

    /* renamed from: j */
    public static final /* synthetic */ C7451v f35846j = new C7451v(7);

    /* renamed from: k */
    public static final /* synthetic */ C7451v f35847k = new C7451v(8);

    /* renamed from: l */
    public static final /* synthetic */ C7451v f35848l = new C7451v(9);

    /* renamed from: m */
    public static final /* synthetic */ C7451v f35849m = new C7451v(10);

    /* renamed from: n */
    public static final /* synthetic */ C7451v f35850n = new C7451v(11);

    /* renamed from: p */
    public static final /* synthetic */ C7451v f35851p = new C7451v(12);

    /* renamed from: q */
    public static final /* synthetic */ C7451v f35852q = new C7451v(13);

    /* renamed from: r */
    public static final /* synthetic */ C7451v f35853r = new C7451v(14);

    /* renamed from: s */
    public static final /* synthetic */ C7451v f35854s = new C7451v(15);

    /* renamed from: t */
    public static final /* synthetic */ C7451v f35855t = new C7451v(16);

    /* renamed from: v */
    public static final /* synthetic */ C7451v f35856v = new C7451v(17);

    /* renamed from: w */
    public static final /* synthetic */ C7451v f35857w = new C7451v(18);

    /* renamed from: a */
    public final /* synthetic */ int f35858a;

    public /* synthetic */ C7451v(int i10) {
        this.f35858a = i10;
    }

    /* renamed from: a */
    public static final InterfaceC1853a m14153a() {
        C6366p c6366p = xm.x1.f40986k;
        return (InterfaceC1853a) xm.x1.f40986k.getValue();
    }

    /* renamed from: d */
    public static C4132l m14154d(String str) {
        int length = str.length();
        if (length < 0 || length >= 5) {
            return new C4132l(false, Integer.valueOf(R.string.enter_valid_country_code));
        }
        Pattern patternCompile = Pattern.compile("^([1-9](\\d{1,3})?)$");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        return patternCompile.matcher(str).matches() ? new C4132l() : new C4132l(false, Integer.valueOf(R.string.remove_plus_symbol));
    }

    @Override // vc.InterfaceC7703f
    /* renamed from: S */
    public InterfaceC7700c mo1857S(String it) {
        AbstractC4154l.m8923f(it, "it");
        return C4049d.f20892a;
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
        return new C8989c(x0Var.mo12239f(C6234q.m12250a(C8988b.class)));
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        switch (this.f35858a) {
            case 0:
                List list = f0.f35406a;
                c7.f6100b.get();
                Long l9 = (Long) e7.f6154b.m3530b();
                l9.getClass();
                return l9;
            case 1:
                List list2 = f0.f35406a;
                Boolean bool = (Boolean) b7.f6089a.m3530b();
                bool.getClass();
                return bool;
            case 2:
                List list3 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f43881u0.m3530b();
            case 3:
                List list4 = f0.f35406a;
                c7.f6100b.get();
                Long l10 = (Long) e7.f6147U.m3530b();
                l10.getClass();
                return l10;
            case 4:
                List list5 = f0.f35406a;
                c7.f6100b.get();
                Long l11 = (Long) e7.f6145S.m3530b();
                l11.getClass();
                return l11;
            case 5:
                List list6 = f0.f35406a;
                c7.f6100b.get();
                Long l12 = (Long) e7.f43882v0.m3530b();
                l12.getClass();
                return l12;
            case 6:
                List list7 = f0.f35406a;
                c7.f6100b.get();
                Long l13 = (Long) e7.f6148V.m3530b();
                l13.getClass();
                return l13;
            case 7:
                List list8 = f0.f35406a;
                c7.f6100b.get();
                Long l14 = (Long) e7.f43876p0.m3530b();
                l14.getClass();
                return l14;
            case 8:
                List list9 = f0.f35406a;
                m8.f6301b.get();
                Boolean bool2 = (Boolean) o8.f6332a.m3530b();
                bool2.getClass();
                return bool2;
            case 9:
                List list10 = f0.f35406a;
                m8.f6301b.get();
                Double d2 = (Double) o8.f6334c.m3530b();
                d2.getClass();
                return d2;
            case 10:
                List list11 = f0.f35406a;
                c7.f6100b.get();
                Long l15 = (Long) e7.f43865e0.m3530b();
                l15.getClass();
                return l15;
            case 11:
                List list12 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f43861a0.m3530b();
            case 12:
                List list13 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43878r0.m3530b()).longValue());
            case 13:
                List list14 = f0.f35406a;
                c7.f6100b.get();
                Boolean bool3 = (Boolean) e7.f6155c.m3530b();
                bool3.getClass();
                return bool3;
            case 14:
                List list15 = f0.f35406a;
                Boolean bool4 = (Boolean) w7.f6438c.m3530b();
                bool4.getClass();
                return bool4;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list16 = f0.f35406a;
                Boolean bool5 = (Boolean) t7.f6396b.m3530b();
                bool5.getClass();
                return bool5;
            case 16:
                List list17 = f0.f35406a;
                p8.f6344b.get();
                Boolean bool6 = (Boolean) r8.f6369h.m3530b();
                bool6.getClass();
                return bool6;
            case 17:
                List list18 = f0.f35406a;
                Boolean bool7 = (Boolean) y6.f6458a.m3530b();
                bool7.getClass();
                return bool7;
            default:
                return new Boolean(((Boolean) i8.f6245a.m3530b()).booleanValue());
        }
    }
}

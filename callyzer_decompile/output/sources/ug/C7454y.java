package ug;

import al.C0174b;
import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import b00.C0529n;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s9;
import com.google.android.gms.internal.measurement.w7;
import com.websoptimization.callyzerbiz.R;
import java.util.List;
import kn.C4132l;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import nx.AbstractC5163a;
import nx.AbstractC5178p;
import org.bouncycastle.iana.AEADAlgorithm;
import qi.InterfaceC6222e;
import ui.InterfaceC7470a;
import wz.C8230a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.y */
/* loaded from: classes.dex */
public final /* synthetic */ class C7454y implements InterfaceC7450u, InterfaceC7470a, InterfaceC6222e {

    /* renamed from: b */
    public static final /* synthetic */ C7454y f35931b = new C7454y(0);

    /* renamed from: c */
    public static final /* synthetic */ C7454y f35932c = new C7454y(1);

    /* renamed from: d */
    public static final /* synthetic */ C7454y f35933d = new C7454y(2);

    /* renamed from: e */
    public static final /* synthetic */ C7454y f35934e = new C7454y(3);

    /* renamed from: f */
    public static final /* synthetic */ C7454y f35935f = new C7454y(4);

    /* renamed from: g */
    public static final /* synthetic */ C7454y f35936g = new C7454y(5);

    /* renamed from: h */
    public static final /* synthetic */ C7454y f35937h = new C7454y(6);

    /* renamed from: j */
    public static final /* synthetic */ C7454y f35938j = new C7454y(7);

    /* renamed from: k */
    public static final /* synthetic */ C7454y f35939k = new C7454y(8);

    /* renamed from: l */
    public static final /* synthetic */ C7454y f35940l = new C7454y(9);

    /* renamed from: m */
    public static final /* synthetic */ C7454y f35941m = new C7454y(10);

    /* renamed from: n */
    public static final /* synthetic */ C7454y f35942n = new C7454y(11);

    /* renamed from: p */
    public static final /* synthetic */ C7454y f35943p = new C7454y(12);

    /* renamed from: q */
    public static final /* synthetic */ C7454y f35944q = new C7454y(13);

    /* renamed from: r */
    public static final /* synthetic */ C7454y f35945r = new C7454y(14);

    /* renamed from: s */
    public static final /* synthetic */ C7454y f35946s = new C7454y(15);

    /* renamed from: t */
    public static final /* synthetic */ C7454y f35947t = new C7454y(16);

    /* renamed from: v */
    public static final /* synthetic */ C7454y f35948v = new C7454y(17);

    /* renamed from: a */
    public final /* synthetic */ int f35949a;

    public /* synthetic */ C7454y(int i10) {
        this.f35949a = i10;
    }

    /* renamed from: a */
    public static final String m14189a(C0529n c0529n, C0529n[] c0529nArr, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        C0529n c0529n2 = C8230a.f39366b;
        int iMo1563d = c0529n.mo1563d();
        int i14 = 0;
        while (i14 < iMo1563d) {
            int i15 = (i14 + iMo1563d) / 2;
            while (i15 > -1 && c0529n.mo1567i(i15) != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (c0529n.mo1567i(i11) == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z10 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z10) {
                    i12 = 46;
                    z6 = false;
                } else {
                    byte bMo1567i = c0529nArr[i19].mo1567i(i20);
                    byte[] bArr = AbstractC4297c.f21703a;
                    int i22 = bMo1567i & 255;
                    z6 = z10;
                    i12 = i22;
                }
                byte bMo1567i2 = c0529n.mo1567i(i16 + i21);
                byte[] bArr2 = AbstractC4297c.f21703a;
                i13 = i12 - (bMo1567i2 & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (c0529nArr[i19].mo1563d() != i20) {
                    z10 = z6;
                } else {
                    if (i19 == c0529nArr.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z10 = true;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int iMo1563d2 = c0529nArr[i19].mo1563d() - i20;
                    int length = c0529nArr.length;
                    for (int i24 = i19 + 1; i24 < length; i24++) {
                        iMo1563d2 += c0529nArr[i24].mo1563d();
                    }
                    if (iMo1563d2 >= i23) {
                        if (iMo1563d2 <= i23) {
                            return c0529n.mo1572o(i16, i18 + i16).mo1571n(AbstractC5163a.f25245a);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            iMo1563d = i15;
        }
        return null;
    }

    /* renamed from: b */
    public static C4132l m14190b(String name) {
        AbstractC4154l.m8923f(name, "name");
        return AbstractC5178p.m10101L(name) ? new C4132l(false, Integer.valueOf(R.string.enter_your_name)) : name.length() > 50 ? new C4132l(false, Integer.valueOf(R.string.name_less_than_50_char)) : new C4132l();
    }

    /* renamed from: c */
    public static C4132l m14191c(String name) {
        AbstractC4154l.m8923f(name, "name");
        return name.length() > 250 ? new C4132l(false, Integer.valueOf(R.string.name_less_than_250_char)) : new C4132l();
    }

    /* renamed from: d */
    public static C4132l m14192d(String name) {
        AbstractC4154l.m8923f(name, "name");
        return AbstractC5178p.m10101L(name) ? new C4132l(false, Integer.valueOf(R.string.lead_common_msg_field_required)) : name.length() > 250 ? new C4132l(false, Integer.valueOf(R.string.name_less_than_250_char)) : new C4132l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m14193e(v6.C7676b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7454y.m14193e(v6.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // qi.InterfaceC6222e
    /* renamed from: h */
    public Object mo21h(p020v.x0 x0Var) {
        return new C0174b(0);
    }

    @Override // ui.InterfaceC7470a
    /* renamed from: l */
    public void mo9084l(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        switch (this.f35949a) {
            case 0:
                List list = f0.f35406a;
                Boolean bool = (Boolean) a9.f6066a.m3530b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43871k0.m3530b()).longValue());
            case 2:
                List list3 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6140N.m3530b();
            case 3:
                List list4 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6137K.m3530b()).longValue());
            case 4:
                List list5 = f0.f35406a;
                c7.f6100b.get();
                Long l9 = (Long) e7.f6135I.m3530b();
                l9.getClass();
                return l9;
            case 5:
                List list6 = f0.f35406a;
                c7.f6100b.get();
                Long l10 = (Long) e7.f6161i.m3530b();
                l10.getClass();
                return l10;
            case 6:
                List list7 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f6160h.m3530b();
            case 7:
                List list8 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6172t.m3530b()).longValue());
            case 8:
                List list9 = f0.f35406a;
                m8.f6301b.get();
                Long l11 = (Long) o8.f6336e.m3530b();
                l11.getClass();
                return l11;
            case 9:
                List list10 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6169q.m3530b()).longValue());
            case 10:
                List list11 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6168p.m3530b()).longValue());
            case 11:
                List list12 = f0.f35406a;
                c7.f6100b.get();
                return (String) e7.f43883w0.m3530b();
            case 12:
                List list13 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f6150X.m3530b()).longValue());
            case 13:
                List list14 = f0.f35406a;
                Boolean bool2 = (Boolean) w7.f6437b.m3530b();
                bool2.getClass();
                return bool2;
            case 14:
                List list15 = f0.f35406a;
                Boolean bool3 = (Boolean) s9.f6375a.m3530b();
                bool3.getClass();
                return bool3;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                List list16 = f0.f35406a;
                p8.f6344b.get();
                Boolean bool4 = (Boolean) r8.f6367f.m3530b();
                bool4.getClass();
                return bool4;
            case 16:
                List list17 = f0.f35406a;
                p8.f6344b.get();
                Boolean bool5 = (Boolean) r8.f6366e.m3530b();
                bool5.getClass();
                return bool5;
            default:
                List list18 = f0.f35406a;
                c7.f6100b.get();
                return Integer.valueOf((int) ((Long) e7.f43874n0.m3530b()).longValue());
        }
    }

    public C7454y(RecyclerView recyclerView) {
        this.f35949a = 24;
    }
}

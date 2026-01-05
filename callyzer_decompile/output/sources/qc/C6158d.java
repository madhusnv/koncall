package qc;

import a2.AbstractC0030c;
import a9.C0073l;
import ai.AbstractC0152i;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import bc.C0642a;
import c9.C0913h;
import c9.C0925t;
import cs.C1491j;
import d9.AbstractC1659d;
import d9.AbstractC1665j;
import ex.InterfaceC2137a;
import ge.C2577i;
import ic.InterfaceC3227e;
import io.C3328c;
import iu.AbstractC3353e;
import iu.C3351c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC4154l;
import ks.c0;
import kx.C4266h;
import m8.C4680j;
import org.bouncycastle.iana.AEADAlgorithm;
import ox.C5770a;
import p004e.AbstractActivityC1878m;
import pg.w9;
import qw.C6366p;
import qw.C6376z;
import qz.C6398p;
import qz.EnumC6384b;
import rw.AbstractC6662l;
import ss.C6913b;
import t8.C7056b;
import tb.C7099j;
import te.C7145b;
import te.C7146c;
import u8.AbstractC7360h;
import u8.C7365m;
import u8.C7368p;
import uo.C7485j;
import ut.C7538b;
import ut.C7546j;
import wo.C8134s;
import x8.AbstractC8312a;
import x8.C8315d;
import xd.C8339j;
import yd.C8621d;
import yv.C8802q;
import yv.C8803r;
import zc.C8931h;
import zc.C8933j;
import zc.C8934k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C6158d implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f30015a;

    /* renamed from: b */
    public final /* synthetic */ Object f30016b;

    public /* synthetic */ C6158d(int i10, Object obj) {
        this.f30015a = i10;
        this.f30016b = obj;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        C8931h c8931h;
        String string;
        int i10 = this.f30015a;
        int i11 = 0;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj = this.f30016b;
        switch (i10) {
            case 0:
                return "Calculating checksum during transmission using: " + kotlin.jvm.internal.a0.m8901a(((InterfaceC3227e) obj).getClass()).m8914c();
            case 1:
                ((C6913b) obj).f33408i.invoke();
                return a0Var;
            case 2:
                C6398p c6398p = (C6398p) obj;
                c6398p.getClass();
                try {
                    c6398p.f30842B.m12418z(2, 0, false);
                } catch (IOException e2) {
                    EnumC6384b enumC6384b = EnumC6384b.PROTOCOL_ERROR;
                    c6398p.m12388h(enumC6384b, enumC6384b, e2);
                }
                return a0Var;
            case 3:
                return AbstractC4154l.m8925h((Object[]) obj);
            case 4:
                return "resolved endpoint: " + ((C0642a) obj);
            case 5:
                return "Canonical request:\n" + ((C7099j) obj).f34268b;
            case 6:
                return new C7145b((C7146c) obj);
            case 7:
                C7365m c7365m = (C7365m) obj;
                int i12 = AbstractC1659d.f8173a;
                C7368p c7368p = c7365m.f35029b;
                if (C7365m.m13780d(c7365m, new HashSet())) {
                    throw new IllegalStateException("WorkContinuation has cycles (" + c7365m + ")");
                }
                WorkDatabase workDatabase = c7368p.f35045c;
                C7056b c7056b = c7368p.f35044b;
                workDatabase.m16389c();
                try {
                    AbstractC1665j.m5377b(workDatabase, c7056b, c7365m);
                    boolean zM5371a = AbstractC1659d.m5371a(c7365m);
                    workDatabase.m16399v();
                    if (zM5371a) {
                        AbstractC7360h.m13779b(c7056b, c7368p.f35045c, c7368p.f35047e);
                    }
                    return a0Var;
                } finally {
                    workDatabase.m16395r();
                }
            case 8:
                C7368p c7368p2 = (C7368p) obj;
                WorkDatabase workDatabase2 = c7368p2.f35045c;
                int i13 = Build.VERSION.SDK_INT;
                Context context = c7368p2.f35043a;
                int i14 = C8315d.f39866f;
                if (i13 >= 34) {
                    AbstractC8312a.m15510a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListM15513b = C8315d.m15513b(context, jobScheduler);
                if (arrayListM15513b != null && !arrayListM15513b.isEmpty()) {
                    int size = arrayListM15513b.size();
                    while (i11 < size) {
                        Object obj2 = arrayListM15513b.get(i11);
                        i11++;
                        C8315d.m15512a(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                C0925t c0925tMo1368C = workDatabase2.mo1368C();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0925tMo1368C.f5651a;
                workDatabase_Impl.m16388b();
                C0913h c0913h = (C0913h) c0925tMo1368C.f5663m;
                C4680j c4680jM347a = c0913h.m347a();
                try {
                    workDatabase_Impl.m16389c();
                    try {
                        c4680jM347a.m9573h();
                        workDatabase_Impl.m16399v();
                        c0913h.m355i(c4680jM347a);
                        AbstractC7360h.m13779b(c7368p2.f35044b, workDatabase2, c7368p2.f35047e);
                        return a0Var;
                    } finally {
                        workDatabase_Impl.m16395r();
                    }
                } catch (Throwable th2) {
                    c0913h.m355i(c4680jM347a);
                    throw th2;
                }
            case 9:
                return obj;
            case 10:
                return ((TelephonyManager) ((C3328c) obj).f17616h).getNetworkCountryIso();
            case 11:
                ((C7546j) obj).m14299e(C7538b.f36298a);
                return a0Var;
            case 12:
                return "applying clock skew " + ((C5770a) obj) + " to client";
            case 13:
                C7485j c7485j = (C7485j) ((C0073l) obj).f267d;
                c7485j.m14286c(c7485j.f36145d);
                return a0Var;
            case 14:
                ((c0) obj).m8957r(C1491j.f7572a);
                return a0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String str = ((C8134s) obj).f38962n;
                return str == null ? "SyncCallLogUseCase" : str;
            case 16:
                return (C2577i) ((C8339j) obj).f39950v.getValue();
            case 17:
                ((AbstractActivityC1878m) obj).finish();
                return a0Var;
            case 18:
                return C8621d.m15959a((C8621d) obj);
            case 19:
                return new C8802q((C8803r) obj);
            case 20:
                return ((Callable) obj).call();
            case 21:
                return ((AbstractC0152i) obj).m348b();
            case 22:
                C8934k c8934k = (C8934k) obj;
                C6366p c6366p = c8934k.f42906c;
                byte[] bArr = c8934k.f42904a;
                String str2 = c8934k.f42905b;
                byte[] bArr2 = C8934k.f42903g;
                int length = bArr2.length;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (i15 < length) {
                        int i17 = i16 + 1;
                        if (bArr[i16] != bArr2[i15]) {
                            c8931h = null;
                        } else {
                            i15++;
                            i16 = i17;
                        }
                    } else {
                        c8931h = new C8931h(AbstractC6662l.m12707J(bArr, w9.m11919j(bArr2.length, bArr.length)));
                    }
                }
                if (c8934k.equals(C8934k.f42901e)) {
                    string = "::1";
                } else if (c8934k.equals(C8934k.f42902f)) {
                    string = "::";
                } else if (c8931h != null) {
                    string = "::ffff:" + c8931h;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    C8933j c8933j = new C8933j();
                    C8933j c8933j2 = new C8933j();
                    short[] sArr = ((C6376z) c6366p.getValue()).f30776a;
                    int length2 = sArr.length;
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < length2) {
                        int i20 = i19 + 1;
                        if (sArr[i18] == ((short) 0)) {
                            int i21 = c8933j.f42900b;
                            if (i21 == 0) {
                                c8933j.f42899a = i19;
                            }
                            int i22 = i21 + 1;
                            c8933j.f42900b = i22;
                            if (i22 > c8933j2.f42900b) {
                                c8933j2 = c8933j;
                            }
                        } else {
                            c8933j = new C8933j();
                        }
                        i18++;
                        i19 = i20;
                    }
                    if (c8933j2.f42900b > 1) {
                        c8934k.m16408d(sb2, w9.m11919j(0, c8933j2.f42899a));
                        sb2.append("::");
                        c8934k.m16408d(sb2, w9.m11919j(c8933j2.f42899a + c8933j2.f42900b, ((C6376z) c6366p.getValue()).f30776a.length));
                    } else {
                        c8934k.m16408d(sb2, new C4266h(0, ((C6376z) c6366p.getValue()).f30776a.length - 1, 1));
                    }
                    string = sb2.toString();
                }
                return str2 != null ? AbstractC0030c.m115f('%', string, str2) : string;
            default:
                return Float.valueOf(((C3351c) ((AbstractC3353e) obj)).f17734b / 100.0f);
        }
    }
}

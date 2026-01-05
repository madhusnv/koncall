package bt;

import an.w1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.widget.Toast;
import androidx.datastore.preferences.protobuf.o1;
import androidx.work.impl.foreground.SystemForegroundService;
import as.C0428a;
import b9.C0629a;
import c6.AbstractC0880j;
import c9.C0915j;
import c9.C0922q;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignInOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.websoptimization.callyzerbiz.R;
import ct.C1502a;
import cv.C1528x;
import d9.AbstractC1670o;
import d9.C1673r;
import dt.C1804j;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.h4;
import g2.v4;
import h1.C2772c;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jp.C3827h;
import jt.C3856e;
import k2.b1;
import k2.h2;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4798i;
import mw.InterfaceC4893a;
import og.ja;
import or.C5442e;
import org.bouncycastle.iana.AEADAlgorithm;
import p005f.C2162k;
import pg.AbstractC5926g;
import pg.AbstractC5937r;
import pg.d9;
import pg.f9;
import pg.y8;
import pp.C5995k;
import qv.C6334i;
import qw.C6361k;
import r5.AbstractC6466a;
import t8.C7069o;
import t8.C7077w;
import tx.InterfaceC7266z;
import u8.C7356d;
import u8.C7378z;
import uq.C7499e;
import ur.AbstractC7524q;
import ur.C7508a;
import ur.C7511d;
import uw.InterfaceC7559c;
import vt.C7785p;
import wq.C8142a;
import ws.C8169j;
import ws.C8176q;
import xt.C8455f;
import yq.C8741f;
import yr.C8766y;
import yt.C8774f;
import yv.C8800o;
import zr.C9031a;
import zs.C9041f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0765j implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4852a;

    /* renamed from: b */
    public final /* synthetic */ Object f4853b;

    /* renamed from: c */
    public final /* synthetic */ Object f4854c;

    /* renamed from: d */
    public final /* synthetic */ Object f4855d;

    /* renamed from: e */
    public final /* synthetic */ Object f4856e;

    public /* synthetic */ C0765j(AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, String str2) {
        this.f4852a = 1;
        this.f4854c = aWSCognitoAuthSignInOptions;
        this.f4855d = realAWSCognitoAuthPlugin;
        this.f4853b = str;
        this.f4856e = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [j$.time.LocalDate] */
    @Override // ex.InterfaceC2137a
    public final Object invoke() throws Throwable {
        LocalDate localDateM16180D;
        int i10 = 26;
        boolean z6 = true;
        InterfaceC7559c interfaceC7559cM16180D = null;
        LocalDate localDateM16180D2 = null;
        switch (this.f4852a) {
            case 0:
                String str = (String) this.f4853b;
                C1502a c1502a = (C1502a) this.f4854c;
                C1804j c1804j = (C1804j) this.f4855d;
                k2.w0 w0Var = (k2.w0) this.f4856e;
                c1804j.m5477h(new C9041f("create_call_note_templates/" + str + "/" + c1502a.f7591d));
                w0Var.setValue(Boolean.FALSE);
                return qw.a0.f30746a;
            case 1:
                return RealAWSCognitoAuthPlugin._signIn$lambda$6((AWSCognitoAuthSignInOptions) this.f4854c, (RealAWSCognitoAuthPlugin) this.f4855d, (String) this.f4853b, (String) this.f4856e);
            case 2:
                return RealAWSCognitoAuthPlugin._signInWithHostedUI$lambda$16((Activity) this.f4853b, (AuthProvider) this.f4854c, (AuthWebUISignInOptions) this.f4855d, (RealAWSCognitoAuthPlugin) this.f4856e);
            case 3:
                C1673r c1673r = (C1673r) this.f4853b;
                UUID uuid = (UUID) this.f4854c;
                C7069o c7069o = (C7069o) this.f4855d;
                Context context = (Context) this.f4856e;
                String string = uuid.toString();
                C0922q c0922qM2685n = c1673r.f8205c.m2685n(string);
                if (c0922qM2685n == null || c0922qM2685n.f5623b.isFinished()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                C7356d c7356d = c1673r.f8204b;
                synchronized (c7356d.f35013k) {
                    try {
                        C7077w.m13371a().getClass();
                        C7378z c7378z = (C7378z) c7356d.f35009g.remove(string);
                        if (c7378z != null) {
                            if (c7356d.f35003a == null) {
                                PowerManager.WakeLock wakeLockM5381a = AbstractC1670o.m5381a(c7356d.f35004b, "ProcessorForegroundLck");
                                c7356d.f35003a = wakeLockM5381a;
                                wakeLockM5381a.acquire();
                            }
                            c7356d.f35008f.put(string, c7378z);
                            Intent intentM1787c = C0629a.m1787c(c7356d.f35004b, ja.m10706a(c7378z.f35066a), c7069o);
                            Context context2 = c7356d.f35004b;
                            if (Build.VERSION.SDK_INT >= 26) {
                                AbstractC6466a.m12448c(context2, intentM1787c);
                            } else {
                                context2.startService(intentM1787c);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C0915j c0915jM10706a = ja.m10706a(c0922qM2685n);
                int i11 = C0629a.f4090k;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", c7069o.f34164a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c7069o.f34165b);
                intent.putExtra("KEY_NOTIFICATION", c7069o.f34166c);
                intent.putExtra("KEY_WORKSPEC_ID", c0915jM10706a.f5589a);
                intent.putExtra("KEY_GENERATION", c0915jM10706a.f5590b);
                context.startService(intent);
                return null;
            case 4:
                C2162k c2162k = (C2162k) this.f4853b;
                Context context3 = (Context) this.f4854c;
                C2162k c2162k2 = (C2162k) this.f4855d;
                C2162k c2162k3 = (C2162k) this.f4856e;
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 33) {
                    c2162k.mo1274a(AbstractC5926g.m11639a());
                } else if (i12 >= 30) {
                    AbstractC4154l.m8923f(context3, "context");
                    if (AbstractC0880j.m2423g() || context3.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                        c2162k.mo1274a(AbstractC5926g.m11639a());
                    } else {
                        c2162k2.mo1274a(AbstractC5937r.m11838b());
                    }
                } else {
                    AbstractC4154l.m8923f(context3, "context");
                    if (i12 < 30 ? d9.m11588a(context3, "android.permission.READ_EXTERNAL_STORAGE") : true) {
                        c2162k2.mo1274a(AbstractC5937r.m11838b());
                    } else {
                        c2162k3.mo1274a("android.permission.READ_EXTERNAL_STORAGE");
                    }
                }
                return qw.a0.f30746a;
            case 5:
                return o1.m1029i((List) ((k2.w0) this.f4856e).getValue(), ((Number) ((C2772c) this.f4853b).m6775d()).floatValue(), (InterfaceC4893a) this.f4854c, (InterfaceC4893a) this.f4855d);
            case 6:
                C5995k c5995k = (C5995k) this.f4853b;
                k2.w0 w0Var2 = (k2.w0) this.f4856e;
                k2.w0 w0Var3 = (k2.w0) this.f4854c;
                k2.w0 w0Var4 = (k2.w0) this.f4855d;
                c5995k.m12029k(new C3827h((String) w0Var2.getValue(), (String) w0Var3.getValue()));
                w0Var4.setValue(Boolean.FALSE);
                return qw.a0.f30746a;
            case 7:
                AbstractC7524q abstractC7524q = (AbstractC7524q) this.f4853b;
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f4854c;
                k2.w0 w0Var5 = (k2.w0) this.f4856e;
                k2.w0 w0Var6 = (k2.w0) this.f4855d;
                if (((ur.i0) w0Var5.getValue()).f36226c == null && ((C5442e) w0Var6.getValue()) == null) {
                    abstractC7524q.mo2033e(C7508a.f36203a);
                    interfaceC2137a.invoke();
                } else {
                    abstractC7524q.mo2033e(new C7511d(null));
                    w0Var6.setValue(null);
                }
                return qw.a0.f30746a;
            case 8:
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f4853b;
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) this.f4854c;
                g2.ja jaVar = (g2.ja) this.f4855d;
                tx.c0.m13502y(interfaceC7266z, null, null, new C1528x(jaVar, interfaceC7559cM16180D, 8), 3).v0(new C6334i((int) (z6 ? 1 : 0), (Object) jaVar, this.f4856e));
                interfaceC2137a2.invoke();
                return qw.a0.f30746a;
            case 9:
                v4 v4Var = (v4) this.f4853b;
                Context context4 = (Context) this.f4854c;
                InterfaceC2137a interfaceC2137a3 = (InterfaceC2137a) this.f4855d;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f4856e;
                if (v4Var.m6331f() == null || v4Var.m6330e() != null) {
                    interfaceC2137a3.invoke();
                    Long lM6331f = v4Var.m6331f();
                    if (lM6331f != null) {
                        C8800o c8800o = C8800o.f42459a;
                        localDateM16180D = C8800o.m16180D(lM6331f.longValue());
                    } else {
                        localDateM16180D = null;
                    }
                    Long lM6330e = v4Var.m6330e();
                    if (lM6330e != null) {
                        C8800o c8800o2 = C8800o.f42459a;
                        interfaceC7559cM16180D = C8800o.m16180D(lM6330e.longValue());
                    }
                    interfaceC2141e.invoke(localDateM16180D, interfaceC7559cM16180D);
                } else {
                    y8.m11951f(context4, R.string.lead_common_msg_select_end_date);
                }
                return qw.a0.f30746a;
            case 10:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f4853b;
                C6361k c6361k = (C6361k) this.f4854c;
                h4 h4Var = (h4) this.f4855d;
                k2.w0 w0Var7 = (k2.w0) this.f4856e;
                Object obj = c6361k.f30755a;
                Long lM6170e = h4Var.m6170e();
                if (lM6170e != null) {
                    C8800o c8800o3 = C8800o.f42459a;
                    localDateM16180D2 = C8800o.m16180D(lM6170e.longValue());
                }
                interfaceC2139c.invoke(new C6361k(obj, localDateM16180D2));
                w0Var7.setValue(Boolean.valueOf(!((Boolean) w0Var7.getValue()).booleanValue()));
                return qw.a0.f30746a;
            case 11:
                InterfaceC7266z interfaceC7266z2 = (InterfaceC7266z) this.f4853b;
                g2.ja jaVar2 = (g2.ja) this.f4854c;
                tx.c0.m13502y(interfaceC7266z2, null, null, new C1528x(jaVar2, interfaceC7559cM16180D, 9), 3).v0(new w1(i10, jaVar2, (InterfaceC2137a) this.f4855d, (InterfaceC2137a) this.f4856e));
                return qw.a0.f30746a;
            case 12:
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) this.f4854c;
                String str2 = (String) this.f4853b;
                k2.w0 w0Var8 = (k2.w0) this.f4856e;
                k2.w0 w0Var9 = (k2.w0) this.f4855d;
                interfaceC2139c2.invoke(str2);
                w0Var8.setValue(Boolean.FALSE);
                w0Var9.setValue(str2);
                return qw.a0.f30746a;
            case 13:
                k2.w0 w0Var10 = (k2.w0) this.f4856e;
                InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) this.f4853b;
                k2.w0 w0Var11 = (k2.w0) this.f4854c;
                b1 b1Var = (b1) this.f4855d;
                w0Var10.setValue(Boolean.FALSE);
                interfaceC2141e2.invoke(w0Var11.getValue(), Integer.valueOf(b1Var.m8526f()));
                return qw.a0.f30746a;
            case 14:
                InterfaceC2141e interfaceC2141e3 = (InterfaceC2141e) this.f4853b;
                k2.w0 w0Var12 = (k2.w0) this.f4856e;
                k2.w0 w0Var13 = (k2.w0) this.f4854c;
                k2.w0 w0Var14 = (k2.w0) this.f4855d;
                interfaceC2141e3.invoke(w0Var12.getValue(), w0Var13.getValue());
                w0Var14.setValue(Boolean.FALSE);
                return qw.a0.f30746a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                InterfaceC2137a interfaceC2137a4 = (InterfaceC2137a) this.f4853b;
                InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) this.f4854c;
                C8176q c8176q = (C8176q) this.f4855d;
                k2.w0 w0Var15 = (k2.w0) this.f4856e;
                interfaceC2137a4.invoke();
                interfaceC2139c3.invoke(new C8169j(c8176q.f39099a));
                w0Var15.setValue(Boolean.FALSE);
                return qw.a0.f30746a;
            case 16:
                C9031a c9031a = (C9031a) this.f4853b;
                InterfaceC2139c interfaceC2139c4 = (InterfaceC2139c) this.f4854c;
                InterfaceC2137a interfaceC2137a5 = (InterfaceC2137a) this.f4855d;
                Context context5 = (Context) this.f4856e;
                List list = c9031a.f43487d;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((C0428a) it.next()).f3148b) {
                            interfaceC2139c4.invoke(C8766y.f42384a);
                            interfaceC2137a5.invoke();
                        }
                    }
                    Toast.makeText(context5, f9.m11628b(context5, R.string.please_add_at_least_one_employee), 1).show();
                } else {
                    Toast.makeText(context5, f9.m11628b(context5, R.string.please_add_at_least_one_employee), 1).show();
                }
                return qw.a0.f30746a;
            case 17:
                C8741f c8741f = (C8741f) this.f4853b;
                InterfaceC2137a interfaceC2137a6 = (InterfaceC2137a) this.f4854c;
                h2 h2Var = (h2) this.f4855d;
                k2.w0 w0Var16 = (k2.w0) this.f4856e;
                List list2 = ((C8142a) h2Var.getValue()).f38999e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!((List) w0Var16.getValue()).contains((C4798i) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                c8741f.m16121f(new C7499e(arrayList));
                interfaceC2137a6.invoke();
                return qw.a0.f30746a;
            default:
                k2.w0 w0Var17 = (k2.w0) this.f4856e;
                C8774f c8774f = (C8774f) this.f4853b;
                k2.w0 w0Var18 = (k2.w0) this.f4854c;
                k2.w0 w0Var19 = (k2.w0) this.f4855d;
                if (((Boolean) w0Var17.getValue()).booleanValue()) {
                    c8774f.m16129f(C7785p.f37449a);
                } else {
                    w0Var18.setValue(new C8455f(c8774f, 2));
                    w0Var19.setValue(Boolean.TRUE);
                }
                return qw.a0.f30746a;
        }
    }

    public /* synthetic */ C0765j(InterfaceC2139c interfaceC2139c, String str, k2.w0 w0Var, k2.w0 w0Var2) {
        this.f4852a = 12;
        this.f4854c = interfaceC2139c;
        this.f4853b = str;
        this.f4856e = w0Var;
        this.f4855d = w0Var2;
    }

    public /* synthetic */ C0765j(C2162k c2162k, Context context, C2162k c2162k2, C3856e c3856e, C2162k c2162k3) {
        this.f4852a = 4;
        this.f4853b = c2162k;
        this.f4854c = context;
        this.f4855d = c2162k2;
        this.f4856e = c2162k3;
    }

    public /* synthetic */ C0765j(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4852a = i10;
        this.f4853b = obj;
        this.f4854c = obj2;
        this.f4855d = obj3;
        this.f4856e = obj4;
    }

    public /* synthetic */ C0765j(Object obj, k2.w0 w0Var, k2.w0 w0Var2, k2.w0 w0Var3, int i10) {
        this.f4852a = i10;
        this.f4853b = obj;
        this.f4856e = w0Var;
        this.f4854c = w0Var2;
        this.f4855d = w0Var3;
    }

    public /* synthetic */ C0765j(k2.w0 w0Var, Object obj, k2.w0 w0Var2, k2.w0 w0Var3, int i10) {
        this.f4852a = i10;
        this.f4856e = w0Var;
        this.f4853b = obj;
        this.f4854c = w0Var2;
        this.f4855d = w0Var3;
    }

    public /* synthetic */ C0765j(AbstractC7524q abstractC7524q, InterfaceC2137a interfaceC2137a, k2.w0 w0Var, k2.w0 w0Var2) {
        this.f4852a = 7;
        this.f4853b = abstractC7524q;
        this.f4854c = interfaceC2137a;
        this.f4856e = w0Var;
        this.f4855d = w0Var2;
    }
}

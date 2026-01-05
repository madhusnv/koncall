package tb;

import ac.C0088a;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import android.widget.EditText;
import b0.C0512d;
import c9.C0915j;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.material.datepicker.RunnableC1342f;
import com.sun.mail.imap.IMAPStore;
import i00.C3107l;
import i00.C3119x;
import i00.InterfaceC3101f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import jc.C3734j;
import k4.C4001v;
import k8.InterfaceC4025b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import l0.InterfaceC4303c;
import l0.RunnableC4307g;
import l4.C4367l;
import nx.AbstractC5178p;
import of.C5352g;
import og.pe;
import og.vf;
import or.AbstractC5453p;
import or.C5440c;
import or.C5441d;
import or.C5442e;
import or.C5443f;
import or.C5444g;
import or.C5445h;
import or.C5446i;
import or.C5447j;
import or.C5448k;
import or.C5449l;
import or.C5450m;
import or.C5451n;
import or.C5452o;
import pg.oa;
import rf.ExecutorC6509n;
import rw.AbstractC6663m;
import sd.C6808b;
import sd.C6813g;
import sd.InterfaceC6811e;
import t8.C7062h;
import u8.C7361i;
import ub.C7392h;
import ug.C7439j;
import ug.g1;
import ui.InterfaceC7471b;
import v6.C7675a;
import v6.C7681g;
import vx.C7802d;
import vx.C7803e;
import vx.C7806h;
import wc.C7973g;
import wc.C7985s;
import wc.InterfaceC7989w;
import xm.j4;
import xm.y5;
import y5.C8559e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.p */
/* loaded from: classes.dex */
public final class C7105p implements InterfaceC3101f, InterfaceC7989w, InterfaceC4303c, InterfaceC4025b {

    /* renamed from: a */
    public final /* synthetic */ int f34289a;

    /* renamed from: b */
    public Object f34290b;

    /* renamed from: c */
    public Object f34291c;

    public /* synthetic */ C7105p(int i10, char c2) {
        this.f34289a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030f  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest m13377o(java.util.ArrayList r20) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.m13377o(java.util.ArrayList):com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest");
    }

    /* renamed from: v */
    public static ArrayList m13378v(List filterFieldType) {
        AbstractC4154l.m8923f(filterFieldType, "filterFieldType");
        ArrayList arrayListD0 = AbstractC6663m.d0(filterFieldType);
        int size = arrayListD0.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListD0.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            AbstractC5453p abstractC5453p = (AbstractC5453p) obj;
            if (abstractC5453p instanceof C5446i) {
                C5446i c5446i = (C5446i) abstractC5453p;
                arrayListD0.set(i10, c5446i.mo11158j(AbstractC5178p.g0(c5446i.f27415i).toString()));
            } else if (abstractC5453p instanceof C5444g) {
                C5444g c5444g = (C5444g) abstractC5453p;
                arrayListD0.set(i10, c5444g.mo11158j(AbstractC5178p.g0(c5444g.f27393e).toString()));
            } else if (abstractC5453p instanceof C5449l) {
                C5449l c5449l = (C5449l) abstractC5453p;
                arrayListD0.set(i10, c5449l.mo11158j(AbstractC5178p.g0(c5449l.f27446i).toString()));
            } else if (abstractC5453p instanceof C5451n) {
                C5451n c5451n = (C5451n) abstractC5453p;
                arrayListD0.set(i10, c5451n.mo11158j(AbstractC5178p.g0(c5451n.f27469g).toString()));
            } else if (abstractC5453p instanceof C5452o) {
                C5452o c5452o = (C5452o) abstractC5453p;
                arrayListD0.set(i10, c5452o.mo11158j(AbstractC5178p.g0(c5452o.f27481e).toString()));
            } else if (!(abstractC5453p instanceof C5440c) && !(abstractC5453p instanceof C5441d) && !(abstractC5453p instanceof C5442e) && !(abstractC5453p instanceof C5443f) && !(abstractC5453p instanceof C5445h) && !(abstractC5453p instanceof C5447j) && !(abstractC5453p instanceof C5450m) && !(abstractC5453p instanceof C5448k)) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = i12;
        }
        return arrayListD0;
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r6 == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
    
        if (r2.m15688d(r1, r4) == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cd -> B:24:0x008c). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13379a(im.EnumC3308j r18, ww.AbstractC8193c r19) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.m13379a(im.j, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public boolean m13380b(C0915j c0915j) {
        boolean zContainsKey;
        synchronized (this.f34291c) {
            zContainsKey = ((C7062h) this.f34290b).f34155a.containsKey(c0915j);
        }
        return zContainsKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13381c(java.util.List r11, ur.AbstractC7524q r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.m13381c(java.util.List, ur.q, ww.c):java.lang.Object");
    }

    @Override // wc.InterfaceC7989w
    public boolean cancel(Throwable th2) {
        switch (this.f34289a) {
            case 7:
                return ((C7973g) this.f34291c).f38361b.cancel(th2);
            default:
                return ((InterfaceC7989w) this.f34290b).cancel(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r33v0, types: [tb.p] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13382d(ur.AbstractC7524q r34, ww.AbstractC8193c r35) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.m13382d(ur.q, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13383e(java.util.List r19, ur.AbstractC7524q r20, ww.AbstractC8193c r21) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.m13383e(java.util.List, ur.q, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13384f(java.util.ArrayList r18, ur.AbstractC7524q r19, ww.AbstractC8193c r20) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.m13384f(java.util.ArrayList, ur.q, ww.c):java.lang.Object");
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        ((Surface) this.f34290b).release();
        ((SurfaceTexture) this.f34291c).release();
    }

    @Override // wc.InterfaceC7989w
    public int getAvailableForRead() {
        switch (this.f34289a) {
            case 7:
                return ((C7973g) this.f34291c).f38361b.getAvailableForRead();
            default:
                return ((InterfaceC7989w) this.f34290b).getAvailableForRead() + ((int) ((C7985s) ((C7392h) this.f34291c).f35156g).f38413a.f3638b);
        }
    }

    @Override // wc.InterfaceC7989w
    public Throwable getClosedCause() {
        switch (this.f34289a) {
            case 7:
                return ((C7973g) this.f34291c).f38361b.getClosedCause();
            default:
                return ((InterfaceC7989w) this.f34290b).getClosedCause();
        }
    }

    /* renamed from: h */
    public CctBackendFactory m13385h(String str) {
        Map map;
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        if (((Map) this.f34291c) == null) {
            Context context = (Context) this.f34290b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            Bundle bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
            if (bundle == null) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map2 = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map2.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                map = map2;
            }
            this.f34291c = map;
        }
        String str4 = (String) ((Map) this.f34291c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb2 = new StringBuilder("Class ");
            sb2.append(str4);
            sb2.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb4 = new StringBuilder("Could not instantiate ");
            sb4.append(str4);
            sb4.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    @Override // i00.InterfaceC3101f
    /* renamed from: i */
    public Object mo2663i(C3119x c3119x) {
        Executor executor = (Executor) this.f34291c;
        return executor == null ? c3119x : new C3107l(executor, c3119x);
    }

    @Override // wc.InterfaceC7989w
    public boolean isClosedForRead() {
        switch (this.f34289a) {
            case 7:
                return ((C7973g) this.f34291c).f38361b.isClosedForRead();
            default:
                C7392h c7392h = (C7392h) this.f34291c;
                return ((C7985s) c7392h.f35156g).f38413a.f3638b == 0 && c7392h.f35151b && ((InterfaceC7989w) this.f34290b).isClosedForRead();
        }
    }

    @Override // wc.InterfaceC7989w
    public boolean isClosedForWrite() {
        switch (this.f34289a) {
            case 7:
                return ((C7973g) this.f34291c).f38361b.isClosedForWrite();
            default:
                return ((InterfaceC7989w) this.f34290b).isClosedForWrite();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r10 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r10 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r10 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13386j(ur.AbstractC7524q r9, ww.AbstractC8193c r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f34290b
            nn.e r0 = (nn.C5113e) r0
            xm.z r0 = r0.f25030a
            boolean r1 = r10 instanceof go.C2688e
            if (r1 == 0) goto L19
            r1 = r10
            go.e r1 = (go.C2688e) r1
            int r2 = r1.f15022c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r1.f15022c = r2
            goto L1e
        L19:
            go.e r1 = new go.e
            r1.<init>(r8, r10)
        L1e:
            java.lang.Object r10 = r1.f15020a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f15022c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L43
            if (r3 == r6) goto L3f
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            og.od.m10798c(r10)
            goto L87
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            og.od.m10798c(r10)
            goto L75
        L3f:
            og.od.m10798c(r10)
            goto L5d
        L43:
            og.od.m10798c(r10)
            boolean r10 = r9 instanceof ks.c0
            java.lang.String r3 = "lead_filter"
            java.lang.Class<com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest> r7 = com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest.class
            if (r10 == 0) goto L60
            r1.f15022c = r6
            fn.i r9 = r0.f41069a
            km.a r9 = r9.f10585a
            km.o r9 = (km.C4120o) r9
            java.lang.Object r10 = r9.m8885g(r3, r7, r1)
            if (r10 != r2) goto L5d
            goto L86
        L5d:
            com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest r10 = (com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest) r10
            return r10
        L60:
            boolean r9 = r9 instanceof ks.q0
            if (r9 == 0) goto L78
            r1.f15022c = r5
            fn.i r9 = r0.f41069a
            km.a r9 = r9.f10585a
            java.lang.String r10 = "schedule_lead_filter"
            km.o r9 = (km.C4120o) r9
            java.lang.Object r10 = r9.m8885g(r10, r7, r1)
            if (r10 != r2) goto L75
            goto L86
        L75:
            com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest r10 = (com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest) r10
            return r10
        L78:
            r1.f15022c = r4
            fn.i r9 = r0.f41069a
            km.a r9 = r9.f10585a
            km.o r9 = (km.C4120o) r9
            java.lang.Object r10 = r9.m8885g(r3, r7, r1)
            if (r10 != r2) goto L87
        L86:
            return r2
        L87:
            com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest r10 = (com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.m13386j(ur.q, ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public void m13387k(Bundle bundle) {
        Locale locale = Locale.US;
        Objects.toString(bundle);
        Log.isLoggable("FirebaseCrashlytics", 2);
        String string = bundle.getString(IMAPStore.ID_NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC7471b interfaceC7471b = "clx".equals(bundle2.getString("_o")) ? (C7439j) this.f34290b : (g1) this.f34291c;
            if (interfaceC7471b == null) {
                return;
            }
            interfaceC7471b.onEvent(string, bundle2);
        }
    }

    @Override // i00.InterfaceC3101f
    /* renamed from: l */
    public Type mo2666l() {
        return (Type) this.f34290b;
    }

    /* renamed from: m */
    public void m13388m(C8559e c8559e) {
        ExecutorC6509n executorC6509n = (ExecutorC6509n) this.f34291c;
        l4.d0 d0Var = (l4.d0) this.f34290b;
        int i10 = c8559e.f41549b;
        if (i10 != 0) {
            executorC6509n.execute(new RunnableC1342f(d0Var, i10, 2));
        } else {
            executorC6509n.execute(new RunnableC4307g(25, d0Var, c8559e.f41548a));
        }
    }

    /* renamed from: n */
    public void m13389n(String encoded) {
        C6808b c6808b;
        AbstractC4154l.m8923f(encoded, "encoded");
        C0088a c0088a = new C0088a(1, C6813g.f32358h, InterfaceC6811e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 11);
        if (encoded.length() == 0) {
            C6808b c6808b2 = C6808b.f32347f;
            this.f34290b = c6808b2;
            this.f34291c = c6808b2;
            return;
        }
        List listM10112W = AbstractC5178p.m10112W(encoded, new String[]{":"}, 2);
        this.f34290b = (C6808b) c0088a.invoke(listM10112W.get(0));
        int size = listM10112W.size();
        if (size == 1) {
            c6808b = C6808b.f32347f;
        } else {
            if (size != 2) {
                throw new IllegalArgumentException("invalid user info string ".concat(encoded));
            }
            c6808b = (C6808b) c0088a.invoke(listM10112W.get(1));
        }
        this.f34291c = c6808b;
    }

    /* renamed from: p */
    public List m13390p(String workSpecId) {
        List listM13361d;
        AbstractC4154l.m8923f(workSpecId, "workSpecId");
        synchronized (this.f34291c) {
            listM13361d = ((C7062h) this.f34290b).m13361d(workSpecId);
        }
        return listM13361d;
    }

    /* renamed from: q */
    public C7361i m13391q(C0915j id2) {
        C7361i c7361iM13362e;
        AbstractC4154l.m8923f(id2, "id");
        synchronized (this.f34291c) {
            c7361iM13362e = ((C7062h) this.f34290b).m13362e(id2);
        }
        return c7361iM13362e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13392r(com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest r9, boolean r10, ur.AbstractC7524q r11, ww.AbstractC8193c r12) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f34290b
            nn.e r0 = (nn.C5113e) r0
            xm.z r0 = r0.f25030a
            boolean r1 = r12 instanceof go.C2689f
            if (r1 == 0) goto L19
            r1 = r12
            go.f r1 = (go.C2689f) r1
            int r2 = r1.f15026d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r1.f15026d = r2
            goto L1e
        L19:
            go.f r1 = new go.f
            r1.<init>(r8, r12)
        L1e:
            java.lang.Object r12 = r1.f15024b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f15026d
            r4 = 3
            r5 = 2
            r6 = 1
            qw.a0 r7 = qw.a0.f30746a
            if (r3 == 0) goto L43
            if (r3 == r6) goto L3d
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L35
            og.od.m10798c(r12)
            return r7
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            boolean r10 = r1.f15023a
            og.od.m10798c(r12)
            goto L8c
        L43:
            og.od.m10798c(r12)
            boolean r12 = r11 instanceof ks.c0
            if (r12 == 0) goto L69
            r1.f15023a = r10
            r1.f15026d = r6
            fn.i r11 = r0.f41069a
            km.a r11 = r11.f10585a
            java.lang.String r12 = "lead_filter"
            km.o r11 = (km.C4120o) r11
            java.lang.Object r9 = r11.m8890l(r12, r9, r1)
            if (r9 != r2) goto L5d
            goto L5e
        L5d:
            r9 = r7
        L5e:
            if (r9 != r2) goto L61
            goto L62
        L61:
            r9 = r7
        L62:
            if (r9 != r2) goto L65
            goto L66
        L65:
            r9 = r7
        L66:
            if (r9 != r2) goto L8c
            goto La2
        L69:
            boolean r11 = r11 instanceof ks.q0
            if (r11 == 0) goto L8c
            r1.f15023a = r10
            r1.f15026d = r5
            fn.i r11 = r0.f41069a
            km.a r11 = r11.f10585a
            java.lang.String r12 = "schedule_lead_filter"
            km.o r11 = (km.C4120o) r11
            java.lang.Object r9 = r11.m8890l(r12, r9, r1)
            if (r9 != r2) goto L80
            goto L81
        L80:
            r9 = r7
        L81:
            if (r9 != r2) goto L84
            goto L85
        L84:
            r9 = r7
        L85:
            if (r9 != r2) goto L88
            goto L89
        L88:
            r9 = r7
        L89:
            if (r9 != r2) goto L8c
            goto La2
        L8c:
            r1.f15023a = r10
            r1.f15026d = r4
            fn.i r9 = r0.f41069a
            java.lang.String r11 = "lead_not_connected_call"
            java.lang.Object r9 = r9.m6031k(r11, r10, r1)
            if (r9 != r2) goto L9b
            goto L9c
        L9b:
            r9 = r7
        L9c:
            if (r9 != r2) goto L9f
            goto La0
        L9f:
            r9 = r7
        La0:
            if (r9 != r2) goto La3
        La2:
            return r2
        La3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.m13392r(com.websoptimization.callyzerbiz.data.model.request.lead_request.LeadFilterRequest, boolean, ur.q, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // wc.InterfaceC7989w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object read(wc.C7985s r8, long r9, uw.InterfaceC7559c r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.read(wc.s, long, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0072, B:33:0x007d, B:32:0x0078, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0072, B:33:0x007d, B:32:0x0078, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    @Override // k8.InterfaceC4025b
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k8.InterfaceC4024a mo8823s(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.mo8823s(java.lang.String):k8.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13393t(tc.C7123h r11, tb.C7096g r12, ww.AbstractC8193c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C7105p.m13393t(tc.h, tb.g, ww.c):java.lang.Object");
    }

    /* renamed from: u */
    public C7361i m13394u(C0915j c0915j) {
        C7361i c7361iM13363f;
        synchronized (this.f34291c) {
            c7361iM13363f = ((C7062h) this.f34290b).m13363f(c0915j);
        }
        return c7361iM13363f;
    }

    public /* synthetic */ C7105p(int i10, Object obj, Object obj2) {
        this.f34289a = i10;
        this.f34290b = obj;
        this.f34291c = obj2;
    }

    public C7105p(IBinder iBinder) throws RemoteException {
        this.f34289a = 9;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f34290b = new Messenger(iBinder);
            this.f34291c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f34291c = new C5352g(iBinder);
            this.f34290b = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        }
    }

    public C7105p(C4367l c4367l) {
        this.f34289a = 10;
        this.f34291c = new vf();
        this.f34290b = c4367l;
        oa.m11812b();
    }

    public C7105p(y5 userSIMRepository, j4 j4Var) {
        this.f34289a = 15;
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f34290b = userSIMRepository;
        this.f34291c = j4Var;
    }

    public C7105p(InterfaceC7989w interfaceC7989w, C7105p signer, C7096g c7096g, byte[] bArr, C3734j c3734j) {
        this.f34289a = 13;
        AbstractC4154l.m8923f(signer, "signer");
        this.f34290b = interfaceC7989w;
        this.f34291c = new C7392h(new C4001v(26, interfaceC7989w), signer, c7096g, bArr, c3734j);
    }

    public C7105p(byte b10, int i10) {
        this.f34289a = i10;
        switch (i10) {
            case 4:
                this.f34290b = new LinkedHashMap();
                this.f34291c = new LinkedHashMap();
                break;
            default:
                InterfaceC7101l.T0.getClass();
                l4.d0 canonicalizer = C7100k.f34273b;
                AbstractC4154l.m8923f(canonicalizer, "canonicalizer");
                this.f34290b = canonicalizer;
                this.f34291c = h0.f34264a;
                break;
        }
    }

    public C7105p(C0512d c0512d, InterfaceC4025b actual) {
        this.f34289a = 22;
        AbstractC4154l.m8923f(actual, "actual");
        this.f34291c = c0512d;
        this.f34290b = actual;
    }

    public C7105p(C7062h c7062h) {
        this.f34289a = 14;
        this.f34290b = c7062h;
        this.f34291c = new Object();
    }

    public C7105p(Context context) {
        this.f34289a = 21;
        this.f34291c = null;
        this.f34290b = context;
    }

    public C7105p(int i10) {
        this.f34289a = 1;
        C6808b c6808b = C6808b.f32347f;
        this.f34290b = c6808b;
        this.f34291c = c6808b;
    }

    public C7105p(C7806h c7806h, bt.l0 l0Var) {
        this.f34289a = 2;
        C7802d c7802d = C7802d.f37476a;
        C7803e c7803e = C7803e.f37477a;
        this.f34290b = c7806h;
        this.f34291c = l0Var;
    }

    public C7105p(EditText editText) {
        this.f34289a = 17;
        this.f34290b = editText;
        C7681g c7681g = new C7681g(editText);
        this.f34291c = c7681g;
        editText.addTextChangedListener(c7681g);
        if (C7675a.f37159b == null) {
            synchronized (C7675a.f37158a) {
                try {
                    if (C7675a.f37159b == null) {
                        C7675a c7675a = new C7675a();
                        try {
                            C7675a.f37160c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C7675a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C7675a.f37159b = c7675a;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C7675a.f37159b);
    }
}

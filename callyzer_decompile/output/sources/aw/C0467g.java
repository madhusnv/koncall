package aw;

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import android.widget.Toast;
import androidx.datastore.preferences.protobuf.o1;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import aq.C0405h;
import at.C0433d;
import bm.C0692c;
import bv.C0784b;
import c9.C0907b;
import c9.C0918m;
import c9.C0919n;
import c9.C0922q;
import com.websoptimization.callyzerbiz.NotePopUpActivity;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import cs.C1490i;
import ct.C1502a;
import cv.C1528x;
import d9.C1674s;
import dt.C1804j;
import dt.C1818x;
import es.C2128e;
import et.C2134f;
import ev.C2136a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import fk.C2310p;
import fs.C2371b;
import g2.h4;
import g2.ja;
import gs.C2728n;
import im.p1;
import iz.C3368a;
import iz.C3373f;
import iz.C3388u;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import jp.C3824e;
import jt.C3856e;
import k2.h2;
import k2.w0;
import kn.C4121a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import ks.q0;
import mm.C4802m;
import mw.InterfaceC4893a;
import nx.AbstractC5178p;
import or.C5454q;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.c8;
import pg.c9;
import pp.C5995k;
import qw.C6361k;
import rw.AbstractC6674x;
import t8.C7064j;
import t8.C7077w;
import tr.C7205a;
import tr.C7211g;
import tx.InterfaceC7266z;
import u2.C7323t;
import u2.C7327x;
import up.C7494g;
import uq.C7501g;
import ur.C7512e;
import uw.InterfaceC7559c;
import wp.C8141g;
import wq.C8142a;
import ws.C8174o;
import wt.C8183a;
import yq.C8741f;
import yv.C8805t;
import zs.C9037b;
import zs.C9056u;
import zs.C9058w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0467g implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f3356a;

    /* renamed from: b */
    public final /* synthetic */ Object f3357b;

    /* renamed from: c */
    public final /* synthetic */ Object f3358c;

    /* renamed from: d */
    public final /* synthetic */ Object f3359d;

    public /* synthetic */ C0467g(int i10, Object obj, Object obj2, Object obj3) {
        this.f3356a = i10;
        this.f3357b = obj;
        this.f3358c = obj2;
        this.f3359d = obj3;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() throws IOException {
        int i10 = this.f3356a;
        InterfaceC7559c interfaceC7559c = null;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj = this.f3359d;
        Object obj2 = this.f3358c;
        Object obj3 = this.f3357b;
        switch (i10) {
            case 0:
                Context applicationContext = ((RecordingCompressManager) obj2).getApplicationContext();
                Uri uri = ((C4121a) ((C4168z) obj).f21164a).f21055b;
                AbstractC4154l.m8920c(uri);
                ((MediaExtractor) obj3).setDataSource(applicationContext, uri, new HashMap());
                return a0Var;
            case 1:
                Boolean bool = Boolean.FALSE;
                ((w0) obj3).setValue(bool);
                ((w0) obj2).setValue("");
                ((w0) obj).setValue(bool);
                return a0Var;
            case 2:
                ((C1804j) obj3).m5477h(new C9037b(((C1502a) obj2).f7589b));
                ((w0) obj).setValue(Boolean.FALSE);
                return a0Var;
            case 3:
                C1818x c1818x = (C1818x) obj3;
                c1818x.m5481f(new C9058w(((C0433d) obj2).f3197f.f7591d));
                c1818x.m5481f(new C9056u(false));
                ((l7.a0) obj).m9188g();
                return a0Var;
            case 4:
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) obj3;
                ((w0) obj2).setValue(Boolean.FALSE);
                if (((C2136a) ((h2) obj).getValue()).f9981m) {
                    interfaceC2137a.invoke();
                }
                return a0Var;
            case 5:
                C1674s c1674s = (C1674s) obj3;
                UUID uuid = (UUID) obj2;
                C7064j c7064j = (C7064j) obj;
                c1674s.getClass();
                String string = uuid.toString();
                C7077w c7077wM13371a = C7077w.m13371a();
                uuid.toString();
                Objects.toString(c7064j);
                c7077wM13371a.getClass();
                WorkDatabase workDatabase = c1674s.f8206a;
                workDatabase.m16389c();
                try {
                    C0922q c0922qM2685n = workDatabase.mo1368C().m2685n(string);
                    if (c0922qM2685n == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (c0922qM2685n.f5623b == t8.e0.RUNNING) {
                        C0918m c0918m = new C0918m(string, c7064j);
                        C0919n c0919nMo1367B = workDatabase.mo1367B();
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0919nMo1367B.f5598a;
                        workDatabase_Impl.m16388b();
                        workDatabase_Impl.m16389c();
                        try {
                            ((C0907b) c0919nMo1367B.f5599b).m2547l(c0918m);
                            workDatabase_Impl.m16399v();
                            workDatabase_Impl.m16395r();
                        } catch (Throwable th2) {
                            workDatabase_Impl.m16395r();
                            throw th2;
                        }
                    } else {
                        C7077w.m13371a().getClass();
                    }
                    workDatabase.m16399v();
                    return null;
                } finally {
                }
            case 6:
                ((C2728n) obj3).m6727e(C1490i.f7571a);
                C2128e c2128e = ((C2371b) obj).f10792f;
                AbstractC4154l.m8920c(c2128e);
                ((InterfaceC2139c) obj2).invoke(c9.m11573b(c2128e.f9949d + "," + c2128e.f9948c, c2128e.f9957l, 16, "lead_details_screen", false));
                return a0Var;
            case 7:
                C0784b c0784b = (C0784b) obj3;
                NotePopUpActivity notePopUpActivity = (NotePopUpActivity) obj2;
                w0 w0Var = (w0) obj;
                int i11 = NotePopUpActivity.f7268g;
                try {
                    c0784b.f4962b.m9337b(p1.NOTE_POPUP_CALL_DETAILS, null);
                    notePopUpActivity.m4590g();
                    notePopUpActivity.finishAndRemoveTask();
                    w0Var.setValue(Boolean.FALSE);
                } catch (Exception e2) {
                    C8805t c8805t = notePopUpActivity.f7274f;
                    if (c8805t == null) {
                        AbstractC4154l.m8928k("traceLogs");
                        throw null;
                    }
                    c8805t.m16240o(notePopUpActivity.f7273e, "Exception on Note popup close: >>>>>>", e2);
                }
                return a0Var;
            case 8:
                ((C3856e) obj3).m8402g(new C2134f((String) obj2));
                ((w0) obj).setValue(Boolean.FALSE);
                return a0Var;
            case 9:
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) obj3;
                w0 w0Var2 = (w0) obj;
                Long lM6170e = ((h4) obj2).m6170e();
                interfaceC2139c.invoke(Long.valueOf(lM6170e != null ? lM6170e.longValue() : -1L));
                w0Var2.setValue(Boolean.FALSE);
                return a0Var;
            case 10:
                ((w0) obj3).setValue(Boolean.FALSE);
                ((InterfaceC2139c) obj2).invoke((String) obj);
                return a0Var;
            case 11:
                ((InterfaceC2139c) obj3).invoke((C5454q) obj2);
                ((w0) obj).setValue(Boolean.FALSE);
                return a0Var;
            case 12:
                InterfaceC2139c interfaceC2139c2 = (InterfaceC2139c) obj3;
                C7323t c7323t = (C7323t) obj2;
                ((w0) ((C4168z) obj).f21164a).setValue(Boolean.TRUE);
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6674x.m12776d(c7323t.size()));
                Iterator it = c7323t.f34910b.iterator();
                while (((C7327x) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((C7327x) it).next();
                    linkedHashMap.put(AbstractC5178p.g0((String) entry.getKey()).toString(), entry.getValue());
                }
                interfaceC2139c2.invoke(linkedHashMap);
                return a0Var;
            case 13:
                return o1.m1029i((List) ((w0) obj).getValue(), 1.0f, (InterfaceC4893a) obj3, (InterfaceC4893a) obj2);
            case 14:
                c8 c8Var = ((C3373f) obj3).f17862b;
                AbstractC4154l.m8920c(c8Var);
                return c8Var.mo11571a(((C3368a) obj).f17780h.f17994d, ((C3388u) obj2).m7786a());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                w0 w0Var3 = (w0) obj2;
                ((C5995k) obj3).m12029k(new C3824e((String) w0Var3.getValue()));
                w0Var3.setValue("");
                ((w0) obj).setValue(Boolean.FALSE);
                return a0Var;
            case 16:
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj3;
                tx.c0.m13502y(interfaceC7266z, null, null, new C0405h(interfaceC7266z, obj2, obj, (InterfaceC7559c) null, 17), 3);
                return a0Var;
            case 17:
                InterfaceC2139c interfaceC2139c3 = (InterfaceC2139c) obj2;
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) obj;
                if (((String) obj3).length() == 0) {
                    interfaceC2139c3.invoke(C7205a.f34497a);
                    interfaceC2137a2.invoke();
                }
                return a0Var;
            case 18:
                ((w0) obj3).setValue(Boolean.valueOf(!((Boolean) r9.getValue()).booleanValue()));
                ((InterfaceC2139c) obj2).invoke(new C6361k(((C6361k) obj).f30755a, null));
                return a0Var;
            case 19:
                ((InterfaceC2139c) obj3).invoke(new C7211g((C5454q) obj2));
                ((InterfaceC2137a) obj).invoke();
                return a0Var;
            case 20:
                return tx.c0.m13502y((InterfaceC7266z) obj3, null, null, new C1528x((ja) obj2, interfaceC7559c, 12), 3).v0(new C0692c((w0) obj, 14));
            case 21:
                w0 w0Var4 = (w0) obj2;
                ((C7494g) obj3).mo2033e(new C7512e((String) w0Var4.getValue()));
                w0Var4.setValue("");
                ((w0) obj).setValue(Boolean.FALSE);
                return a0Var;
            case 22:
                w0 w0Var5 = (w0) obj2;
                ((C8141g) obj3).mo2033e(new C7512e((String) w0Var5.getValue()));
                w0Var5.setValue("");
                ((w0) obj).setValue(Boolean.FALSE);
                return a0Var;
            case 23:
                ((InterfaceC2139c) obj3).invoke((ks.c0) obj2);
                ((InterfaceC2139c) obj).invoke("filter_screen/lead");
                return a0Var;
            case 24:
                ((InterfaceC2139c) obj3).invoke((q0) obj2);
                ((InterfaceC2139c) obj).invoke("filter_screen/lead");
                return a0Var;
            case 25:
                ((w0) obj).setValue(Boolean.FALSE);
                ((InterfaceC2139c) obj3).invoke(new C8174o(((C4802m) obj2).f23891c));
                return a0Var;
            case 26:
                Context context = (Context) obj3;
                InterfaceC2137a interfaceC2137a3 = (InterfaceC2137a) obj2;
                if (((C8142a) ((h2) obj).getValue()).f38999e.size() < 2) {
                    Toast.makeText(context, context.getString(R.string.add_contacts_less_2_warning), 0).show();
                } else {
                    interfaceC2137a3.invoke();
                }
                return a0Var;
            case 27:
                ((C8741f) obj3).m16121f(new C7501g(new sq.p1(17, (InterfaceC2139c) obj2), new C2310p((Context) obj, 5)));
                return a0Var;
            default:
                ((w0) obj3).setValue(Boolean.FALSE);
                ((InterfaceC2139c) obj2).invoke(((C8183a) obj).f39142d);
                return a0Var;
        }
    }

    public /* synthetic */ C0467g(C4168z c4168z, InterfaceC2139c interfaceC2139c, C7323t c7323t) {
        this.f3356a = 12;
        this.f3359d = c4168z;
        this.f3357b = interfaceC2139c;
        this.f3358c = c7323t;
    }
}

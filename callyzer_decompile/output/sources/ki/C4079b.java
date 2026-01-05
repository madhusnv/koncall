package ki;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.l1;
import com.sun.mail.imap.IMAPStore;
import java.util.ArrayList;
import ni.C5072a;
import ni.C5074c;
import ni.InterfaceC5073b;
import oi.AbstractC5387a;
import qj.InterfaceC6237b;
import sf.AbstractC6840z;
import ug.z1;
import yh.AbstractC8662f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ki.b */
/* loaded from: classes.dex */
public final class C4079b {

    /* renamed from: a */
    public final InterfaceC6237b f20959a;

    /* renamed from: b */
    public Integer f20960b = null;

    public C4079b(InterfaceC6237b interfaceC6237b) {
        this.f20959a = interfaceC6237b;
    }

    /* renamed from: a */
    public static boolean m8847a(ArrayList arrayList, C4078a c4078a) {
        String str = c4078a.f20953a;
        String str2 = c4078a.f20954b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C4078a c4078a2 = (C4078a) obj;
            if (c4078a2.f20953a.equals(str) && c4078a2.f20954b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ArrayList m8848b() {
        C5074c c5074c = (C5074c) ((InterfaceC5073b) this.f20959a.get());
        c5074c.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((l1) c5074c.f24884a.f20704b).m3484f("frc", "")) {
            AbstractC8662f abstractC8662f = AbstractC5387a.f27061a;
            AbstractC6840z.m13036g(bundle);
            C5072a c5072a = new C5072a();
            String str = (String) z1.m14267e(bundle, "origin", String.class, null);
            AbstractC6840z.m13036g(str);
            c5072a.f24868a = str;
            String str2 = (String) z1.m14267e(bundle, IMAPStore.ID_NAME, String.class, null);
            AbstractC6840z.m13036g(str2);
            c5072a.f24869b = str2;
            c5072a.f24870c = z1.m14267e(bundle, "value", Object.class, null);
            c5072a.f24871d = (String) z1.m14267e(bundle, "trigger_event_name", String.class, null);
            c5072a.f24872e = ((Long) z1.m14267e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            c5072a.f24873f = (String) z1.m14267e(bundle, "timed_out_event_name", String.class, null);
            c5072a.f24874g = (Bundle) z1.m14267e(bundle, "timed_out_event_params", Bundle.class, null);
            c5072a.f24875h = (String) z1.m14267e(bundle, "triggered_event_name", String.class, null);
            c5072a.f24876i = (Bundle) z1.m14267e(bundle, "triggered_event_params", Bundle.class, null);
            c5072a.f24877j = ((Long) z1.m14267e(bundle, "time_to_live", Long.class, 0L)).longValue();
            c5072a.f24878k = (String) z1.m14267e(bundle, "expired_event_name", String.class, null);
            c5072a.f24879l = (Bundle) z1.m14267e(bundle, "expired_event_params", Bundle.class, null);
            c5072a.f24881n = ((Boolean) z1.m14267e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            c5072a.f24880m = ((Long) z1.m14267e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            c5072a.f24882o = ((Long) z1.m14267e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(c5072a);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0286  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.os.Bundle, java.lang.String] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8849c(java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.C4079b.m8849c(java.util.ArrayList):void");
    }
}

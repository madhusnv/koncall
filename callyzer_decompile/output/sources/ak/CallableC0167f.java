package ak;

import a1.C0005d;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import bj.C0669a;
import bk.C0676g;
import bk.C0688s;
import c9.C0909d;
import c9.C0927v;
import cj.C0979e;
import eb.g2;
import ej.C2060e;
import io.C3328c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import nf.C5047i;
import org.json.JSONException;
import org.json.JSONObject;
import tb.C7105p;
import wi.C8062l;
import wi.C8066p;
import xi.C8386d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ak.f */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0167f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f516a;

    /* renamed from: b */
    public final /* synthetic */ Object f517b;

    public /* synthetic */ CallableC0167f(int i10, Object obj) {
        this.f516a = i10;
        this.f517b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0676g c0676gM1952a;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        switch (this.f516a) {
            case 0:
                return ((C0171j) this.f517b).m386a();
            case 1:
                C0688s c0688s = (C0688s) this.f517b;
                synchronized (c0688s) {
                    c0676gM1952a = null;
                    try {
                        fileInputStreamOpenFileInput = c0688s.f4321a.openFileInput(c0688s.f4322b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th3) {
                        fileInputStreamOpenFileInput = null;
                        th2 = th3;
                    }
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                        c0676gM1952a = C0676g.m1952a(new JSONObject(new String(bArr, "UTF-8")));
                        fileInputStreamOpenFileInput.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        return c0676gM1952a;
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        throw th2;
                    }
                }
                return c0676gM1952a;
            case 2:
                WorkDatabase workDatabase = (WorkDatabase) ((C5047i) this.f517b).f24823b;
                Long lM2611u = workDatabase.mo1371y().m2611u("next_alarm_manager_id");
                int iLongValue = lM2611u != null ? (int) lM2611u.longValue() : 0;
                workDatabase.mo1371y().m2615y(new C0909d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 3:
                C3328c c3328c = (C3328c) ((C0927v) this.f517b).f5669c;
                g2 g2Var = (g2) c3328c.f17614f;
                C2060e c2060e = (C2060e) c3328c.f17610b;
                g2Var.getClass();
                C8386d.m15553b();
                try {
                    HashMap mapM5717c = g2.m5717c(c2060e);
                    C0005d c0005d = new C0005d(g2Var.f9320a, mapM5717c);
                    c0005d.m34A("User-Agent", "Crashlytics Android SDK/20.0.0");
                    c0005d.m34A("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    g2.m5716a(c0005d, c2060e);
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    mapM5717c.toString();
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    C0669a c0669aM73r = c0005d.m73r();
                    int i10 = c0669aM73r.f4225b;
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    if (i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203) {
                        return new JSONObject(c0669aM73r.f4226c);
                    }
                    return null;
                } catch (IOException | Exception unused3) {
                    return null;
                }
            default:
                C8062l c8062l = ((C8066p) this.f517b).f38630g;
                c8062l.getClass();
                C8386d.m15552a();
                C7105p c7105p = c8062l.f38601c;
                C0979e c0979e = (C0979e) c7105p.f34291c;
                String str = (String) c7105p.f34290b;
                c0979e.getClass();
                boolean z6 = true;
                if (new File((File) c0979e.f5804c, str).exists()) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    C0979e c0979e2 = (C0979e) c7105p.f34291c;
                    c0979e2.getClass();
                    new File((File) c0979e2.f5804c, str).delete();
                } else {
                    String strM15200d = c8062l.m15200d();
                    if (strM15200d == null || !c8062l.f38608j.m13422c(strM15200d)) {
                        z6 = false;
                    }
                }
                return Boolean.valueOf(z6);
        }
    }
}

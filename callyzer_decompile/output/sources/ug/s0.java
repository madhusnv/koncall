package ug;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import ia.C3220l;
import java.io.IOException;
import java.util.Map;
import mm.AbstractC4801l;
import sf.AbstractC6840z;
import zf.AbstractC8948c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35812a = 1;

    /* renamed from: b */
    public final int f35813b;

    /* renamed from: c */
    public final String f35814c;

    /* renamed from: d */
    public final Object f35815d;

    /* renamed from: e */
    public final Object f35816e;

    /* renamed from: f */
    public final Object f35817f;

    /* renamed from: g */
    public final Object f35818g;

    public /* synthetic */ s0(String str, w0 w0Var, int i10, IOException iOException, byte[] bArr, Map map) {
        AbstractC6840z.m13036g(w0Var);
        this.f35815d = w0Var;
        this.f35813b = i10;
        this.f35816e = iOException;
        this.f35817f = bArr;
        this.f35814c = str;
        this.f35818g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35812a) {
            case 0:
                v0 v0Var = (v0) this.f35818g;
                d1 d1Var = ((n1) v0Var.f482a).f35668e;
                n1.m14083i(d1Var);
                if (!d1Var.f35835b) {
                    Log.println(6, v0Var.m14165W(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (v0Var.f35859c == 0) {
                    C7436g c7436g = ((n1) v0Var.f482a).f35667d;
                    if (c7436g.f35447e == null) {
                        synchronized (c7436g) {
                            try {
                                if (c7436g.f35447e == null) {
                                    n1 n1Var = (n1) c7436g.f482a;
                                    ApplicationInfo applicationInfo = n1Var.f35664a.getApplicationInfo();
                                    String strM16432a = AbstractC8948c.m16432a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c7436g.f35447e = Boolean.valueOf(str != null && str.equals(strM16432a));
                                    }
                                    if (c7436g.f35447e == null) {
                                        c7436g.f35447e = Boolean.TRUE;
                                        v0 v0Var2 = n1Var.f35669f;
                                        n1.m14085m(v0Var2);
                                        v0Var2.f35862f.m14140a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c7436g.f35447e.booleanValue()) {
                        v0Var.f35859c = 'C';
                    } else {
                        v0Var.f35859c = 'c';
                    }
                }
                if (v0Var.f35860d < 0) {
                    ((n1) v0Var.f482a).f35667d.m13884R();
                    v0Var.f35860d = 133005L;
                }
                int i10 = this.f35813b;
                char c2 = v0Var.f35859c;
                long j6 = v0Var.f35860d;
                String str2 = this.f35814c;
                Object obj = this.f35815d;
                Object obj2 = this.f35816e;
                Object obj3 = this.f35817f;
                char cCharAt = "01VDIWEA?".charAt(i10);
                String strM14158X = v0.m14158X(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(AbstractC4801l.m9725C(String.valueOf(cCharAt).length() + 1, String.valueOf(c2).length(), String.valueOf(j6).length(), 1) + strM14158X.length());
                sb2.append("2");
                sb2.append(cCharAt);
                sb2.append(c2);
                sb2.append(j6);
                sb2.append(":");
                sb2.append(strM14158X);
                String string = sb2.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                C3220l c3220l = d1Var.f35331e;
                if (c3220l != null) {
                    String str3 = (String) c3220l.f17357d;
                    d1 d1Var2 = (d1) c3220l.f17358e;
                    d1Var2.mo325M();
                    if (((d1) c3220l.f17358e).m13861Q().getLong((String) c3220l.f17355b, 0L) == 0) {
                        c3220l.m7566g();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesM13861Q = d1Var2.m13861Q();
                    String str4 = (String) c3220l.f17356c;
                    long j10 = sharedPreferencesM13861Q.getLong(str4, 0L);
                    if (j10 <= 0) {
                        SharedPreferences.Editor editorEdit = d1Var2.m13861Q().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    l4 l4Var = ((n1) d1Var2.f482a).f35672j;
                    n1.m14083i(l4Var);
                    long jNextLong = l4Var.K0().nextLong() & Long.MAX_VALUE;
                    long j11 = j10 + 1;
                    long j12 = Long.MAX_VALUE / j11;
                    SharedPreferences.Editor editorEdit2 = d1Var2.m13861Q().edit();
                    if (jNextLong < j12) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j11);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((w0) this.f35815d).mo13809a(this.f35814c, this.f35813b, (Throwable) this.f35816e, (byte[]) this.f35817f, (Map) this.f35818g);
                return;
        }
    }

    public s0(v0 v0Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f35813b = i10;
        this.f35814c = str;
        this.f35815d = obj;
        this.f35816e = obj2;
        this.f35817f = obj3;
        this.f35818g = v0Var;
    }
}

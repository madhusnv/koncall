package ec;

import android.os.Bundle;
import com.sun.mail.util.AbstractC1452a;
import dy.AbstractC1856d;
import j$.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p020v.a1;
import td.C7124a;
import td.C7126c;
import ud.C7404h;
import ug.C7432c;
import ug.C7448s;
import ug.C7449t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.q */
/* loaded from: classes.dex */
public final class C2019q {

    /* renamed from: a */
    public final /* synthetic */ int f9564a;

    /* renamed from: b */
    public long f9565b;

    /* renamed from: c */
    public Object f9566c;

    /* renamed from: d */
    public Object f9567d;

    /* renamed from: e */
    public Object f9568e;

    /* renamed from: d */
    public static C2019q m5742d(C7449t c7449t) {
        String str = c7449t.f35827a;
        String str2 = c7449t.f35829c;
        return new C2019q(c7449t.f35830d, c7449t.f35828b.m14134g(), str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m5743a(java.lang.Object r13, lu.C4525k r14, ww.AbstractC8193c r15) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.C2019q.m5743a(java.lang.Object, lu.k, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public void m5744b() {
        Iterator it = ((LinkedHashMap) this.f9566c).entrySet().iterator();
        while (it.hasNext()) {
            C7404h c7404h = (C7404h) ((Map.Entry) it.next()).getValue();
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            if (C7124a.m13407e().compareTo(c7404h.f35188b) >= 0) {
                it.remove();
            }
        }
        DateTimeFormatter dateTimeFormatter2 = C7126c.f34342b;
        this.f9568e = C7124a.m13407e().m13410c(this.f9565b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[PHI: r8 r16 r17
      0x00ff: PHI (r8v6 android.database.Cursor) = (r8v7 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r16v3 com.google.android.gms.internal.measurement.c3) = (r16v5 com.google.android.gms.internal.measurement.c3), (r16v10 com.google.android.gms.internal.measurement.c3) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.measurement.c3 m5745c(com.google.android.gms.internal.measurement.c3 r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.C2019q.m5745c(com.google.android.gms.internal.measurement.c3, java.lang.String):com.google.android.gms.internal.measurement.c3");
    }

    /* renamed from: e */
    public C7449t m5746e() {
        return new C7449t((String) this.f9566c, new C7448s(new Bundle((Bundle) this.f9568e)), (String) this.f9567d, this.f9565b);
    }

    public String toString() {
        switch (this.f9564a) {
            case 2:
                String str = (String) this.f9567d;
                String string = ((Bundle) this.f9568e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f9566c;
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                a1.m14319B(sb2, "origin=", str, ",name=", str2);
                return AbstractC1452a.m4564k(sb2, ",params=", string);
            default:
                return super.toString();
        }
    }

    public C2019q(long j6, Bundle bundle, String str, String str2) {
        this.f9564a = 2;
        this.f9566c = str;
        this.f9567d = str2;
        this.f9568e = bundle;
        this.f9565b = j6;
    }

    public /* synthetic */ C2019q(C7432c c7432c) {
        this.f9564a = 3;
        this.f9568e = c7432c;
    }

    public C2019q(long j6) {
        this.f9564a = 0;
        this.f9565b = j6;
        this.f9566c = new LinkedHashMap();
        this.f9567d = AbstractC1856d.m5490a();
        DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
        this.f9568e = C7124a.m13407e().m13410c(j6);
    }
}

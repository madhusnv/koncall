package p001o;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p001o.dz4;
import p001o.iz4;
import p001o.pm6;

/* loaded from: classes2.dex */
public final class n38 implements n2b {

    /* renamed from: a */
    public final dz4.InterfaceC13064a f36311a;

    /* renamed from: b */
    public final String f36312b;

    /* renamed from: c */
    public final boolean f36313c;

    /* renamed from: d */
    public final Map f36314d;

    public n38(String str, boolean z, dz4.InterfaceC13064a interfaceC13064a) {
        op0.m42511a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f36311a = interfaceC13064a;
        this.f36312b = str;
        this.f36313c = z;
        this.f36314d = new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:9|21|10|(2:12|13)(2:26|15)) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        r1 = m40039d(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r8 = r8 + 1;
        r9 = r9.m32919a().m32933j(r1).m32924a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        p001o.sqi.m48733l(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        r11 = move-exception;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m40038c(dz4.InterfaceC13064a interfaceC13064a, String str, byte[] bArr, Map map) throws o2b {
        o5g o5gVar = new o5g(interfaceC13064a.mo23962a());
        iz4 iz4VarM32924a = new iz4.C14403b().m32933j(str).m32928e(map).m32927d(2).m32926c(bArr).m32925b(1).m32924a();
        int i = 0;
        iz4 iz4VarM32924a2 = iz4VarM32924a;
        while (true) {
            try {
                gz4 gz4Var = new gz4(o5gVar, iz4VarM32924a2);
                return vq1.m53201d(gz4Var);
            } catch (Exception e) {
                throw new o2b(iz4VarM32924a, (Uri) op0.m42515e(o5gVar.m41628o()), o5gVar.mo23959b(), o5gVar.m41627n(), e);
            }
        }
    }

    /* renamed from: d */
    public static String m40039d(j28 j28Var, int i) {
        Map map;
        List list;
        int i2 = j28Var.f29628d;
        if (!((i2 == 307 || i2 == 308) && i < 5) || (map = j28Var.f29630f) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // p001o.n2b
    /* renamed from: a */
    public byte[] mo40021a(UUID uuid, pm6.C16138a c16138a) throws o2b {
        String strM43870b = c16138a.m43870b();
        if (this.f36313c || TextUtils.isEmpty(strM43870b)) {
            strM43870b = this.f36312b;
        }
        if (TextUtils.isEmpty(strM43870b)) {
            throw new o2b(new iz4.C14403b().m32932i(Uri.EMPTY).m32924a(), Uri.EMPTY, of8.m42180r(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = dr1.f20427e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : dr1.f20425c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f36314d) {
            map.putAll(this.f36314d);
        }
        return m40038c(this.f36311a, strM43870b, c16138a.m43869a(), map);
    }

    @Override // p001o.n2b
    /* renamed from: b */
    public byte[] mo40022b(UUID uuid, pm6.C16141d c16141d) {
        return m40038c(this.f36311a, c16141d.m43873b() + "&signedRequest=" + sqi.m48703H(c16141d.m43872a()), null, Collections.emptyMap());
    }

    /* renamed from: e */
    public void m40040e(String str, String str2) {
        op0.m42515e(str);
        op0.m42515e(str2);
        synchronized (this.f36314d) {
            this.f36314d.put(str, str2);
        }
    }
}

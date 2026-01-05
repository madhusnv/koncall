package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.protocol.HTTP;
import p001o.zq1;

/* loaded from: classes6.dex */
public abstract class k38 {

    /* renamed from: a */
    public static final zq1 f31417a;

    /* renamed from: b */
    public static final zq1 f31418b;

    static {
        zq1.C18692a c18692a = zq1.f57497d;
        f31417a = c18692a.m59707c(BasicHeaderValueFormatter.UNSAFE_CHARS);
        f31418b = c18692a.m59707c("\t ,=");
    }

    /* renamed from: a */
    public static final List m34938a(wx7 wx7Var, String str) {
        sq8.m48649h(wx7Var, "<this>");
        sq8.m48649h(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = wx7Var.size();
        for (int i = 0; i < size; i++) {
            if (e9g.m24606x(str, wx7Var.m55329j(i), true)) {
                try {
                    m34940c(new rl1().n0(wx7Var.m55333w(i)), arrayList);
                } catch (EOFException e) {
                    e9d.f21191a.m24582g().m24573j("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m34939b(zqe zqeVar) {
        sq8.m48649h(zqeVar, "<this>");
        if (sq8.m48644c(zqeVar.m59732Q().m51737h(), "HEAD")) {
            return false;
        }
        int iM59739h = zqeVar.m59739h();
        return (((iM59739h >= 100 && iM59739h < 200) || iM59739h == 204 || iM59739h == 304) && jgj.m33816j(zqeVar) == -1 && !e9g.m24606x(HTTP.CHUNK_CODING, zqe.m59725t(zqeVar, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m34940c(rl1 rl1Var, List list) throws EOFException {
        String strM34942e;
        int iM28614C;
        LinkedHashMap linkedHashMap;
        while (true) {
            String strM34942e2 = null;
            while (true) {
                if (strM34942e2 == null) {
                    m34944g(rl1Var);
                    strM34942e2 = m34942e(rl1Var);
                    if (strM34942e2 == null) {
                        return;
                    }
                }
                boolean zM34944g = m34944g(rl1Var);
                strM34942e = m34942e(rl1Var);
                if (strM34942e == null) {
                    if (rl1Var.mo32311n()) {
                        list.add(new bg2(strM34942e2, isa.m32681h()));
                        return;
                    }
                    return;
                }
                iM28614C = ggj.m28614C(rl1Var, (byte) 61);
                boolean zM34944g2 = m34944g(rl1Var);
                if (zM34944g || (!zM34944g2 && !rl1Var.mo32311n())) {
                    linkedHashMap = new LinkedHashMap();
                    int iM28614C2 = iM28614C + ggj.m28614C(rl1Var, (byte) 61);
                    while (true) {
                        if (strM34942e == null) {
                            strM34942e = m34942e(rl1Var);
                            if (!m34944g(rl1Var)) {
                                iM28614C2 = ggj.m28614C(rl1Var, (byte) 61);
                                if (iM28614C2 == 0) {
                                    if (iM28614C2 > 1 || m34944g(rl1Var)) {
                                        return;
                                    }
                                    String strM34941d = m34945h(rl1Var, (byte) 34) ? m34941d(rl1Var) : m34942e(rl1Var);
                                    if (strM34941d == null || ((String) linkedHashMap.put(strM34942e, strM34941d)) != null) {
                                        return;
                                    }
                                    if (!m34944g(rl1Var) && !rl1Var.mo32311n()) {
                                        return;
                                    } else {
                                        strM34942e = null;
                                    }
                                }
                            }
                        } else if (iM28614C2 == 0) {
                            break;
                        }
                    }
                }
                list.add(new bg2(strM34942e2, linkedHashMap));
                strM34942e2 = strM34942e;
            }
            Map mapSingletonMap = Collections.singletonMap(null, strM34942e + e9g.m24589C("=", iM28614C));
            sq8.m48648g(mapSingletonMap, "singletonMap(...)");
            list.add(new bg2(strM34942e2, mapSingletonMap));
        }
    }

    /* renamed from: d */
    public static final String m34941d(rl1 rl1Var) throws EOFException {
        if (!(rl1Var.readByte() == 34)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        rl1 rl1Var2 = new rl1();
        while (true) {
            long jR2 = rl1Var.r2(f31417a);
            if (jR2 == -1) {
                return null;
            }
            if (rl1Var.m46918s(jR2) == 34) {
                rl1Var2.M0(rl1Var, jR2);
                rl1Var.readByte();
                return rl1Var2.m46909T();
            }
            if (rl1Var.f0() == jR2 + 1) {
                return null;
            }
            rl1Var2.M0(rl1Var, jR2);
            rl1Var.readByte();
            rl1Var2.M0(rl1Var, 1L);
        }
    }

    /* renamed from: e */
    public static final String m34942e(rl1 rl1Var) {
        long jR2 = rl1Var.r2(f31418b);
        if (jR2 == -1) {
            jR2 = rl1Var.f0();
        }
        if (jR2 != 0) {
            return rl1Var.t1(jR2);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m34943f(f74 f74Var, w48 w48Var, wx7 wx7Var) {
        sq8.m48649h(f74Var, "<this>");
        sq8.m48649h(w48Var, ImagesContract.URL);
        sq8.m48649h(wx7Var, "headers");
        if (f74Var == f74.f22851b) {
            return;
        }
        List listM24460e = e74.f21090k.m24460e(w48Var, wx7Var);
        if (listM24460e.isEmpty()) {
            return;
        }
        f74Var.mo26224a(w48Var, listM24460e);
    }

    /* renamed from: g */
    public static final boolean m34944g(rl1 rl1Var) throws EOFException {
        boolean z = false;
        while (!rl1Var.mo32311n()) {
            byte bM46918s = rl1Var.m46918s(0L);
            boolean z2 = true;
            if (bM46918s != 44) {
                if (bM46918s != 32 && bM46918s != 9) {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                rl1Var.readByte();
            } else {
                rl1Var.readByte();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public static final boolean m34945h(rl1 rl1Var, byte b) {
        return !rl1Var.mo32311n() && rl1Var.m46918s(0L) == b;
    }
}

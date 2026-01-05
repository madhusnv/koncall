package p001o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import org.apache.http.protocol.HTTP;
import p001o.tn8;
import p001o.zqe;

/* loaded from: classes6.dex */
public final class uz1 implements tn8 {

    /* renamed from: a */
    public final boolean f49691a;

    public uz1(boolean z) {
        this.f49691a = z;
    }

    /* renamed from: a */
    public final boolean m52174a(int i, dl6 dl6Var) {
        if (i == 100) {
            return true;
        }
        return 102 <= i && i < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: IOException -> 0x018a, TryCatch #0 {IOException -> 0x018a, blocks: (B:39:0x00a9, B:41:0x00b2, B:42:0x00b6, B:44:0x00e0, B:46:0x00e9, B:47:0x00ec, B:48:0x0110, B:52:0x011b, B:54:0x0130, B:56:0x013e, B:63:0x0154, B:66:0x0163, B:67:0x0189, B:58:0x0149, B:53:0x0120), top: B:75:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120 A[Catch: IOException -> 0x018a, TryCatch #0 {IOException -> 0x018a, blocks: (B:39:0x00a9, B:41:0x00b2, B:42:0x00b6, B:44:0x00e0, B:46:0x00e9, B:47:0x00ec, B:48:0x0110, B:52:0x011b, B:54:0x0130, B:56:0x013e, B:63:0x0154, B:66:0x0163, B:67:0x0189, B:58:0x0149, B:53:0x0120), top: B:75:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149 A[Catch: IOException -> 0x018a, TryCatch #0 {IOException -> 0x018a, blocks: (B:39:0x00a9, B:41:0x00b2, B:42:0x00b6, B:44:0x00e0, B:46:0x00e9, B:47:0x00ec, B:48:0x0110, B:52:0x011b, B:54:0x0130, B:56:0x013e, B:63:0x0154, B:66:0x0163, B:67:0x0189, B:58:0x0149, B:53:0x0120), top: B:75:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v21, types: [o.zqe$a] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // p001o.tn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zqe intercept(tn8.InterfaceC17165a interfaceC17165a) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        ?? M44762a;
        zqe.C18696a c18696aM23403r;
        int iM59739h;
        zqe zqeVarM59750c;
        Object obj;
        sq8.m48649h(interfaceC17165a, "chain");
        cde cdeVar = (cde) interfaceC17165a;
        dl6 dl6VarM20977g = cdeVar.m20977g();
        sq8.m48646e(dl6VarM20977g);
        ule uleVarM20979i = cdeVar.m20979i();
        xle xleVarM51730a = uleVarM20979i.m51730a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            dl6VarM20977g.m23409x(uleVarM20979i);
            M44762a = q38.m44762a(uleVarM20979i.m51737h());
            try {
                if (M44762a == 0 || xleVarM51730a == null) {
                    dl6VarM20977g.m23401p();
                    z = true;
                    M44762a = 0;
                } else {
                    if (e9g.m24606x(HTTP.EXPECT_CONTINUE, uleVarM20979i.m51734e("Expect"), true)) {
                        dl6VarM20977g.m23391f();
                        M44762a = dl6VarM20977g.m23403r(true);
                        try {
                            dl6VarM20977g.m23405t();
                            z = false;
                            obj = M44762a;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (e instanceof dt3) {
                                throw e;
                            }
                            c18696aM23403r = M44762a;
                            if (!dl6VarM20977g.m23396k()) {
                                throw e;
                            }
                            if (c18696aM23403r == null) {
                            }
                            zqe zqeVarM59750c2 = c18696aM23403r.m59764q(uleVarM20979i).m59755h(dl6VarM20977g.m23393h().m59200n()).m59765r(jCurrentTimeMillis).m59763p(System.currentTimeMillis()).m59750c();
                            iM59739h = zqeVarM59750c2.m59739h();
                            if (m52174a(iM59739h, dl6VarM20977g)) {
                            }
                            dl6VarM20977g.m23404s(zqeVarM59750c2);
                            if (this.f49691a) {
                            }
                            if (!e9g.m24606x("close", zqeVarM59750c.m59732Q().m51734e("Connection"), true)) {
                                dl6VarM20977g.m23400o();
                            }
                            if (iM59739h == 204) {
                                throw new ProtocolException("HTTP " + iM59739h + " had non-zero Content-Length: " + zqeVarM59750c.m59735c().mo21617g());
                            }
                            throw new ProtocolException("HTTP " + iM59739h + " had non-zero Content-Length: " + zqeVarM59750c.m59735c().mo21617g());
                            return zqeVarM59750c;
                        }
                    } else {
                        z = true;
                        obj = null;
                    }
                    if (obj != null) {
                        dl6VarM20977g.m23401p();
                        M44762a = obj;
                        if (!dl6VarM20977g.m23393h().m59204r()) {
                            dl6VarM20977g.m23400o();
                            M44762a = obj;
                        }
                    } else if (xleVarM51730a.mo49546g()) {
                        dl6VarM20977g.m23391f();
                        xleVarM51730a.mo18955i(uac.m51309b(dl6VarM20977g.m23388c(uleVarM20979i, true)));
                        M44762a = obj;
                    } else {
                        gm1 gm1VarM51309b = uac.m51309b(dl6VarM20977g.m23388c(uleVarM20979i, false));
                        xleVarM51730a.mo18955i(gm1VarM51309b);
                        gm1VarM51309b.close();
                        M44762a = obj;
                    }
                }
                if (xleVarM51730a == null || !xleVarM51730a.mo49546g()) {
                    dl6VarM20977g.m23390e();
                }
                e = null;
                c18696aM23403r = M44762a;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            M44762a = 0;
        }
        if (c18696aM23403r == null) {
            try {
                c18696aM23403r = dl6VarM20977g.m23403r(false);
                sq8.m48646e(c18696aM23403r);
                if (z) {
                    dl6VarM20977g.m23405t();
                    z = false;
                }
            } catch (IOException e4) {
                if (e == null) {
                    throw e4;
                }
                cl6.m21376a(e, e4);
                throw e;
            }
        }
        zqe zqeVarM59750c22 = c18696aM23403r.m59764q(uleVarM20979i).m59755h(dl6VarM20977g.m23393h().m59200n()).m59765r(jCurrentTimeMillis).m59763p(System.currentTimeMillis()).m59750c();
        iM59739h = zqeVarM59750c22.m59739h();
        if (m52174a(iM59739h, dl6VarM20977g)) {
            zqe.C18696a c18696aM23403r2 = dl6VarM20977g.m23403r(false);
            sq8.m48646e(c18696aM23403r2);
            if (z) {
                dl6VarM20977g.m23405t();
            }
            zqeVarM59750c22 = c18696aM23403r2.m59764q(uleVarM20979i).m59755h(dl6VarM20977g.m23393h().m59200n()).m59765r(jCurrentTimeMillis).m59763p(System.currentTimeMillis()).m59750c();
            iM59739h = zqeVarM59750c22.m59739h();
        }
        dl6VarM20977g.m23404s(zqeVarM59750c22);
        zqeVarM59750c = (this.f49691a || iM59739h != 101) ? zqeVarM59750c22.m59728H().m59749b(dl6VarM20977g.m23402q(zqeVarM59750c22)).m59750c() : egj.m25002u(zqeVarM59750c22);
        if (!e9g.m24606x("close", zqeVarM59750c.m59732Q().m51734e("Connection"), true) || e9g.m24606x("close", zqe.m59725t(zqeVarM59750c, "Connection", null, 2, null), true)) {
            dl6VarM20977g.m23400o();
        }
        if ((iM59739h == 204 && iM59739h != 205) || zqeVarM59750c.m59735c().mo21617g() <= 0) {
            return zqeVarM59750c;
        }
        throw new ProtocolException("HTTP " + iM59739h + " had non-zero Content-Length: " + zqeVarM59750c.m59735c().mo21617g());
    }
}

package p001o;

import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public class wtb {

    /* renamed from: a */
    public final ktb f52653a;

    /* renamed from: b */
    public final lma f52654b;

    public wtb(ktb ktbVar, lma lmaVar) {
        this.f52653a = ktbVar;
        this.f52654b = lmaVar;
    }

    /* renamed from: a */
    public final ama m54999a(String str, String str2) {
        Pair pairM36216a;
        if (str2 == null || (pairM36216a = this.f52653a.m36216a(str)) == null) {
            return null;
        }
        qw6 qw6Var = (qw6) pairM36216a.first;
        InputStream inputStream = (InputStream) pairM36216a.second;
        nma nmaVarM21408s = qw6Var == qw6.ZIP ? cma.m21408s(new ZipInputStream(inputStream), str) : cma.m21398i(inputStream, str);
        if (nmaVarM21408s.m40788b() != null) {
            return (ama) nmaVarM21408s.m40788b();
        }
        return null;
    }

    /* renamed from: b */
    public final nma m55000b(String str, String str2) throws IOException {
        rja.m46864a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                fma fmaVarMo37470a = this.f52654b.mo37470a(str);
                if (!fmaVarMo37470a.U0()) {
                    nma nmaVar = new nma((Throwable) new IllegalArgumentException(fmaVarMo37470a.l2()));
                    try {
                        fmaVarMo37470a.close();
                    } catch (IOException e) {
                        rja.m46867d("LottieFetchResult close failed ", e);
                    }
                    return nmaVar;
                }
                nma nmaVarM55002d = m55002d(str, fmaVarMo37470a.w0(), fmaVarMo37470a.m0(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(nmaVarM55002d.m40788b() != null);
                rja.m46864a(sb.toString());
                try {
                    fmaVarMo37470a.close();
                } catch (IOException e2) {
                    rja.m46867d("LottieFetchResult close failed ", e2);
                }
                return nmaVarM55002d;
            } catch (Exception e3) {
                nma nmaVar2 = new nma((Throwable) e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        rja.m46867d("LottieFetchResult close failed ", e4);
                    }
                }
                return nmaVar2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    rja.m46867d("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public nma m55001c(String str, String str2) {
        ama amaVarM54999a = m54999a(str, str2);
        if (amaVarM54999a != null) {
            return new nma(amaVarM54999a);
        }
        rja.m46864a("Animation for " + str + " not found in cache. Fetching from network.");
        return m55000b(str, str2);
    }

    /* renamed from: d */
    public final nma m55002d(String str, InputStream inputStream, String str2, String str3) {
        qw6 qw6Var;
        nma nmaVarM55004f;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            rja.m46864a("Handling zip response.");
            qw6Var = qw6.ZIP;
            nmaVarM55004f = m55004f(str, inputStream, str3);
        } else {
            rja.m46864a("Received json response.");
            qw6Var = qw6.JSON;
            nmaVarM55004f = m55003e(str, inputStream, str3);
        }
        if (str3 != null && nmaVarM55004f.m40788b() != null) {
            this.f52653a.m36219e(str, qw6Var);
        }
        return nmaVarM55004f;
    }

    /* renamed from: e */
    public final nma m55003e(String str, InputStream inputStream, String str2) {
        return str2 == null ? cma.m21398i(inputStream, null) : cma.m21398i(new FileInputStream(this.f52653a.m36220f(str, inputStream, qw6.JSON).getAbsolutePath()), str);
    }

    /* renamed from: f */
    public final nma m55004f(String str, InputStream inputStream, String str2) {
        return str2 == null ? cma.m21408s(new ZipInputStream(inputStream), null) : cma.m21408s(new ZipInputStream(new FileInputStream(this.f52653a.m36220f(str, inputStream, qw6.ZIP))), str);
    }
}

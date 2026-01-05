package p001o;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import p001o.yw6;

/* loaded from: classes5.dex */
public final class t8i {

    /* renamed from: a */
    public static final t8i f46633a = new t8i();

    /* renamed from: b */
    public static final String f46634b;

    /* renamed from: c */
    public static final String f46635c;

    /* renamed from: d */
    public static yw6 f46636d;

    static {
        String strMo26337d = kge.m35689b(t8i.class).mo26337d();
        if (strMo26337d == null) {
            strMo26337d = "UrlRedirectCache";
        }
        f46634b = strMo26337d;
        f46635c = strMo26337d + "_Redirect";
    }

    /* renamed from: a */
    public static final void m49566a(Uri uri, Uri uri2) throws IOException {
        if (uri == null || uri2 == null) {
            return;
        }
        OutputStream outputStreamM58407i = null;
        try {
            try {
                yw6 yw6VarM49567b = m49567b();
                String string = uri.toString();
                sq8.m48648g(string, "fromUri.toString()");
                outputStreamM58407i = yw6VarM49567b.m58407i(string, f46635c);
                String string2 = uri2.toString();
                sq8.m48648g(string2, "toUri.toString()");
                byte[] bytes = string2.getBytes(sh2.f45422b);
                sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
                outputStreamM58407i.write(bytes);
            } catch (IOException e) {
                sja.f45482e.m48386a(bka.CACHE, 4, f46634b, "IOException when accessing cache: " + e.getMessage());
            }
        } finally {
            cri.m21664j(outputStreamM58407i);
        }
    }

    /* renamed from: b */
    public static final synchronized yw6 m49567b() {
        yw6 yw6Var;
        yw6Var = f46636d;
        if (yw6Var == null) {
            yw6Var = new yw6(f46634b, new yw6.C18511e());
        }
        f46636d = yw6Var;
        return yw6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (p001o.sq8.m48644c(r3, r10) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        r5 = r6;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        p001o.sja.f45482e.m48386a(p001o.bka.CACHE, 6, p001o.t8i.f46634b, "A loop detected in UrlRedirectCache");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        p001o.cri.m21664j(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b7: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:184), block:B:43:0x00b7 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Uri m49568c(Uri uri) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3;
        InputStreamReader inputStreamReader4 = null;
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        sq8.m48648g(string, "uri.toString()");
        HashSet hashSet = new HashSet();
        hashSet.add(string);
        try {
            try {
                yw6 yw6VarM49567b = m49567b();
                InputStream inputStreamM58405f = yw6VarM49567b.m58405f(string, f46635c);
                inputStreamReader = null;
                boolean z = false;
                while (true) {
                    if (inputStreamM58405f == null) {
                        break;
                    }
                    try {
                        inputStreamReader3 = new InputStreamReader(inputStreamM58405f);
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        char[] cArr = new char[128];
                        StringBuilder sb = new StringBuilder();
                        for (int i = inputStreamReader3.read(cArr, 0, 128); i > 0; i = inputStreamReader3.read(cArr, 0, 128)) {
                            sb.append(cArr, 0, i);
                        }
                        cri.m21664j(inputStreamReader3);
                        String string2 = sb.toString();
                        sq8.m48648g(string2, "urlBuilder.toString()");
                        if (hashSet.contains(string2)) {
                            break;
                        }
                        hashSet.add(string2);
                        inputStreamReader = inputStreamReader3;
                        z = true;
                        inputStreamM58405f = yw6VarM49567b.m58405f(string2, f46635c);
                        string = string2;
                    } catch (IOException e2) {
                        e = e2;
                        inputStreamReader = inputStreamReader3;
                        sja.f45482e.m48386a(bka.CACHE, 4, f46634b, "IOException when accessing cache: " + e.getMessage());
                        cri.m21664j(inputStreamReader);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader4 = inputStreamReader3;
                        cri.m21664j(inputStreamReader4);
                        throw th;
                    }
                }
                if (z) {
                    Uri uri2 = Uri.parse(string);
                    cri.m21664j(inputStreamReader);
                    return uri2;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader4 = inputStreamReader2;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
        cri.m21664j(inputStreamReader);
        return null;
    }
}

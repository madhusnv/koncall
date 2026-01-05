package p001o;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public class i38 extends ul1 {

    /* renamed from: d */
    public static final i38 f27983d;

    /* renamed from: e */
    public static final sl1 f27984e;

    /* renamed from: f */
    public static final sl1 f27985f;

    /* renamed from: g */
    public static final sl1 f27986g;

    /* renamed from: h */
    public static final sl1 f27987h;

    /* renamed from: i */
    public static final sl1 f27988i;

    /* renamed from: j */
    public static final sl1 f27989j;

    /* renamed from: k */
    public static final sl1 f27990k;

    /* renamed from: l */
    public static final sl1 f27991l;

    /* renamed from: m */
    public static final sl1 f27992m;

    /* renamed from: n */
    public static final sl1 f27993n;

    /* renamed from: o */
    public static /* synthetic */ Class f27994o;

    static {
        i38 i38Var = new i38();
        f27983d = i38Var;
        f27984e = i38Var.m51689a("close", 1);
        f27985f = i38Var.m51689a(HTTP.CHUNK_CODING, 2);
        f27986g = i38Var.m51689a("gzip", 3);
        f27987h = i38Var.m51689a(HTTP.IDENTITY_CODING, 4);
        f27988i = i38Var.m51689a("keep-alive", 5);
        f27989j = i38Var.m51689a(HTTP.EXPECT_CONTINUE, 6);
        f27990k = i38Var.m51689a("102-processing", 7);
        f27991l = i38Var.m51689a(HttpHeaders.TE, 8);
        f27992m = i38Var.m51689a("bytes", 9);
        f27993n = i38Var.m51689a("no-cache", 10);
        i38Var.m51689a("gzip", 100);
        i38Var.m51689a("gzip,deflate", 101);
        i38Var.m51689a("deflate", 102);
        try {
            Class clsM31466i = f27994o;
            if (clsM31466i == null) {
                clsM31466i = m31466i("org.mortbay.jetty.HttpHeaderValues");
                f27994o = clsM31466i;
            }
            InputStream resourceAsStream = clsM31466i.getResourceAsStream("/org/mortbay/jetty/useragents");
            if (resourceAsStream != null) {
                LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(resourceAsStream));
                String line = lineNumberReader.readLine();
                int i = 103;
                while (line != null) {
                    int i2 = i + 1;
                    f27983d.m51689a(line, i);
                    line = lineNumberReader.readLine();
                    i = i2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            tia.m49923e(e);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ Class m31466i(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}

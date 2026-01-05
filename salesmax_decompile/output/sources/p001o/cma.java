package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public abstract class cma {

    /* renamed from: a */
    public static final Map f18319a = new HashMap();

    /* renamed from: b */
    public static final byte[] f18320b = {80, 75, 3, 4};

    /* renamed from: o.cma$a */
    public class C12702a implements ima {

        /* renamed from: a */
        public final /* synthetic */ String f18321a;

        public C12702a(String str) {
            this.f18321a = str;
        }

        @Override // p001o.ima
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ama amaVar) {
            cma.f18319a.remove(this.f18321a);
        }
    }

    /* renamed from: o.cma$b */
    public class C12703b implements ima {

        /* renamed from: a */
        public final /* synthetic */ String f18322a;

        public C12703b(String str) {
            this.f18322a = str;
        }

        @Override // p001o.ima
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            cma.f18319a.remove(this.f18322a);
        }
    }

    /* renamed from: o.cma$c */
    public class CallableC12704c implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Context f18323a;

        /* renamed from: b */
        public final /* synthetic */ String f18324b;

        /* renamed from: c */
        public final /* synthetic */ String f18325c;

        public CallableC12704c(Context context, String str, String str2) {
            this.f18323a = context;
            this.f18324b = str;
            this.f18325c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nma call() {
            nma nmaVarM55001c = ve9.m52659d(this.f18323a).m55001c(this.f18324b, this.f18325c);
            if (this.f18325c != null && nmaVarM55001c.m40788b() != null) {
                bma.m19372b().m19374c(this.f18325c, (ama) nmaVarM55001c.m40788b());
            }
            return nmaVarM55001c;
        }
    }

    /* renamed from: o.cma$d */
    public class CallableC12705d implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Context f18326a;

        /* renamed from: b */
        public final /* synthetic */ String f18327b;

        /* renamed from: c */
        public final /* synthetic */ String f18328c;

        public CallableC12705d(Context context, String str, String str2) {
            this.f18326a = context;
            this.f18327b = str;
            this.f18328c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nma call() {
            return cma.m21396g(this.f18326a, this.f18327b, this.f18328c);
        }
    }

    /* renamed from: o.cma$e */
    public class CallableC12706e implements Callable {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f18329a;

        /* renamed from: b */
        public final /* synthetic */ Context f18330b;

        /* renamed from: c */
        public final /* synthetic */ int f18331c;

        /* renamed from: d */
        public final /* synthetic */ String f18332d;

        public CallableC12706e(WeakReference weakReference, Context context, int i, String str) {
            this.f18329a = weakReference;
            this.f18330b = context;
            this.f18331c = i;
            this.f18332d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nma call() {
            Context context = (Context) this.f18329a.get();
            if (context == null) {
                context = this.f18330b;
            }
            return cma.m21405p(context, this.f18331c, this.f18332d);
        }
    }

    /* renamed from: o.cma$f */
    public class CallableC12707f implements Callable {

        /* renamed from: a */
        public final /* synthetic */ InputStream f18333a;

        /* renamed from: b */
        public final /* synthetic */ String f18334b;

        public CallableC12707f(InputStream inputStream, String str) {
            this.f18333a = inputStream;
            this.f18334b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nma call() {
            return cma.m21398i(this.f18333a, this.f18334b);
        }
    }

    /* renamed from: o.cma$g */
    public class CallableC12708g implements Callable {

        /* renamed from: a */
        public final /* synthetic */ ama f18335a;

        public CallableC12708g(ama amaVar) {
            this.f18335a = amaVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nma call() {
            return new nma(this.f18335a);
        }
    }

    /* renamed from: b */
    public static oma m21391b(String str, Callable callable) {
        ama amaVarM19373a = str == null ? null : bma.m19372b().m19373a(str);
        if (amaVarM19373a != null) {
            return new oma(new CallableC12708g(amaVarM19373a));
        }
        if (str != null) {
            Map map = f18319a;
            if (map.containsKey(str)) {
                return (oma) map.get(str);
            }
        }
        oma omaVar = new oma(callable);
        if (str != null) {
            omaVar.m42431f(new C12702a(str));
            omaVar.m42430e(new C12703b(str));
            f18319a.put(str, omaVar);
        }
        return omaVar;
    }

    /* renamed from: c */
    public static hma m21392c(ama amaVar, String str) {
        for (hma hmaVar : amaVar.m17446j().values()) {
            if (hmaVar.m30809b().equals(str)) {
                return hmaVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static oma m21393d(Context context, String str) {
        return m21394e(context, str, "asset_" + str);
    }

    /* renamed from: e */
    public static oma m21394e(Context context, String str, String str2) {
        return m21391b(str2, new CallableC12705d(context.getApplicationContext(), str, str2));
    }

    /* renamed from: f */
    public static nma m21395f(Context context, String str) {
        return m21396g(context, str, "asset_" + str);
    }

    /* renamed from: g */
    public static nma m21396g(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return m21398i(context.getAssets().open(str), str2);
            }
            return m21408s(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new nma((Throwable) e);
        }
    }

    /* renamed from: h */
    public static oma m21397h(InputStream inputStream, String str) {
        return m21391b(str, new CallableC12707f(inputStream, str));
    }

    /* renamed from: i */
    public static nma m21398i(InputStream inputStream, String str) {
        return m21399j(inputStream, str, true);
    }

    /* renamed from: j */
    public static nma m21399j(InputStream inputStream, String str, boolean z) throws IOException {
        try {
            return m21400k(ka9.m35227u(uac.m51310c(uac.m51316i(inputStream))), str);
        } finally {
            if (z) {
                hri.m31023c(inputStream);
            }
        }
    }

    /* renamed from: k */
    public static nma m21400k(ka9 ka9Var, String str) {
        return m21401l(ka9Var, str, true);
    }

    /* renamed from: l */
    public static nma m21401l(ka9 ka9Var, String str, boolean z) throws IOException {
        try {
            try {
                ama amaVarM23549a = dma.m23549a(ka9Var);
                if (str != null) {
                    bma.m19372b().m19374c(str, amaVarM23549a);
                }
                nma nmaVar = new nma(amaVarM23549a);
                if (z) {
                    hri.m31023c(ka9Var);
                }
                return nmaVar;
            } catch (Exception e) {
                nma nmaVar2 = new nma((Throwable) e);
                if (z) {
                    hri.m31023c(ka9Var);
                }
                return nmaVar2;
            }
        } catch (Throwable th) {
            if (z) {
                hri.m31023c(ka9Var);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static oma m21402m(Context context, int i) {
        return m21403n(context, i, m21412w(context, i));
    }

    /* renamed from: n */
    public static oma m21403n(Context context, int i, String str) {
        return m21391b(str, new CallableC12706e(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    /* renamed from: o */
    public static nma m21404o(Context context, int i) {
        return m21405p(context, i, m21412w(context, i));
    }

    /* renamed from: p */
    public static nma m21405p(Context context, int i, String str) {
        try {
            im1 im1VarM51310c = uac.m51310c(uac.m51316i(context.getResources().openRawResource(i)));
            return m21411v(im1VarM51310c).booleanValue() ? m21408s(new ZipInputStream(im1VarM51310c.o3()), str) : m21398i(im1VarM51310c.o3(), str);
        } catch (Resources.NotFoundException e) {
            return new nma((Throwable) e);
        }
    }

    /* renamed from: q */
    public static oma m21406q(Context context, String str) {
        return m21407r(context, str, "url_" + str);
    }

    /* renamed from: r */
    public static oma m21407r(Context context, String str, String str2) {
        return m21391b(str2, new CallableC12704c(context, str, str2));
    }

    /* renamed from: s */
    public static nma m21408s(ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return m21409t(zipInputStream, str);
        } finally {
            hri.m31023c(zipInputStream);
        }
    }

    /* renamed from: t */
    public static nma m21409t(ZipInputStream zipInputStream, String str) throws IOException {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            ama amaVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    amaVar = (ama) m21401l(ka9.m35227u(uac.m51310c(uac.m51316i(zipInputStream))), null, false).m40788b();
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    map.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (amaVar == null) {
                return new nma((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                hma hmaVarM21392c = m21392c(amaVar, (String) entry.getKey());
                if (hmaVarM21392c != null) {
                    hmaVarM21392c.m30813f(hri.m31032l((Bitmap) entry.getValue(), hmaVarM21392c.m30812e(), hmaVarM21392c.m30810c()));
                }
            }
            for (Map.Entry entry2 : amaVar.m17446j().entrySet()) {
                if (((hma) entry2.getValue()).m30808a() == null) {
                    return new nma((Throwable) new IllegalStateException("There is no image for " + ((hma) entry2.getValue()).m30809b()));
                }
            }
            if (str != null) {
                bma.m19372b().m19374c(str, amaVar);
            }
            return new nma(amaVar);
        } catch (IOException e) {
            return new nma((Throwable) e);
        }
    }

    /* renamed from: u */
    public static boolean m21410u(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: v */
    public static Boolean m21411v(im1 im1Var) {
        try {
            im1 im1VarPeek = im1Var.peek();
            for (byte b : f18320b) {
                if (im1VarPeek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            im1VarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            rja.m46865b("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    /* renamed from: w */
    public static String m21412w(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m21410u(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}

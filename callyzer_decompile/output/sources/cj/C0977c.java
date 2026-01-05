package cj;

import aj.C0161a;
import io.C3328c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import wi.C8059i;
import zi.j2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cj.c */
/* loaded from: classes.dex */
public final class C0977c {

    /* renamed from: e */
    public static final Charset f5791e = Charset.forName("UTF-8");

    /* renamed from: f */
    public static final int f5792f = 15;

    /* renamed from: g */
    public static final C0161a f5793g = new C0161a();

    /* renamed from: h */
    public static final C0975a f5794h = new C0975a(0);

    /* renamed from: i */
    public static final C0976b f5795i = new C0976b(0);

    /* renamed from: a */
    public final AtomicInteger f5796a = new AtomicInteger(0);

    /* renamed from: b */
    public final C0979e f5797b;

    /* renamed from: c */
    public final C3328c f5798c;

    /* renamed from: d */
    public final C8059i f5799d;

    public C0977c(C0979e c0979e, C3328c c3328c, C8059i c8059i) {
        this.f5797b = c0979e;
        this.f5798c = c3328c;
        this.f5799d = c8059i;
    }

    /* renamed from: a */
    public static void m2755a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: e */
    public static String m2756e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f5791e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static void m2757f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f5791e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: b */
    public final ArrayList m2758b() {
        ArrayList arrayList = new ArrayList();
        C0979e c0979e = this.f5797b;
        arrayList.addAll(C0979e.m2769x(((File) c0979e.f5807f).listFiles()));
        arrayList.addAll(C0979e.m2769x(((File) c0979e.f5808g).listFiles()));
        C0975a c0975a = f5794h;
        Collections.sort(arrayList, c0975a);
        List listM2769x = C0979e.m2769x(((File) c0979e.f5806e).listFiles());
        Collections.sort(listM2769x, c0975a);
        arrayList.addAll(listM2769x);
        return arrayList;
    }

    /* renamed from: c */
    public final NavigableSet m2759c() {
        return new TreeSet(C0979e.m2769x(((File) this.f5797b.f5805d).list())).descendingSet();
    }

    /* renamed from: d */
    public final void m2760d(j2 j2Var, String str, boolean z6) {
        C0979e c0979e = this.f5797b;
        int i10 = this.f5798c.m7651f().f9644a.f8363b;
        f5793g.getClass();
        try {
            m2757f(c0979e.m2781o(str, AbstractC5601a.m11238i("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f5796a.getAndIncrement())), z6 ? "_" : "")), C0161a.f499a.m8776q(j2Var));
        } catch (IOException unused) {
        }
        C0976b c0976b = new C0976b(1);
        c0979e.getClass();
        File file = new File((File) c0979e.f5805d, str);
        file.mkdirs();
        List<File> listM2769x = C0979e.m2769x(file.listFiles(c0976b));
        Collections.sort(listM2769x, new C0975a(1));
        int size = listM2769x.size();
        for (File file2 : listM2769x) {
            if (size <= i10) {
                return;
            }
            C0979e.m2767u(file2);
            size--;
        }
    }
}

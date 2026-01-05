package p001o;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public final class tt5 implements Closeable {

    /* renamed from: a */
    public final File f47694a;

    /* renamed from: b */
    public final File f47695b;

    /* renamed from: c */
    public final File f47696c;

    /* renamed from: d */
    public final File f47697d;

    /* renamed from: e */
    public final int f47698e;

    /* renamed from: f */
    public long f47699f;

    /* renamed from: g */
    public final int f47700g;

    /* renamed from: q */
    public Writer f47702q;

    /* renamed from: x */
    public int f47704x;

    /* renamed from: h */
    public long f47701h = 0;

    /* renamed from: s */
    public final LinkedHashMap f47703s = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: y */
    public long f47705y = 0;

    /* renamed from: H */
    public final ThreadPoolExecutor f47692H = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC17199b(null));

    /* renamed from: L */
    public final Callable f47693L = new CallableC17198a();

    /* renamed from: o.tt5$a */
    public class CallableC17198a implements Callable {
        public CallableC17198a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (tt5.this) {
                if (tt5.this.f47702q == null) {
                    return null;
                }
                tt5.this.j0();
                if (tt5.this.m50504O()) {
                    tt5.this.m50508Y();
                    tt5.this.f47704x = 0;
                }
                return null;
            }
        }
    }

    /* renamed from: o.tt5$b */
    public static final class ThreadFactoryC17199b implements ThreadFactory {
        public ThreadFactoryC17199b() {
        }

        public /* synthetic */ ThreadFactoryC17199b(CallableC17198a callableC17198a) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: o.tt5$c */
    public final class C17200c {

        /* renamed from: a */
        public final C17201d f47707a;

        /* renamed from: b */
        public final boolean[] f47708b;

        /* renamed from: c */
        public boolean f47709c;

        public /* synthetic */ C17200c(tt5 tt5Var, C17201d c17201d, CallableC17198a callableC17198a) {
            this(c17201d);
        }

        /* renamed from: a */
        public void m50515a() {
            tt5.this.m50510t(this, false);
        }

        /* renamed from: b */
        public void m50516b() {
            if (this.f47709c) {
                return;
            }
            try {
                m50515a();
            } catch (IOException unused) {
            }
        }

        /* renamed from: e */
        public void m50517e() {
            tt5.this.m50510t(this, true);
            this.f47709c = true;
        }

        /* renamed from: f */
        public File m50518f(int i) {
            File fileM50529k;
            synchronized (tt5.this) {
                if (this.f47707a.f47716f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f47707a.f47715e) {
                    this.f47708b[i] = true;
                }
                fileM50529k = this.f47707a.m50529k(i);
                tt5.this.f47694a.mkdirs();
            }
            return fileM50529k;
        }

        public C17200c(C17201d c17201d) {
            this.f47707a = c17201d;
            this.f47708b = c17201d.f47715e ? null : new boolean[tt5.this.f47700g];
        }
    }

    /* renamed from: o.tt5$d */
    public final class C17201d {

        /* renamed from: a */
        public final String f47711a;

        /* renamed from: b */
        public final long[] f47712b;

        /* renamed from: c */
        public File[] f47713c;

        /* renamed from: d */
        public File[] f47714d;

        /* renamed from: e */
        public boolean f47715e;

        /* renamed from: f */
        public C17200c f47716f;

        /* renamed from: g */
        public long f47717g;

        public /* synthetic */ C17201d(tt5 tt5Var, String str, CallableC17198a callableC17198a) {
            this(str);
        }

        /* renamed from: j */
        public File m50528j(int i) {
            return this.f47713c[i];
        }

        /* renamed from: k */
        public File m50529k(int i) {
            return this.f47714d[i];
        }

        /* renamed from: l */
        public String m50530l() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f47712b) {
                sb.append(TokenParser.SP);
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m50531m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m50532n(String[] strArr) throws IOException {
            if (strArr.length != tt5.this.f47700g) {
                throw m50531m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f47712b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m50531m(strArr);
                }
            }
        }

        public C17201d(String str) {
            this.f47711a = str;
            this.f47712b = new long[tt5.this.f47700g];
            this.f47713c = new File[tt5.this.f47700g];
            this.f47714d = new File[tt5.this.f47700g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < tt5.this.f47700g; i++) {
                sb.append(i);
                this.f47713c[i] = new File(tt5.this.f47694a, sb.toString());
                sb.append(".tmp");
                this.f47714d[i] = new File(tt5.this.f47694a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: o.tt5$e */
    public final class C17202e {

        /* renamed from: a */
        public final String f47719a;

        /* renamed from: b */
        public final long f47720b;

        /* renamed from: c */
        public final long[] f47721c;

        /* renamed from: d */
        public final File[] f47722d;

        public /* synthetic */ C17202e(tt5 tt5Var, String str, long j, File[] fileArr, long[] jArr, CallableC17198a callableC17198a) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File m50533a(int i) {
            return this.f47722d[i];
        }

        public C17202e(String str, long j, File[] fileArr, long[] jArr) {
            this.f47719a = str;
            this.f47720b = j;
            this.f47722d = fileArr;
            this.f47721c = jArr;
        }
    }

    public tt5(File file, int i, int i2, long j) {
        this.f47694a = file;
        this.f47698e = i;
        this.f47695b = new File(file, "journal");
        this.f47696c = new File(file, "journal.tmp");
        this.f47697d = new File(file, "journal.bkp");
        this.f47700g = i2;
        this.f47699f = j;
    }

    /* renamed from: C */
    public static void m50489C(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: J */
    public static void m50490J(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: Q */
    public static tt5 m50491Q(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                f0(file2, file3, false);
            }
        }
        tt5 tt5Var = new tt5(file, i, i2, j);
        if (tt5Var.f47695b.exists()) {
            try {
                tt5Var.m50506T();
                tt5Var.m50505S();
                return tt5Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                tt5Var.m50511u();
            }
        }
        file.mkdirs();
        tt5 tt5Var2 = new tt5(file, i, i2, j);
        tt5Var2.m50508Y();
        return tt5Var2;
    }

    public static void f0(File file, File file2, boolean z) throws IOException {
        if (z) {
            m50489C(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: s */
    public static void m50500s(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: D */
    public C17200c m50501D(String str) {
        return m50502H(str, -1L);
    }

    /* renamed from: H */
    public final synchronized C17200c m50502H(String str, long j) {
        m50509r();
        C17201d c17201d = (C17201d) this.f47703s.get(str);
        CallableC17198a callableC17198a = null;
        if (j != -1 && (c17201d == null || c17201d.f47717g != j)) {
            return null;
        }
        if (c17201d == null) {
            c17201d = new C17201d(this, str, callableC17198a);
            this.f47703s.put(str, c17201d);
        } else if (c17201d.f47716f != null) {
            return null;
        }
        C17200c c17200c = new C17200c(this, c17201d, callableC17198a);
        c17201d.f47716f = c17200c;
        this.f47702q.append((CharSequence) "DIRTY");
        this.f47702q.append(TokenParser.SP);
        this.f47702q.append((CharSequence) str);
        this.f47702q.append('\n');
        m50490J(this.f47702q);
        return c17200c;
    }

    /* renamed from: K */
    public synchronized C17202e m50503K(String str) {
        m50509r();
        C17201d c17201d = (C17201d) this.f47703s.get(str);
        if (c17201d == null) {
            return null;
        }
        if (!c17201d.f47715e) {
            return null;
        }
        for (File file : c17201d.f47713c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f47704x++;
        this.f47702q.append((CharSequence) "READ");
        this.f47702q.append(TokenParser.SP);
        this.f47702q.append((CharSequence) str);
        this.f47702q.append('\n');
        if (m50504O()) {
            this.f47692H.submit(this.f47693L);
        }
        return new C17202e(this, str, c17201d.f47717g, c17201d.f47713c, c17201d.f47712b, null);
    }

    /* renamed from: O */
    public final boolean m50504O() {
        int i = this.f47704x;
        return i >= 2000 && i >= this.f47703s.size();
    }

    /* renamed from: S */
    public final void m50505S() throws IOException {
        m50489C(this.f47696c);
        Iterator it = this.f47703s.values().iterator();
        while (it.hasNext()) {
            C17201d c17201d = (C17201d) it.next();
            int i = 0;
            if (c17201d.f47716f == null) {
                while (i < this.f47700g) {
                    this.f47701h += c17201d.f47712b[i];
                    i++;
                }
            } else {
                c17201d.f47716f = null;
                while (i < this.f47700g) {
                    m50489C(c17201d.m50528j(i));
                    m50489C(c17201d.m50529k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: T */
    public final void m50506T() throws IOException {
        f8g f8gVar = new f8g(new FileInputStream(this.f47695b), tqi.f47622a);
        try {
            String strM26287f = f8gVar.m26287f();
            String strM26287f2 = f8gVar.m26287f();
            String strM26287f3 = f8gVar.m26287f();
            String strM26287f4 = f8gVar.m26287f();
            String strM26287f5 = f8gVar.m26287f();
            if (!"libcore.io.DiskLruCache".equals(strM26287f) || !"1".equals(strM26287f2) || !Integer.toString(this.f47698e).equals(strM26287f3) || !Integer.toString(this.f47700g).equals(strM26287f4) || !"".equals(strM26287f5)) {
                throw new IOException("unexpected journal header: [" + strM26287f + ", " + strM26287f2 + ", " + strM26287f4 + ", " + strM26287f5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m50507X(f8gVar.m26287f());
                    i++;
                } catch (EOFException unused) {
                    this.f47704x = i - this.f47703s.size();
                    if (f8gVar.m26286d()) {
                        m50508Y();
                    } else {
                        this.f47702q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f47695b, true), tqi.f47622a));
                    }
                    tqi.m50346a(f8gVar);
                    return;
                }
            }
        } catch (Throwable th) {
            tqi.m50346a(f8gVar);
            throw th;
        }
    }

    /* renamed from: X */
    public final void m50507X(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f47703s.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C17201d c17201d = (C17201d) this.f47703s.get(strSubstring);
        CallableC17198a callableC17198a = null;
        if (c17201d == null) {
            c17201d = new C17201d(this, strSubstring, callableC17198a);
            this.f47703s.put(strSubstring, c17201d);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            c17201d.f47715e = true;
            c17201d.f47716f = null;
            c17201d.m50532n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c17201d.f47716f = new C17200c(this, c17201d, callableC17198a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: Y */
    public final synchronized void m50508Y() {
        Writer writer = this.f47702q;
        if (writer != null) {
            m50500s(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f47696c), tqi.f47622a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f47698e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f47700g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C17201d c17201d : this.f47703s.values()) {
                if (c17201d.f47716f != null) {
                    bufferedWriter.write("DIRTY " + c17201d.f47711a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + c17201d.f47711a + c17201d.m50530l() + '\n');
                }
            }
            m50500s(bufferedWriter);
            if (this.f47695b.exists()) {
                f0(this.f47695b, this.f47697d, true);
            }
            f0(this.f47696c, this.f47695b, false);
            this.f47697d.delete();
            this.f47702q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f47695b, true), tqi.f47622a));
        } catch (Throwable th) {
            m50500s(bufferedWriter);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f47702q == null) {
            return;
        }
        Iterator it = new ArrayList(this.f47703s.values()).iterator();
        while (it.hasNext()) {
            C17201d c17201d = (C17201d) it.next();
            if (c17201d.f47716f != null) {
                c17201d.f47716f.m50515a();
            }
        }
        j0();
        m50500s(this.f47702q);
        this.f47702q = null;
    }

    public synchronized boolean d0(String str) {
        m50509r();
        C17201d c17201d = (C17201d) this.f47703s.get(str);
        if (c17201d != null && c17201d.f47716f == null) {
            for (int i = 0; i < this.f47700g; i++) {
                File fileM50528j = c17201d.m50528j(i);
                if (fileM50528j.exists() && !fileM50528j.delete()) {
                    throw new IOException("failed to delete " + fileM50528j);
                }
                this.f47701h -= c17201d.f47712b[i];
                c17201d.f47712b[i] = 0;
            }
            this.f47704x++;
            this.f47702q.append((CharSequence) "REMOVE");
            this.f47702q.append(TokenParser.SP);
            this.f47702q.append((CharSequence) str);
            this.f47702q.append('\n');
            this.f47703s.remove(str);
            if (m50504O()) {
                this.f47692H.submit(this.f47693L);
            }
            return true;
        }
        return false;
    }

    public final void j0() {
        while (this.f47701h > this.f47699f) {
            d0((String) ((Map.Entry) this.f47703s.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: r */
    public final void m50509r() {
        if (this.f47702q == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: t */
    public final synchronized void m50510t(C17200c c17200c, boolean z) {
        C17201d c17201d = c17200c.f47707a;
        if (c17201d.f47716f != c17200c) {
            throw new IllegalStateException();
        }
        if (z && !c17201d.f47715e) {
            for (int i = 0; i < this.f47700g; i++) {
                if (!c17200c.f47708b[i]) {
                    c17200c.m50515a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!c17201d.m50529k(i).exists()) {
                    c17200c.m50515a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f47700g; i2++) {
            File fileM50529k = c17201d.m50529k(i2);
            if (!z) {
                m50489C(fileM50529k);
            } else if (fileM50529k.exists()) {
                File fileM50528j = c17201d.m50528j(i2);
                fileM50529k.renameTo(fileM50528j);
                long j = c17201d.f47712b[i2];
                long length = fileM50528j.length();
                c17201d.f47712b[i2] = length;
                this.f47701h = (this.f47701h - j) + length;
            }
        }
        this.f47704x++;
        c17201d.f47716f = null;
        if (c17201d.f47715e || z) {
            c17201d.f47715e = true;
            this.f47702q.append((CharSequence) "CLEAN");
            this.f47702q.append(TokenParser.SP);
            this.f47702q.append((CharSequence) c17201d.f47711a);
            this.f47702q.append((CharSequence) c17201d.m50530l());
            this.f47702q.append('\n');
            if (z) {
                long j2 = this.f47705y;
                this.f47705y = 1 + j2;
                c17201d.f47717g = j2;
            }
        } else {
            this.f47703s.remove(c17201d.f47711a);
            this.f47702q.append((CharSequence) "REMOVE");
            this.f47702q.append(TokenParser.SP);
            this.f47702q.append((CharSequence) c17201d.f47711a);
            this.f47702q.append('\n');
        }
        m50490J(this.f47702q);
        if (this.f47701h > this.f47699f || m50504O()) {
            this.f47692H.submit(this.f47693L);
        }
    }

    /* renamed from: u */
    public void m50511u() throws IOException {
        close();
        tqi.m50347b(this.f47694a);
    }
}

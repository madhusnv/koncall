package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p001o.sja;
import p001o.yw6;

/* loaded from: classes5.dex */
public final class yw6 {

    /* renamed from: i */
    public static final C18509c f56163i = new C18509c(null);

    /* renamed from: j */
    public static final String f56164j = yw6.class.getSimpleName();

    /* renamed from: k */
    public static final AtomicLong f56165k = new AtomicLong();

    /* renamed from: a */
    public final String f56166a;

    /* renamed from: b */
    public final C18511e f56167b;

    /* renamed from: c */
    public final File f56168c;

    /* renamed from: d */
    public boolean f56169d;

    /* renamed from: e */
    public boolean f56170e;

    /* renamed from: f */
    public final ReentrantLock f56171f;

    /* renamed from: g */
    public final Condition f56172g;

    /* renamed from: h */
    public final AtomicLong f56173h;

    /* renamed from: o.yw6$a */
    public static final class C18507a {

        /* renamed from: a */
        public static final C18507a f56174a = new C18507a();

        /* renamed from: b */
        public static final FilenameFilter f56175b = new FilenameFilter() { // from class: o.ww6
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return yw6.C18507a.m58413f(file, str);
            }
        };

        /* renamed from: c */
        public static final FilenameFilter f56176c = new FilenameFilter() { // from class: o.xw6
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return yw6.C18507a.m58414g(file, str);
            }
        };

        /* renamed from: f */
        public static final boolean m58413f(File file, String str) {
            sq8.m48648g(str, "filename");
            return !e9g.m24597K(str, "buffer", false, 2, null);
        }

        /* renamed from: g */
        public static final boolean m58414g(File file, String str) {
            sq8.m48648g(str, "filename");
            return e9g.m24597K(str, "buffer", false, 2, null);
        }

        /* renamed from: c */
        public final void m58415c(File file) {
            sq8.m48649h(file, "root");
            File[] fileArrListFiles = file.listFiles(m58417e());
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    file2.delete();
                }
            }
        }

        /* renamed from: d */
        public final FilenameFilter m58416d() {
            return f56175b;
        }

        /* renamed from: e */
        public final FilenameFilter m58417e() {
            return f56176c;
        }

        /* renamed from: h */
        public final File m58418h(File file) {
            return new File(file, "buffer" + yw6.f56165k.incrementAndGet());
        }
    }

    /* renamed from: o.yw6$b */
    public static final class C18508b extends OutputStream {

        /* renamed from: a */
        public final OutputStream f56177a;

        /* renamed from: b */
        public final InterfaceC18513g f56178b;

        public C18508b(OutputStream outputStream, InterfaceC18513g interfaceC18513g) {
            sq8.m48649h(outputStream, "innerStream");
            sq8.m48649h(interfaceC18513g, "callback");
            this.f56177a = outputStream;
            this.f56178b = interfaceC18513g;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                this.f56177a.close();
            } finally {
                this.f56178b.mo58425a();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f56177a.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            sq8.m48649h(bArr, "buffer");
            this.f56177a.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            sq8.m48649h(bArr, "buffer");
            this.f56177a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f56177a.write(i);
        }
    }

    /* renamed from: o.yw6$c */
    public static final class C18509c {
        public C18509c() {
        }

        public /* synthetic */ C18509c(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m58419a() {
            return yw6.f56164j;
        }
    }

    /* renamed from: o.yw6$e */
    public static final class C18511e {

        /* renamed from: a */
        public int f56181a = 1048576;

        /* renamed from: b */
        public int f56182b = 1024;

        /* renamed from: a */
        public final int m58420a() {
            return this.f56181a;
        }

        /* renamed from: b */
        public final int m58421b() {
            return this.f56182b;
        }
    }

    /* renamed from: o.yw6$f */
    public static final class C18512f implements Comparable {

        /* renamed from: c */
        public static final a f56183c = new a(null);

        /* renamed from: a */
        public final File f56184a;

        /* renamed from: b */
        public final long f56185b;

        /* renamed from: o.yw6$f$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C18512f(File file) {
            sq8.m48649h(file, TransferTable.COLUMN_FILE);
            this.f56184a = file;
            this.f56185b = file.lastModified();
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C18512f c18512f) {
            sq8.m48649h(c18512f, "another");
            long j = this.f56185b;
            long j2 = c18512f.f56185b;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.f56184a.compareTo(c18512f.f56184a);
        }

        /* renamed from: c */
        public final File m58423c() {
            return this.f56184a;
        }

        /* renamed from: d */
        public final long m58424d() {
            return this.f56185b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C18512f) && compareTo((C18512f) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.f56184a.hashCode()) * 37) + ((int) (this.f56185b % Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }
    }

    /* renamed from: o.yw6$g */
    public interface InterfaceC18513g {
        /* renamed from: a */
        void mo58425a();
    }

    /* renamed from: o.yw6$h */
    public static final class C18514h {

        /* renamed from: a */
        public static final C18514h f56186a = new C18514h();

        /* renamed from: a */
        public final JSONObject m58426a(InputStream inputStream) throws JSONException, IOException {
            sq8.m48649h(inputStream, "stream");
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = inputStream.read();
                if (i4 == -1) {
                    sja.C16851a c16851a = sja.f45482e;
                    bka bkaVar = bka.CACHE;
                    String strM58419a = yw6.f56163i.m58419a();
                    sq8.m48648g(strM58419a, "TAG");
                    c16851a.m48387b(bkaVar, strM58419a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (i4 & Constants.MAX_HOST_LENGTH);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int i5 = inputStream.read(bArr, i, i2 - i);
                if (i5 < 1) {
                    sja.C16851a c16851a2 = sja.f45482e;
                    bka bkaVar2 = bka.CACHE;
                    String strM58419a2 = yw6.f56163i.m58419a();
                    sq8.m48648g(strM58419a2, "TAG");
                    c16851a2.m48387b(bkaVar2, strM58419a2, "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + i2);
                    return null;
                }
                i += i5;
            }
            try {
                Object objNextValue = new JSONTokener(new String(bArr, sh2.f45422b)).nextValue();
                if (objNextValue instanceof JSONObject) {
                    return (JSONObject) objNextValue;
                }
                sja.C16851a c16851a3 = sja.f45482e;
                bka bkaVar3 = bka.CACHE;
                String strM58419a3 = yw6.f56163i.m58419a();
                sq8.m48648g(strM58419a3, "TAG");
                c16851a3.m48387b(bkaVar3, strM58419a3, "readHeader: expected JSONObject, got " + objNextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public final void m58427b(OutputStream outputStream, JSONObject jSONObject) throws IOException {
            sq8.m48649h(outputStream, "stream");
            sq8.m48649h(jSONObject, "header");
            String string = jSONObject.toString();
            sq8.m48648g(string, "header.toString()");
            byte[] bytes = string.getBytes(sh2.f45422b);
            sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & Constants.MAX_HOST_LENGTH);
            outputStream.write((bytes.length >> 8) & Constants.MAX_HOST_LENGTH);
            outputStream.write((bytes.length >> 0) & Constants.MAX_HOST_LENGTH);
            outputStream.write(bytes);
        }
    }

    /* renamed from: o.yw6$i */
    public static final class C18515i implements InterfaceC18513g {

        /* renamed from: a */
        public final /* synthetic */ long f56187a;

        /* renamed from: b */
        public final /* synthetic */ yw6 f56188b;

        /* renamed from: c */
        public final /* synthetic */ File f56189c;

        /* renamed from: d */
        public final /* synthetic */ String f56190d;

        public C18515i(long j, yw6 yw6Var, File file, String str) {
            this.f56187a = j;
            this.f56188b = yw6Var;
            this.f56189c = file;
            this.f56190d = str;
        }

        @Override // p001o.yw6.InterfaceC18513g
        /* renamed from: a */
        public void mo58425a() {
            if (this.f56187a < this.f56188b.f56173h.get()) {
                this.f56189c.delete();
            } else {
                this.f56188b.m58409m(this.f56190d, this.f56189c);
            }
        }
    }

    public yw6(String str, C18511e c18511e) {
        sq8.m48649h(str, "tag");
        sq8.m48649h(c18511e, "limits");
        this.f56166a = str;
        this.f56167b = c18511e;
        File file = new File(C10773c.m13024q(), str);
        this.f56168c = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f56171f = reentrantLock;
        this.f56172g = reentrantLock.newCondition();
        this.f56173h = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            C18507a.f56174a.m58415c(file);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ InputStream m58402g(yw6 yw6Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return yw6Var.m58405f(str, str2);
    }

    /* renamed from: j */
    public static /* synthetic */ OutputStream m58403j(yw6 yw6Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return yw6Var.m58407i(str, str2);
    }

    /* renamed from: l */
    public static final void m58404l(yw6 yw6Var) {
        sq8.m48649h(yw6Var, "this$0");
        yw6Var.m58410n();
    }

    /* renamed from: f */
    public final InputStream m58405f(String str, String str2) throws IOException {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        File file = new File(this.f56168c, cri.n0(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject jSONObjectM58426a = C18514h.f56186a.m58426a(bufferedInputStream);
                if (jSONObjectM58426a == null) {
                    return null;
                }
                if (!sq8.m48644c(jSONObjectM58426a.optString(TransferTable.COLUMN_KEY), str)) {
                    return null;
                }
                String strOptString = jSONObjectM58426a.optString("tag", null);
                if (str2 == null && !sq8.m48644c(str2, strOptString)) {
                    return null;
                }
                long time = new Date().getTime();
                sja.C16851a c16851a = sja.f45482e;
                bka bkaVar = bka.CACHE;
                String str3 = f56164j;
                sq8.m48648g(str3, "TAG");
                c16851a.m48387b(bkaVar, str3, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                file.setLastModified(time);
                return bufferedInputStream;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public final InputStream m58406h(String str, InputStream inputStream) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(inputStream, "input");
        return new C18510d(inputStream, m58403j(this, str, null, 2, null));
    }

    /* renamed from: i */
    public final OutputStream m58407i(String str, String str2) throws IOException {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        File fileM58418h = C18507a.f56174a.m58418h(this.f56168c);
        fileM58418h.delete();
        if (!fileM58418h.createNewFile()) {
            throw new IOException("Could not create file at " + fileM58418h.getAbsolutePath());
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C18508b(new FileOutputStream(fileM58418h), new C18515i(System.currentTimeMillis(), this, fileM58418h, str)), 8192);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TransferTable.COLUMN_KEY, str);
                    if (!cri.d0(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    C18514h.f56186a.m58427b(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    sja.C16851a c16851a = sja.f45482e;
                    bka bkaVar = bka.CACHE;
                    String str3 = f56164j;
                    sq8.m48648g(str3, "TAG");
                    c16851a.m48386a(bkaVar, 5, str3, "Error creating JSON header for cache file: " + e);
                    throw new IOException(e.getMessage());
                }
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            sja.C16851a c16851a2 = sja.f45482e;
            bka bkaVar2 = bka.CACHE;
            String str4 = f56164j;
            sq8.m48648g(str4, "TAG");
            c16851a2.m48386a(bkaVar2, 5, str4, "Error creating buffer output stream: " + e2);
            throw new IOException(e2.getMessage());
        }
    }

    /* renamed from: k */
    public final void m58408k() {
        ReentrantLock reentrantLock = this.f56171f;
        reentrantLock.lock();
        try {
            if (!this.f56169d) {
                this.f56169d = true;
                C10773c.m13028u().execute(new Runnable() { // from class: o.vw6
                    @Override // java.lang.Runnable
                    public final void run() {
                        yw6.m58404l(this.f50953a);
                    }
                });
            }
            y3i y3iVar = y3i.f54824a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public final void m58409m(String str, File file) {
        if (!file.renameTo(new File(this.f56168c, cri.n0(str)))) {
            file.delete();
        }
        m58408k();
    }

    /* renamed from: n */
    public final void m58410n() {
        long j;
        ReentrantLock reentrantLock = this.f56171f;
        reentrantLock.lock();
        try {
            this.f56169d = false;
            this.f56170e = true;
            y3i y3iVar = y3i.f54824a;
            reentrantLock.unlock();
            try {
                sja.C16851a c16851a = sja.f45482e;
                bka bkaVar = bka.CACHE;
                String str = f56164j;
                sq8.m48648g(str, "TAG");
                c16851a.m48387b(bkaVar, str, "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] fileArrListFiles = this.f56168c.listFiles(C18507a.f56174a.m58416d());
                long length = 0;
                if (fileArrListFiles != null) {
                    int length2 = fileArrListFiles.length;
                    int i = 0;
                    j = 0;
                    while (i < length2) {
                        File file = fileArrListFiles[i];
                        sq8.m48648g(file, TransferTable.COLUMN_FILE);
                        C18512f c18512f = new C18512f(file);
                        priorityQueue.add(c18512f);
                        sja.C16851a c16851a2 = sja.f45482e;
                        bka bkaVar2 = bka.CACHE;
                        String str2 = f56164j;
                        sq8.m48648g(str2, "TAG");
                        c16851a2.m48387b(bkaVar2, str2, "  trim considering time=" + Long.valueOf(c18512f.m58424d()) + " name=" + c18512f.m58423c().getName());
                        length += file.length();
                        j++;
                        i++;
                        fileArrListFiles = fileArrListFiles;
                    }
                } else {
                    j = 0;
                }
                while (true) {
                    if (length <= this.f56167b.m58420a() && j <= this.f56167b.m58421b()) {
                        this.f56171f.lock();
                        try {
                            this.f56170e = false;
                            this.f56172g.signalAll();
                            y3i y3iVar2 = y3i.f54824a;
                            return;
                        } finally {
                        }
                    }
                    File fileM58423c = ((C18512f) priorityQueue.remove()).m58423c();
                    sja.C16851a c16851a3 = sja.f45482e;
                    bka bkaVar3 = bka.CACHE;
                    String str3 = f56164j;
                    sq8.m48648g(str3, "TAG");
                    c16851a3.m48387b(bkaVar3, str3, "  trim removing " + fileM58423c.getName());
                    length -= fileM58423c.length();
                    j += -1;
                    fileM58423c.delete();
                }
            } catch (Throwable th) {
                this.f56171f.lock();
                try {
                    this.f56170e = false;
                    this.f56172g.signalAll();
                    y3i y3iVar3 = y3i.f54824a;
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.f56166a + " file:" + this.f56168c.getName() + '}';
    }

    /* renamed from: o.yw6$d */
    public static final class C18510d extends InputStream {

        /* renamed from: a */
        public final InputStream f56179a;

        /* renamed from: b */
        public final OutputStream f56180b;

        public C18510d(InputStream inputStream, OutputStream outputStream) {
            sq8.m48649h(inputStream, "input");
            sq8.m48649h(outputStream, "output");
            this.f56179a = inputStream;
            this.f56180b = outputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f56179a.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f56179a.close();
            } finally {
                this.f56180b.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            sq8.m48649h(bArr, "buffer");
            int i = this.f56179a.read(bArr);
            if (i > 0) {
                this.f56180b.write(bArr, 0, i);
            }
            return i;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j) {
                int i = read(bArr, 0, (int) Math.min(j - j2, 1024));
                if (i < 0) {
                    return j2;
                }
                j2 += i;
            }
            return j2;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i = this.f56179a.read();
            if (i >= 0) {
                this.f56180b.write(i);
            }
            return i;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            sq8.m48649h(bArr, "buffer");
            int i3 = this.f56179a.read(bArr, i, i2);
            if (i3 > 0) {
                this.f56180b.write(bArr, i, i3);
            }
            return i3;
        }
    }
}

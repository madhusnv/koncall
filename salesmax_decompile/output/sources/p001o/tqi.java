package p001o;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* loaded from: classes5.dex */
public abstract class tqi {

    /* renamed from: a */
    public static final Charset f47622a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f47623b = Charset.forName(HTTP.UTF_8);

    /* renamed from: a */
    public static void m50346a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m50347b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m50347b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}

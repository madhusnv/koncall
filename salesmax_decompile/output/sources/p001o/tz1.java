package p001o;

import ai.salesmax.model.Tasks;
import android.os.Environment;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class tz1 {

    /* renamed from: a */
    public final String f48104a = "TCCallRecordings";

    /* renamed from: b */
    public final File f48105b = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "TCCallRecordings");

    /* renamed from: d */
    public static final boolean m50792d(File file) {
        sq8.m48649h(file, "obj");
        return file.isFile();
    }

    /* renamed from: b */
    public final String m50793b(Tasks tasks) {
        sq8.m48649h(tasks, "newCall");
        File fileM50794c = m50794c(this.f48105b);
        if ((fileM50794c != null ? sq8.m48652k(fileM50794c.lastModified(), tasks.getCallStartTime()) : -2) <= -1) {
            return "";
        }
        String canonicalPath = fileM50794c != null ? fileM50794c.getCanonicalPath() : null;
        return canonicalPath == null ? "" : canonicalPath;
    }

    /* renamed from: c */
    public final File m50794c(File file) {
        File file2 = null;
        File[] fileArrListFiles = file != null ? file.listFiles(new FileFilter() { // from class: o.sz1
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                return tz1.m50792d(file3);
            }
        }) : null;
        if (fileArrListFiles != null) {
            Iterator itM45707a = qo0.m45707a(fileArrListFiles);
            long jLastModified = Long.MIN_VALUE;
            while (itM45707a.hasNext()) {
                File file3 = (File) itM45707a.next();
                if (file3.lastModified() > jLastModified) {
                    jLastModified = file3.lastModified();
                    file2 = file3;
                }
            }
        }
        return file2;
    }
}

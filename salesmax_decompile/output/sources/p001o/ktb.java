package p001o;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class ktb {

    /* renamed from: a */
    public final kma f32704a;

    public ktb(kma kmaVar) {
        this.f32704a = kmaVar;
    }

    /* renamed from: b */
    public static String m36215b(String str, qw6 qw6Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? qw6Var.tempExtension() : qw6Var.extension);
        return sb.toString();
    }

    /* renamed from: a */
    public Pair m36216a(String str) {
        try {
            File fileM36217c = m36217c(str);
            if (fileM36217c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileM36217c);
            qw6 qw6Var = fileM36217c.getAbsolutePath().endsWith(".zip") ? qw6.ZIP : qw6.JSON;
            rja.m46864a("Cache hit for " + str + " at " + fileM36217c.getAbsolutePath());
            return new Pair(qw6Var, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final File m36217c(String str) {
        File file = new File(m36218d(), m36215b(str, qw6.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m36218d(), m36215b(str, qw6.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    public final File m36218d() {
        File fileMo35930a = this.f32704a.mo35930a();
        if (fileMo35930a.isFile()) {
            fileMo35930a.delete();
        }
        if (!fileMo35930a.exists()) {
            fileMo35930a.mkdirs();
        }
        return fileMo35930a;
    }

    /* renamed from: e */
    public void m36219e(String str, qw6 qw6Var) {
        File file = new File(m36218d(), m36215b(str, qw6Var, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        rja.m46864a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        rja.m46866c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* renamed from: f */
    public File m36220f(String str, InputStream inputStream, qw6 qw6Var) throws IOException {
        File file = new File(m36218d(), m36215b(str, qw6Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}

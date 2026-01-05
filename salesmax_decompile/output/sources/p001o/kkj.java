package p001o;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public final class kkj {

    /* renamed from: a */
    public final Context f32362a;

    public kkj(Context context) {
        this.f32362a = context;
    }

    /* renamed from: b */
    public static long m35821b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jM35821b = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jM35821b += m35821b(file2);
            }
        }
        return jM35821b;
    }

    /* renamed from: a */
    public final long m35822a() {
        return m35821b(new File(this.f32362a.getFilesDir(), "assetpacks"));
    }
}

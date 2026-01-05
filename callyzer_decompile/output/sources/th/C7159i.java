package th;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: th.i */
/* loaded from: classes.dex */
public final class C7159i {

    /* renamed from: a */
    public final Context f34408a;

    public C7159i(Context context) {
        this.f34408a = context;
    }

    /* renamed from: a */
    public static long m13419a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jM13419a = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jM13419a += m13419a(file2);
            }
        }
        return jM13419a;
    }
}

package og;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a */
    public static final /* synthetic */ int f26606a = 0;

    /* renamed from: a */
    public static final File m10743a(Context context, String fileName) {
        AbstractC4154l.m8923f(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}

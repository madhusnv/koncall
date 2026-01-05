package uh;

import android.os.Process;
import i0.m0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uh.h */
/* loaded from: classes.dex */
public abstract class AbstractC7463h {

    /* renamed from: a */
    public static final HashMap f36052a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f36052a = new HashMap();
        m0.m7377j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PlayCoreVersion");
    }
}

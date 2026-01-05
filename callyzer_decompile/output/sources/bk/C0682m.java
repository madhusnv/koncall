package bk;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.m */
/* loaded from: classes.dex */
public final class C0682m {

    /* renamed from: a */
    public final HashSet f4285a = new HashSet();

    /* renamed from: b */
    public final Executor f4286b;

    /* renamed from: c */
    public final C0674e f4287c;

    /* renamed from: d */
    public final C0674e f4288d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C0682m(Executor executor, C0674e c0674e, C0674e c0674e2) {
        this.f4286b = executor;
        this.f4287c = c0674e;
        this.f4288d = c0674e2;
    }
}

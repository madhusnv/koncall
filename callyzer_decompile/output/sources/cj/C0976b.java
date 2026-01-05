package cj;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cj.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0976b implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ int f5790a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f5790a) {
            case 0:
                return str.startsWith("event");
            case 1:
                return str.startsWith("event") && !str.endsWith("_");
            case 2:
                return str.startsWith("aqs.");
            default:
                return str.startsWith(".ae");
        }
    }
}

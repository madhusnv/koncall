package o6;

import ex.InterfaceC2137a;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.k */
/* loaded from: classes.dex */
public final class C5309k extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f26073a;

    /* renamed from: b */
    public final /* synthetic */ C5321w f26074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5309k(C5321w c5321w, int i10) {
        super(0);
        this.f26073a = i10;
        this.f26074b = c5321w;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() throws IOException {
        switch (this.f26073a) {
            case 0:
                return ((f0) this.f26074b.f26190j.getValue()).f26038c;
            default:
                c0 c0Var = this.f26074b.f26181a;
                File canonicalFile = ((File) c0Var.f26012c.invoke()).getCanonicalFile();
                synchronized (c0.f26009e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = c0.f26008d;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    AbstractC4154l.m8922e(path, "path");
                    linkedHashSet.add(path);
                }
                return new f0(canonicalFile, c0Var.f26010a, (j0) c0Var.f26011b.invoke(canonicalFile), new b0(0, canonicalFile));
        }
    }
}

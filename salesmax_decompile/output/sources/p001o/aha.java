package p001o;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public abstract class aha {

    /* renamed from: o.aha$a */
    public interface InterfaceC12172a {
        wga onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(wga wgaVar, Object obj);

        void onLoaderReset(wga wgaVar);
    }

    /* renamed from: b */
    public static aha m17056b(xca xcaVar) {
        return new bha(xcaVar, ((lxi) xcaVar).getViewModelStore());
    }

    /* renamed from: a */
    public abstract void mo17057a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract wga mo17058c(int i, Bundle bundle, InterfaceC12172a interfaceC12172a);

    /* renamed from: d */
    public abstract void mo17059d();
}

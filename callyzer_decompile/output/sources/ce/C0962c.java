package ce;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import ge.C2580l;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ce.c */
/* loaded from: classes.dex */
public final class C0962c implements InterfaceC0961b {
    @Override // ce.InterfaceC0961b
    /* renamed from: a */
    public final String mo2725a(Object obj, C2580l c2580l) {
        Uri uri = (Uri) obj;
        if (!AbstractC4154l.m8918a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        Configuration configuration = c2580l.f14045a.getResources().getConfiguration();
        Bitmap.Config[] configArr = AbstractC4066g.f20920a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}

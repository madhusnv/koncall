package ym;

import android.net.Uri;
import kk.AbstractC4092l;
import kk.C4095o;
import kk.InterfaceC4091k;
import kk.InterfaceC4096p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.k */
/* loaded from: classes3.dex */
public final class C8700k implements InterfaceC4096p, InterfaceC4091k {
    @Override // kk.InterfaceC4096p
    /* renamed from: a */
    public final C4095o mo7643a(Object obj) {
        return new C4095o(String.valueOf((Uri) obj));
    }

    @Override // kk.InterfaceC4091k
    /* renamed from: b */
    public final Object mo7644b(AbstractC4092l abstractC4092l) {
        String strMo8868c;
        if (abstractC4092l == null || (strMo8868c = abstractC4092l.mo8868c()) == null) {
            return null;
        }
        return Uri.parse(strMo8868c);
    }
}

package lj;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import jj.InterfaceC3780e;
import jj.InterfaceC3781f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lj.c */
/* loaded from: classes.dex */
public final class C4480c implements InterfaceC3780e {

    /* renamed from: a */
    public static final SimpleDateFormat f22304a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f22304a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // jj.InterfaceC3776a
    /* renamed from: a */
    public final void mo5788a(Object obj, Object obj2) {
        ((InterfaceC3781f) obj2).add(f22304a.format((Date) obj));
    }
}

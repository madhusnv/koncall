package ae;

import android.net.Uri;
import ge.C2580l;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6366p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ae.j */
/* loaded from: classes.dex */
public final class C0129j implements InterfaceC0126g {

    /* renamed from: a */
    public final C6366p f411a;

    /* renamed from: b */
    public final C6366p f412b;

    /* renamed from: c */
    public final boolean f413c;

    public C0129j(C6366p c6366p, C6366p c6366p2, boolean z6) {
        this.f411a = c6366p;
        this.f412b = c6366p2;
        this.f413c = z6;
    }

    @Override // ae.InterfaceC0126g
    /* renamed from: a */
    public final InterfaceC0127h mo299a(Object obj, C2580l c2580l) {
        Uri uri = (Uri) obj;
        if (!AbstractC4154l.m8918a(uri.getScheme(), "http") && !AbstractC4154l.m8918a(uri.getScheme(), "https")) {
            return null;
        }
        return new C0132m(uri.toString(), c2580l, this.f411a, this.f412b, this.f413c);
    }
}

package ae;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ge.C2580l;
import java.io.File;
import java.nio.ByteBuffer;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ae.a */
/* loaded from: classes.dex */
public final class C0120a implements InterfaceC0126g {

    /* renamed from: a */
    public final /* synthetic */ int f398a;

    public /* synthetic */ C0120a(int i10) {
        this.f398a = i10;
    }

    @Override // ae.InterfaceC0126g
    /* renamed from: a */
    public final InterfaceC0127h mo299a(Object obj, C2580l c2580l) {
        switch (this.f398a) {
            case 0:
                Uri uri = (Uri) obj;
                if (AbstractC4066g.m8842c(uri)) {
                    return new C0121b(uri, c2580l, 0);
                }
                return null;
            case 1:
                return new C0122c((Bitmap) obj, c2580l, 0);
            case 2:
                return new C0122c((ByteBuffer) obj, c2580l, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (AbstractC4154l.m8918a(uri2.getScheme(), "content")) {
                    return new C0123d(uri2, c2580l);
                }
                return null;
            case 4:
                return new C0122c((Drawable) obj, c2580l, 2);
            case 5:
                return new C0128i((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (AbstractC4154l.m8918a(uri3.getScheme(), "android.resource")) {
                    return new C0121b(uri3, c2580l, 1);
                }
                return null;
        }
    }
}

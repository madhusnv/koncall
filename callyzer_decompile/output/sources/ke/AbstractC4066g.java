package ke;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import he.C2910a;
import he.EnumC2915f;
import iz.C3389v;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import pg.AbstractC5935p;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ke.g */
/* loaded from: classes.dex */
public abstract class AbstractC4066g {

    /* renamed from: a */
    public static final Bitmap.Config[] f20920a;

    /* renamed from: b */
    public static final Bitmap.Config f20921b;

    /* renamed from: c */
    public static final C3389v f20922c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f20920a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f20921b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f20922c = new C3389v((String[]) new ArrayList(20).toArray(new String[0]));
    }

    /* renamed from: a */
    public static final void m8840a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final String m8841b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || AbstractC5178p.m10101L(str)) {
            return null;
        }
        String strE0 = AbstractC5178p.e0(AbstractC5178p.e0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(AbstractC5178p.b0('.', AbstractC5178p.b0('/', strE0, strE0), ""));
    }

    /* renamed from: c */
    public static final boolean m8842c(Uri uri) {
        return AbstractC4154l.m8918a(uri.getScheme(), TransferTable.COLUMN_FILE) && AbstractC4154l.m8918a((String) AbstractC6663m.m12743G(uri.getPathSegments()), "android_asset");
    }

    /* renamed from: d */
    public static final int m8843d(AbstractC5935p abstractC5935p, EnumC2915f enumC2915f) {
        if (abstractC5935p instanceof C2910a) {
            return ((C2910a) abstractC5935p).f15944b;
        }
        int i10 = AbstractC4065f.f20919a[enumC2915f.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}

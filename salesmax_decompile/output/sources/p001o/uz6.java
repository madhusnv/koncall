package p001o;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class uz6 {

    /* renamed from: a */
    public static final uz6 f49700a = new uz6();

    /* renamed from: a */
    public final String m52177a() {
        return "scan-" + new SimpleDateFormat("dd-MMM-yyyy-hh:mm a", Locale.getDefault()).format(new Date()) + ".pdf";
    }

    /* renamed from: b */
    public final boolean m52178b(String str) {
        sq8.m48649h(str, "name");
        return e9g.m24597K(str, ".", false, 2, null);
    }

    /* renamed from: c */
    public final String m52179c(Context context, Uri uri) {
        sq8.m48649h(context, "context");
        sq8.m48649h(uri, "fileUri");
        String type2 = context.getContentResolver().getType(uri);
        if (type2 == null) {
            type2 = URLConnection.guessContentTypeFromName(uri.toString());
        }
        return type2 == null ? "" : type2;
    }

    /* renamed from: d */
    public final String m52180d(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "filePath");
        String type2 = context.getContentResolver().getType(Uri.fromFile(new File(str)));
        return type2 == null ? URLConnection.guessContentTypeFromName(str) : type2;
    }
}

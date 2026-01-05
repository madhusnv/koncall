package nf;

import b2.C0554l;
import com.amplifyframework.storage.ObjectMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import rf.C6506k;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nf.c */
/* loaded from: classes.dex */
public final class RunnableC5041c implements Runnable {

    /* renamed from: c */
    public static final C0554l f24803c = new C0554l("RevokeAccessOperation", new String[0]);

    /* renamed from: a */
    public final String f24804a;

    /* renamed from: b */
    public final C6506k f24805b;

    public RunnableC5041c(String str) {
        AbstractC6840z.m13033d(str);
        this.f24804a = str;
        this.f24805b = new C6506k(null);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        C0554l c0554l = f24803c;
        Status status = Status.f6004g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f24804a).openConnection();
            httpURLConnection.setRequestProperty(ObjectMetadata.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f6002e;
            } else {
                c0554l.m1635d("Unable to revoke access!", new Object[0]);
            }
            String str = "Response Code: " + responseCode;
            Object[] objArr = new Object[0];
            if (c0554l.f3778b <= 3) {
                c0554l.m1635d(str, objArr);
            }
        } catch (IOException e2) {
            c0554l.m1635d("IOException when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        } catch (Exception e10) {
            c0554l.m1635d("Exception when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        }
        this.f24805b.m3097e(status);
    }
}

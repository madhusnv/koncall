package wj;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;
import pg.u6;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.l */
/* loaded from: classes.dex */
public final class C8086l implements Closeable {

    /* renamed from: a */
    public final URL f38713a;

    /* renamed from: b */
    public volatile Future f38714b;

    /* renamed from: c */
    public C8656m f38715c;

    public C8086l(URL url) {
        this.f38713a = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38714b.cancel(true);
    }

    /* renamed from: h */
    public final Bitmap m15222h() throws IOException {
        boolean zIsLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f38713a;
        if (zIsLoggable) {
            Objects.toString(url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrM11882c = u6.m11882c(new C8078d(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArrM11882c.length;
                Objects.toString(url);
            }
            if (bArrM11882c.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM11882c, 0, bArrM11882c.length);
            if (bitmapDecodeByteArray != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Objects.toString(url);
                }
                return bitmapDecodeByteArray;
            }
            throw new IOException("Failed to decode image: " + url);
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}

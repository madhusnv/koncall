package jf;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jf.c */
/* loaded from: classes.dex */
public final class C3760c extends Thread {

    /* renamed from: a */
    public final /* synthetic */ HashMap f19635a;

    public C3760c(HashMap map) {
        this.f19635a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap map = this.f19635a;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String string = builderBuildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    new StringBuilder(String.valueOf(string).length() + 65);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e2) {
            e = e2;
            String message = e.getMessage();
            new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
        } catch (IndexOutOfBoundsException e10) {
            String message2 = e10.getMessage();
            new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
        } catch (RuntimeException e11) {
            e = e11;
            String message3 = e.getMessage();
            new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

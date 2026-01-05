package p001o;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public class ze5 implements lma {
    @Override // p001o.lma
    /* renamed from: a */
    public fma mo37470a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new ye5(httpURLConnection);
    }
}

package p020v;

import android.content.Intent;
import android.media.Image;
import android.util.Log;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import c0.b1;
import c0.d1;
import cj.C0979e;
import com.amplifyframework.storage.ObjectMetadata;
import com.google.crypto.tink.shaded.protobuf.C1377d;
import com.google.firebase.encoders.EncodingException;
import i0.c1;
import i0.v0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k4.C4001v;
import l0.AbstractC4308h;
import l0.C4310j;
import l0.InterfaceC4301a;
import l4.C4367l;
import lj.C4481d;
import lj.C4482e;
import mf.C4719b;
import mq.C4833a;
import og.f1;
import og.u1;
import pg.l8;
import qi.RunnableC6224g;
import ug.C7439j;
import ve.C7708b;
import we.C8011m;
import we.C8019u;
import wi.C8052b;
import wi.CallableC8060j;
import wj.AbstractC8098x;
import wj.C8100z;
import x0.C8250a;
import x4.C8299i;
import x4.InterfaceC8300j;
import y4.C8553n;
import yg.C8656m;
import yg.InterfaceC8644a;
import yg.InterfaceC8646c;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements InterfaceC8300j, InterfaceC4301a, c1, InterfaceC8644a, InterfaceC8646c {

    /* renamed from: a */
    public final /* synthetic */ int f36482a;

    /* renamed from: b */
    public final /* synthetic */ Object f36483b;

    public /* synthetic */ b0(int i10, Object obj) {
        this.f36482a = i10;
        this.f36483b = obj;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        switch (this.f36482a) {
            case 0:
                d1 d1Var = (d1) this.f36483b;
                ((Executor) d1Var.f5072g).execute(new RunnableC6224g(14, d1Var, c8299i));
                return "FetchData for CameraAvailability";
            default:
                C7597g c7597g = (C7597g) this.f36483b;
                c7597g.f36543c = c8299i;
                return "RequestCompleteListener[" + c7597g + "]";
        }
    }

    /* renamed from: a */
    public C1377d m14347a(C7439j c7439j) {
        C7708b c7708b = (C7708b) this.f36483b;
        URL url = (URL) c7439j.f35537b;
        if (Log.isLoggable(f1.m10639c("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c7708b.f37237g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty(ObjectMetadata.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(ObjectMetadata.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c7439j.f35538c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C4001v c4001v = c7708b.f37231a;
                    C8011m c8011m = (C8011m) c7439j.f35539d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C4481d c4481d = (C4481d) c4001v.f20704b;
                    C4482e c4482e = new C4482e(bufferedWriter, c4481d.f22309a, c4481d.f22310b, c4481d.f22311c, c4481d.f22312d);
                    c4482e.m9330g(c8011m);
                    c4482e.m9332i();
                    c4482e.f22314b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(f1.m10639c("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    f1.m10638b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(ObjectMetadata.CONTENT_TYPE));
                    f1.m10638b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(ObjectMetadata.CONTENT_ENCODING));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C1377d(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C1377d(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField(ObjectMetadata.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C1377d c1377d = new C1377d(responseCode, null, C8019u.m15168a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f38539a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c1377d;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException | IOException unused) {
            Log.isLoggable(f1.m10639c("CctTransportBackend"), 6);
            return new C1377d(400, null, 0L);
        } catch (ConnectException | UnknownHostException unused2) {
            Log.isLoggable(f1.m10639c("CctTransportBackend"), 6);
            return new C1377d(500, null, 0L);
        }
    }

    @Override // l0.InterfaceC4301a, p016r.InterfaceC6409a
    public InterfaceFutureC8957d apply(Object obj) {
        switch (this.f36482a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f36483b;
                List list = (List) obj;
                Objects.toString(list);
                u1.m10942a("SyncCaptureSessionBase");
                return list.isEmpty() ? new C4310j(1, new IllegalArgumentException("Unable to open capture session without surfaces")) : list.contains(null) ? new C4310j(1, new DeferrableSurface$SurfaceClosedException((v0) arrayList.get(list.indexOf(null)), "Surface closed")) : AbstractC4308h.m9033c(list);
            default:
                return (InterfaceFutureC8957d) ((C4833a) this.f36483b).invoke(obj);
        }
    }

    /* renamed from: b */
    public float m14348b(float f6) {
        return ((C8553n) this.f36483b).f41529k.mo155a() * f6;
    }

    @Override // i0.c1
    /* renamed from: d */
    public void mo18d(i0.d1 d1Var) throws Exception {
        Image imageE0;
        switch (this.f36482a) {
            case 2:
                C4719b c4719b = (C4719b) this.f36483b;
                c4719b.getClass();
                try {
                    b1 b1VarMo1878h = d1Var.mo1878h();
                    if (b1VarMo1878h != null) {
                        ((C4367l) c4719b.f23617f).m9137q(b1VarMo1878h);
                        return;
                    }
                    return;
                } catch (IllegalStateException e2) {
                    e2.getMessage();
                    u1.m10943b("ZslControlImpl");
                    return;
                }
            default:
                C8250a c8250a = (C8250a) this.f36483b;
                synchronized (c8250a.f39396a) {
                    try {
                        if (c8250a.f39399d) {
                            return;
                        }
                        b1 b1VarMo1870D = d1Var.mo1870D();
                        if (b1VarMo1870D != null && (imageE0 = b1VarMo1870D.e0()) != null) {
                            if (c8250a.f39402g) {
                                long j6 = c8250a.f39403h;
                                if (j6 != -1) {
                                    imageE0.setTimestamp(j6);
                                }
                            }
                            c8250a.f39397b.queueInputImage(imageE0);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // yg.InterfaceC8644a
    /* renamed from: f */
    public Object mo20f(C8656m c8656m) {
        boolean z6;
        switch (this.f36482a) {
            case 4:
                ((C0979e) this.f36483b).getClass();
                if (c8656m.m15985l()) {
                    C8052b c8052b = (C8052b) c8656m.m15983j();
                    String str = c8052b.f38571b;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    File file = c8052b.f38572c;
                    z6 = true;
                    if (file.delete()) {
                        file.getPath();
                        Log.isLoggable("FirebaseCrashlytics", 3);
                    } else {
                        file.getPath();
                    }
                } else {
                    c8656m.m15982i();
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 5:
                ((CountDownLatch) this.f36483b).countDown();
                return null;
            case 10:
                return (C8656m) ((CallableC8060j) this.f36483b).call();
            default:
                ((Runnable) this.f36483b).run();
                return l8.m11765f(null);
        }
    }

    @Override // yg.InterfaceC8646c
    /* renamed from: j */
    public void mo22j(C8656m c8656m) {
        switch (this.f36482a) {
            case 6:
                AbstractC8098x.m15282b((Intent) this.f36483b);
                break;
            case 7:
                ((C8100z) this.f36483b).f38767b.m15971d(null);
                break;
            default:
                ((ScheduledFuture) this.f36483b).cancel(false);
                break;
        }
    }

    public /* synthetic */ b0(g1 g1Var, ArrayList arrayList) {
        this.f36482a = 1;
        this.f36483b = arrayList;
    }
}

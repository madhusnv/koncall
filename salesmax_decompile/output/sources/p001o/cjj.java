package p001o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzl;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzsg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class cjj {

    /* renamed from: b */
    public static final Executor f18258b = fna.m27127d();

    /* renamed from: a */
    public final Context f18259a;

    public cjj(Context context) {
        this.f18259a = context;
    }

    /* renamed from: c */
    public static cjj m21327c(Context context) {
        return new cjj(context);
    }

    /* renamed from: e */
    public static void m21328e(String str, Exception exc) {
    }

    /* renamed from: a */
    public final Uri m21329a(Uri uri, String str) throws IOException {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return null;
        }
        File file = new File(this.f18259a.getCacheDir(), "mlkit_docscan_ui_client");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, SystemClock.elapsedRealtimeNanos() + str);
        try {
            Context context = this.f18259a;
            InputStream inputStreamZza = zzl.zza(context, uri, (Objects.equals(context.getPackageName(), "com.google.android.gms") || !scheme.equals(FirebaseAnalytics.Param.CONTENT)) ? zzk.zzc : zzk.zza);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamZza.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            Uri uriFromFile = Uri.fromFile(file2);
                            fileOutputStream.close();
                            inputStreamZza.close();
                            return uriFromFile;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            m21328e("Failed to save file to local: ".concat(uri.toString()), e);
            return null;
        }
    }

    /* renamed from: b */
    public final Task m21330b(final int i, final Intent intent) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f18258b.execute(new Runnable() { // from class: o.xij
            /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:6:0x000f, B:8:0x002b, B:10:0x0031, B:12:0x0037, B:15:0x0046, B:17:0x004e, B:21:0x0058, B:27:0x0063, B:28:0x006e), top: B:36:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x005d, PHI: r5
              0x0058: PHI (r5v3 android.net.Uri) = (r5v7 android.net.Uri), (r5v5 android.net.Uri) binds: [B:16:0x004c, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:6:0x000f, B:8:0x002b, B:10:0x0031, B:12:0x0037, B:15:0x0046, B:17:0x004e, B:21:0x0058, B:27:0x0063, B:28:0x006e), top: B:36:0x000f }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i2 = i;
                cjj cjjVar = this.f53833a;
                Intent intent2 = intent;
                GmsDocumentScanningResult gmsDocumentScanningResultM15792d = null;
                gmsDocumentScanningResultM15792d = null;
                gmsDocumentScanningResultM15792d = null;
                Uri uri = null;
                gmsDocumentScanningResultM15792d = null;
                if (i2 == -1 && intent2 != null) {
                    try {
                        ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("uri_array_extra_result_image_uris");
                        Uri uri2 = (Uri) intent2.getParcelableExtra("uri_extra_result_pdf_uri");
                        int intExtra = intent2.getIntExtra("int_extra_result_page_count", 0);
                        ArrayList arrayList = new ArrayList();
                        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                            int size = parcelableArrayListExtra.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                Uri uriM21329a = cjjVar.m21329a((Uri) parcelableArrayListExtra.get(i3), ".jpg");
                                if (uriM21329a == null) {
                                    break;
                                }
                                arrayList.add(uriM21329a);
                            }
                            if (uri2 == null) {
                            }
                        } else if (uri2 == null) {
                            gmsDocumentScanningResultM15792d = GmsDocumentScanningResult.m15792d(arrayList, uri, intExtra);
                        } else {
                            Uri uriM21329a2 = cjjVar.m21329a(uri2, ".pdf");
                            if (uriM21329a2 != null) {
                                uri = uriM21329a2;
                                gmsDocumentScanningResultM15792d = GmsDocumentScanningResult.m15792d(arrayList, uri, intExtra);
                            }
                        }
                    } catch (Throwable th) {
                        if (intent2 != null) {
                            cjjVar.m21331d(intent2.getStringExtra("string_extra_session_id"));
                        }
                        throw th;
                    }
                }
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (gmsDocumentScanningResultM15792d == null) {
                    taskCompletionSource2.setException(new IllegalStateException("Failed to handle result"));
                } else {
                    taskCompletionSource2.setResult(gmsDocumentScanningResultM15792d);
                }
                if (intent2 != null) {
                    cjjVar.m21331d(intent2.getStringExtra("string_extra_session_id"));
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: d */
    public final void m21331d(final String str) {
        if (str == null) {
            return;
        }
        try {
            Tasks.await(new njj(this.f18259a).doRead(TaskApiCall.builder().setFeatures(oec.f38252u).run(new RemoteCall() { // from class: o.gjj
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    Api.ClientKey clientKey = njj.f36962a;
                    ((zzsg) ((qjj) obj).getService()).zzc(str);
                    ((TaskCompletionSource) obj2).setResult(null);
                }
            }).setMethodKey(24337).build()));
        } catch (InterruptedException | ExecutionException e) {
            m21328e("Failed to cleanup GMS Core cache", e);
        }
    }
}

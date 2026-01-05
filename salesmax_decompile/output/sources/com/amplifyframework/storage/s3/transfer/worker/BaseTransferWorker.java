package com.amplifyframework.storage.s3.transfer.worker;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.amplifyframework.storage.ObjectMetadata;
import com.amplifyframework.storage.s3.transfer.ProgressListener;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.bce;
import p001o.dgf;
import p001o.dh3;
import p001o.gk8;
import p001o.h6c;
import p001o.h6g;
import p001o.hsa;
import p001o.kf9;
import p001o.oq1;
import p001o.s3e;
import p001o.sme;
import p001o.sq1;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public interface BaseTransferWorker {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String MULTIPART_UPLOAD = "MULTIPART_UPLOAD";
    public static final String MULTI_PART_UPLOAD_ID = "multipartUploadId";
    public static final String OUTPUT_TRANSFER_RECORD_ID = "OUTPUT_TRANSFER_RECORD_ID";
    public static final String PART_RECORD_ID = "PART_RECORD_ID";
    public static final String RUN_AS_FOREGROUND_TASK = "RUN_AS_FOREGROUND_TASK";
    public static final String TRANSFER_RECORD_ID = "TRANSFER_RECORD_ID";
    public static final String WORKER_ID = "WORKER_ID";
    public static final String completionRequestTag = "COMPLETION_REQUEST_TAG_%s";
    public static final String initiationRequestTag = "INITIATION_REQUEST_TAG_%s";

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Map<String, h6c> CANNED_ACL_MAP;
        public static final String MULTIPART_UPLOAD = "MULTIPART_UPLOAD";
        public static final String MULTI_PART_UPLOAD_ID = "multipartUploadId";
        public static final String OUTPUT_TRANSFER_RECORD_ID = "OUTPUT_TRANSFER_RECORD_ID";
        public static final String PART_RECORD_ID = "PART_RECORD_ID";
        public static final String RUN_AS_FOREGROUND_TASK = "RUN_AS_FOREGROUND_TASK";
        public static final String TRANSFER_RECORD_ID = "TRANSFER_RECORD_ID";
        public static final String WORKER_ID = "WORKER_ID";
        public static final String completionRequestTag = "COMPLETION_REQUEST_TAG_%s";
        public static final String initiationRequestTag = "INITIATION_REQUEST_TAG_%s";

        static {
            List listM29838a = h6c.f26235a.m29838a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(listM29838a, 10)), 16));
            for (Object obj : listM29838a) {
                linkedHashMap.put(((h6c) obj).mo29837b(), obj);
            }
            CANNED_ACL_MAP = linkedHashMap;
        }

        private Companion() {
        }
    }

    public static final class DefaultImpls {
        public static s3e createPutObjectRequest(BaseTransferWorker baseTransferWorker, TransferRecord transferRecord, ProgressListener progressListener) {
            sq8.m48649h(transferRecord, "transferRecord");
            return s3e.f44658N.m47667a(new C107041(transferRecord, new File(transferRecord.getFile())));
        }

        public static boolean isNetworkAvailable(BaseTransferWorker baseTransferWorker, Context context) {
            sq8.m48649h(context, "context");
            Object systemService = context.getSystemService("connectivity");
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            if (Build.VERSION.SDK_INT >= 29) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3))) {
                    return true;
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.amplifyframework.storage.s3.transfer.worker.BaseTransferWorker$createPutObjectRequest$1 */
    public static final class C107041 extends kf9 implements xk7 {
        final /* synthetic */ File $file;
        final /* synthetic */ TransferRecord $transferRecord;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107041(TransferRecord transferRecord, File file) {
            super(1);
            this.$transferRecord = transferRecord;
            this.$file = file;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s3e.C16737a) obj);
            return y3i.f54824a;
        }

        public final void invoke(s3e.C16737a c16737a) {
            String str;
            sq8.m48649h(c16737a, "$this$invoke");
            c16737a.m47631Q(this.$transferRecord.getBucketName());
            c16737a.m47638X(this.$transferRecord.getKey());
            c16737a.m47630P(sq1.m48629d(oq1.f38709b, this.$file));
            c16737a.m47632R(this.$transferRecord.getHeaderCacheControl());
            c16737a.m47633S(this.$transferRecord.getHeaderContentDisposition());
            String sseAlgorithm = this.$transferRecord.getSseAlgorithm();
            c16737a.a0(sseAlgorithm != null ? dgf.f19804a.m23075a(sseAlgorithm) : null);
            c16737a.b0(this.$transferRecord.getSseKMSKey());
            c16737a.m47634T(this.$transferRecord.getHeaderContentEncoding());
            c16737a.m47636V(this.$transferRecord.getHeaderContentType());
            String httpExpires = this.$transferRecord.getHttpExpires();
            c16737a.m47637W(httpExpires != null ? gk8.f25374b.m28959b(httpExpires) : null);
            c16737a.m47639Y(this.$transferRecord.getUserMetadata());
            c16737a.m47635U(this.$transferRecord.getMd5());
            String headerStorageClass = this.$transferRecord.getHeaderStorageClass();
            c16737a.c0(headerStorageClass != null ? h6g.f26258a.m29845a(headerStorageClass) : null);
            Map<String, String> userMetadata = this.$transferRecord.getUserMetadata();
            c16737a.e0(userMetadata != null ? userMetadata.get(ObjectMetadata.REDIRECT_LOCATION) : null);
            String cannedAcl = this.$transferRecord.getCannedAcl();
            c16737a.m47629O(cannedAcl != null ? (h6c) Companion.CANNED_ACL_MAP.get(cannedAcl) : null);
            Map<String, String> userMetadata2 = this.$transferRecord.getUserMetadata();
            c16737a.m47640Z((userMetadata2 == null || (str = userMetadata2.get(ObjectMetadata.REQUESTER_PAYS_HEADER)) == null) ? null : sme.f45648a.m48559a(str));
            Map<String, String> userMetadata3 = this.$transferRecord.getUserMetadata();
            c16737a.d0(userMetadata3 != null ? userMetadata3.get(ObjectMetadata.S3_TAGGING) : null);
        }
    }

    s3e createPutObjectRequest(TransferRecord transferRecord, ProgressListener progressListener);

    boolean isNetworkAvailable(Context context);
}

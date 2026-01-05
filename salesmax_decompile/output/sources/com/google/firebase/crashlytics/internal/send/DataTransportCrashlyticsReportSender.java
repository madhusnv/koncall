package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;
import p001o.cxh;
import p001o.dvh;
import p001o.fr1;
import p001o.n76;
import p001o.rwh;

/* loaded from: classes4.dex */
public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private final ReportQueue reportQueue;
    private final dvh transportTransform;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final dvh DEFAULT_TRANSFORM = new dvh() { // from class: o.nz4
        @Override // p001o.dvh
        public final Object apply(Object obj) {
            return DataTransportCrashlyticsReportSender.lambda$static$0((CrashlyticsReport) obj);
        }
    };

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, dvh dvhVar) {
        this.reportQueue = reportQueue;
        this.transportTransform = dvhVar;
    }

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        cxh.m22043f(context);
        rwh rwhVarM22047g = cxh.m22041c().m22047g(new fr1(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
        n76 n76VarM40202b = n76.m40202b("json");
        dvh dvhVar = DEFAULT_TRANSFORM;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(rwhVarM22047g.mo47214a(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, n76VarM40202b, dvhVar), settingsProvider.getSettingsSync(), onDemandCounter), dvhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$static$0(CrashlyticsReport crashlyticsReport) {
        return TRANSFORM.reportToJson(crashlyticsReport).getBytes(Charset.forName(HTTP.UTF_8));
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public Task<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, z).getTask();
    }
}

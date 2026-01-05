package ai.salesmax.call.recon;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.call.recon.RecordingReconWorker;
import ai.salesmax.model.CallEngagement;
import ai.salesmax.util.Prefs;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import p001o.e9g;
import p001o.f9g;
import p001o.h4e;
import p001o.h96;
import p001o.id5;
import p001o.ife;
import p001o.ke1;
import p001o.kf9;
import p001o.n64;
import p001o.q83;
import p001o.rc7;
import p001o.rz1;
import p001o.sq8;
import p001o.tu1;
import p001o.wz6;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class RecordingReconWorker extends CoroutineWorker {
    private static final String TAG = "call-recording-worker";
    private final Context context;
    private final WorkerParameters workerParameters;
    public static final C0069a Companion = new C0069a(null);
    public static final int $stable = 8;

    /* renamed from: ai.salesmax.call.recon.RecordingReconWorker$a */
    public static final class C0069a {
        public C0069a() {
        }

        public /* synthetic */ C0069a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: ai.salesmax.call.recon.RecordingReconWorker$b */
    public static final class C0070b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C0070b f282a = new C0070b();

        public C0070b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h96 h96Var) {
            return Boolean.valueOf(sq8.m48644c(h96Var.m29988G(), Boolean.FALSE) && sq8.m48644c(h96Var.m29999c(), "CONNECTED"));
        }
    }

    /* renamed from: ai.salesmax.call.recon.RecordingReconWorker$c */
    public static final class C0071c extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ String f284b;

        /* renamed from: c */
        public final /* synthetic */ String f285c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0071c(String str, String str2) {
            super(1);
            this.f284b = str;
            this.f285c = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m159a(h96 h96Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            Long lM47304b;
            Long lM47304b2;
            StringBuilder sb = new StringBuilder();
            sb.append("Processing to retry for the engagement: ");
            sb.append(h96Var);
            if (h96Var.m29990I() != null) {
                RecordingReconWorker recordingReconWorker = RecordingReconWorker.this;
                CallEngagement callEngagementM29996O = h96Var.m29996O();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Retrying to update recording to the engagement with engagement: ");
                sb2.append(h96Var);
                sb2.append(" already attached: ");
                sb2.append(callEngagementM29996O);
                tu1.f47778e.m50641a().G0(recordingReconWorker.getContext(), callEngagementM29996O);
                return;
            }
            RecordingReconWorker recordingReconWorker2 = RecordingReconWorker.this;
            String str = this.f284b;
            String str2 = this.f285c;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Processing to retry without recording attached already for: ");
            sb3.append(h96Var);
            Long lM30003g = h96Var.m30003g();
            Long lM30002f = h96Var.m30002f();
            if (str == null || lM30003g == null) {
                return;
            }
            long jLongValue = lM30003g.longValue();
            CallEngagement callEngagementM29996O2 = h96Var.m29996O();
            y3i y3iVar = null;
            if (Build.VERSION.SDK_INT < 30) {
                rz1 rz1VarM55448e = wz6.m55448e(wz6.f52913a, recordingReconWorker2.getContext(), str, jLongValue, null, 8, null);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Closest match found: ");
                sb4.append(rz1VarM55448e);
                Long lValueOf = Long.valueOf(((rz1VarM55448e == null || (lM47304b = rz1VarM55448e.m47304b()) == null) ? 0L : lM47304b.longValue()) - (lM30002f != null ? lM30002f.longValue() : 0L));
                if (!(lValueOf.longValue() <= 10000)) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    lValueOf.longValue();
                    callEngagementM29996O2.setCallRecording(rz1VarM55448e);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Retrying to update recording to the engagement: ");
                    sb5.append(callEngagementM29996O2);
                    tu1.f47778e.m50641a().G0(recordingReconWorker2.getContext(), callEngagementM29996O2);
                    y3iVar = y3i.f54824a;
                }
                if (y3iVar == null) {
                    FirebaseCrashlytics.getInstance().recordException(new RuntimeException("Could not match recording for engagement - " + callEngagementM29996O2.getId() + " - nearestFile is " + rz1VarM55448e));
                    return;
                }
                return;
            }
            if (str2 != null) {
                rz1 rz1VarM29807e = h4e.f26198a.m29807e(recordingReconWorker2.getContext(), jLongValue);
                if (rz1VarM29807e != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Closest match found: ");
                    sb6.append(rz1VarM29807e);
                    Long lM47304b3 = rz1VarM29807e.m47304b();
                    if (Math.abs((lM47304b3 != null ? lM47304b3.longValue() : 0L) - (lM30002f != null ? lM30002f.longValue() : 0L)) > 10000) {
                        FirebaseCrashlytics.getInstance().recordException(new RuntimeException("Could not match recording for engagement - " + callEngagementM29996O2.getId() + " - nearestFile is " + rz1VarM29807e));
                        y3iVar = y3i.f54824a;
                    } else {
                        if ((lM30002f != null ? lM30002f.longValue() : 0L) > 0) {
                            callEngagementM29996O2.setCallRecording(rz1VarM29807e);
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Retrying to update recording to the engagement: ");
                            sb7.append(callEngagementM29996O2);
                            tu1.f47778e.m50641a().G0(recordingReconWorker2.getContext(), callEngagementM29996O2);
                        }
                        y3iVar = y3i.f54824a;
                    }
                }
                if (y3iVar == null) {
                    rz1 rz1VarM55451d = wz6.f52913a.m55451d(recordingReconWorker2.getContext(), str, jLongValue, str2);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Closest match found: ");
                    sb8.append(rz1VarM55451d);
                    if (Math.abs(((rz1VarM55451d == null || (lM47304b2 = rz1VarM55451d.m47304b()) == null) ? 0L : lM47304b2.longValue()) - (lM30002f != null ? lM30002f.longValue() : 0L)) <= 10000) {
                        callEngagementM29996O2.setCallRecording(rz1VarM55451d);
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("Retrying to update recording to the engagement: ");
                        sb9.append(callEngagementM29996O2);
                        tu1.f47778e.m50641a().G0(recordingReconWorker2.getContext(), callEngagementM29996O2);
                        return;
                    }
                    FirebaseCrashlytics.getInstance().recordException(new RuntimeException("Could not match recording for engagement - " + callEngagementM29996O2.getId() + " - nearestFile is " + rz1VarM55451d));
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            m159a((h96) obj);
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingReconWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.context = context;
        this.workerParameters = workerParameters;
    }

    private final void handleProcessedEngagements(List<h96> list, String str, String str2) {
        Stream<h96> stream;
        if (list == null || (stream = list.stream()) == null) {
            return;
        }
        final C0070b c0070b = C0070b.f282a;
        Stream<h96> streamFilter = stream.filter(new Predicate() { // from class: o.jfe
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return RecordingReconWorker.handleProcessedEngagements$lambda$21(c0070b, obj);
            }
        });
        if (streamFilter != null) {
            final C0071c c0071c = new C0071c(str, str2);
            streamFilter.forEach(new Consumer() { // from class: o.kfe
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    RecordingReconWorker.handleProcessedEngagements$lambda$22(c0071c, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleProcessedEngagements$lambda$21(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleProcessedEngagements$lambda$22(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    private final boolean processedRecording(rz1 rz1Var, List<h96> list) {
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (sq8.m48644c(((h96) next).m29990I(), rz1Var.m47308f())) {
                    obj = next;
                    break;
                }
            }
            obj = (h96) obj;
        }
        return obj == null;
    }

    private final String relativePath(Uri uri) {
        String path;
        List listD0 = (uri == null || (path = uri.getPath()) == null) ? null : f9g.D0(path, new String[]{":"}, false, 0, 6, null);
        if ((listD0 == null || listD0.isEmpty()) || listD0.size() <= 1) {
            return null;
        }
        return (String) listD0.get(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c7 A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:28:0x00d2, B:30:0x00d8, B:35:0x00e3, B:37:0x00e9, B:40:0x00f3, B:42:0x00f9, B:44:0x010a, B:48:0x013a, B:51:0x015a, B:63:0x0173, B:64:0x017c, B:66:0x0182, B:68:0x018f, B:74:0x01a3, B:75:0x01a7, B:76:0x01b0, B:78:0x01b6, B:80:0x01c3, B:81:0x01c7, B:82:0x01cb, B:84:0x01d1, B:87:0x01e4, B:97:0x01f9, B:100:0x021e, B:101:0x0229, B:103:0x022f, B:105:0x023c, B:106:0x0240, B:107:0x0244, B:109:0x024a, B:98:0x020c, B:122:0x02c0, B:124:0x02c7, B:126:0x02f0, B:125:0x02df, B:111:0x0267, B:112:0x0282, B:114:0x0288, B:116:0x0295, B:117:0x0299, B:118:0x029d, B:120:0x02a3), top: B:133:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02df A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:28:0x00d2, B:30:0x00d8, B:35:0x00e3, B:37:0x00e9, B:40:0x00f3, B:42:0x00f9, B:44:0x010a, B:48:0x013a, B:51:0x015a, B:63:0x0173, B:64:0x017c, B:66:0x0182, B:68:0x018f, B:74:0x01a3, B:75:0x01a7, B:76:0x01b0, B:78:0x01b6, B:80:0x01c3, B:81:0x01c7, B:82:0x01cb, B:84:0x01d1, B:87:0x01e4, B:97:0x01f9, B:100:0x021e, B:101:0x0229, B:103:0x022f, B:105:0x023c, B:106:0x0240, B:107:0x0244, B:109:0x024a, B:98:0x020c, B:122:0x02c0, B:124:0x02c7, B:126:0x02f0, B:125:0x02df, B:111:0x0267, B:112:0x0282, B:114:0x0288, B:116:0x0295, B:117:0x0299, B:118:0x029d, B:120:0x02a3), top: B:133:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3 A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:28:0x00d2, B:30:0x00d8, B:35:0x00e3, B:37:0x00e9, B:40:0x00f3, B:42:0x00f9, B:44:0x010a, B:48:0x013a, B:51:0x015a, B:63:0x0173, B:64:0x017c, B:66:0x0182, B:68:0x018f, B:74:0x01a3, B:75:0x01a7, B:76:0x01b0, B:78:0x01b6, B:80:0x01c3, B:81:0x01c7, B:82:0x01cb, B:84:0x01d1, B:87:0x01e4, B:97:0x01f9, B:100:0x021e, B:101:0x0229, B:103:0x022f, B:105:0x023c, B:106:0x0240, B:107:0x0244, B:109:0x024a, B:98:0x020c, B:122:0x02c0, B:124:0x02c7, B:126:0x02f0, B:125:0x02df, B:111:0x0267, B:112:0x0282, B:114:0x0288, B:116:0x0295, B:117:0x0299, B:118:0x029d, B:120:0x02a3), top: B:133:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a A[Catch: all -> 0x0320, TRY_LEAVE, TryCatch #0 {all -> 0x0320, blocks: (B:28:0x00d2, B:30:0x00d8, B:35:0x00e3, B:37:0x00e9, B:40:0x00f3, B:42:0x00f9, B:44:0x010a, B:48:0x013a, B:51:0x015a, B:63:0x0173, B:64:0x017c, B:66:0x0182, B:68:0x018f, B:74:0x01a3, B:75:0x01a7, B:76:0x01b0, B:78:0x01b6, B:80:0x01c3, B:81:0x01c7, B:82:0x01cb, B:84:0x01d1, B:87:0x01e4, B:97:0x01f9, B:100:0x021e, B:101:0x0229, B:103:0x022f, B:105:0x023c, B:106:0x0240, B:107:0x0244, B:109:0x024a, B:98:0x020c, B:122:0x02c0, B:124:0x02c7, B:126:0x02f0, B:125:0x02df, B:111:0x0267, B:112:0x0282, B:114:0x0288, B:116:0x0295, B:117:0x0299, B:118:0x029d, B:120:0x02a3), top: B:133:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173 A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:28:0x00d2, B:30:0x00d8, B:35:0x00e3, B:37:0x00e9, B:40:0x00f3, B:42:0x00f9, B:44:0x010a, B:48:0x013a, B:51:0x015a, B:63:0x0173, B:64:0x017c, B:66:0x0182, B:68:0x018f, B:74:0x01a3, B:75:0x01a7, B:76:0x01b0, B:78:0x01b6, B:80:0x01c3, B:81:0x01c7, B:82:0x01cb, B:84:0x01d1, B:87:0x01e4, B:97:0x01f9, B:100:0x021e, B:101:0x0229, B:103:0x022f, B:105:0x023c, B:106:0x0240, B:107:0x0244, B:109:0x024a, B:98:0x020c, B:122:0x02c0, B:124:0x02c7, B:126:0x02f0, B:125:0x02df, B:111:0x0267, B:112:0x0282, B:114:0x0288, B:116:0x0295, B:117:0x0299, B:118:0x029d, B:120:0x02a3), top: B:133:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e1  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(n64 n64Var) {
        String str;
        long j;
        long jMin;
        boolean z;
        boolean z2;
        String str2;
        long j2;
        boolean z3;
        boolean z4;
        Uri uriM3252n;
        StringBuilder sb = new StringBuilder();
        sb.append("Worker start for ");
        sb.append("RECORDING_RECONCILIATION");
        Data inputData = this.workerParameters.getInputData();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Data passed for processing: ");
        sb2.append(inputData);
        try {
            ke1 ke1VarM35525a = ke1.f32003i.m35525a();
            if (ke1VarM35525a == null) {
                ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
                sq8.m48648g(resultRetry, "retry(...)");
                return resultRetry;
            }
            String string = this.workerParameters.getInputData().getString("accountId");
            if (string == null) {
                ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
                sq8.m48648g(resultFailure, "failure(...)");
                return resultFailure;
            }
            String string2 = this.workerParameters.getInputData().getString("userId");
            if (string2 == null) {
                ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
                sq8.m48648g(resultFailure2, "failure(...)");
                return resultFailure2;
            }
            long j3 = this.workerParameters.getInputData().getLong("start", System.currentTimeMillis());
            Data inputData2 = this.workerParameters.getInputData();
            h4e h4eVar = h4e.f26198a;
            long j4 = inputData2.getLong("end", h4eVar.m29804b());
            long j5 = this.workerParameters.getInputData().getLong("threshold", h4eVar.m29809g());
            q83 q83VarM35518t = ke1VarM35525a.m35518t("RECORDING_RECONCILIATION", string, string2);
            long jMin2 = Math.min(j4, System.currentTimeMillis());
            if (q83VarM35518t != null) {
                j = j4;
                jMin = Math.min(Math.max(q83VarM35518t.m44966g(), j5), Math.max(j3, j5));
            } else {
                j = j4;
                jMin = j3;
            }
            Prefs prefsM127c = SuperfoneApplication.f225c.m127c();
            if (prefsM127c != null) {
                str = "failure(...)";
                z = prefsM127c.m3251m();
                if (!z) {
                    try {
                        z2 = (prefsM127c.m3252n() == null && prefsM127c.m3253o() == null) ? false : true;
                    } catch (Throwable unused) {
                        ListenableWorker.Result resultFailure3 = ListenableWorker.Result.failure();
                        sq8.m48648g(resultFailure3, str);
                        return resultFailure3;
                    }
                }
                String string3 = (prefsM127c != null || (uriM3252n = prefsM127c.m3252n()) == null) ? null : uriM3252n.toString();
                String strM3253o = prefsM127c == null ? prefsM127c.m3253o() : null;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Recording flag received: ");
                sb3.append(z2);
                if (z2) {
                    str2 = string2;
                } else {
                    List listM35517s = ke1VarM35525a.m35517s(jMin2);
                    StringBuilder sb4 = new StringBuilder();
                    str2 = string2;
                    sb4.append("Recording is enabled: ");
                    sb4.append(z2);
                    sb4.append(" with storage: ");
                    sb4.append(strM3253o);
                    sb4.append(" and uri: ");
                    sb4.append(string3);
                    handleProcessedEngagements(listM35517s, strM3253o, string3);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        if (string3 != null) {
                            List listM29808f = h4eVar.m29808f(this.context, jMin, jMin2);
                            String strRelativePath = relativePath(Uri.parse(string3));
                            if (!listM29808f.isEmpty()) {
                                if (!(strRelativePath == null || strRelativePath.length() == 0)) {
                                    z3 = true;
                                }
                                if (z3) {
                                }
                                if (listM29808f == null) {
                                }
                            } else {
                                z3 = false;
                                if (z3) {
                                    listM29808f = null;
                                }
                                if (listM29808f == null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : listM29808f) {
                                        rz1 rz1Var = (rz1) obj;
                                        if (rz1Var.m47310h() != null) {
                                            String strM47310h = rz1Var.m47310h();
                                            sq8.m48646e(strRelativePath);
                                            z4 = e9g.m24595I(strM47310h, strRelativePath, true);
                                            if (!z4) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        if (!z4) {
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : arrayList) {
                                        if (processedRecording((rz1) obj2, listM35517s)) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        ife.f28606f.m32075a().m32065d((rz1) it.next());
                                    }
                                } else {
                                    boolean z5 = true;
                                    if (strM3253o != null) {
                                        if (strM3253o.length() <= 0) {
                                            z5 = false;
                                        }
                                        if ((z5 ? strM3253o : null) != null) {
                                            Set setM55450c = i >= 30 ? wz6.f52913a.m55450c(this.context, strM3253o, jMin, jMin2, string3) : wz6.f52913a.m55449b(this.context, strM3253o, jMin, jMin2);
                                            if (setM55450c != null) {
                                                ArrayList<rz1> arrayList3 = new ArrayList();
                                                for (Object obj3 : setM55450c) {
                                                    if (processedRecording((rz1) obj3, listM35517s)) {
                                                        arrayList3.add(obj3);
                                                    }
                                                }
                                                for (rz1 rz1Var2 : arrayList3) {
                                                    StringBuilder sb5 = new StringBuilder();
                                                    sb5.append("Enqueuing recording which is not mapped: ");
                                                    sb5.append(rz1Var2);
                                                    ife.f28606f.m32075a().m32065d(rz1Var2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (strM3253o != null) {
                        Set setM55449b = wz6.f52913a.m55449b(this.context, strM3253o, jMin, jMin2);
                        ArrayList<rz1> arrayList4 = new ArrayList();
                        for (Object obj4 : setM55449b) {
                            if (processedRecording((rz1) obj4, listM35517s)) {
                                arrayList4.add(obj4);
                            }
                        }
                        for (rz1 rz1Var3 : arrayList4) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Enqueuing recording which is not mapped: ");
                            sb6.append(rz1Var3);
                            ife.f28606f.m32075a().m32065d(rz1Var3);
                        }
                    }
                }
                long j6 = jMin2 - 60000;
                if (q83VarM35518t == null) {
                    ke1VarM35525a.m35503G(q83.m44960b(q83VarM35518t, 0, null, null, null, j6, 15, null));
                    j2 = j;
                } else {
                    j2 = j;
                    ke1VarM35525a.m35524z(new q83(0, "RECORDING_RECONCILIATION", string, str2, jMin2, 1, null));
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Process completed success for Worker: ");
                sb7.append("RECORDING_RECONCILIATION");
                sb7.append(" with boundary: [");
                sb7.append(j3);
                sb7.append(", ");
                sb7.append(j2);
                sb7.append("]");
                ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                sq8.m48648g(resultSuccess, "success(...)");
                return resultSuccess;
            }
            str = "failure(...)";
            if (!z) {
            }
            if (prefsM127c != null) {
            }
            if (prefsM127c == null) {
            }
            StringBuilder sb32 = new StringBuilder();
            sb32.append("Recording flag received: ");
            sb32.append(z2);
            if (z2) {
            }
            long j62 = jMin2 - 60000;
            if (q83VarM35518t == null) {
            }
            StringBuilder sb72 = new StringBuilder();
            sb72.append("Process completed success for Worker: ");
            sb72.append("RECORDING_RECONCILIATION");
            sb72.append(" with boundary: [");
            sb72.append(j3);
            sb72.append(", ");
            sb72.append(j2);
            sb72.append("]");
            ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
            sq8.m48648g(resultSuccess2, "success(...)");
            return resultSuccess2;
        } catch (Throwable unused2) {
            str = "failure(...)";
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(n64 n64Var) {
        rc7 rc7Var = rc7.f43371a;
        Context applicationContext = getApplicationContext();
        sq8.m48648g(applicationContext, "getApplicationContext(...)");
        return rc7Var.m46509a(applicationContext);
    }
}

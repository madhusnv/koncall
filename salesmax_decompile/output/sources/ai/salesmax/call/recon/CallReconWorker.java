package ai.salesmax.call.recon;

import ai.salesmax.AbstractC0059a;
import ai.salesmax.call.recon.CallReconWorker;
import ai.salesmax.model.CallEvent;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p001o.ch3;
import p001o.cv1;
import p001o.dh3;
import p001o.eu5;
import p001o.h4e;
import p001o.h84;
import p001o.h96;
import p001o.hv1;
import p001o.i84;
import p001o.id5;
import p001o.jgg;
import p001o.ke1;
import p001o.kf9;
import p001o.ml1;
import p001o.n64;
import p001o.nif;
import p001o.nl7;
import p001o.q83;
import p001o.rc7;
import p001o.rm1;
import p001o.sq8;
import p001o.tu1;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class CallReconWorker extends CoroutineWorker {
    private static final String TAG = "call-recon-worker";
    private final Context context;
    private final WorkerParameters workerParameters;
    public static final C0061a Companion = new C0061a(null);
    public static final int $stable = 8;

    /* renamed from: ai.salesmax.call.recon.CallReconWorker$a */
    public static final class C0061a {
        public C0061a() {
        }

        public /* synthetic */ C0061a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: ai.salesmax.call.recon.CallReconWorker$b */
    public static final class C0062b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C0062b f265a = new C0062b();

        public C0062b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h96 h96Var) {
            return Boolean.valueOf(sq8.m48644c(h96Var.m29985D(), Boolean.FALSE));
        }
    }

    /* renamed from: ai.salesmax.call.recon.CallReconWorker$c */
    public static final class C0063c extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ AtomicInteger f267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0063c(AtomicInteger atomicInteger) {
            super(1);
            this.f267b = atomicInteger;
        }

        /* renamed from: a */
        public final void m154a(h96 h96Var) {
            StringBuilder sb = new StringBuilder();
            sb.append("Submitting processed non persisted engagement for retry persisting: ");
            sb.append(h96Var);
            tu1.f47778e.m50641a().F0(CallReconWorker.this.context, h96Var.m29996O());
            this.f267b.incrementAndGet();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m154a((h96) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: ai.salesmax.call.recon.CallReconWorker$d */
    public static final class C0064d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C0064d f268a = new C0064d();

        public C0064d() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(h96 h96Var) {
            return h96Var.m30016t();
        }
    }

    /* renamed from: ai.salesmax.call.recon.CallReconWorker$e */
    public static final class C0065e extends jgg implements nl7 {

        /* renamed from: a */
        public int f269a;

        /* renamed from: b */
        public final /* synthetic */ ke1 f270b;

        /* renamed from: c */
        public final /* synthetic */ List f271c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0065e(ke1 ke1Var, List list, n64 n64Var) {
            super(2, n64Var);
            this.f270b = ke1Var;
            this.f271c = list;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C0065e(this.f270b, this.f271c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f269a;
            if (i == 0) {
                wre.m54934b(obj);
                ke1 ke1Var = this.f270b;
                List list = this.f271c;
                this.f269a = 1;
                if (ke1Var.m35522x(list, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C0065e) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallReconWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "context");
        sq8.m48649h(workerParameters, "workerParameters");
        this.context = context;
        this.workerParameters = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String doWork$lambda$10$lambda$9$lambda$2(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (String) xk7Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doWork$lambda$10$lambda$9$lambda$3(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doWork$lambda$10$lambda$9$lambda$4(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    private final List<CallEvent> fetchNonPersistedEvents() {
        ke1 ke1VarM35525a = ke1.f32003i.m35525a();
        List listM35514p = ke1VarM35525a != null ? ke1VarM35525a.m35514p() : null;
        if (listM35514p == null) {
            return ch3.m21246k();
        }
        ArrayList arrayList = new ArrayList(dh3.m23088v(listM35514p, 10));
        Iterator it = listM35514p.iterator();
        while (it.hasNext()) {
            arrayList.add(((cv1) it.next()).m21861y(this.context));
        }
        return arrayList;
    }

    private final Set<Long> identifyMissingCallLogs(long j) throws NumberFormatException {
        List listM21246k;
        ke1 ke1VarM35525a = ke1.f32003i.m35525a();
        List listM35512n = ke1VarM35525a != null ? ke1VarM35525a.m35512n(j) : null;
        if (listM35512n != null) {
            List list = listM35512n.isEmpty() ^ true ? listM35512n : null;
            if (list != null) {
                final ArrayList arrayList = new ArrayList(dh3.m23088v(listM35512n, 10));
                Iterator it = listM35512n.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
                }
                Iterator it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                long j2 = Long.parseLong((String) it2.next());
                while (it2.hasNext()) {
                    long j3 = Long.parseLong((String) it2.next());
                    if (j2 > j3) {
                        j2 = j3;
                    }
                }
                Iterator it3 = list.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException();
                }
                long j4 = Long.parseLong((String) it3.next());
                while (it3.hasNext()) {
                    long j5 = Long.parseLong((String) it3.next());
                    if (j4 < j5) {
                        j4 = j5;
                    }
                }
                int size = list.size();
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (((int) ((j4 - j2) + 1)) != size) {
                    LongStream.range(j2, j4).filter(new LongPredicate() { // from class: o.mz1
                        @Override // java.util.function.LongPredicate
                        public final boolean test(long j6) {
                            return CallReconWorker.identifyMissingCallLogs$lambda$19$lambda$16(arrayList, j6);
                        }
                    }).forEach(new LongConsumer() { // from class: o.nz1
                        @Override // java.util.function.LongConsumer
                        public final void accept(long j6) {
                            CallReconWorker.identifyMissingCallLogs$lambda$19$lambda$17(linkedHashSet, j6);
                        }
                    });
                }
                if (ke1VarM35525a == null || (listM21246k = ke1VarM35525a.m35513o(j)) == null) {
                    listM21246k = ch3.m21246k();
                }
                ArrayList arrayList2 = new ArrayList(dh3.m23088v(listM21246k, 10));
                Iterator it4 = listM21246k.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(Long.valueOf(Long.parseLong((String) it4.next())));
                }
                linkedHashSet.addAll(arrayList2);
                return linkedHashSet;
            }
        }
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean identifyMissingCallLogs$lambda$19$lambda$16(List list, long j) {
        sq8.m48649h(list, "$ids");
        return !list.contains(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void identifyMissingCallLogs$lambda$19$lambda$17(Set set, long j) {
        sq8.m48649h(set, "$missing");
        set.add(Long.valueOf(j));
    }

    private final void persistEvents(List<CallEvent> list) {
        ke1 ke1VarM35525a = ke1.f32003i.m35525a();
        if (ke1VarM35525a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallEvent) it.next()).toCallLog());
        }
        rm1.m46952d(i84.m31707a(eu5.m25611b()), null, null, new C0065e(ke1VarM35525a, arrayList, null), 3, null);
    }

    private final void updateForPersisted(Set<String> set) {
        ke1 ke1VarM35525a = ke1.f32003i.m35525a();
        StringBuilder sb = new StringBuilder();
        sb.append("Call Logs to be updated: ");
        sb.append(set);
        for (String str : set) {
            if (str != null) {
                cv1 cv1VarM35511m = ke1VarM35525a != null ? ke1VarM35525a.m35511m(str) : null;
                if (cv1VarM35511m != null) {
                    cv1VarM35511m.m21860x(true);
                    ke1VarM35525a.m35501E(cv1VarM35511m);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01f8 A[Catch: all -> 0x032b, TryCatch #0 {all -> 0x032b, blocks: (B:18:0x00cf, B:20:0x00d5, B:22:0x00f7, B:25:0x0104, B:28:0x017d, B:30:0x018d, B:32:0x019d, B:39:0x01d6, B:41:0x01dc, B:43:0x01e9, B:46:0x01f8, B:48:0x0200, B:50:0x0222, B:52:0x0228, B:54:0x0235, B:55:0x0242, B:56:0x0251, B:58:0x0257, B:60:0x0268, B:62:0x026f, B:71:0x027f, B:72:0x0283, B:73:0x0287, B:75:0x028d, B:76:0x02ad, B:78:0x02b4, B:80:0x02f1, B:79:0x02ce, B:47:0x01fd, B:33:0x01b1, B:35:0x01b9, B:37:0x01c3), top: B:91:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fd A[Catch: all -> 0x032b, TryCatch #0 {all -> 0x032b, blocks: (B:18:0x00cf, B:20:0x00d5, B:22:0x00f7, B:25:0x0104, B:28:0x017d, B:30:0x018d, B:32:0x019d, B:39:0x01d6, B:41:0x01dc, B:43:0x01e9, B:46:0x01f8, B:48:0x0200, B:50:0x0222, B:52:0x0228, B:54:0x0235, B:55:0x0242, B:56:0x0251, B:58:0x0257, B:60:0x0268, B:62:0x026f, B:71:0x027f, B:72:0x0283, B:73:0x0287, B:75:0x028d, B:76:0x02ad, B:78:0x02b4, B:80:0x02f1, B:79:0x02ce, B:47:0x01fd, B:33:0x01b1, B:35:0x01b9, B:37:0x01c3), top: B:91:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0235 A[Catch: all -> 0x032b, TryCatch #0 {all -> 0x032b, blocks: (B:18:0x00cf, B:20:0x00d5, B:22:0x00f7, B:25:0x0104, B:28:0x017d, B:30:0x018d, B:32:0x019d, B:39:0x01d6, B:41:0x01dc, B:43:0x01e9, B:46:0x01f8, B:48:0x0200, B:50:0x0222, B:52:0x0228, B:54:0x0235, B:55:0x0242, B:56:0x0251, B:58:0x0257, B:60:0x0268, B:62:0x026f, B:71:0x027f, B:72:0x0283, B:73:0x0287, B:75:0x028d, B:76:0x02ad, B:78:0x02b4, B:80:0x02f1, B:79:0x02ce, B:47:0x01fd, B:33:0x01b1, B:35:0x01b9, B:37:0x01c3), top: B:91:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0257 A[Catch: all -> 0x032b, TryCatch #0 {all -> 0x032b, blocks: (B:18:0x00cf, B:20:0x00d5, B:22:0x00f7, B:25:0x0104, B:28:0x017d, B:30:0x018d, B:32:0x019d, B:39:0x01d6, B:41:0x01dc, B:43:0x01e9, B:46:0x01f8, B:48:0x0200, B:50:0x0222, B:52:0x0228, B:54:0x0235, B:55:0x0242, B:56:0x0251, B:58:0x0257, B:60:0x0268, B:62:0x026f, B:71:0x027f, B:72:0x0283, B:73:0x0287, B:75:0x028d, B:76:0x02ad, B:78:0x02b4, B:80:0x02f1, B:79:0x02ce, B:47:0x01fd, B:33:0x01b1, B:35:0x01b9, B:37:0x01c3), top: B:91:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028d A[Catch: all -> 0x032b, LOOP:1: B:73:0x0287->B:75:0x028d, LOOP_END, TryCatch #0 {all -> 0x032b, blocks: (B:18:0x00cf, B:20:0x00d5, B:22:0x00f7, B:25:0x0104, B:28:0x017d, B:30:0x018d, B:32:0x019d, B:39:0x01d6, B:41:0x01dc, B:43:0x01e9, B:46:0x01f8, B:48:0x0200, B:50:0x0222, B:52:0x0228, B:54:0x0235, B:55:0x0242, B:56:0x0251, B:58:0x0257, B:60:0x0268, B:62:0x026f, B:71:0x027f, B:72:0x0283, B:73:0x0287, B:75:0x028d, B:76:0x02ad, B:78:0x02b4, B:80:0x02f1, B:79:0x02ce, B:47:0x01fd, B:33:0x01b1, B:35:0x01b9, B:37:0x01c3), top: B:91:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b4 A[Catch: all -> 0x032b, TryCatch #0 {all -> 0x032b, blocks: (B:18:0x00cf, B:20:0x00d5, B:22:0x00f7, B:25:0x0104, B:28:0x017d, B:30:0x018d, B:32:0x019d, B:39:0x01d6, B:41:0x01dc, B:43:0x01e9, B:46:0x01f8, B:48:0x0200, B:50:0x0222, B:52:0x0228, B:54:0x0235, B:55:0x0242, B:56:0x0251, B:58:0x0257, B:60:0x0268, B:62:0x026f, B:71:0x027f, B:72:0x0283, B:73:0x0287, B:75:0x028d, B:76:0x02ad, B:78:0x02b4, B:80:0x02f1, B:79:0x02ce, B:47:0x01fd, B:33:0x01b1, B:35:0x01b9, B:37:0x01c3), top: B:91:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ce A[Catch: all -> 0x032b, TryCatch #0 {all -> 0x032b, blocks: (B:18:0x00cf, B:20:0x00d5, B:22:0x00f7, B:25:0x0104, B:28:0x017d, B:30:0x018d, B:32:0x019d, B:39:0x01d6, B:41:0x01dc, B:43:0x01e9, B:46:0x01f8, B:48:0x0200, B:50:0x0222, B:52:0x0228, B:54:0x0235, B:55:0x0242, B:56:0x0251, B:58:0x0257, B:60:0x0268, B:62:0x026f, B:71:0x027f, B:72:0x0283, B:73:0x0287, B:75:0x028d, B:76:0x02ad, B:78:0x02b4, B:80:0x02f1, B:79:0x02ce, B:47:0x01fd, B:33:0x01b1, B:35:0x01b9, B:37:0x01c3), top: B:91:0x00cf }] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(n64 n64Var) {
        String str;
        boolean z;
        String str2;
        long j;
        long j2;
        long j3;
        List<CallEvent> listFetchNonPersistedEvents;
        ke1 ke1Var;
        List listM35517s;
        Set<String> setM40664e;
        long j4;
        String str3;
        AtomicInteger atomicInteger;
        boolean z2;
        Stream stream;
        Stream streamFilter;
        Stream stream2;
        List list;
        Integer numM39304d;
        StringBuilder sb = new StringBuilder();
        sb.append("Worker start for ");
        sb.append("CALL_RECONCILIATION");
        Data inputData = this.workerParameters.getInputData();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Data passed for processing: ");
        sb2.append(inputData);
        if (hv1.f27574f.m31195a().m31189u(this.context)) {
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
                long j5 = this.workerParameters.getInputData().getLong("start", System.currentTimeMillis());
                Data inputData2 = this.workerParameters.getInputData();
                h4e h4eVar = h4e.f26198a;
                long j6 = inputData2.getLong("end", h4eVar.m29804b());
                long j7 = this.workerParameters.getInputData().getLong("threshold", h4eVar.m29809g());
                boolean z3 = this.workerParameters.getInputData().getBoolean("immediate", false);
                q83 q83VarM35518t = ke1VarM35525a.m35518t("CALL_RECONCILIATION", string, string2);
                long jMin = Math.min(j6, System.currentTimeMillis());
                try {
                    long jM3217E = AbstractC0059a.m132a().m3217E();
                    if (q83VarM35518t != null) {
                        z = z3;
                        str2 = string;
                        j = j6;
                        long jMin2 = Math.min(Math.max(q83VarM35518t.m44966g(), j7), Math.max(j5 - h4eVar.m29803a(), j7));
                        if (jM3217E > 0) {
                            jMin2 = Math.max(jMin2, jM3217E);
                        }
                        j2 = jMin2;
                    } else {
                        z = z3;
                        str2 = string;
                        j = j6;
                        j2 = j5;
                    }
                    Context applicationContext = getApplicationContext();
                    sq8.m48648g(applicationContext, "getApplicationContext(...)");
                    List listM29805c = h4eVar.m29805c(applicationContext, j2, jMin);
                    int size = listM29805c.size();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Call Log found in range[");
                    sb3.append(j5);
                    sb3.append(", ");
                    j3 = j;
                    sb3.append(j3);
                    sb3.append("] is: ");
                    sb3.append(size);
                    persistEvents(listM29805c);
                    Set setIdentifyMissingCallLogs = identifyMissingCallLogs(j7);
                    Context applicationContext2 = getApplicationContext();
                    sq8.m48648g(applicationContext2, "getApplicationContext(...)");
                    persistEvents(h4eVar.m29806d(applicationContext2, setIdentifyMissingCallLogs));
                    listFetchNonPersistedEvents = fetchNonPersistedEvents();
                    int size2 = listFetchNonPersistedEvents.size();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Final call Events to be processed: ");
                    sb4.append(size2);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Batch to be processed with immediate effects: ");
                    boolean z4 = z;
                    sb5.append(z4);
                    if (z4) {
                        ke1Var = ke1VarM35525a;
                        List listM35517s2 = ke1Var.m35517s(System.currentTimeMillis());
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (listM35517s2 != null) {
                            list = listM35517s2;
                            numM39304d = ml1.m39304d(listM35517s2.size());
                        } else {
                            list = listM35517s2;
                            numM39304d = null;
                        }
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Engagements found pending reconciliation by date: ");
                        sb6.append(jCurrentTimeMillis);
                        sb6.append(" is: ");
                        sb6.append(numM39304d);
                        listM35517s = list;
                    } else {
                        ke1Var = ke1VarM35525a;
                        listM35517s = ke1Var.m35517s(jMin);
                        Integer numM39304d2 = listM35517s != null ? ml1.m39304d(listM35517s.size()) : null;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Engagements found pending reconciliation by date: ");
                        sb7.append(jMin);
                        sb7.append(" is: ");
                        sb7.append(numM39304d2);
                    }
                } catch (Throwable unused) {
                    str = "CALL_RECONCILIATION";
                }
                try {
                    if (listM35517s != null && (stream2 = listM35517s.stream()) != null) {
                        final C0064d c0064d = C0064d.f268a;
                        Stream map = stream2.map(new Function() { // from class: o.oz1
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return CallReconWorker.doWork$lambda$10$lambda$9$lambda$2(c0064d, obj);
                            }
                        });
                        setM40664e = map != null ? (Set) map.collect(Collectors.toSet()) : null;
                        if (setM40664e != null) {
                            setM40664e = nif.m40664e();
                        } else {
                            sq8.m48646e(setM40664e);
                        }
                        updateForPersisted(setM40664e);
                        int size3 = setM40664e.size();
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Engagements persisted found in by date: ");
                        sb8.append(j3);
                        sb8.append(" is: ");
                        sb8.append(size3);
                        AtomicInteger atomicInteger2 = new AtomicInteger(0);
                        if (listM35517s != null && (stream = listM35517s.stream()) != null) {
                            final C0062b c0062b = C0062b.f265a;
                            streamFilter = stream.filter(new Predicate() { // from class: o.pz1
                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    return CallReconWorker.doWork$lambda$10$lambda$9$lambda$3(c0062b, obj);
                                }
                            });
                            if (streamFilter != null) {
                                final C0063c c0063c = new C0063c(atomicInteger2);
                                streamFilter.forEach(new Consumer() { // from class: o.qz1
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj) {
                                        CallReconWorker.doWork$lambda$10$lambda$9$lambda$4(c0063c, obj);
                                    }
                                });
                            }
                        }
                        AtomicInteger atomicInteger3 = new AtomicInteger(0);
                        ArrayList<CallEvent> arrayList = new ArrayList();
                        for (Object obj : listFetchNonPersistedEvents) {
                            CallEvent callEvent = (CallEvent) obj;
                            if (!setM40664e.contains(callEvent.getCallId())) {
                                String number = callEvent.getNumber();
                                z2 = true;
                                if (number == null || number.length() == 0) {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                arrayList.add(obj);
                            }
                        }
                        for (CallEvent callEvent2 : arrayList) {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("Missing event not received realtime: ");
                            sb9.append(callEvent2);
                            hv1.f27574f.m31195a().m31186r(callEvent2);
                            atomicInteger3.incrementAndGet();
                        }
                        long j8 = jMin - 60000;
                        if (q83VarM35518t == null) {
                            ke1Var.m35503G(q83.m44960b(q83VarM35518t, 0, null, null, null, j8, 15, null));
                            str3 = ", ";
                            j4 = jMin;
                            atomicInteger = atomicInteger3;
                        } else {
                            j4 = jMin;
                            str3 = ", ";
                            atomicInteger = atomicInteger3;
                            ke1Var.m35524z(new q83(0, "CALL_RECONCILIATION", str2, string2, Math.max(jMin, j2), 1, null));
                        }
                        int i = atomicInteger.get();
                        int i2 = atomicInteger2.get();
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("Process completed success for Worker: ");
                        str = "CALL_RECONCILIATION";
                        sb10.append(str);
                        sb10.append(" with boundary: [");
                        sb10.append(j2);
                        sb10.append(str3);
                        sb10.append(j4);
                        sb10.append("] synced: ");
                        sb10.append(i);
                        sb10.append(" and retried ");
                        sb10.append(i2);
                    }
                    sb10.append(str);
                    sb10.append(" with boundary: [");
                    sb10.append(j2);
                    sb10.append(str3);
                    sb10.append(j4);
                    sb10.append("] synced: ");
                    sb10.append(i);
                    sb10.append(" and retried ");
                    sb10.append(i2);
                } catch (Throwable unused2) {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("Processing failed for Worker: ");
                    sb11.append(str);
                    ListenableWorker.Result resultFailure3 = ListenableWorker.Result.failure();
                    sq8.m48648g(resultFailure3, "failure(...)");
                    return resultFailure3;
                }
                if (setM40664e != null) {
                }
                updateForPersisted(setM40664e);
                int size32 = setM40664e.size();
                StringBuilder sb82 = new StringBuilder();
                sb82.append("Engagements persisted found in by date: ");
                sb82.append(j3);
                sb82.append(" is: ");
                sb82.append(size32);
                AtomicInteger atomicInteger22 = new AtomicInteger(0);
                if (listM35517s != null) {
                    final xk7 c0062b2 = C0062b.f265a;
                    streamFilter = stream.filter(new Predicate() { // from class: o.pz1
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            return CallReconWorker.doWork$lambda$10$lambda$9$lambda$3(c0062b2, obj2);
                        }
                    });
                    if (streamFilter != null) {
                    }
                }
                AtomicInteger atomicInteger32 = new AtomicInteger(0);
                ArrayList<CallEvent> arrayList2 = new ArrayList();
                while (r1.hasNext()) {
                }
                while (r1.hasNext()) {
                }
                long j82 = jMin - 60000;
                if (q83VarM35518t == null) {
                }
                int i3 = atomicInteger.get();
                int i22 = atomicInteger22.get();
                StringBuilder sb102 = new StringBuilder();
                sb102.append("Process completed success for Worker: ");
                str = "CALL_RECONCILIATION";
            } catch (Throwable unused3) {
                str = "CALL_RECONCILIATION";
            }
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        sq8.m48648g(resultSuccess, "success(...)");
        return resultSuccess;
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(n64 n64Var) {
        rc7 rc7Var = rc7.f43371a;
        Context applicationContext = getApplicationContext();
        sq8.m48648g(applicationContext, "getApplicationContext(...)");
        return rc7Var.m46509a(applicationContext);
    }
}

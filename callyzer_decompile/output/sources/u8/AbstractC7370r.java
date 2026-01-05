package u8;

import a9.AbstractC0071j;
import a9.C0062a;
import a9.C0070i;
import a9.C0073l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.ExtractedText;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c9.C0914i;
import com.websoptimization.callyzerbiz.R;
import d9.AbstractC1666k;
import d9.ExecutorC1668m;
import g4.n0;
import java.util.concurrent.ExecutorService;
import k0.ExecutorC3896f;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import nx.AbstractC5178p;
import og.pe;
import pg.t9;
import t8.C7056b;
import t8.C7077w;
import tx.c0;
import v8.C7691c;
import x8.C8315d;
import z1.C8849i;
import z7.C8892u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.r */
/* loaded from: classes.dex */
public abstract class AbstractC7370r {
    /* renamed from: a */
    public static final C7368p m13788a(Context context, C7056b c7056b) throws Resources.NotFoundException {
        C8892u c8892uM11876a;
        AbstractC4154l.m8923f(context, "context");
        ExecutorService executorService = c7056b.f34107c;
        C0914i c0914i = new C0914i();
        c0914i.f5587c = new Handler(Looper.getMainLooper());
        c0914i.f5588d = new ExecutorC3896f(c0914i);
        ExecutorC1668m executorC1668m = new ExecutorC1668m(executorService, 0);
        c0914i.f5585a = executorC1668m;
        c0914i.f5586b = c0.m13492o(executorC1668m);
        Context applicationContext = context.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext, "context.applicationContext");
        ExecutorC1668m executorC1668m2 = (ExecutorC1668m) c0914i.f5585a;
        AbstractC4154l.m8922e(executorC1668m2, "workTaskExecutor.serialTaskExecutor");
        C7077w clock = c7056b.f34108d;
        boolean z6 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        AbstractC4154l.m8923f(clock, "clock");
        if (z6) {
            c8892uM11876a = new C8892u(applicationContext, WorkDatabase.class, null);
            c8892uM11876a.f42821i = true;
        } else {
            c8892uM11876a = t9.m11876a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            c8892uM11876a.f42820h = new a1.c0(27, applicationContext);
        }
        c8892uM11876a.f42818f = executorC1668m2;
        c8892uM11876a.f42816d.add(new C7353a(clock));
        c8892uM11876a.m16385a(C7355c.f34996h);
        c8892uM11876a.m16385a(new C7357e(applicationContext, 2, 3));
        c8892uM11876a.m16385a(C7355c.f34997i);
        c8892uM11876a.m16385a(C7355c.f34998j);
        c8892uM11876a.m16385a(new C7357e(applicationContext, 5, 6));
        c8892uM11876a.m16385a(C7355c.f34999k);
        c8892uM11876a.m16385a(C7355c.f35000l);
        c8892uM11876a.m16385a(C7355c.f35001m);
        c8892uM11876a.m16385a(new C7357e(applicationContext));
        c8892uM11876a.m16385a(new C7357e(applicationContext, 10, 11));
        c8892uM11876a.m16385a(C7355c.f34992d);
        c8892uM11876a.m16385a(C7355c.f34993e);
        c8892uM11876a.m16385a(C7355c.f34994f);
        c8892uM11876a.m16385a(C7355c.f34995g);
        c8892uM11876a.m16385a(new C7357e(applicationContext, 21, 22));
        c8892uM11876a.f42828p = false;
        c8892uM11876a.f42829q = true;
        WorkDatabase workDatabase = (WorkDatabase) c8892uM11876a.m16386b();
        Context applicationContext2 = context.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext2, "context.applicationContext");
        Context applicationContext3 = applicationContext2.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext3, "context.applicationContext");
        C0062a c0062a = new C0062a(applicationContext3, c0914i, 0);
        Context applicationContext4 = applicationContext2.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext4, "context.applicationContext");
        C0062a c0062a2 = new C0062a(applicationContext4, c0914i, 1);
        Context applicationContext5 = applicationContext2.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext5, "context.applicationContext");
        int i10 = AbstractC0071j.f262a;
        C0070i c0070i = new C0070i(applicationContext5, c0914i);
        Context applicationContext6 = applicationContext2.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext6, "context.applicationContext");
        C0062a c0062a3 = new C0062a(applicationContext6, c0914i, 2);
        C0073l c0073l = new C0073l();
        c0073l.f264a = applicationContext2;
        c0073l.f265b = c0062a;
        c0073l.f268e = c0062a2;
        c0073l.f266c = c0070i;
        c0073l.f267d = c0062a3;
        C7356d c7356d = new C7356d(context.getApplicationContext(), c7056b, c0914i, workDatabase);
        int i11 = C7369q.f35053a;
        int i12 = AbstractC7360h.f35020a;
        C8315d c8315d = new C8315d(context, workDatabase, c7056b);
        AbstractC1666k.m5378a(context, SystemJobService.class, true);
        C7077w.m13371a().getClass();
        return new C7368p(context.getApplicationContext(), c7056b, c0914i, workDatabase, pe.m10834i(c8315d, new C7691c(context, c7056b, c0073l, c7356d, new C8849i(c7356d, c0914i), c0914i)), c7356d, c0073l);
    }

    /* renamed from: b */
    public static final ExtractedText m13789b(C4381z c4381z) {
        ExtractedText extractedText = new ExtractedText();
        String str = c4381z.f21945a.f13620b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j6 = c4381z.f21946b;
        extractedText.selectionStart = n0.m6458e(j6);
        extractedText.selectionEnd = n0.m6457d(j6);
        extractedText.flags = !AbstractC5178p.m10117y(c4381z.f21945a.f13620b, '\n') ? 1 : 0;
        return extractedText;
    }
}

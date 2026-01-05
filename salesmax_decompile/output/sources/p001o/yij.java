package p001o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public final class yij implements cn0 {

    /* renamed from: a */
    public final fkj f55568a;

    /* renamed from: b */
    public final hij f55569b;

    /* renamed from: c */
    public final Context f55570c;

    /* renamed from: d */
    public final Handler f55571d = new Handler(Looper.getMainLooper());

    public yij(fkj fkjVar, hij hijVar, Context context) {
        this.f55568a = fkjVar;
        this.f55569b = hijVar;
        this.f55570c = context;
    }

    @Override // p001o.cn0
    /* renamed from: a */
    public final Task mo21439a() {
        return this.f55568a.m26980c(this.f55570c.getPackageName());
    }

    @Override // p001o.cn0
    /* renamed from: b */
    public final boolean mo21440b(bn0 bn0Var, ws wsVar, en0 en0Var) {
        if (bn0Var == null || wsVar == null || en0Var == null || !bn0Var.m19395b(en0Var) || bn0Var.m19399g()) {
            return false;
        }
        bn0Var.m19398f();
        wsVar.m54945b(new IntentSenderRequest.C1751a(bn0Var.m19397d(en0Var).getIntentSender()).m3733a());
        return true;
    }
}

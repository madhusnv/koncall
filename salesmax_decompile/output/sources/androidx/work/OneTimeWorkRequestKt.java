package androidx.work;

import androidx.work.OneTimeWorkRequest;
import p001o.hb9;
import p001o.ob9;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class OneTimeWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        sq8.m48655n(4, "W");
        return new OneTimeWorkRequest.Builder(ListenableWorker.class);
    }

    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, ob9 ob9Var) {
        sq8.m48649h(builder, "<this>");
        sq8.m48649h(ob9Var, "inputMerger");
        return builder.setInputMerger(hb9.m30150a(ob9Var));
    }
}

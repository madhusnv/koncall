package p001o;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* loaded from: classes2.dex */
public final class vs extends os {

    /* renamed from: a */
    public static final C17667a f50802a = new C17667a(null);

    /* renamed from: o.vs$a */
    public static final class C17667a {
        public C17667a() {
        }

        public /* synthetic */ C17667a(id5 id5Var) {
            this();
        }
    }

    @Override // p001o.os
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo6230a(Context context, IntentSenderRequest intentSenderRequest) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intentSenderRequest, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        sq8.m48648g(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // p001o.os
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo6231c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}

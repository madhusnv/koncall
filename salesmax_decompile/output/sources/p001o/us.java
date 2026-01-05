package p001o;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* loaded from: classes2.dex */
public final class us extends os {

    /* renamed from: a */
    public static final C17439a f49418a = new C17439a(null);

    /* renamed from: o.us$a */
    public static final class C17439a {
        public C17439a() {
        }

        public /* synthetic */ C17439a(id5 id5Var) {
            this();
        }
    }

    @Override // p001o.os
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo6230a(Context context, Intent intent) {
        sq8.m48649h(context, "context");
        sq8.m48649h(intent, "input");
        return intent;
    }

    @Override // p001o.os
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo6231c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}

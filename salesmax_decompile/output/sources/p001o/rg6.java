package p001o;

import android.content.Context;
import com.amplifyframework.datastore.appsync.ModelWithMetadataAdapter;
import com.amplifyframework.datastore.generated.model.AccountMemberActivity;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class rg6 {
    /* renamed from: a */
    public final void m46700a(String str, String str2, Context context) {
        if (str == null || !sq8.m48644c(str, AccountMemberActivity.class.getSimpleName())) {
            return;
        }
        Object objFromJson = ja8.f30035c.fromJson(str2, (Class<Object>) AccountMemberActivity.class);
        sq8.m48648g(objFromJson, "fromJson(...)");
        AccountMemberActivity accountMemberActivity = (AccountMemberActivity) objFromJson;
        if (this instanceof pe) {
            ((pe) this).mo43496b(accountMemberActivity, context);
        }
    }

    /* renamed from: b */
    public abstract void mo43496b(Object obj, Context context);

    /* renamed from: c */
    public final void m46701c(String str, Context context) {
        sq8.m48649h(str, "event");
        sq8.m48649h(context, "context");
        m46700a(m46702d(str), str, context);
    }

    /* renamed from: d */
    public final String m46702d(String str) {
        return new JSONObject(str).optString(ModelWithMetadataAdapter.TYPE_NAME);
    }
}

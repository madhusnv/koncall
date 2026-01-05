package p001o;

import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class yzc {

    /* renamed from: i */
    public static final C18533a f56322i = new C18533a(null);

    /* renamed from: a */
    public final String f56323a;

    /* renamed from: b */
    public final int f56324b;

    /* renamed from: c */
    public final int f56325c;

    /* renamed from: d */
    public final String f56326d;

    /* renamed from: e */
    public final String f56327e;

    /* renamed from: f */
    public final String f56328f;

    /* renamed from: g */
    public final String f56329g;

    /* renamed from: h */
    public final int f56330h;

    /* renamed from: o.yzc$a */
    public static final class C18533a {
        public C18533a() {
        }

        public /* synthetic */ C18533a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.yzc$b */
    public enum EnumC18534b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        EnumC18534b(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public yzc(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "component");
        String string = jSONObject.getString("class_name");
        sq8.m48648g(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f56323a = string;
        this.f56324b = jSONObject.optInt(FirebaseAnalytics.Param.INDEX, -1);
        this.f56325c = jSONObject.optInt(OutcomeConstants.OUTCOME_ID);
        String strOptString = jSONObject.optString("text");
        sq8.m48648g(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.f56326d = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        sq8.m48648g(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.f56327e = strOptString2;
        String strOptString3 = jSONObject.optString(MediaTrack.ROLE_DESCRIPTION);
        sq8.m48648g(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f56328f = strOptString3;
        String strOptString4 = jSONObject.optString("hint");
        sq8.m48648g(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.f56329g = strOptString4;
        this.f56330h = jSONObject.optInt("match_bitmask");
    }

    /* renamed from: a */
    public final String m58562a() {
        return this.f56323a;
    }

    /* renamed from: b */
    public final String m58563b() {
        return this.f56328f;
    }

    /* renamed from: c */
    public final String m58564c() {
        return this.f56329g;
    }

    /* renamed from: d */
    public final int m58565d() {
        return this.f56325c;
    }

    /* renamed from: e */
    public final int m58566e() {
        return this.f56324b;
    }

    /* renamed from: f */
    public final int m58567f() {
        return this.f56330h;
    }

    /* renamed from: g */
    public final String m58568g() {
        return this.f56327e;
    }

    /* renamed from: h */
    public final String m58569h() {
        return this.f56326d;
    }
}

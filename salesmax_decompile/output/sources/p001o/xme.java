package p001o;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class xme {

    /* renamed from: a */
    public static final C18190a f53935a = new C18190a(null);

    /* renamed from: o.xme$a */
    public static final class C18190a {
        public C18190a() {
        }

        public /* synthetic */ C18190a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final boolean m56484a(String str) {
            sq8.m48649h(str, "jsonString");
            if (str.length() == 0) {
                return false;
            }
            try {
                new JSONObject(str);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}

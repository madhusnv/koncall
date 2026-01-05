package p001o;

import android.content.Context;
import android.net.Uri;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes.dex */
public final class rz1 {

    /* renamed from: a */
    public final String f44271a;

    /* renamed from: b */
    public final Uri f44272b;

    /* renamed from: c */
    public final String f44273c;

    /* renamed from: d */
    public final String f44274d;

    /* renamed from: e */
    public final Long f44275e;

    /* renamed from: f */
    public final Long f44276f;

    /* renamed from: g */
    public final String f44277g;

    /* renamed from: h */
    public final String f44278h;

    /* renamed from: i */
    public final Context f44279i;

    /* renamed from: o.rz1$a */
    public static final class C16681a {

        /* renamed from: b */
        public Uri f44281b;

        /* renamed from: e */
        public Long f44284e;

        /* renamed from: f */
        public Long f44285f;

        /* renamed from: g */
        public String f44286g;

        /* renamed from: h */
        public String f44287h;

        /* renamed from: i */
        public Context f44288i;

        /* renamed from: a */
        public String f44280a = "";

        /* renamed from: c */
        public String f44282c = "";

        /* renamed from: d */
        public String f44283d = "";

        /* renamed from: a */
        public final rz1 m47312a() {
            return new rz1(this.f44280a, this.f44281b, this.f44282c, this.f44283d, this.f44284e, this.f44285f, this.f44286g, this.f44287h, this.f44288i, null);
        }

        /* renamed from: b */
        public final C16681a m47313b(Context context) {
            this.f44288i = context;
            return this;
        }

        /* renamed from: c */
        public final C16681a m47314c(Long l) {
            this.f44284e = l;
            return this;
        }

        /* renamed from: d */
        public final C16681a m47315d(Long l) {
            this.f44285f = l;
            return this;
        }

        /* renamed from: e */
        public final C16681a m47316e(String str) {
            sq8.m48649h(str, "fileName");
            this.f44282c = str;
            return this;
        }

        /* renamed from: f */
        public final C16681a m47317f(String str) {
            sq8.m48649h(str, "filePath");
            this.f44283d = str;
            return this;
        }

        /* renamed from: g */
        public final C16681a m47318g(String str) {
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            this.f44280a = str;
            return this;
        }

        /* renamed from: h */
        public final C16681a m47319h(String str) {
            this.f44286g = str;
            return this;
        }

        /* renamed from: i */
        public final C16681a m47320i(String str) {
            this.f44287h = str;
            return this;
        }

        /* renamed from: j */
        public final C16681a m47321j(Uri uri) {
            this.f44281b = uri;
            return this;
        }
    }

    public /* synthetic */ rz1(String str, Uri uri, String str2, String str3, Long l, Long l2, String str4, String str5, Context context, id5 id5Var) {
        this(str, uri, str2, str3, l, l2, str4, str5, context);
    }

    /* renamed from: a */
    public final Context m47303a() {
        return this.f44279i;
    }

    /* renamed from: b */
    public final Long m47304b() {
        return this.f44275e;
    }

    /* renamed from: c */
    public final Long m47305c() {
        return this.f44276f;
    }

    /* renamed from: d */
    public final String m47306d() {
        return this.f44273c;
    }

    /* renamed from: e */
    public final String m47307e() {
        return this.f44274d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sq8.m48644c(rz1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        sq8.m48647f(obj, "null cannot be cast to non-null type ai.salesmax.call.recording.CallRecording");
        rz1 rz1Var = (rz1) obj;
        return sq8.m48644c(this.f44271a, rz1Var.f44271a) && sq8.m48644c(this.f44272b, rz1Var.f44272b) && sq8.m48644c(this.f44273c, rz1Var.f44273c) && sq8.m48644c(this.f44274d, rz1Var.f44274d) && sq8.m48644c(this.f44275e, rz1Var.f44275e) && sq8.m48644c(this.f44276f, rz1Var.f44276f) && sq8.m48644c(this.f44277g, rz1Var.f44277g) && sq8.m48644c(this.f44278h, rz1Var.f44278h) && sq8.m48644c(this.f44279i, rz1Var.f44279i);
    }

    /* renamed from: f */
    public final String m47308f() {
        return this.f44271a;
    }

    /* renamed from: g */
    public final String m47309g() {
        return this.f44277g;
    }

    /* renamed from: h */
    public final String m47310h() {
        return this.f44278h;
    }

    public int hashCode() {
        int iHashCode = this.f44271a.hashCode() * 31;
        Uri uri = this.f44272b;
        int iHashCode2 = (((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f44273c.hashCode()) * 31) + this.f44274d.hashCode()) * 31;
        Long l = this.f44275e;
        int iHashCode3 = (iHashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.f44276f;
        int iHashCode4 = (iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.f44277g;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f44278h;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Context context = this.f44279i;
        return iHashCode6 + (context != null ? context.hashCode() : 0);
    }

    /* renamed from: i */
    public final Uri m47311i() {
        return this.f44272b;
    }

    public String toString() {
        return "CallRecording(id='" + this.f44271a + "', uri=" + this.f44272b + ", fileName='" + this.f44273c + "', filePath='" + this.f44274d + "', dateAdded=" + this.f44275e + ", dateModified=" + this.f44276f + ", mimeType=" + this.f44277g + ", relativePath=" + this.f44278h + ", context=" + this.f44279i + ")";
    }

    public rz1(String str, Uri uri, String str2, String str3, Long l, Long l2, String str4, String str5, Context context) {
        this.f44271a = str;
        this.f44272b = uri;
        this.f44273c = str2;
        this.f44274d = str3;
        this.f44275e = l;
        this.f44276f = l2;
        this.f44277g = str4;
        this.f44278h = str5;
        this.f44279i = context;
    }
}

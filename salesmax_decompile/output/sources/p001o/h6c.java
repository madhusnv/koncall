package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class h6c {

    /* renamed from: a */
    public static final C13860e f26235a = new C13860e(null);

    /* renamed from: b */
    public static final List f26236b = ch3.m21249n(C13856a.f26237c, C13857b.f26239c, C13858c.f26241c, C13859d.f26243c, C13861f.f26245c, C13862g.f26247c, C13863h.f26249c);

    /* renamed from: o.h6c$a */
    public static final class C13856a extends h6c {

        /* renamed from: c */
        public static final C13856a f26237c = new C13856a();

        /* renamed from: d */
        public static final String f26238d = "authenticated-read";

        public C13856a() {
            super(null);
        }

        @Override // p001o.h6c
        /* renamed from: b */
        public String mo29837b() {
            return f26238d;
        }

        public String toString() {
            return "AuthenticatedRead";
        }
    }

    /* renamed from: o.h6c$b */
    public static final class C13857b extends h6c {

        /* renamed from: c */
        public static final C13857b f26239c = new C13857b();

        /* renamed from: d */
        public static final String f26240d = "aws-exec-read";

        public C13857b() {
            super(null);
        }

        @Override // p001o.h6c
        /* renamed from: b */
        public String mo29837b() {
            return f26240d;
        }

        public String toString() {
            return "AwsExecRead";
        }
    }

    /* renamed from: o.h6c$c */
    public static final class C13858c extends h6c {

        /* renamed from: c */
        public static final C13858c f26241c = new C13858c();

        /* renamed from: d */
        public static final String f26242d = "bucket-owner-full-control";

        public C13858c() {
            super(null);
        }

        @Override // p001o.h6c
        /* renamed from: b */
        public String mo29837b() {
            return f26242d;
        }

        public String toString() {
            return "BucketOwnerFullControl";
        }
    }

    /* renamed from: o.h6c$d */
    public static final class C13859d extends h6c {

        /* renamed from: c */
        public static final C13859d f26243c = new C13859d();

        /* renamed from: d */
        public static final String f26244d = "bucket-owner-read";

        public C13859d() {
            super(null);
        }

        @Override // p001o.h6c
        /* renamed from: b */
        public String mo29837b() {
            return f26244d;
        }

        public String toString() {
            return "BucketOwnerRead";
        }
    }

    /* renamed from: o.h6c$e */
    public static final class C13860e {
        public C13860e() {
        }

        public /* synthetic */ C13860e(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final List m29838a() {
            return h6c.f26236b;
        }
    }

    /* renamed from: o.h6c$f */
    public static final class C13861f extends h6c {

        /* renamed from: c */
        public static final C13861f f26245c = new C13861f();

        /* renamed from: d */
        public static final String f26246d = "private";

        public C13861f() {
            super(null);
        }

        @Override // p001o.h6c
        /* renamed from: b */
        public String mo29837b() {
            return f26246d;
        }

        public String toString() {
            return "Private";
        }
    }

    /* renamed from: o.h6c$g */
    public static final class C13862g extends h6c {

        /* renamed from: c */
        public static final C13862g f26247c = new C13862g();

        /* renamed from: d */
        public static final String f26248d = "public-read";

        public C13862g() {
            super(null);
        }

        @Override // p001o.h6c
        /* renamed from: b */
        public String mo29837b() {
            return f26248d;
        }

        public String toString() {
            return "PublicRead";
        }
    }

    /* renamed from: o.h6c$h */
    public static final class C13863h extends h6c {

        /* renamed from: c */
        public static final C13863h f26249c = new C13863h();

        /* renamed from: d */
        public static final String f26250d = "public-read-write";

        public C13863h() {
            super(null);
        }

        @Override // p001o.h6c
        /* renamed from: b */
        public String mo29837b() {
            return f26250d;
        }

        public String toString() {
            return "PublicReadWrite";
        }
    }

    public h6c() {
    }

    public /* synthetic */ h6c(id5 id5Var) {
        this();
    }

    /* renamed from: b */
    public abstract String mo29837b();
}

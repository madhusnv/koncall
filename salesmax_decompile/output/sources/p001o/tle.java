package p001o;

import android.net.Uri;
import androidx.media3.common.C2181a;
import java.util.Collections;
import java.util.List;
import p001o.jbf;

/* loaded from: classes2.dex */
public abstract class tle {

    /* renamed from: a */
    public final long f47374a;

    /* renamed from: b */
    public final C2181a f47375b;

    /* renamed from: c */
    public final nf8 f47376c;

    /* renamed from: d */
    public final long f47377d;

    /* renamed from: e */
    public final List f47378e;

    /* renamed from: f */
    public final List f47379f;

    /* renamed from: g */
    public final List f47380g;

    /* renamed from: h */
    public final zbe f47381h;

    /* renamed from: o.tle$b */
    public static class C17152b extends tle implements jr4 {

        /* renamed from: i */
        public final jbf.AbstractC14487a f47382i;

        public C17152b(long j, C2181a c2181a, List list, jbf.AbstractC14487a abstractC14487a, List list2, List list3, List list4) {
            super(j, c2181a, list, abstractC14487a, list2, list3, list4);
            this.f47382i = abstractC14487a;
        }

        @Override // p001o.tle
        /* renamed from: a */
        public String mo50165a() {
            return null;
        }

        @Override // p001o.jr4
        /* renamed from: b */
        public long mo34363b(long j) {
            return this.f47382i.m33489j(j);
        }

        @Override // p001o.jr4
        /* renamed from: c */
        public long mo34364c(long j, long j2) {
            return this.f47382i.m33487h(j, j2);
        }

        @Override // p001o.jr4
        /* renamed from: d */
        public long mo34365d(long j, long j2) {
            return this.f47382i.m33483d(j, j2);
        }

        @Override // p001o.jr4
        /* renamed from: e */
        public long mo34366e(long j, long j2) {
            return this.f47382i.m33485f(j, j2);
        }

        @Override // p001o.jr4
        /* renamed from: f */
        public zbe mo34367f(long j) {
            return this.f47382i.mo33490k(this, j);
        }

        @Override // p001o.jr4
        /* renamed from: g */
        public long mo34368g(long j, long j2) {
            return this.f47382i.m33488i(j, j2);
        }

        @Override // p001o.jr4
        /* renamed from: h */
        public long mo34369h(long j) {
            return this.f47382i.mo33486g(j);
        }

        @Override // p001o.jr4
        /* renamed from: i */
        public boolean mo34370i() {
            return this.f47382i.mo33491l();
        }

        @Override // p001o.jr4
        /* renamed from: j */
        public long mo34371j() {
            return this.f47382i.m33484e();
        }

        @Override // p001o.jr4
        /* renamed from: k */
        public long mo34372k(long j, long j2) {
            return this.f47382i.m33482c(j, j2);
        }

        @Override // p001o.tle
        /* renamed from: l */
        public jr4 mo50166l() {
            return this;
        }

        @Override // p001o.tle
        /* renamed from: m */
        public zbe mo50167m() {
            return null;
        }
    }

    /* renamed from: o.tle$c */
    public static class C17153c extends tle {

        /* renamed from: i */
        public final Uri f47383i;

        /* renamed from: j */
        public final long f47384j;

        /* renamed from: k */
        public final String f47385k;

        /* renamed from: l */
        public final zbe f47386l;

        /* renamed from: m */
        public final wuf f47387m;

        public C17153c(long j, C2181a c2181a, List list, jbf.C14491e c14491e, List list2, List list3, List list4, String str, long j2) {
            super(j, c2181a, list, c14491e, list2, list3, list4);
            this.f47383i = Uri.parse(((ef1) list.get(0)).f21518a);
            zbe zbeVarM33492c = c14491e.m33492c();
            this.f47386l = zbeVarM33492c;
            this.f47385k = str;
            this.f47384j = j2;
            this.f47387m = zbeVarM33492c != null ? null : new wuf(new zbe(null, 0L, j2));
        }

        @Override // p001o.tle
        /* renamed from: a */
        public String mo50165a() {
            return this.f47385k;
        }

        @Override // p001o.tle
        /* renamed from: l */
        public jr4 mo50166l() {
            return this.f47387m;
        }

        @Override // p001o.tle
        /* renamed from: m */
        public zbe mo50167m() {
            return this.f47386l;
        }
    }

    /* renamed from: o */
    public static tle m50164o(long j, C2181a c2181a, List list, jbf jbfVar, List list2, List list3, List list4, String str) {
        if (jbfVar instanceof jbf.C14491e) {
            return new C17153c(j, c2181a, list, (jbf.C14491e) jbfVar, list2, list3, list4, str, -1L);
        }
        if (jbfVar instanceof jbf.AbstractC14487a) {
            return new C17152b(j, c2181a, list, (jbf.AbstractC14487a) jbfVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    /* renamed from: a */
    public abstract String mo50165a();

    /* renamed from: l */
    public abstract jr4 mo50166l();

    /* renamed from: m */
    public abstract zbe mo50167m();

    /* renamed from: n */
    public zbe m50168n() {
        return this.f47381h;
    }

    public tle(long j, C2181a c2181a, List list, jbf jbfVar, List list2, List list3, List list4) {
        op0.m42511a(!list.isEmpty());
        this.f47374a = j;
        this.f47375b = c2181a;
        this.f47376c = nf8.m40511y(list);
        this.f47378e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f47379f = list3;
        this.f47380g = list4;
        this.f47381h = jbfVar.mo33480a(this);
        this.f47377d = jbfVar.m33481b();
    }
}

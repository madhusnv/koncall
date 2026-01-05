package p001o;

import androidx.media3.exoplayer.C2213j;
import java.util.List;
import p001o.nf8;

/* loaded from: classes2.dex */
public final class po3 implements lef {

    /* renamed from: a */
    public final nf8 f40323a;

    /* renamed from: b */
    public long f40324b;

    /* renamed from: o.po3$a */
    public static final class C16145a implements lef {

        /* renamed from: a */
        public final lef f40325a;

        /* renamed from: b */
        public final nf8 f40326b;

        public C16145a(lef lefVar, List list) {
            this.f40325a = lefVar;
            this.f40326b = nf8.m40511y(list);
        }

        /* renamed from: a */
        public nf8 m43958a() {
            return this.f40326b;
        }

        @Override // p001o.lef
        /* renamed from: b */
        public boolean mo7002b() {
            return this.f40325a.mo7002b();
        }

        @Override // p001o.lef
        /* renamed from: c */
        public boolean mo7003c(C2213j c2213j) {
            return this.f40325a.mo7003c(c2213j);
        }

        @Override // p001o.lef
        /* renamed from: d */
        public long mo7004d() {
            return this.f40325a.mo7004d();
        }

        @Override // p001o.lef
        /* renamed from: g */
        public long mo7006g() {
            return this.f40325a.mo7006g();
        }

        @Override // p001o.lef
        /* renamed from: h */
        public void mo7007h(long j) {
            this.f40325a.mo7007h(j);
        }
    }

    public po3(List list, List list2) {
        nf8.C15566a c15566aM40508q = nf8.m40508q();
        op0.m42511a(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            c15566aM40508q.mo32056a(new C16145a((lef) list.get(i), (List) list2.get(i)));
        }
        this.f40323a = c15566aM40508q.m40520k();
        this.f40324b = -9223372036854775807L;
    }

    @Override // p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        for (int i = 0; i < this.f40323a.size(); i++) {
            if (((C16145a) this.f40323a.get(i)).mo7002b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        boolean zMo7003c;
        boolean z = false;
        do {
            long jMo7004d = mo7004d();
            if (jMo7004d == Long.MIN_VALUE) {
                break;
            }
            zMo7003c = false;
            for (int i = 0; i < this.f40323a.size(); i++) {
                long jMo7004d2 = ((C16145a) this.f40323a.get(i)).mo7004d();
                boolean z2 = jMo7004d2 != Long.MIN_VALUE && jMo7004d2 <= c2213j.f8421a;
                if (jMo7004d2 == jMo7004d || z2) {
                    zMo7003c |= ((C16145a) this.f40323a.get(i)).mo7003c(c2213j);
                }
            }
            z |= zMo7003c;
        } while (zMo7003c);
        return z;
    }

    @Override // p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.f40323a.size(); i++) {
            long jMo7004d = ((C16145a) this.f40323a.get(i)).mo7004d();
            if (jMo7004d != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo7004d);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i = 0; i < this.f40323a.size(); i++) {
            C16145a c16145a = (C16145a) this.f40323a.get(i);
            long jMo7006g = c16145a.mo7006g();
            if ((c16145a.m43958a().contains(1) || c16145a.m43958a().contains(2) || c16145a.m43958a().contains(4)) && jMo7006g != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo7006g);
            }
            if (jMo7006g != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo7006g);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f40324b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f40324b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
        for (int i = 0; i < this.f40323a.size(); i++) {
            ((C16145a) this.f40323a.get(i)).mo7007h(j);
        }
    }
}

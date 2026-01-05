package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class z7c extends x6c {

    /* renamed from: a */
    public final Object[] f56634a;

    /* renamed from: o.z7c$a */
    public static final class C18567a extends sf1 {

        /* renamed from: a */
        public final m9c f56635a;

        /* renamed from: b */
        public final Object[] f56636b;

        /* renamed from: c */
        public int f56637c;

        /* renamed from: d */
        public boolean f56638d;

        /* renamed from: e */
        public volatile boolean f56639e;

        public C18567a(m9c m9cVar, Object[] objArr) {
            this.f56635a = m9cVar;
            this.f56636b = objArr;
        }

        /* renamed from: a */
        public void m58865a() {
            Object[] objArr = this.f56636b;
            int length = objArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    this.f56635a.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f56635a.mo16560e(obj);
            }
            if (isDisposed()) {
                return;
            }
            this.f56635a.onComplete();
        }

        @Override // p001o.rtf
        public void clear() {
            this.f56637c = this.f56636b.length;
        }

        @Override // p001o.su5
        public void dispose() {
            this.f56639e = true;
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f56639e;
        }

        @Override // p001o.rtf
        public boolean isEmpty() {
            return this.f56637c == this.f56636b.length;
        }

        @Override // p001o.rtf
        public Object poll() {
            int i = this.f56637c;
            Object[] objArr = this.f56636b;
            if (i == objArr.length) {
                return null;
            }
            this.f56637c = i + 1;
            Object obj = objArr[i];
            Objects.requireNonNull(obj, "The array element is null");
            return obj;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f56638d = true;
            return 1;
        }
    }

    public z7c(Object[] objArr) {
        this.f56634a = objArr;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        C18567a c18567a = new C18567a(m9cVar, this.f56634a);
        m9cVar.mo16559a(c18567a);
        if (c18567a.f56638d) {
            return;
        }
        c18567a.m58865a();
    }
}

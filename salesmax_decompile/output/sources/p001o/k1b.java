package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public interface k1b {

    /* renamed from: a */
    public static final k1b f31372a = new C14702a();

    /* renamed from: o.k1b$a */
    public class C14702a implements k1b {
        @Override // p001o.k1b
        /* renamed from: a */
        public long mo7052a() {
            throw new NoSuchElementException();
        }

        @Override // p001o.k1b
        /* renamed from: b */
        public long mo7053b() {
            throw new NoSuchElementException();
        }

        @Override // p001o.k1b
        public boolean next() {
            return false;
        }
    }

    /* renamed from: a */
    long mo7052a();

    /* renamed from: b */
    long mo7053b();

    boolean next();
}

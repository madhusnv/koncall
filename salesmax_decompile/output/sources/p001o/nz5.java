package p001o;

import android.os.Looper;
import androidx.media3.common.C2181a;
import p001o.fz5;
import p001o.mz5;
import p001o.nz5;

/* loaded from: classes2.dex */
public interface nz5 {

    /* renamed from: a */
    public static final nz5 f37467a = new C15681a();

    /* renamed from: o.nz5$a */
    public class C15681a implements nz5 {
        @Override // p001o.nz5
        /* renamed from: a */
        public fz5 mo41290a(mz5.C15451a c15451a, C2181a c2181a) {
            if (c2181a.f7947r == null) {
                return null;
            }
            return new sj6(new fz5.C13592a(new i5i(1), 6001));
        }

        @Override // p001o.nz5
        /* renamed from: c */
        public void mo41292c(Looper looper, jbd jbdVar) {
        }

        @Override // p001o.nz5
        /* renamed from: d */
        public int mo41293d(C2181a c2181a) {
            return c2181a.f7947r != null ? 1 : 0;
        }
    }

    /* renamed from: o.nz5$b */
    public interface InterfaceC15682b {

        /* renamed from: a */
        public static final InterfaceC15682b f37468a = new InterfaceC15682b() { // from class: o.oz5
            @Override // p001o.nz5.InterfaceC15682b
            public final void release() {
                nz5.InterfaceC15682b.m41295b();
            }
        };

        /* renamed from: b */
        static /* synthetic */ void m41295b() {
        }

        void release();
    }

    /* renamed from: a */
    fz5 mo41290a(mz5.C15451a c15451a, C2181a c2181a);

    /* renamed from: b */
    default InterfaceC15682b mo41291b(mz5.C15451a c15451a, C2181a c2181a) {
        return InterfaceC15682b.f37468a;
    }

    /* renamed from: c */
    void mo41292c(Looper looper, jbd jbdVar);

    /* renamed from: d */
    int mo41293d(C2181a c2181a);

    /* renamed from: f */
    default void mo41294f() {
    }

    default void release() {
    }
}

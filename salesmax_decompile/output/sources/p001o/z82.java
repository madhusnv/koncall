package p001o;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;
import p001o.bhf;
import p001o.sc8;

/* loaded from: classes2.dex */
public interface z82 {

    /* renamed from: a */
    public static final z82 f56683a = new C18575b();

    /* renamed from: o.z82$a */
    public class C18574a implements t72 {
        public C18574a() {
        }

        @Override // p001o.t72
        /* renamed from: a */
        public zfa mo49347a() {
            return bn7.m19430p(null);
        }

        @Override // p001o.t72
        /* renamed from: b */
        public zfa mo49348b() {
            return bn7.m19430p(null);
        }
    }

    /* renamed from: o.z82$b */
    public class C18575b implements z82 {
        @Override // p001o.z82
        /* renamed from: a */
        public void mo37109a(bhf.C12402b c12402b) {
        }

        @Override // p001o.z82
        /* renamed from: c */
        public zfa mo37111c(List list, int i, int i2) {
            return bn7.m19430p(Collections.emptyList());
        }

        @Override // p001o.z82
        /* renamed from: d */
        public Rect mo37112d() {
            return new Rect();
        }

        @Override // p001o.z82
        /* renamed from: e */
        public void mo37113e(int i) {
        }

        @Override // p001o.z82
        /* renamed from: f */
        public mq3 mo37114f() {
            return null;
        }

        @Override // p001o.z82
        /* renamed from: g */
        public void mo37115g(mq3 mq3Var) {
        }

        @Override // p001o.z82
        /* renamed from: i */
        public void mo37117i() {
        }
    }

    /* renamed from: o.z82$c */
    public static final class C18576c extends Exception {

        /* renamed from: a */
        public l72 f56685a;

        public C18576c(l72 l72Var) {
            this.f56685a = l72Var;
        }
    }

    /* renamed from: o.z82$d */
    public interface InterfaceC18577d {
        /* renamed from: a */
        void mo26132a();

        /* renamed from: b */
        void mo26133b(List list);
    }

    /* renamed from: a */
    void mo37109a(bhf.C12402b c12402b);

    /* renamed from: b */
    default void mo37110b(sc8.InterfaceC16805i interfaceC16805i) {
    }

    /* renamed from: c */
    zfa mo37111c(List list, int i, int i2);

    /* renamed from: d */
    Rect mo37112d();

    /* renamed from: e */
    void mo37113e(int i);

    /* renamed from: f */
    mq3 mo37114f();

    /* renamed from: g */
    void mo37115g(mq3 mq3Var);

    /* renamed from: h */
    default zfa mo37116h(int i, int i2) {
        return bn7.m19430p(new C18574a());
    }

    /* renamed from: i */
    void mo37117i();
}

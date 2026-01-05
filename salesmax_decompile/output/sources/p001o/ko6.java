package p001o;

import androidx.media3.common.C2181a;
import java.util.List;
import p001o.x8b;

/* loaded from: classes2.dex */
public interface ko6 extends wth {

    /* renamed from: o.ko6$a */
    public static final class C14892a {

        /* renamed from: a */
        public final qth f32501a;

        /* renamed from: b */
        public final int[] f32502b;

        /* renamed from: c */
        public final int f32503c;

        public C14892a(qth qthVar, int... iArr) {
            this(qthVar, iArr, 0);
        }

        public C14892a(qth qthVar, int[] iArr, int i) {
            if (iArr.length == 0) {
                ria.m46820d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f32501a = qthVar;
            this.f32502b = iArr;
            this.f32503c = i;
        }
    }

    /* renamed from: o.ko6$b */
    public interface InterfaceC14893b {
        /* renamed from: a */
        ko6[] mo19895a(C14892a[] c14892aArr, ta1 ta1Var, x8b.C18076b c18076b, lmh lmhVar);
    }

    /* renamed from: a */
    boolean mo22947a(int i, long j);

    /* renamed from: c */
    default boolean mo35979c(long j, k93 k93Var, List list) {
        return false;
    }

    /* renamed from: d */
    int mo16357d();

    void disable();

    void enable();

    /* renamed from: g */
    boolean mo22951g(int i, long j);

    /* renamed from: h */
    void mo19891h(float f);

    /* renamed from: i */
    Object mo16358i();

    /* renamed from: j */
    default void mo35980j() {
    }

    /* renamed from: k */
    void mo16359k(long j, long j2, long j3, List list, k1b[] k1bVarArr);

    /* renamed from: n */
    default void mo35981n(boolean z) {
    }

    /* renamed from: o */
    int mo19892o(long j, List list);

    /* renamed from: p */
    int mo22954p();

    /* renamed from: q */
    C2181a mo22955q();

    /* renamed from: r */
    int mo16360r();

    /* renamed from: s */
    default void mo35982s() {
    }
}

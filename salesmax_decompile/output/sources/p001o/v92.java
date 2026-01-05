package p001o;

import java.util.Collection;
import p001o.w8i;

/* loaded from: classes2.dex */
public interface v92 extends g72, w8i.InterfaceC17799b {

    /* renamed from: o.v92$a */
    public enum EnumC17532a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        EnumC17532a(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    @Override // p001o.g72
    /* renamed from: a */
    default t92 mo28113a() {
        return mo26122j();
    }

    /* renamed from: c */
    z82 mo26115c();

    /* renamed from: d */
    default u82 mo26116d() {
        return x82.m55810a();
    }

    /* renamed from: f */
    default void mo26118f(boolean z) {
    }

    /* renamed from: h */
    void mo26120h(Collection collection);

    /* renamed from: i */
    void mo26121i(Collection collection);

    /* renamed from: j */
    u92 mo26122j();

    /* renamed from: k */
    default void mo26123k(u82 u82Var) {
    }

    /* renamed from: l */
    default boolean m52466l() {
        return mo28113a().mo38382d() == 0;
    }

    /* renamed from: n */
    v6c mo26125n();

    /* renamed from: p */
    default boolean mo42848p() {
        return true;
    }

    /* renamed from: q */
    default void mo26126q(boolean z) {
    }
}

package p001o;

import java.util.Set;
import p001o.mq3;

/* loaded from: classes2.dex */
public interface lce extends mq3 {
    @Override // p001o.mq3
    /* renamed from: a */
    default Set mo36955a(mq3.AbstractC15402a abstractC15402a) {
        return getConfig().mo36955a(abstractC15402a);
    }

    @Override // p001o.mq3
    /* renamed from: b */
    default Set mo36956b() {
        return getConfig().mo36956b();
    }

    @Override // p001o.mq3
    /* renamed from: c */
    default boolean mo36957c(mq3.AbstractC15402a abstractC15402a) {
        return getConfig().mo36957c(abstractC15402a);
    }

    @Override // p001o.mq3
    /* renamed from: d */
    default Object mo36958d(mq3.AbstractC15402a abstractC15402a, Object obj) {
        return getConfig().mo36958d(abstractC15402a, obj);
    }

    @Override // p001o.mq3
    /* renamed from: e */
    default mq3.EnumC15404c mo36959e(mq3.AbstractC15402a abstractC15402a) {
        return getConfig().mo36959e(abstractC15402a);
    }

    @Override // p001o.mq3
    /* renamed from: f */
    default Object mo36960f(mq3.AbstractC15402a abstractC15402a) {
        return getConfig().mo36960f(abstractC15402a);
    }

    @Override // p001o.mq3
    /* renamed from: g */
    default void mo36961g(String str, mq3.InterfaceC15403b interfaceC15403b) {
        getConfig().mo36961g(str, interfaceC15403b);
    }

    mq3 getConfig();

    @Override // p001o.mq3
    /* renamed from: h */
    default Object mo36962h(mq3.AbstractC15402a abstractC15402a, mq3.EnumC15404c enumC15404c) {
        return getConfig().mo36962h(abstractC15402a, enumC15404c);
    }
}

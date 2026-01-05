package gc;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gc.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C2559c extends AbstractC4152j implements InterfaceC2139c {

    /* renamed from: a */
    public static final C2559c f13961a = new C2559c(1, AbstractC5178p.class, "toBoolean", "toBoolean(Ljava/lang/String;)Z", 1);

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        String p02 = (String) obj;
        AbstractC4154l.m8923f(p02, "p0");
        return Boolean.valueOf(Boolean.parseBoolean(p02));
    }
}

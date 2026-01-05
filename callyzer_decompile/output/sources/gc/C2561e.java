package gc;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gc.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C2561e extends AbstractC4152j implements InterfaceC2139c {

    /* renamed from: a */
    public static final C2561e f13963a = new C2561e(1, AbstractC5178p.class, "toLong", "toLong(Ljava/lang/String;)J", 1);

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        String p02 = (String) obj;
        AbstractC4154l.m8923f(p02, "p0");
        return Long.valueOf(Long.parseLong(p02));
    }
}

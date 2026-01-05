package fk;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    public final m1 f10517a;

    /* renamed from: b */
    public final n1 f10518b;

    public x0(m1 timeProvider, n1 uuidGenerator) {
        AbstractC4154l.m8923f(timeProvider, "timeProvider");
        AbstractC4154l.m8923f(uuidGenerator, "uuidGenerator");
        this.f10517a = timeProvider;
        this.f10518b = uuidGenerator;
    }

    /* renamed from: a */
    public final p0 m5986a(p0 p0Var) {
        String str;
        this.f10518b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC4154l.m8922e(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        String lowerCase = AbstractC5185w.m10136r(string, "-", "").toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        return new p0(lowerCase, (p0Var == null || (str = p0Var.f10468b) == null) ? lowerCase : str, p0Var != null ? p0Var.f10469c + 1 : 0, this.f10517a.m5981a().f10454b);
    }
}

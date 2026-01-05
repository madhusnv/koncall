package p001o;

import com.google.android.gms.cast.MediaTrack;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class pzf {

    /* renamed from: c */
    public static final Map f41004c = Collections.emptyMap();

    /* renamed from: d */
    public static final Set f41005d = Collections.unmodifiableSet(EnumSet.noneOf(EnumC16261a.class));

    /* renamed from: a */
    public final szf f41006a;

    /* renamed from: b */
    public final Set f41007b;

    /* renamed from: o.pzf$a */
    public enum EnumC16261a {
        RECORD_EVENTS
    }

    public pzf(szf szfVar, EnumSet enumSet) {
        this.f41006a = (szf) kri.m36136b(szfVar, "context");
        Set setUnmodifiableSet = enumSet == null ? f41005d : Collections.unmodifiableSet(EnumSet.copyOf(enumSet));
        this.f41007b = setUnmodifiableSet;
        kri.m36135a(!szfVar.m49108c().m21799d() || setUnmodifiableSet.contains(EnumC16261a.RECORD_EVENTS), "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    /* renamed from: a */
    public final void m44561a(String str) {
        kri.m36136b(str, MediaTrack.ROLE_DESCRIPTION);
        mo44562b(str, f41004c);
    }

    /* renamed from: b */
    public abstract void mo44562b(String str, Map map);

    /* renamed from: c */
    public abstract void mo44563c(kcb kcbVar);

    /* renamed from: d */
    public final void m44564d() {
        mo44565e(z76.f56627a);
    }

    /* renamed from: e */
    public abstract void mo44565e(z76 z76Var);

    /* renamed from: f */
    public final szf m44566f() {
        return this.f41006a;
    }

    /* renamed from: g */
    public abstract void mo44567g(String str, ox0 ox0Var);
}

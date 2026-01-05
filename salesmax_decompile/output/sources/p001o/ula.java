package p001o;

import java.util.Map;

/* loaded from: classes2.dex */
public final class ula extends u90 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ula(v90 v90Var) {
        super(v90Var, null);
        sq8.m48649h(v90Var, "alignmentLinesOwner");
    }

    @Override // p001o.u90
    /* renamed from: d */
    public long mo17148d(xzb xzbVar, long j) {
        sq8.m48649h(xzbVar, "$this$calculatePositionInParent");
        wla wlaVarK0 = xzbVar.K0();
        sq8.m48646e(wlaVarK0);
        long jD0 = wlaVarK0.d0();
        return s9c.m48057p(v9c.m52474a(gl8.m29001f(jD0), gl8.m29002g(jD0)), j);
    }

    @Override // p001o.u90
    /* renamed from: e */
    public Map mo17149e(xzb xzbVar) {
        sq8.m48649h(xzbVar, "<this>");
        wla wlaVarK0 = xzbVar.K0();
        sq8.m48646e(wlaVarK0);
        return wlaVarK0.b0().mo18091b();
    }

    @Override // p001o.u90
    /* renamed from: i */
    public int mo17150i(xzb xzbVar, s90 s90Var) {
        sq8.m48649h(xzbVar, "<this>");
        sq8.m48649h(s90Var, "alignmentLine");
        wla wlaVarK0 = xzbVar.K0();
        sq8.m48646e(wlaVarK0);
        return wlaVarK0.m52910W(s90Var);
    }
}

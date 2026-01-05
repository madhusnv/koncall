package p001o;

/* loaded from: classes5.dex */
public abstract class bse {
    /* renamed from: a */
    public static Object m19698a(int i, Object obj, hl7 hl7Var, wse wseVar) {
        Object objApply;
        if (i < 1) {
            return hl7Var.apply(obj);
        }
        do {
            objApply = hl7Var.apply(obj);
            obj = wseVar.mo52652a(obj, objApply);
            if (obj == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return objApply;
    }
}

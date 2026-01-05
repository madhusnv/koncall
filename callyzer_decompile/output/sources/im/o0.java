package im;

import a2.AbstractC0030c;
import com.websoptimization.callyzerbiz.data.model.response.BaseResponse;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o0 extends f1 {

    /* renamed from: a */
    public final Object f17571a;

    /* renamed from: b */
    public final int f17572b;

    /* renamed from: c */
    public final i0 f17573c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(BaseResponse baseResponse, int i10) {
        i0 i0Var;
        super(0);
        int i11 = 0;
        this.f17571a = baseResponse;
        this.f17572b = i10;
        i0[] i0VarArrValues = i0.values();
        int length = i0VarArrValues.length;
        while (true) {
            if (i11 >= length) {
                i0Var = null;
                break;
            }
            i0Var = i0VarArrValues[i11];
            if (i0Var.getCode() == this.f17572b) {
                break;
            } else {
                i11++;
            }
        }
        this.f17573c = i0Var == null ? i0.Unknown : i0Var;
    }

    /* renamed from: b */
    public final String m7642b() {
        int i10 = this.f17572b;
        return (400 > i10 || i10 >= 500) ? (501 > i10 || i10 >= 600) ? AbstractC4801l.m9730d(i10, "Can't identify Error,code := ") : "ServerError" : "ClientError";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return AbstractC4154l.m8918a(this.f17571a, o0Var.f17571a) && this.f17572b == o0Var.f17572b;
    }

    public final int hashCode() {
        Object obj = this.f17571a;
        return Integer.hashCode(this.f17572b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("API ERROR >>> ", m7642b(), " >>> codeName :=(", this.f17573c.name(), ") >>> message: ");
        sbM127r.append(this.f17571a);
        return sbM127r.toString();
    }
}
